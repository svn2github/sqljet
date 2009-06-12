// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 SqlParser.g 2009-06-12 19:03:52

  package org.tmatesoft.sqljet.core.internal.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQUALS", "EQUALS2", "NOT_EQUALS", "NOT_EQUALS2", "LESS", "LESS_OR_EQ", "GREATER", "GREATER_OR_EQ", "SHIFT_LEFT", "SHIFT_RIGHT", "AMPERSAND", "PIPE", "DOUBLE_PIPE", "PLUS", "MINUS", "TILDA", "ASTERISK", "SLASH", "PERCENT", "SEMI", "DOT", "COMMA", "LPAREN", "RPAREN", "QUESTION", "COLON", "AT", "DOLLAR", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ABORT", "ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "AS", "ASC", "ATTACH", "AUTOINCREMENT", "BEFORE", "BEGIN", "BETWEEN", "BY", "CASCADE", "CASE", "CAST", "CHECK", "COLLATE", "COLUMN", "COMMIT", "CONFLICT", "CONSTRAINT", "CREATE", "CROSS", "CURRENT_TIME", "CURRENT_DATE", "CURRENT_TIMESTAMP", "DATABASE", "DEFAULT", "DEFERRABLE", "DEFERRED", "DELETE", "DESC", "DETACH", "DISTINCT", "DROP", "EACH", "ELSE", "END", "ESCAPE", "EXCEPT", "EXCLUSIVE", "EXISTS", "EXPLAIN", "FAIL", "FOR", "FOREIGN", "FROM", "GLOB", "GROUP", "HAVING", "IF", "IGNORE", "IMMEDIATE", "IN", "INDEX", "INDEXED", "INITIALLY", "INNER", "INSERT", "INSTEAD", "INTERSECT", "INTO", "IS", "ISNULL", "JOIN", "KEY", "LEFT", "LIKE", "LIMIT", "MATCH", "NATURAL", "NOT", "NOTNULL", "NULL", "OF", "OFFSET", "ON", "OR", "ORDER", "OUTER", "PLAN", "PRAGMA", "PRIMARY", "QUERY", "RAISE", "REFERENCES", "REGEXP", "REINDEX", "RELEASE", "RENAME", "REPLACE", "RESTRICT", "ROLLBACK", "ROW", "SAVEPOINT", "SELECT", "SET", "TABLE", "TEMPORARY", "THEN", "TO", "TRANSACTION", "TRIGGER", "UNION", "UNIQUE", "UPDATE", "USING", "VACUUM", "VALUES", "VIEW", "VIRTUAL", "WHEN", "WHERE", "ID_START", "ID", "STRING", "INTEGER", "FLOAT_EXP", "FLOAT", "BLOB", "COMMENT", "LINE_COMMENT", "WS", "ALIAS", "BIND", "BIND_NAME", "BLOB_LITERAL", "COLUMN_CONSTRAINT", "COLUMN_EXPRESSION", "COLUMNS", "CONSTRAINTS", "CREATE_INDEX", "CREATE_TABLE", "DROP_INDEX", "DROP_TABLE", "FLOAT_LITERAL", "FUNCTION_LITERAL", "INTEGER_LITERAL", "IS_NULL", "IN_VALUES", "NOT_NULL", "OPTIONS", "ORDERING", "SELECT_CORE", "STRING_LITERAL", "TABLE_CONSTRAINT", "TYPE", "TYPE_PARAMS"
    };
    public static final int ROW=154;
    public static final int BLOB_LITERAL=187;
    public static final int TYPE_PARAMS=208;
    public static final int NOT=132;
    public static final int EXCEPT=100;
    public static final int FOREIGN=106;
    public static final int EOF=-1;
    public static final int TYPE=207;
    public static final int RPAREN=27;
    public static final int CREATE=82;
    public static final int STRING_LITERAL=205;
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
    public static final int NOT_NULL=201;
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
    public static final int DATABASE=87;
    public static final int VACUUM=168;
    public static final int DROP=95;
    public static final int DETACH=93;
    public static final int WHEN=172;
    public static final int NATURAL=131;
    public static final int BETWEEN=71;
    public static final int OPTIONS=202;
    public static final int STRING=176;
    public static final int CAST=75;
    public static final int TABLE_CONSTRAINT=206;
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
    public static final int SELECT_CORE=204;
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
    public static final int ORDERING=203;
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
    // SqlParser.g:59:1: sql_stmt_list : ( sql_stmt )+ ;
    public final SqlParser.sql_stmt_list_return sql_stmt_list() throws RecognitionException {
        SqlParser.sql_stmt_list_return retval = new SqlParser.sql_stmt_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.sql_stmt_return sql_stmt1 = null;



        try {
            // SqlParser.g:59:14: ( ( sql_stmt )+ )
            // SqlParser.g:59:16: ( sql_stmt )+
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:59:16: ( sql_stmt )+
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
            	    // SqlParser.g:59:17: sql_stmt
            	    {
            	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list167);
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
    // SqlParser.g:61:1: sql_stmt : ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI ;
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
            // SqlParser.g:61:9: ( ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI )
            // SqlParser.g:61:11: ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:61:11: ( EXPLAIN ( QUERY PLAN )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EXPLAIN) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // SqlParser.g:61:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN2=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt177); 
                    EXPLAIN2_tree = (Object)adaptor.create(EXPLAIN2);
                    adaptor.addChild(root_0, EXPLAIN2_tree);

                    // SqlParser.g:61:20: ( QUERY PLAN )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==QUERY) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // SqlParser.g:61:21: QUERY PLAN
                            {
                            QUERY3=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt180); 
                            QUERY3_tree = (Object)adaptor.create(QUERY3);
                            adaptor.addChild(root_0, QUERY3_tree);

                            PLAN4=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt182); 
                            PLAN4_tree = (Object)adaptor.create(PLAN4);
                            adaptor.addChild(root_0, PLAN4_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt188);
            sql_stmt_core5=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core5.getTree());
            SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt190); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:63:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );
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
            // SqlParser.g:64:3: ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt )
            int alt4=25;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // SqlParser.g:64:5: pragma_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core201);
                    pragma_stmt7=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt7.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:65:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core207);
                    attach_stmt8=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt8.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:66:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core213);
                    detach_stmt9=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt9.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:67:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core219);
                    analyze_stmt10=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt10.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:68:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core225);
                    reindex_stmt11=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt11.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:69:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core231);
                    vacuum_stmt12=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt12.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:71:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core240);
                    select_stmt13=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt13.getTree());

                    }
                    break;
                case 8 :
                    // SqlParser.g:72:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core246);
                    insert_stmt14=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt14.getTree());

                    }
                    break;
                case 9 :
                    // SqlParser.g:73:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core252);
                    update_stmt15=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt15.getTree());

                    }
                    break;
                case 10 :
                    // SqlParser.g:74:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core258);
                    delete_stmt16=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt16.getTree());

                    }
                    break;
                case 11 :
                    // SqlParser.g:75:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core264);
                    begin_stmt17=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt17.getTree());

                    }
                    break;
                case 12 :
                    // SqlParser.g:76:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core270);
                    commit_stmt18=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt18.getTree());

                    }
                    break;
                case 13 :
                    // SqlParser.g:77:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core276);
                    rollback_stmt19=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt19.getTree());

                    }
                    break;
                case 14 :
                    // SqlParser.g:78:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core282);
                    savepoint_stmt20=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt20.getTree());

                    }
                    break;
                case 15 :
                    // SqlParser.g:79:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core288);
                    release_stmt21=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt21.getTree());

                    }
                    break;
                case 16 :
                    // SqlParser.g:81:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core297);
                    create_virtual_table_stmt22=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt22.getTree());

                    }
                    break;
                case 17 :
                    // SqlParser.g:82:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core303);
                    create_table_stmt23=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt23.getTree());

                    }
                    break;
                case 18 :
                    // SqlParser.g:83:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core309);
                    drop_table_stmt24=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt24.getTree());

                    }
                    break;
                case 19 :
                    // SqlParser.g:84:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core315);
                    alter_table_stmt25=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt25.getTree());

                    }
                    break;
                case 20 :
                    // SqlParser.g:85:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core321);
                    create_view_stmt26=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt26.getTree());

                    }
                    break;
                case 21 :
                    // SqlParser.g:86:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core327);
                    drop_view_stmt27=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt27.getTree());

                    }
                    break;
                case 22 :
                    // SqlParser.g:87:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core333);
                    create_index_stmt28=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt28.getTree());

                    }
                    break;
                case 23 :
                    // SqlParser.g:88:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core339);
                    drop_index_stmt29=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt29.getTree());

                    }
                    break;
                case 24 :
                    // SqlParser.g:89:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core345);
                    create_trigger_stmt30=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt30.getTree());

                    }
                    break;
                case 25 :
                    // SqlParser.g:90:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core351);
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
    // SqlParser.g:93:1: qualified_table_name : (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? ;
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
            // SqlParser.g:93:21: ( (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? )
            // SqlParser.g:93:23: (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:93:23: (database_name= id DOT )?
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
                    // SqlParser.g:93:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_qualified_table_name364);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name366); 
                    DOT32_tree = (Object)adaptor.create(DOT32);
                    adaptor.addChild(root_0, DOT32_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_qualified_table_name372);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:93:61: ( INDEXED BY index_name= id | NOT INDEXED )?
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
                    // SqlParser.g:93:62: INDEXED BY index_name= id
                    {
                    INDEXED33=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name375); 
                    INDEXED33_tree = (Object)adaptor.create(INDEXED33);
                    adaptor.addChild(root_0, INDEXED33_tree);

                    BY34=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name377); 
                    BY34_tree = (Object)adaptor.create(BY34);
                    adaptor.addChild(root_0, BY34_tree);

                    pushFollow(FOLLOW_id_in_qualified_table_name381);
                    index_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, index_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:93:89: NOT INDEXED
                    {
                    NOT35=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name385); 
                    NOT35_tree = (Object)adaptor.create(NOT35);
                    adaptor.addChild(root_0, NOT35_tree);

                    INDEXED36=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name387); 
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
    // SqlParser.g:95:1: signed_number : ( PLUS | MINUS )? ( INTEGER | FLOAT ) ;
    public final SqlParser.signed_number_return signed_number() throws RecognitionException {
        SqlParser.signed_number_return retval = new SqlParser.signed_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set37=null;
        Token set38=null;

        Object set37_tree=null;
        Object set38_tree=null;

        try {
            // SqlParser.g:95:14: ( ( PLUS | MINUS )? ( INTEGER | FLOAT ) )
            // SqlParser.g:95:16: ( PLUS | MINUS )? ( INTEGER | FLOAT )
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:95:16: ( PLUS | MINUS )?
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
    // SqlParser.g:97:1: expr : or_subexpr ( OR or_subexpr )* ;
    public final SqlParser.expr_return expr() throws RecognitionException {
        SqlParser.expr_return retval = new SqlParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR40=null;
        SqlParser.or_subexpr_return or_subexpr39 = null;

        SqlParser.or_subexpr_return or_subexpr41 = null;


        Object OR40_tree=null;

        try {
            // SqlParser.g:97:5: ( or_subexpr ( OR or_subexpr )* )
            // SqlParser.g:97:7: or_subexpr ( OR or_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_subexpr_in_expr418);
            or_subexpr39=or_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, or_subexpr39.getTree());
            // SqlParser.g:97:18: ( OR or_subexpr )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // SqlParser.g:97:19: OR or_subexpr
            	    {
            	    OR40=(Token)match(input,OR,FOLLOW_OR_in_expr421); 
            	    OR40_tree = (Object)adaptor.create(OR40);
            	    root_0 = (Object)adaptor.becomeRoot(OR40_tree, root_0);

            	    pushFollow(FOLLOW_or_subexpr_in_expr424);
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
    // SqlParser.g:99:1: or_subexpr : and_subexpr ( AND and_subexpr )* ;
    public final SqlParser.or_subexpr_return or_subexpr() throws RecognitionException {
        SqlParser.or_subexpr_return retval = new SqlParser.or_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND43=null;
        SqlParser.and_subexpr_return and_subexpr42 = null;

        SqlParser.and_subexpr_return and_subexpr44 = null;


        Object AND43_tree=null;

        try {
            // SqlParser.g:99:11: ( and_subexpr ( AND and_subexpr )* )
            // SqlParser.g:99:13: and_subexpr ( AND and_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_subexpr_in_or_subexpr433);
            and_subexpr42=and_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, and_subexpr42.getTree());
            // SqlParser.g:99:25: ( AND and_subexpr )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // SqlParser.g:99:26: AND and_subexpr
            	    {
            	    AND43=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr436); 
            	    AND43_tree = (Object)adaptor.create(AND43);
            	    root_0 = (Object)adaptor.becomeRoot(AND43_tree, root_0);

            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr439);
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
    // SqlParser.g:101:1: and_subexpr : eq_subexpr ( cond_expr )? ;
    public final SqlParser.and_subexpr_return and_subexpr() throws RecognitionException {
        SqlParser.and_subexpr_return retval = new SqlParser.and_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.eq_subexpr_return eq_subexpr45 = null;

        SqlParser.cond_expr_return cond_expr46 = null;



        try {
            // SqlParser.g:101:12: ( eq_subexpr ( cond_expr )? )
            // SqlParser.g:101:14: eq_subexpr ( cond_expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr448);
            eq_subexpr45=eq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, eq_subexpr45.getTree());
            // SqlParser.g:101:34: ( cond_expr )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // SqlParser.g:101:34: cond_expr
                    {
                    pushFollow(FOLLOW_cond_expr_in_and_subexpr450);
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
    // SqlParser.g:103:1: cond_expr : ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN in_source | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN $e1 $e2 ( NOT )? ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+ );
    public final SqlParser.cond_expr_return cond_expr() throws RecognitionException {
        SqlParser.cond_expr_return retval = new SqlParser.cond_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT47=null;
        Token ESCAPE49=null;
        Token NOT50=null;
        Token IN51=null;
        Token ISNULL53=null;
        Token NOTNULL54=null;
        Token IS55=null;
        Token NULL56=null;
        Token NOT57=null;
        Token NULL58=null;
        Token IS59=null;
        Token NOT60=null;
        Token NULL61=null;
        Token NOT62=null;
        Token BETWEEN63=null;
        Token AND64=null;
        Token set65=null;
        SqlParser.eq_subexpr_return match_expr = null;

        SqlParser.eq_subexpr_return escape_expr = null;

        SqlParser.eq_subexpr_return e1 = null;

        SqlParser.eq_subexpr_return e2 = null;

        SqlParser.match_op_return match_op48 = null;

        SqlParser.in_source_return in_source52 = null;

        SqlParser.eq_subexpr_return eq_subexpr66 = null;


        Object NOT47_tree=null;
        Object ESCAPE49_tree=null;
        Object NOT50_tree=null;
        Object IN51_tree=null;
        Object ISNULL53_tree=null;
        Object NOTNULL54_tree=null;
        Object IS55_tree=null;
        Object NULL56_tree=null;
        Object NOT57_tree=null;
        Object NULL58_tree=null;
        Object IS59_tree=null;
        Object NOT60_tree=null;
        Object NULL61_tree=null;
        Object NOT62_tree=null;
        Object BETWEEN63_tree=null;
        Object AND64_tree=null;
        Object set65_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_ESCAPE=new RewriteRuleTokenStream(adaptor,"token ESCAPE");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleTokenStream stream_NOTNULL=new RewriteRuleTokenStream(adaptor,"token NOTNULL");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_BETWEEN=new RewriteRuleTokenStream(adaptor,"token BETWEEN");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_ISNULL=new RewriteRuleTokenStream(adaptor,"token ISNULL");
        RewriteRuleSubtreeStream stream_match_op=new RewriteRuleSubtreeStream(adaptor,"rule match_op");
        RewriteRuleSubtreeStream stream_eq_subexpr=new RewriteRuleSubtreeStream(adaptor,"rule eq_subexpr");
        try {
            // SqlParser.g:104:3: ( ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )? -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? ) | ( NOT )? IN in_source | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN $e1 $e2 ( NOT )? ) | ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+ )
            int alt17=5;
            switch ( input.LA(1) ) {
            case NOT:
                {
                switch ( input.LA(2) ) {
                case NULL:
                    {
                    alt17=3;
                    }
                    break;
                case IN:
                    {
                    alt17=2;
                    }
                    break;
                case BETWEEN:
                    {
                    alt17=4;
                    }
                    break;
                case GLOB:
                case LIKE:
                case MATCH:
                case REGEXP:
                    {
                    alt17=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }

                }
                break;
            case GLOB:
            case LIKE:
            case MATCH:
            case REGEXP:
                {
                alt17=1;
                }
                break;
            case IN:
                {
                alt17=2;
                }
                break;
            case IS:
            case ISNULL:
            case NOTNULL:
                {
                alt17=3;
                }
                break;
            case BETWEEN:
                {
                alt17=4;
                }
                break;
            case EQUALS:
            case EQUALS2:
            case NOT_EQUALS:
            case NOT_EQUALS2:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // SqlParser.g:104:5: ( NOT )? match_op match_expr= eq_subexpr ( ESCAPE escape_expr= eq_subexpr )?
                    {
                    // SqlParser.g:104:5: ( NOT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NOT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // SqlParser.g:104:5: NOT
                            {
                            NOT47=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr462);  
                            stream_NOT.add(NOT47);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_match_op_in_cond_expr465);
                    match_op48=match_op();

                    state._fsp--;

                    stream_match_op.add(match_op48.getTree());
                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr469);
                    match_expr=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(match_expr.getTree());
                    // SqlParser.g:104:41: ( ESCAPE escape_expr= eq_subexpr )?
                    int alt12=2;
                    alt12 = dfa12.predict(input);
                    switch (alt12) {
                        case 1 :
                            // SqlParser.g:104:42: ESCAPE escape_expr= eq_subexpr
                            {
                            ESCAPE49=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_cond_expr472);  
                            stream_ESCAPE.add(ESCAPE49);

                            pushFollow(FOLLOW_eq_subexpr_in_cond_expr476);
                            escape_expr=eq_subexpr();

                            state._fsp--;

                            stream_eq_subexpr.add(escape_expr.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: match_op, match_expr, NOT, escape_expr, ESCAPE
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
                    // 104:74: -> ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                    {
                        // SqlParser.g:104:77: ^( match_op $match_expr ( NOT )? ( ^( ESCAPE $escape_expr) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_match_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_match_expr.nextTree());
                        // SqlParser.g:104:100: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // SqlParser.g:104:105: ( ^( ESCAPE $escape_expr) )?
                        if ( stream_escape_expr.hasNext()||stream_ESCAPE.hasNext() ) {
                            // SqlParser.g:104:105: ^( ESCAPE $escape_expr)
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
                    // SqlParser.g:105:5: ( NOT )? IN in_source
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:105:5: ( NOT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NOT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // SqlParser.g:105:5: NOT
                            {
                            NOT50=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr504); 
                            NOT50_tree = (Object)adaptor.create(NOT50);
                            adaptor.addChild(root_0, NOT50_tree);


                            }
                            break;

                    }

                    IN51=(Token)match(input,IN,FOLLOW_IN_in_cond_expr507); 
                    IN51_tree = (Object)adaptor.create(IN51);
                    root_0 = (Object)adaptor.becomeRoot(IN51_tree, root_0);

                    pushFollow(FOLLOW_in_source_in_cond_expr510);
                    in_source52=in_source();

                    state._fsp--;

                    adaptor.addChild(root_0, in_source52.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:106:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
                    {
                    // SqlParser.g:106:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | NOT NULL -> NOT_NULL | IS NOT NULL -> NOT_NULL )
                    int alt14=5;
                    switch ( input.LA(1) ) {
                    case ISNULL:
                        {
                        alt14=1;
                        }
                        break;
                    case NOTNULL:
                        {
                        alt14=2;
                        }
                        break;
                    case IS:
                        {
                        int LA14_3 = input.LA(2);

                        if ( (LA14_3==NULL) ) {
                            alt14=3;
                        }
                        else if ( (LA14_3==NOT) ) {
                            alt14=5;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NOT:
                        {
                        alt14=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // SqlParser.g:106:6: ISNULL
                            {
                            ISNULL53=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_cond_expr517);  
                            stream_ISNULL.add(ISNULL53);



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
                            // 106:13: -> IS_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(IS_NULL, "IS_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // SqlParser.g:106:26: NOTNULL
                            {
                            NOTNULL54=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_cond_expr525);  
                            stream_NOTNULL.add(NOTNULL54);



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
                            // 106:34: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 3 :
                            // SqlParser.g:106:48: IS NULL
                            {
                            IS55=(Token)match(input,IS,FOLLOW_IS_in_cond_expr533);  
                            stream_IS.add(IS55);

                            NULL56=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr535);  
                            stream_NULL.add(NULL56);



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
                            // 106:56: -> IS_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(IS_NULL, "IS_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 4 :
                            // SqlParser.g:106:69: NOT NULL
                            {
                            NOT57=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr543);  
                            stream_NOT.add(NOT57);

                            NULL58=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr545);  
                            stream_NULL.add(NULL58);



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
                            // 106:78: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 5 :
                            // SqlParser.g:106:92: IS NOT NULL
                            {
                            IS59=(Token)match(input,IS,FOLLOW_IS_in_cond_expr553);  
                            stream_IS.add(IS59);

                            NOT60=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr555);  
                            stream_NOT.add(NOT60);

                            NULL61=(Token)match(input,NULL,FOLLOW_NULL_in_cond_expr557);  
                            stream_NULL.add(NULL61);



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
                            // 106:104: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // SqlParser.g:107:5: ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr
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
                            NOT62=(Token)match(input,NOT,FOLLOW_NOT_in_cond_expr568);  
                            stream_NOT.add(NOT62);


                            }
                            break;

                    }

                    BETWEEN63=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_cond_expr571);  
                    stream_BETWEEN.add(BETWEEN63);

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr575);
                    e1=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e1.getTree());
                    AND64=(Token)match(input,AND,FOLLOW_AND_in_cond_expr577);  
                    stream_AND.add(AND64);

                    pushFollow(FOLLOW_eq_subexpr_in_cond_expr581);
                    e2=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e2.getTree());


                    // AST REWRITE
                    // elements: BETWEEN, e2, NOT, e1
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
                    // 107:50: -> ^( BETWEEN $e1 $e2 ( NOT )? )
                    {
                        // SqlParser.g:107:53: ^( BETWEEN $e1 $e2 ( NOT )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BETWEEN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());
                        adaptor.addChild(root_1, stream_e2.nextTree());
                        // SqlParser.g:107:71: ( NOT )?
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
                case 5 :
                    // SqlParser.g:108:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:108:5: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=EQUALS && LA16_0<=NOT_EQUALS2)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // SqlParser.g:108:6: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr
                    	    {
                    	    set65=(Token)input.LT(1);
                    	    set65=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=EQUALS && input.LA(1)<=NOT_EQUALS2) ) {
                    	        input.consume();
                    	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set65), root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_eq_subexpr_in_cond_expr620);
                    	    eq_subexpr66=eq_subexpr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, eq_subexpr66.getTree());

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
    // SqlParser.g:111:1: match_op : ( LIKE | GLOB | REGEXP | MATCH );
    public final SqlParser.match_op_return match_op() throws RecognitionException {
        SqlParser.match_op_return retval = new SqlParser.match_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set67=null;

        Object set67_tree=null;

        try {
            // SqlParser.g:111:9: ( LIKE | GLOB | REGEXP | MATCH )
            // SqlParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set67=(Token)input.LT(1);
            if ( input.LA(1)==GLOB||input.LA(1)==LIKE||input.LA(1)==MATCH||input.LA(1)==REGEXP ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set67));
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

    public static class in_source_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in_source"
    // SqlParser.g:113:1: in_source : ( LPAREN ( select_stmt )? RPAREN | LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( expr )+ ) | (database_name= id DOT )? table_name= id -> ^( $table_name ( $database_name)? ) );
    public final SqlParser.in_source_return in_source() throws RecognitionException {
        SqlParser.in_source_return retval = new SqlParser.in_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN68=null;
        Token RPAREN70=null;
        Token LPAREN71=null;
        Token COMMA73=null;
        Token RPAREN75=null;
        Token DOT76=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.select_stmt_return select_stmt69 = null;

        SqlParser.expr_return expr72 = null;

        SqlParser.expr_return expr74 = null;


        Object LPAREN68_tree=null;
        Object RPAREN70_tree=null;
        Object LPAREN71_tree=null;
        Object COMMA73_tree=null;
        Object RPAREN75_tree=null;
        Object DOT76_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:114:3: ( LPAREN ( select_stmt )? RPAREN | LPAREN expr ( COMMA expr )* RPAREN -> ^( IN_VALUES ( expr )+ ) | (database_name= id DOT )? table_name= id -> ^( $table_name ( $database_name)? ) )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LPAREN) ) {
                switch ( input.LA(2) ) {
                case PLUS:
                case MINUS:
                case TILDA:
                case LPAREN:
                case QUESTION:
                case COLON:
                case AT:
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
                case NOT:
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
                case STRING:
                case INTEGER:
                case FLOAT:
                case BLOB:
                    {
                    alt21=2;
                    }
                    break;
                case SELECT:
                    {
                    int LA21_4 = input.LA(3);

                    if ( (LA21_4==DOT) ) {
                        alt21=2;
                    }
                    else if ( ((LA21_4>=PLUS && LA21_4<=ASTERISK)||LA21_4==LPAREN||(LA21_4>=QUESTION && LA21_4<=AT)||(LA21_4>=ABORT && LA21_4<=FROM)||(LA21_4>=GROUP && LA21_4<=IMMEDIATE)||(LA21_4>=INDEX && LA21_4<=IS)||(LA21_4>=JOIN && LA21_4<=LEFT)||LA21_4==LIMIT||(LA21_4>=NATURAL && LA21_4<=NOT)||(LA21_4>=NULL && LA21_4<=REFERENCES)||(LA21_4>=REINDEX && LA21_4<=WHERE)||(LA21_4>=ID && LA21_4<=INTEGER)||(LA21_4>=FLOAT && LA21_4<=BLOB)) ) {
                        alt21=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RPAREN:
                    {
                    alt21=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA21_0>=ABORT && LA21_0<=FROM)||(LA21_0>=GROUP && LA21_0<=IMMEDIATE)||(LA21_0>=INDEX && LA21_0<=IS)||(LA21_0>=JOIN && LA21_0<=LEFT)||LA21_0==LIMIT||LA21_0==NATURAL||(LA21_0>=NULL && LA21_0<=REFERENCES)||(LA21_0>=REINDEX && LA21_0<=WHERE)||LA21_0==ID) ) {
                alt21=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // SqlParser.g:114:5: LPAREN ( select_stmt )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN68=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_source656); 
                    // SqlParser.g:114:13: ( select_stmt )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==SELECT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // SqlParser.g:114:13: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_in_source659);
                            select_stmt69=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt69.getTree());

                            }
                            break;

                    }

                    RPAREN70=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_source662); 

                    }
                    break;
                case 2 :
                    // SqlParser.g:115:5: LPAREN expr ( COMMA expr )* RPAREN
                    {
                    LPAREN71=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_source669);  
                    stream_LPAREN.add(LPAREN71);

                    pushFollow(FOLLOW_expr_in_in_source671);
                    expr72=expr();

                    state._fsp--;

                    stream_expr.add(expr72.getTree());
                    // SqlParser.g:115:17: ( COMMA expr )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // SqlParser.g:115:18: COMMA expr
                    	    {
                    	    COMMA73=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_source674);  
                    	    stream_COMMA.add(COMMA73);

                    	    pushFollow(FOLLOW_expr_in_in_source676);
                    	    expr74=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr74.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    RPAREN75=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_source680);  
                    stream_RPAREN.add(RPAREN75);



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
                    // 115:38: -> ^( IN_VALUES ( expr )+ )
                    {
                        // SqlParser.g:115:41: ^( IN_VALUES ( expr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_VALUES, "IN_VALUES"), root_1);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // SqlParser.g:116:5: (database_name= id DOT )? table_name= id
                    {
                    // SqlParser.g:116:5: (database_name= id DOT )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==ID) ) {
                        int LA20_1 = input.LA(2);

                        if ( (LA20_1==DOT) ) {
                            alt20=1;
                        }
                    }
                    else if ( ((LA20_0>=ABORT && LA20_0<=FROM)||(LA20_0>=GROUP && LA20_0<=IMMEDIATE)||(LA20_0>=INDEX && LA20_0<=IS)||(LA20_0>=JOIN && LA20_0<=LEFT)||LA20_0==LIMIT||LA20_0==NATURAL||(LA20_0>=NULL && LA20_0<=REFERENCES)||(LA20_0>=REINDEX && LA20_0<=WHERE)) ) {
                        int LA20_2 = input.LA(2);

                        if ( (LA20_2==DOT) ) {
                            alt20=1;
                        }
                    }
                    switch (alt20) {
                        case 1 :
                            // SqlParser.g:116:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_in_source698);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT76=(Token)match(input,DOT,FOLLOW_DOT_in_in_source700);  
                            stream_DOT.add(DOT76);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_in_source706);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());


                    // AST REWRITE
                    // elements: table_name, database_name
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
                    // 116:43: -> ^( $table_name ( $database_name)? )
                    {
                        // SqlParser.g:116:46: ^( $table_name ( $database_name)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_1);

                        // SqlParser.g:116:60: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_1, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

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
    // $ANTLR end "in_source"

    public static class eq_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eq_subexpr"
    // SqlParser.g:119:1: eq_subexpr : neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* ;
    public final SqlParser.eq_subexpr_return eq_subexpr() throws RecognitionException {
        SqlParser.eq_subexpr_return retval = new SqlParser.eq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set78=null;
        SqlParser.neq_subexpr_return neq_subexpr77 = null;

        SqlParser.neq_subexpr_return neq_subexpr79 = null;


        Object set78_tree=null;

        try {
            // SqlParser.g:119:11: ( neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* )
            // SqlParser.g:119:13: neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr727);
            neq_subexpr77=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr77.getTree());
            // SqlParser.g:119:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=LESS && LA22_0<=GREATER_OR_EQ)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // SqlParser.g:119:26: ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr
            	    {
            	    set78=(Token)input.LT(1);
            	    set78=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LESS && input.LA(1)<=GREATER_OR_EQ) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set78), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr747);
            	    neq_subexpr79=neq_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, neq_subexpr79.getTree());

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
    // $ANTLR end "eq_subexpr"

    public static class neq_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "neq_subexpr"
    // SqlParser.g:121:1: neq_subexpr : bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* ;
    public final SqlParser.neq_subexpr_return neq_subexpr() throws RecognitionException {
        SqlParser.neq_subexpr_return retval = new SqlParser.neq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set81=null;
        SqlParser.bit_subexpr_return bit_subexpr80 = null;

        SqlParser.bit_subexpr_return bit_subexpr82 = null;


        Object set81_tree=null;

        try {
            // SqlParser.g:121:12: ( bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* )
            // SqlParser.g:121:14: bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr756);
            bit_subexpr80=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr80.getTree());
            // SqlParser.g:121:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=SHIFT_LEFT && LA23_0<=PIPE)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // SqlParser.g:121:27: ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr
            	    {
            	    set81=(Token)input.LT(1);
            	    set81=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHIFT_LEFT && input.LA(1)<=PIPE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set81), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr776);
            	    bit_subexpr82=bit_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bit_subexpr82.getTree());

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
    // $ANTLR end "neq_subexpr"

    public static class bit_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bit_subexpr"
    // SqlParser.g:123:1: bit_subexpr : add_subexpr ( ( PLUS | MINUS ) add_subexpr )* ;
    public final SqlParser.bit_subexpr_return bit_subexpr() throws RecognitionException {
        SqlParser.bit_subexpr_return retval = new SqlParser.bit_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set84=null;
        SqlParser.add_subexpr_return add_subexpr83 = null;

        SqlParser.add_subexpr_return add_subexpr85 = null;


        Object set84_tree=null;

        try {
            // SqlParser.g:123:12: ( add_subexpr ( ( PLUS | MINUS ) add_subexpr )* )
            // SqlParser.g:123:14: add_subexpr ( ( PLUS | MINUS ) add_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr785);
            add_subexpr83=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr83.getTree());
            // SqlParser.g:123:26: ( ( PLUS | MINUS ) add_subexpr )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=PLUS && LA24_0<=MINUS)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // SqlParser.g:123:27: ( PLUS | MINUS ) add_subexpr
            	    {
            	    set84=(Token)input.LT(1);
            	    set84=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set84), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr797);
            	    add_subexpr85=add_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add_subexpr85.getTree());

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
    // $ANTLR end "bit_subexpr"

    public static class add_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_subexpr"
    // SqlParser.g:125:1: add_subexpr : mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* ;
    public final SqlParser.add_subexpr_return add_subexpr() throws RecognitionException {
        SqlParser.add_subexpr_return retval = new SqlParser.add_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set87=null;
        SqlParser.mul_subexpr_return mul_subexpr86 = null;

        SqlParser.mul_subexpr_return mul_subexpr88 = null;


        Object set87_tree=null;

        try {
            // SqlParser.g:125:12: ( mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* )
            // SqlParser.g:125:14: mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr806);
            mul_subexpr86=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr86.getTree());
            // SqlParser.g:125:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=ASTERISK && LA25_0<=PERCENT)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // SqlParser.g:125:27: ( ASTERISK | SLASH | PERCENT ) mul_subexpr
            	    {
            	    set87=(Token)input.LT(1);
            	    set87=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ASTERISK && input.LA(1)<=PERCENT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set87), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr822);
            	    mul_subexpr88=mul_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_subexpr88.getTree());

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
    // $ANTLR end "add_subexpr"

    public static class mul_subexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mul_subexpr"
    // SqlParser.g:127:1: mul_subexpr : con_subexpr ( DOUBLE_PIPE con_subexpr )* ;
    public final SqlParser.mul_subexpr_return mul_subexpr() throws RecognitionException {
        SqlParser.mul_subexpr_return retval = new SqlParser.mul_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_PIPE90=null;
        SqlParser.con_subexpr_return con_subexpr89 = null;

        SqlParser.con_subexpr_return con_subexpr91 = null;


        Object DOUBLE_PIPE90_tree=null;

        try {
            // SqlParser.g:127:12: ( con_subexpr ( DOUBLE_PIPE con_subexpr )* )
            // SqlParser.g:127:14: con_subexpr ( DOUBLE_PIPE con_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr831);
            con_subexpr89=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr89.getTree());
            // SqlParser.g:127:26: ( DOUBLE_PIPE con_subexpr )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==DOUBLE_PIPE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // SqlParser.g:127:27: DOUBLE_PIPE con_subexpr
            	    {
            	    DOUBLE_PIPE90=(Token)match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_mul_subexpr834); 
            	    DOUBLE_PIPE90_tree = (Object)adaptor.create(DOUBLE_PIPE90);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE90_tree, root_0);

            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr837);
            	    con_subexpr91=con_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, con_subexpr91.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // SqlParser.g:129:1: con_subexpr : ( PLUS | MINUS | TILDA | NOT )? unary_subexpr ;
    public final SqlParser.con_subexpr_return con_subexpr() throws RecognitionException {
        SqlParser.con_subexpr_return retval = new SqlParser.con_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set92=null;
        SqlParser.unary_subexpr_return unary_subexpr93 = null;


        Object set92_tree=null;

        try {
            // SqlParser.g:129:12: ( ( PLUS | MINUS | TILDA | NOT )? unary_subexpr )
            // SqlParser.g:129:14: ( PLUS | MINUS | TILDA | NOT )? unary_subexpr
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:129:14: ( PLUS | MINUS | TILDA | NOT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=PLUS && LA27_0<=TILDA)||LA27_0==NOT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // SqlParser.g:
                    {
                    set92=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=TILDA)||input.LA(1)==NOT ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set92));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_unary_subexpr_in_con_subexpr863);
            unary_subexpr93=unary_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, unary_subexpr93.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:131:1: unary_subexpr : atom_expr ( COLLATE collation_name= ID )? ;
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
            // SqlParser.g:131:14: ( atom_expr ( COLLATE collation_name= ID )? )
            // SqlParser.g:131:16: atom_expr ( COLLATE collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_unary_subexpr870);
            atom_expr94=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr94.getTree());
            // SqlParser.g:131:26: ( COLLATE collation_name= ID )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==COLLATE) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==ID) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // SqlParser.g:131:27: COLLATE collation_name= ID
                    {
                    COLLATE95=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr873); 
                    COLLATE95_tree = (Object)adaptor.create(COLLATE95);
                    root_0 = (Object)adaptor.becomeRoot(COLLATE95_tree, root_0);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr878); 
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
    // SqlParser.g:133:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );
    public final SqlParser.atom_expr_return atom_expr() throws RecognitionException {
        SqlParser.atom_expr_return retval = new SqlParser.atom_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token column_name=null;
        Token function_name=null;
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
        Token EXISTS114=null;
        Token LPAREN115=null;
        Token RPAREN117=null;
        Token CASE118=null;
        Token WHEN120=null;
        Token THEN122=null;
        Token ELSE124=null;
        Token END126=null;
        List list_args=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.literal_value_return literal_value96 = null;

        SqlParser.bind_parameter_return bind_parameter97 = null;

        SqlParser.expr_return expr106 = null;

        SqlParser.expr_return expr110 = null;

        SqlParser.type_name_return type_name112 = null;

        SqlParser.select_stmt_return select_stmt116 = null;

        SqlParser.expr_return expr119 = null;

        SqlParser.expr_return expr121 = null;

        SqlParser.expr_return expr123 = null;

        SqlParser.expr_return expr125 = null;

        SqlParser.raise_function_return raise_function127 = null;

        SqlParser.expr_return args = null;
         args = null;
        Object column_name_tree=null;
        Object function_name_tree=null;
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
        Object EXISTS114_tree=null;
        Object LPAREN115_tree=null;
        Object RPAREN117_tree=null;
        Object CASE118_tree=null;
        Object WHEN120_tree=null;
        Object THEN122_tree=null;
        Object ELSE124_tree=null;
        Object END126_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:134:3: ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function )
            int alt38=9;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // SqlParser.g:134:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_value_in_atom_expr890);
                    literal_value96=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value96.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:135:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bind_parameter_in_atom_expr896);
                    bind_parameter97=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter97.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:136:5: ( (database_name= id DOT )? table_name= id DOT )? column_name= ID
                    {
                    // SqlParser.g:136:5: ( (database_name= id DOT )? table_name= id DOT )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==ID) ) {
                        int LA30_1 = input.LA(2);

                        if ( (LA30_1==DOT) ) {
                            alt30=1;
                        }
                    }
                    else if ( ((LA30_0>=ABORT && LA30_0<=FROM)||(LA30_0>=GROUP && LA30_0<=IMMEDIATE)||(LA30_0>=INDEX && LA30_0<=IS)||(LA30_0>=JOIN && LA30_0<=LEFT)||LA30_0==LIMIT||LA30_0==NATURAL||(LA30_0>=NULL && LA30_0<=REFERENCES)||(LA30_0>=REINDEX && LA30_0<=WHERE)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // SqlParser.g:136:6: (database_name= id DOT )? table_name= id DOT
                            {
                            // SqlParser.g:136:6: (database_name= id DOT )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==ID) ) {
                                int LA29_1 = input.LA(2);

                                if ( (LA29_1==DOT) ) {
                                    int LA29_3 = input.LA(3);

                                    if ( (LA29_3==ID) ) {
                                        int LA29_4 = input.LA(4);

                                        if ( (LA29_4==DOT) ) {
                                            alt29=1;
                                        }
                                    }
                                    else if ( ((LA29_3>=ABORT && LA29_3<=FROM)||(LA29_3>=GROUP && LA29_3<=IMMEDIATE)||(LA29_3>=INDEX && LA29_3<=IS)||(LA29_3>=JOIN && LA29_3<=LEFT)||LA29_3==LIMIT||LA29_3==NATURAL||(LA29_3>=NULL && LA29_3<=REFERENCES)||(LA29_3>=REINDEX && LA29_3<=WHERE)) ) {
                                        alt29=1;
                                    }
                                }
                            }
                            else if ( ((LA29_0>=ABORT && LA29_0<=FROM)||(LA29_0>=GROUP && LA29_0<=IMMEDIATE)||(LA29_0>=INDEX && LA29_0<=IS)||(LA29_0>=JOIN && LA29_0<=LEFT)||LA29_0==LIMIT||LA29_0==NATURAL||(LA29_0>=NULL && LA29_0<=REFERENCES)||(LA29_0>=REINDEX && LA29_0<=WHERE)) ) {
                                int LA29_2 = input.LA(2);

                                if ( (LA29_2==DOT) ) {
                                    int LA29_3 = input.LA(3);

                                    if ( (LA29_3==ID) ) {
                                        int LA29_4 = input.LA(4);

                                        if ( (LA29_4==DOT) ) {
                                            alt29=1;
                                        }
                                    }
                                    else if ( ((LA29_3>=ABORT && LA29_3<=FROM)||(LA29_3>=GROUP && LA29_3<=IMMEDIATE)||(LA29_3>=INDEX && LA29_3<=IS)||(LA29_3>=JOIN && LA29_3<=LEFT)||LA29_3==LIMIT||LA29_3==NATURAL||(LA29_3>=NULL && LA29_3<=REFERENCES)||(LA29_3>=REINDEX && LA29_3<=WHERE)) ) {
                                        alt29=1;
                                    }
                                }
                            }
                            switch (alt29) {
                                case 1 :
                                    // SqlParser.g:136:7: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_atom_expr906);
                                    database_name=id();

                                    state._fsp--;

                                    stream_id.add(database_name.getTree());
                                    DOT98=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr908);  
                                    stream_DOT.add(DOT98);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_atom_expr914);
                            table_name=id();

                            state._fsp--;

                            stream_id.add(table_name.getTree());
                            DOT99=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr916);  
                            stream_DOT.add(DOT99);


                            }
                            break;

                    }

                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr922);  
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
                    // 136:65: -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                    {
                        // SqlParser.g:136:68: ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_EXPRESSION, "COLUMN_EXPRESSION"), root_1);

                        // SqlParser.g:136:88: ^( $column_name ( ^( $table_name ( $database_name)? ) )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_2);

                        // SqlParser.g:136:103: ( ^( $table_name ( $database_name)? ) )?
                        if ( stream_table_name.hasNext()||stream_database_name.hasNext() ) {
                            // SqlParser.g:136:103: ^( $table_name ( $database_name)? )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                            // SqlParser.g:136:117: ( $database_name)?
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
                    // SqlParser.g:137:5: function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    function_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr951); 
                    function_name_tree = (Object)adaptor.create(function_name);
                    adaptor.addChild(root_0, function_name_tree);

                    LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr953); 
                    LPAREN100_tree = (Object)adaptor.create(LPAREN100);
                    adaptor.addChild(root_0, LPAREN100_tree);

                    // SqlParser.g:137:29: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
                    int alt33=3;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=PLUS && LA33_0<=TILDA)||LA33_0==LPAREN||(LA33_0>=QUESTION && LA33_0<=AT)||(LA33_0>=ABORT && LA33_0<=FROM)||(LA33_0>=GROUP && LA33_0<=IMMEDIATE)||(LA33_0>=INDEX && LA33_0<=IS)||(LA33_0>=JOIN && LA33_0<=LEFT)||LA33_0==LIMIT||(LA33_0>=NATURAL && LA33_0<=NOT)||(LA33_0>=NULL && LA33_0<=REFERENCES)||(LA33_0>=REINDEX && LA33_0<=WHERE)||(LA33_0>=ID && LA33_0<=INTEGER)||(LA33_0>=FLOAT && LA33_0<=BLOB)) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==ASTERISK) ) {
                        alt33=2;
                    }
                    switch (alt33) {
                        case 1 :
                            // SqlParser.g:137:30: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // SqlParser.g:137:30: ( DISTINCT )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==DISTINCT) ) {
                                int LA31_1 = input.LA(2);

                                if ( ((LA31_1>=PLUS && LA31_1<=TILDA)||LA31_1==LPAREN||(LA31_1>=QUESTION && LA31_1<=AT)||(LA31_1>=ABORT && LA31_1<=FROM)||(LA31_1>=GROUP && LA31_1<=IMMEDIATE)||(LA31_1>=INDEX && LA31_1<=IS)||(LA31_1>=JOIN && LA31_1<=LEFT)||LA31_1==LIMIT||(LA31_1>=NATURAL && LA31_1<=NOT)||(LA31_1>=NULL && LA31_1<=REFERENCES)||(LA31_1>=REINDEX && LA31_1<=WHERE)||(LA31_1>=ID && LA31_1<=INTEGER)||(LA31_1>=FLOAT && LA31_1<=BLOB)) ) {
                                    alt31=1;
                                }
                            }
                            switch (alt31) {
                                case 1 :
                                    // SqlParser.g:137:31: DISTINCT
                                    {
                                    DISTINCT101=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr957); 
                                    DISTINCT101_tree = (Object)adaptor.create(DISTINCT101);
                                    adaptor.addChild(root_0, DISTINCT101_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_atom_expr963);
                            args=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());

                            // SqlParser.g:137:53: ( COMMA args+= expr )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==COMMA) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // SqlParser.g:137:54: COMMA args+= expr
                            	    {
                            	    COMMA102=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr966); 
                            	    COMMA102_tree = (Object)adaptor.create(COMMA102);
                            	    adaptor.addChild(root_0, COMMA102_tree);

                            	    pushFollow(FOLLOW_expr_in_atom_expr970);
                            	    args=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, args.getTree());
                            	    if (list_args==null) list_args=new ArrayList();
                            	    list_args.add(args.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:137:75: ASTERISK
                            {
                            ASTERISK103=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr976); 
                            ASTERISK103_tree = (Object)adaptor.create(ASTERISK103);
                            adaptor.addChild(root_0, ASTERISK103_tree);


                            }
                            break;

                    }

                    RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr980); 
                    RPAREN104_tree = (Object)adaptor.create(RPAREN104);
                    adaptor.addChild(root_0, RPAREN104_tree);


                    }
                    break;
                case 5 :
                    // SqlParser.g:138:5: LPAREN expr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN105=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr986); 
                    pushFollow(FOLLOW_expr_in_atom_expr989);
                    expr106=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr106.getTree());
                    RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr991); 

                    }
                    break;
                case 6 :
                    // SqlParser.g:139:5: CAST LPAREN expr AS type_name RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    CAST108=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr998); 
                    CAST108_tree = (Object)adaptor.create(CAST108);
                    adaptor.addChild(root_0, CAST108_tree);

                    LPAREN109=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1000); 
                    LPAREN109_tree = (Object)adaptor.create(LPAREN109);
                    adaptor.addChild(root_0, LPAREN109_tree);

                    pushFollow(FOLLOW_expr_in_atom_expr1002);
                    expr110=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr110.getTree());
                    AS111=(Token)match(input,AS,FOLLOW_AS_in_atom_expr1004); 
                    AS111_tree = (Object)adaptor.create(AS111);
                    adaptor.addChild(root_0, AS111_tree);

                    pushFollow(FOLLOW_type_name_in_atom_expr1006);
                    type_name112=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name112.getTree());
                    RPAREN113=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1008); 
                    RPAREN113_tree = (Object)adaptor.create(RPAREN113);
                    adaptor.addChild(root_0, RPAREN113_tree);


                    }
                    break;
                case 7 :
                    // SqlParser.g:140:5: ( EXISTS )? LPAREN select_stmt RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:140:5: ( EXISTS )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==EXISTS) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // SqlParser.g:140:53: EXISTS
                            {
                            EXISTS114=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_atom_expr1017); 
                            EXISTS114_tree = (Object)adaptor.create(EXISTS114);
                            adaptor.addChild(root_0, EXISTS114_tree);


                            }
                            break;

                    }

                    LPAREN115=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr1021); 
                    LPAREN115_tree = (Object)adaptor.create(LPAREN115);
                    adaptor.addChild(root_0, LPAREN115_tree);

                    pushFollow(FOLLOW_select_stmt_in_atom_expr1023);
                    select_stmt116=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt116.getTree());
                    RPAREN117=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr1025); 
                    RPAREN117_tree = (Object)adaptor.create(RPAREN117);
                    adaptor.addChild(root_0, RPAREN117_tree);


                    }
                    break;
                case 8 :
                    // SqlParser.g:141:5: CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END
                    {
                    root_0 = (Object)adaptor.nil();

                    CASE118=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr1031); 
                    CASE118_tree = (Object)adaptor.create(CASE118);
                    adaptor.addChild(root_0, CASE118_tree);

                    // SqlParser.g:141:10: ( expr )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=PLUS && LA35_0<=TILDA)||LA35_0==LPAREN||(LA35_0>=QUESTION && LA35_0<=AT)||(LA35_0>=ABORT && LA35_0<=FROM)||(LA35_0>=GROUP && LA35_0<=IMMEDIATE)||(LA35_0>=INDEX && LA35_0<=IS)||(LA35_0>=JOIN && LA35_0<=LEFT)||LA35_0==LIMIT||(LA35_0>=NATURAL && LA35_0<=NOT)||(LA35_0>=NULL && LA35_0<=REFERENCES)||(LA35_0>=REINDEX && LA35_0<=VIRTUAL)||LA35_0==WHERE||(LA35_0>=ID && LA35_0<=INTEGER)||(LA35_0>=FLOAT && LA35_0<=BLOB)) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==WHEN) ) {
                        int LA35_2 = input.LA(2);

                        if ( (LA35_2==DOT) ) {
                            alt35=1;
                        }
                    }
                    switch (alt35) {
                        case 1 :
                            // SqlParser.g:141:11: expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr1034);
                            expr119=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr119.getTree());

                            }
                            break;

                    }

                    // SqlParser.g:141:18: ( WHEN expr THEN expr )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==WHEN) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // SqlParser.g:141:19: WHEN expr THEN expr
                    	    {
                    	    WHEN120=(Token)match(input,WHEN,FOLLOW_WHEN_in_atom_expr1039); 
                    	    WHEN120_tree = (Object)adaptor.create(WHEN120);
                    	    adaptor.addChild(root_0, WHEN120_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr1041);
                    	    expr121=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr121.getTree());
                    	    THEN122=(Token)match(input,THEN,FOLLOW_THEN_in_atom_expr1043); 
                    	    THEN122_tree = (Object)adaptor.create(THEN122);
                    	    adaptor.addChild(root_0, THEN122_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr1045);
                    	    expr123=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr123.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    // SqlParser.g:141:41: ( ELSE expr )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ELSE) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // SqlParser.g:141:42: ELSE expr
                            {
                            ELSE124=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr1050); 
                            ELSE124_tree = (Object)adaptor.create(ELSE124);
                            adaptor.addChild(root_0, ELSE124_tree);

                            pushFollow(FOLLOW_expr_in_atom_expr1052);
                            expr125=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr125.getTree());

                            }
                            break;

                    }

                    END126=(Token)match(input,END,FOLLOW_END_in_atom_expr1056); 
                    END126_tree = (Object)adaptor.create(END126);
                    adaptor.addChild(root_0, END126_tree);


                    }
                    break;
                case 9 :
                    // SqlParser.g:142:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_function_in_atom_expr1062);
                    raise_function127=raise_function();

                    state._fsp--;

                    adaptor.addChild(root_0, raise_function127.getTree());

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
    // SqlParser.g:145:1: literal_value : ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) );
    public final SqlParser.literal_value_return literal_value() throws RecognitionException {
        SqlParser.literal_value_return retval = new SqlParser.literal_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTEGER128=null;
        Token FLOAT129=null;
        Token STRING130=null;
        Token BLOB131=null;
        Token NULL132=null;
        Token CURRENT_TIME133=null;
        Token CURRENT_DATE134=null;
        Token CURRENT_TIMESTAMP135=null;

        Object INTEGER128_tree=null;
        Object FLOAT129_tree=null;
        Object STRING130_tree=null;
        Object BLOB131_tree=null;
        Object NULL132_tree=null;
        Object CURRENT_TIME133_tree=null;
        Object CURRENT_DATE134_tree=null;
        Object CURRENT_TIMESTAMP135_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BLOB=new RewriteRuleTokenStream(adaptor,"token BLOB");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_CURRENT_TIMESTAMP=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIMESTAMP");
        RewriteRuleTokenStream stream_CURRENT_DATE=new RewriteRuleTokenStream(adaptor,"token CURRENT_DATE");
        RewriteRuleTokenStream stream_CURRENT_TIME=new RewriteRuleTokenStream(adaptor,"token CURRENT_TIME");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // SqlParser.g:146:3: ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) )
            int alt39=8;
            switch ( input.LA(1) ) {
            case INTEGER:
                {
                alt39=1;
                }
                break;
            case FLOAT:
                {
                alt39=2;
                }
                break;
            case STRING:
                {
                alt39=3;
                }
                break;
            case BLOB:
                {
                alt39=4;
                }
                break;
            case NULL:
                {
                alt39=5;
                }
                break;
            case CURRENT_TIME:
                {
                alt39=6;
                }
                break;
            case CURRENT_DATE:
                {
                alt39=7;
                }
                break;
            case CURRENT_TIMESTAMP:
                {
                alt39=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // SqlParser.g:146:5: INTEGER
                    {
                    INTEGER128=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal_value1075);  
                    stream_INTEGER.add(INTEGER128);



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
                    // 146:13: -> ^( INTEGER_LITERAL INTEGER )
                    {
                        // SqlParser.g:146:16: ^( INTEGER_LITERAL INTEGER )
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
                    // SqlParser.g:147:5: FLOAT
                    {
                    FLOAT129=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal_value1089);  
                    stream_FLOAT.add(FLOAT129);



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
                    // 147:11: -> ^( FLOAT_LITERAL FLOAT )
                    {
                        // SqlParser.g:147:14: ^( FLOAT_LITERAL FLOAT )
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
                    // SqlParser.g:148:5: STRING
                    {
                    STRING130=(Token)match(input,STRING,FOLLOW_STRING_in_literal_value1103);  
                    stream_STRING.add(STRING130);



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
                    // 148:12: -> ^( STRING_LITERAL STRING )
                    {
                        // SqlParser.g:148:15: ^( STRING_LITERAL STRING )
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
                    // SqlParser.g:149:5: BLOB
                    {
                    BLOB131=(Token)match(input,BLOB,FOLLOW_BLOB_in_literal_value1117);  
                    stream_BLOB.add(BLOB131);



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
                    // 149:10: -> ^( BLOB_LITERAL BLOB )
                    {
                        // SqlParser.g:149:13: ^( BLOB_LITERAL BLOB )
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
                    // SqlParser.g:150:5: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL132=(Token)match(input,NULL,FOLLOW_NULL_in_literal_value1131); 
                    NULL132_tree = (Object)adaptor.create(NULL132);
                    adaptor.addChild(root_0, NULL132_tree);


                    }
                    break;
                case 6 :
                    // SqlParser.g:151:5: CURRENT_TIME
                    {
                    CURRENT_TIME133=(Token)match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_literal_value1137);  
                    stream_CURRENT_TIME.add(CURRENT_TIME133);



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
                    // 151:18: -> ^( FUNCTION_LITERAL CURRENT_TIME )
                    {
                        // SqlParser.g:151:21: ^( FUNCTION_LITERAL CURRENT_TIME )
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
                    // SqlParser.g:152:5: CURRENT_DATE
                    {
                    CURRENT_DATE134=(Token)match(input,CURRENT_DATE,FOLLOW_CURRENT_DATE_in_literal_value1151);  
                    stream_CURRENT_DATE.add(CURRENT_DATE134);



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
                    // 152:18: -> ^( FUNCTION_LITERAL CURRENT_DATE )
                    {
                        // SqlParser.g:152:21: ^( FUNCTION_LITERAL CURRENT_DATE )
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
                    // SqlParser.g:153:5: CURRENT_TIMESTAMP
                    {
                    CURRENT_TIMESTAMP135=(Token)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_literal_value1165);  
                    stream_CURRENT_TIMESTAMP.add(CURRENT_TIMESTAMP135);



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
                    // 153:23: -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                    {
                        // SqlParser.g:153:26: ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
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
    // SqlParser.g:156:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );
    public final SqlParser.bind_parameter_return bind_parameter() throws RecognitionException {
        SqlParser.bind_parameter_return retval = new SqlParser.bind_parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token position=null;
        Token QUESTION136=null;
        Token QUESTION137=null;
        Token COLON138=null;
        Token AT139=null;
        SqlParser.id_return name = null;


        Object position_tree=null;
        Object QUESTION136_tree=null;
        Object QUESTION137_tree=null;
        Object COLON138_tree=null;
        Object AT139_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:157:3: ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) )
            int alt40=4;
            switch ( input.LA(1) ) {
            case QUESTION:
                {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==INTEGER) ) {
                    alt40=2;
                }
                else if ( ((LA40_1>=EQUALS && LA40_1<=MINUS)||(LA40_1>=ASTERISK && LA40_1<=SEMI)||LA40_1==COMMA||LA40_1==RPAREN||(LA40_1>=ABORT && LA40_1<=WHERE)||LA40_1==ID) ) {
                    alt40=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
                }
                break;
            case COLON:
                {
                alt40=3;
                }
                break;
            case AT:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // SqlParser.g:157:5: QUESTION
                    {
                    QUESTION136=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1186);  
                    stream_QUESTION.add(QUESTION136);



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
                    // 157:14: -> BIND
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(BIND, "BIND"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:158:5: QUESTION position= INTEGER
                    {
                    QUESTION137=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1196);  
                    stream_QUESTION.add(QUESTION137);

                    position=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter1200);  
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
                    // 158:31: -> ^( BIND $position)
                    {
                        // SqlParser.g:158:34: ^( BIND $position)
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
                    // SqlParser.g:159:5: COLON name= id
                    {
                    COLON138=(Token)match(input,COLON,FOLLOW_COLON_in_bind_parameter1215);  
                    stream_COLON.add(COLON138);

                    pushFollow(FOLLOW_id_in_bind_parameter1219);
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
                    // 159:19: -> ^( BIND_NAME $name)
                    {
                        // SqlParser.g:159:22: ^( BIND_NAME $name)
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
                    // SqlParser.g:160:5: AT name= id
                    {
                    AT139=(Token)match(input,AT,FOLLOW_AT_in_bind_parameter1234);  
                    stream_AT.add(AT139);

                    pushFollow(FOLLOW_id_in_bind_parameter1238);
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
                    // 160:16: -> ^( BIND_NAME $name)
                    {
                        // SqlParser.g:160:19: ^( BIND_NAME $name)
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
    // SqlParser.g:164:1: raise_function : RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN ;
    public final SqlParser.raise_function_return raise_function() throws RecognitionException {
        SqlParser.raise_function_return retval = new SqlParser.raise_function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token error_message=null;
        Token RAISE140=null;
        Token LPAREN141=null;
        Token IGNORE142=null;
        Token set143=null;
        Token COMMA144=null;
        Token RPAREN145=null;

        Object error_message_tree=null;
        Object RAISE140_tree=null;
        Object LPAREN141_tree=null;
        Object IGNORE142_tree=null;
        Object set143_tree=null;
        Object COMMA144_tree=null;
        Object RPAREN145_tree=null;

        try {
            // SqlParser.g:164:15: ( RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN )
            // SqlParser.g:164:17: RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RAISE140=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function1258); 
            RAISE140_tree = (Object)adaptor.create(RAISE140);
            root_0 = (Object)adaptor.becomeRoot(RAISE140_tree, root_0);

            LPAREN141=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function1261); 
            // SqlParser.g:164:32: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING )
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
                    // SqlParser.g:164:33: IGNORE
                    {
                    IGNORE142=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function1265); 
                    IGNORE142_tree = (Object)adaptor.create(IGNORE142);
                    adaptor.addChild(root_0, IGNORE142_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:164:42: ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING
                    {
                    set143=(Token)input.LT(1);
                    if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==ROLLBACK ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set143));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    COMMA144=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1281); 
                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1286); 
                    error_message_tree = (Object)adaptor.create(error_message);
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }

            RPAREN145=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1289); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:166:1: type_name : (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) ;
    public final SqlParser.type_name_return type_name() throws RecognitionException {
        SqlParser.type_name_return retval = new SqlParser.type_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN146=null;
        Token COMMA147=null;
        Token RPAREN148=null;
        Token names=null;
        List list_names=null;
        SqlParser.signed_number_return size1 = null;

        SqlParser.signed_number_return size2 = null;


        Object LPAREN146_tree=null;
        Object COMMA147_tree=null;
        Object RPAREN148_tree=null;
        Object names_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_signed_number=new RewriteRuleSubtreeStream(adaptor,"rule signed_number");
        try {
            // SqlParser.g:166:10: ( (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) )
            // SqlParser.g:166:12: (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            {
            // SqlParser.g:166:17: (names+= ID )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // SqlParser.g:166:17: names+= ID
            	    {
            	    names=(Token)match(input,ID,FOLLOW_ID_in_type_name1299);  
            	    stream_ID.add(names);

            	    if (list_names==null) list_names=new ArrayList();
            	    list_names.add(names);


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            // SqlParser.g:166:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==LPAREN) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // SqlParser.g:166:24: LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN
                    {
                    LPAREN146=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name1303);  
                    stream_LPAREN.add(LPAREN146);

                    pushFollow(FOLLOW_signed_number_in_type_name1307);
                    size1=signed_number();

                    state._fsp--;

                    stream_signed_number.add(size1.getTree());
                    // SqlParser.g:166:51: ( COMMA size2= signed_number )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==COMMA) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // SqlParser.g:166:52: COMMA size2= signed_number
                            {
                            COMMA147=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name1310);  
                            stream_COMMA.add(COMMA147);

                            pushFollow(FOLLOW_signed_number_in_type_name1314);
                            size2=signed_number();

                            state._fsp--;

                            stream_signed_number.add(size2.getTree());

                            }
                            break;

                    }

                    RPAREN148=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name1318);  
                    stream_RPAREN.add(RPAREN148);


                    }
                    break;

            }



            // AST REWRITE
            // elements: size2, size1, names
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
            // 167:1: -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
            {
                // SqlParser.g:167:4: ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                // SqlParser.g:167:11: ^( TYPE_PARAMS ( $size1)? ( $size2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS"), root_2);

                // SqlParser.g:167:25: ( $size1)?
                if ( stream_size1.hasNext() ) {
                    adaptor.addChild(root_2, stream_size1.nextTree());

                }
                stream_size1.reset();
                // SqlParser.g:167:33: ( $size2)?
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
    // SqlParser.g:170:1: pragma_stmt : PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? ;
    public final SqlParser.pragma_stmt_return pragma_stmt() throws RecognitionException {
        SqlParser.pragma_stmt_return retval = new SqlParser.pragma_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRAGMA149=null;
        Token DOT150=null;
        Token EQUALS151=null;
        Token LPAREN153=null;
        Token RPAREN155=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return pragma_name = null;

        SqlParser.pragma_value_return pragma_value152 = null;

        SqlParser.pragma_value_return pragma_value154 = null;


        Object PRAGMA149_tree=null;
        Object DOT150_tree=null;
        Object EQUALS151_tree=null;
        Object LPAREN153_tree=null;
        Object RPAREN155_tree=null;

        try {
            // SqlParser.g:170:12: ( PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? )
            // SqlParser.g:170:14: PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA149=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1350); 
            PRAGMA149_tree = (Object)adaptor.create(PRAGMA149);
            adaptor.addChild(root_0, PRAGMA149_tree);

            // SqlParser.g:170:21: (database_name= id DOT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==DOT) ) {
                    alt45=1;
                }
            }
            else if ( ((LA45_0>=ABORT && LA45_0<=FROM)||(LA45_0>=GROUP && LA45_0<=IMMEDIATE)||(LA45_0>=INDEX && LA45_0<=IS)||(LA45_0>=JOIN && LA45_0<=LEFT)||LA45_0==LIMIT||LA45_0==NATURAL||(LA45_0>=NULL && LA45_0<=REFERENCES)||(LA45_0>=REINDEX && LA45_0<=WHERE)) ) {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==DOT) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // SqlParser.g:170:22: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_pragma_stmt1355);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT150=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1357); 
                    DOT150_tree = (Object)adaptor.create(DOT150);
                    adaptor.addChild(root_0, DOT150_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_pragma_stmt1363);
            pragma_name=id();

            state._fsp--;

            adaptor.addChild(root_0, pragma_name.getTree());
            // SqlParser.g:170:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==EQUALS) ) {
                alt46=1;
            }
            else if ( (LA46_0==LPAREN) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // SqlParser.g:170:61: EQUALS pragma_value
                    {
                    EQUALS151=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1366); 
                    EQUALS151_tree = (Object)adaptor.create(EQUALS151);
                    adaptor.addChild(root_0, EQUALS151_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1368);
                    pragma_value152=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value152.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:170:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN153=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1372); 
                    LPAREN153_tree = (Object)adaptor.create(LPAREN153);
                    adaptor.addChild(root_0, LPAREN153_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1374);
                    pragma_value154=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value154.getTree());
                    RPAREN155=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1376); 
                    RPAREN155_tree = (Object)adaptor.create(RPAREN155);
                    adaptor.addChild(root_0, RPAREN155_tree);


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
    // SqlParser.g:172:1: pragma_value : ( signed_number | name= id | STRING );
    public final SqlParser.pragma_value_return pragma_value() throws RecognitionException {
        SqlParser.pragma_value_return retval = new SqlParser.pragma_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING157=null;
        SqlParser.id_return name = null;

        SqlParser.signed_number_return signed_number156 = null;


        Object STRING157_tree=null;

        try {
            // SqlParser.g:172:13: ( signed_number | name= id | STRING )
            int alt47=3;
            switch ( input.LA(1) ) {
            case PLUS:
            case MINUS:
            case INTEGER:
            case FLOAT:
                {
                alt47=1;
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
                alt47=2;
                }
                break;
            case STRING:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // SqlParser.g:172:15: signed_number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_signed_number_in_pragma_value1385);
                    signed_number156=signed_number();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_number156.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:172:31: name= id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_pragma_value1391);
                    name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:172:41: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING157=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1395); 
                    STRING157_tree = (Object)adaptor.create(STRING157);
                    adaptor.addChild(root_0, STRING157_tree);


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
    // SqlParser.g:175:1: attach_stmt : ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id ;
    public final SqlParser.attach_stmt_return attach_stmt() throws RecognitionException {
        SqlParser.attach_stmt_return retval = new SqlParser.attach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token filename=null;
        Token ATTACH158=null;
        Token DATABASE159=null;
        Token STRING160=null;
        Token AS162=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return id161 = null;


        Object filename_tree=null;
        Object ATTACH158_tree=null;
        Object DATABASE159_tree=null;
        Object STRING160_tree=null;
        Object AS162_tree=null;

        try {
            // SqlParser.g:175:12: ( ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id )
            // SqlParser.g:175:14: ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id
            {
            root_0 = (Object)adaptor.nil();

            ATTACH158=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1403); 
            ATTACH158_tree = (Object)adaptor.create(ATTACH158);
            adaptor.addChild(root_0, ATTACH158_tree);

            // SqlParser.g:175:21: ( DATABASE )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==DATABASE) ) {
                int LA48_1 = input.LA(2);

                if ( ((LA48_1>=ABORT && LA48_1<=AND)||(LA48_1>=ASC && LA48_1<=FROM)||(LA48_1>=GROUP && LA48_1<=IMMEDIATE)||(LA48_1>=INDEX && LA48_1<=IS)||(LA48_1>=JOIN && LA48_1<=LEFT)||LA48_1==LIMIT||LA48_1==NATURAL||(LA48_1>=NULL && LA48_1<=REFERENCES)||(LA48_1>=REINDEX && LA48_1<=WHERE)||(LA48_1>=ID && LA48_1<=STRING)) ) {
                    alt48=1;
                }
                else if ( (LA48_1==AS) ) {
                    int LA48_4 = input.LA(3);

                    if ( (LA48_4==AS) ) {
                        int LA48_5 = input.LA(4);

                        if ( ((LA48_5>=ABORT && LA48_5<=FROM)||(LA48_5>=GROUP && LA48_5<=IMMEDIATE)||(LA48_5>=INDEX && LA48_5<=IS)||(LA48_5>=JOIN && LA48_5<=LEFT)||LA48_5==LIMIT||LA48_5==NATURAL||(LA48_5>=NULL && LA48_5<=REFERENCES)||(LA48_5>=REINDEX && LA48_5<=WHERE)||LA48_5==ID) ) {
                            alt48=1;
                        }
                    }
                }
            }
            switch (alt48) {
                case 1 :
                    // SqlParser.g:175:22: DATABASE
                    {
                    DATABASE159=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1406); 
                    DATABASE159_tree = (Object)adaptor.create(DATABASE159);
                    adaptor.addChild(root_0, DATABASE159_tree);


                    }
                    break;

            }

            // SqlParser.g:175:42: ( STRING | id )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==STRING) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=ABORT && LA49_0<=FROM)||(LA49_0>=GROUP && LA49_0<=IMMEDIATE)||(LA49_0>=INDEX && LA49_0<=IS)||(LA49_0>=JOIN && LA49_0<=LEFT)||LA49_0==LIMIT||LA49_0==NATURAL||(LA49_0>=NULL && LA49_0<=REFERENCES)||(LA49_0>=REINDEX && LA49_0<=WHERE)||LA49_0==ID) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // SqlParser.g:175:43: STRING
                    {
                    STRING160=(Token)match(input,STRING,FOLLOW_STRING_in_attach_stmt1413); 
                    STRING160_tree = (Object)adaptor.create(STRING160);
                    adaptor.addChild(root_0, STRING160_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:175:52: id
                    {
                    pushFollow(FOLLOW_id_in_attach_stmt1417);
                    id161=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id161.getTree());

                    }
                    break;

            }

            AS162=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1420); 
            AS162_tree = (Object)adaptor.create(AS162);
            adaptor.addChild(root_0, AS162_tree);

            pushFollow(FOLLOW_id_in_attach_stmt1424);
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
    // SqlParser.g:178:1: detach_stmt : DETACH ( DATABASE )? database_name= id ;
    public final SqlParser.detach_stmt_return detach_stmt() throws RecognitionException {
        SqlParser.detach_stmt_return retval = new SqlParser.detach_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DETACH163=null;
        Token DATABASE164=null;
        SqlParser.id_return database_name = null;


        Object DETACH163_tree=null;
        Object DATABASE164_tree=null;

        try {
            // SqlParser.g:178:12: ( DETACH ( DATABASE )? database_name= id )
            // SqlParser.g:178:14: DETACH ( DATABASE )? database_name= id
            {
            root_0 = (Object)adaptor.nil();

            DETACH163=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1432); 
            DETACH163_tree = (Object)adaptor.create(DETACH163);
            adaptor.addChild(root_0, DETACH163_tree);

            // SqlParser.g:178:21: ( DATABASE )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==DATABASE) ) {
                int LA50_1 = input.LA(2);

                if ( ((LA50_1>=ABORT && LA50_1<=FROM)||(LA50_1>=GROUP && LA50_1<=IMMEDIATE)||(LA50_1>=INDEX && LA50_1<=IS)||(LA50_1>=JOIN && LA50_1<=LEFT)||LA50_1==LIMIT||LA50_1==NATURAL||(LA50_1>=NULL && LA50_1<=REFERENCES)||(LA50_1>=REINDEX && LA50_1<=WHERE)||LA50_1==ID) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // SqlParser.g:178:22: DATABASE
                    {
                    DATABASE164=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1435); 
                    DATABASE164_tree = (Object)adaptor.create(DATABASE164);
                    adaptor.addChild(root_0, DATABASE164_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_detach_stmt1441);
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
    // SqlParser.g:181:1: analyze_stmt : ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? ;
    public final SqlParser.analyze_stmt_return analyze_stmt() throws RecognitionException {
        SqlParser.analyze_stmt_return retval = new SqlParser.analyze_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ANALYZE165=null;
        Token DOT166=null;
        SqlParser.id_return database_or_table_name = null;

        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object ANALYZE165_tree=null;
        Object DOT166_tree=null;

        try {
            // SqlParser.g:181:13: ( ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? )
            // SqlParser.g:181:15: ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ANALYZE165=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1449); 
            ANALYZE165_tree = (Object)adaptor.create(ANALYZE165);
            adaptor.addChild(root_0, ANALYZE165_tree);

            // SqlParser.g:181:23: (database_or_table_name= id | database_name= id DOT table_name= id )?
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==DOT) ) {
                    alt51=2;
                }
                else if ( (LA51_1==SEMI) ) {
                    alt51=1;
                }
            }
            else if ( ((LA51_0>=ABORT && LA51_0<=FROM)||(LA51_0>=GROUP && LA51_0<=IMMEDIATE)||(LA51_0>=INDEX && LA51_0<=IS)||(LA51_0>=JOIN && LA51_0<=LEFT)||LA51_0==LIMIT||LA51_0==NATURAL||(LA51_0>=NULL && LA51_0<=REFERENCES)||(LA51_0>=REINDEX && LA51_0<=WHERE)) ) {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==SEMI) ) {
                    alt51=1;
                }
                else if ( (LA51_2==DOT) ) {
                    alt51=2;
                }
            }
            switch (alt51) {
                case 1 :
                    // SqlParser.g:181:24: database_or_table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1454);
                    database_or_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_or_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:181:52: database_name= id DOT table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1460);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT166=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1462); 
                    DOT166_tree = (Object)adaptor.create(DOT166);
                    adaptor.addChild(root_0, DOT166_tree);

                    pushFollow(FOLLOW_id_in_analyze_stmt1466);
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
    // SqlParser.g:184:1: reindex_stmt : REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id ;
    public final SqlParser.reindex_stmt_return reindex_stmt() throws RecognitionException {
        SqlParser.reindex_stmt_return retval = new SqlParser.reindex_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REINDEX167=null;
        Token DOT168=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return collation_or_table_or_index_name = null;


        Object REINDEX167_tree=null;
        Object DOT168_tree=null;

        try {
            // SqlParser.g:184:13: ( REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id )
            // SqlParser.g:184:15: REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id
            {
            root_0 = (Object)adaptor.nil();

            REINDEX167=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1476); 
            REINDEX167_tree = (Object)adaptor.create(REINDEX167);
            adaptor.addChild(root_0, REINDEX167_tree);

            // SqlParser.g:184:23: (database_name= id DOT )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==DOT) ) {
                    alt52=1;
                }
            }
            else if ( ((LA52_0>=ABORT && LA52_0<=FROM)||(LA52_0>=GROUP && LA52_0<=IMMEDIATE)||(LA52_0>=INDEX && LA52_0<=IS)||(LA52_0>=JOIN && LA52_0<=LEFT)||LA52_0==LIMIT||LA52_0==NATURAL||(LA52_0>=NULL && LA52_0<=REFERENCES)||(LA52_0>=REINDEX && LA52_0<=WHERE)) ) {
                int LA52_2 = input.LA(2);

                if ( (LA52_2==DOT) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // SqlParser.g:184:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_reindex_stmt1481);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT168=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1483); 
                    DOT168_tree = (Object)adaptor.create(DOT168);
                    adaptor.addChild(root_0, DOT168_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_reindex_stmt1489);
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
    // SqlParser.g:187:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VACUUM169=null;

        Object VACUUM169_tree=null;

        try {
            // SqlParser.g:187:12: ( VACUUM )
            // SqlParser.g:187:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();

            VACUUM169=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1497); 
            VACUUM169_tree = (Object)adaptor.create(VACUUM169);
            adaptor.addChild(root_0, VACUUM169_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:193:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR170=null;
        Token set171=null;

        Object OR170_tree=null;
        Object set171_tree=null;

        try {
            // SqlParser.g:193:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:193:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            OR170=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1508); 
            OR170_tree = (Object)adaptor.create(OR170);
            adaptor.addChild(root_0, OR170_tree);

            set171=(Token)input.LT(1);
            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set171));
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
    // SqlParser.g:195:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
    public final SqlParser.ordering_term_return ordering_term() throws RecognitionException {
        SqlParser.ordering_term_return retval = new SqlParser.ordering_term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASC173=null;
        Token DESC174=null;
        SqlParser.expr_return expr172 = null;


        Object ASC173_tree=null;
        Object DESC174_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:195:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // SqlParser.g:195:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1535);
            expr172=expr();

            state._fsp--;

            stream_expr.add(expr172.getTree());
            // SqlParser.g:195:82: ( ASC | DESC )?
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ASC) ) {
                alt53=1;
            }
            else if ( (LA53_0==DESC) ) {
                alt53=2;
            }
            switch (alt53) {
                case 1 :
                    // SqlParser.g:195:83: ASC
                    {
                    ASC173=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1540);  
                    stream_ASC.add(ASC173);


                    }
                    break;
                case 2 :
                    // SqlParser.g:195:89: DESC
                    {
                    DESC174=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1544);  
                    stream_DESC.add(DESC174);


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
            // 196:1: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // SqlParser.g:196:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDERING, "ORDERING"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // SqlParser.g:196:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:196:27: ( DESC )?
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
    // SqlParser.g:198:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
    public final SqlParser.operation_limited_clause_return operation_limited_clause() throws RecognitionException {
        SqlParser.operation_limited_clause_return retval = new SqlParser.operation_limited_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER175=null;
        Token BY176=null;
        Token COMMA178=null;
        Token LIMIT180=null;
        Token set181=null;
        SqlParser.ordering_term_return ordering_term177 = null;

        SqlParser.ordering_term_return ordering_term179 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER175_tree=null;
        Object BY176_tree=null;
        Object COMMA178_tree=null;
        Object LIMIT180_tree=null;
        Object set181_tree=null;

        try {
            // SqlParser.g:198:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // SqlParser.g:199:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:199:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ORDER) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // SqlParser.g:199:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER175=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1574); 
                    ORDER175_tree = (Object)adaptor.create(ORDER175);
                    adaptor.addChild(root_0, ORDER175_tree);

                    BY176=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1576); 
                    BY176_tree = (Object)adaptor.create(BY176);
                    adaptor.addChild(root_0, BY176_tree);

                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1578);
                    ordering_term177=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term177.getTree());
                    // SqlParser.g:199:27: ( COMMA ordering_term )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==COMMA) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // SqlParser.g:199:28: COMMA ordering_term
                    	    {
                    	    COMMA178=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1581); 
                    	    COMMA178_tree = (Object)adaptor.create(COMMA178);
                    	    adaptor.addChild(root_0, COMMA178_tree);

                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1583);
                    	    ordering_term179=ordering_term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, ordering_term179.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            LIMIT180=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1591); 
            LIMIT180_tree = (Object)adaptor.create(LIMIT180);
            adaptor.addChild(root_0, LIMIT180_tree);

            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1595); 
            limit_tree = (Object)adaptor.create(limit);
            adaptor.addChild(root_0, limit_tree);

            // SqlParser.g:200:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==COMMA||LA56_0==OFFSET) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // SqlParser.g:200:24: ( OFFSET | COMMA ) offset= INTEGER
                    {
                    set181=(Token)input.LT(1);
                    if ( input.LA(1)==COMMA||input.LA(1)==OFFSET ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set181));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1608); 
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
    // SqlParser.g:203:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
    public final SqlParser.select_stmt_return select_stmt() throws RecognitionException {
        SqlParser.select_stmt_return retval = new SqlParser.select_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token limit=null;
        Token offset=null;
        Token ORDER183=null;
        Token BY184=null;
        Token COMMA186=null;
        Token LIMIT188=null;
        Token OFFSET189=null;
        Token COMMA190=null;
        SqlParser.select_list_return select_list182 = null;

        SqlParser.ordering_term_return ordering_term185 = null;

        SqlParser.ordering_term_return ordering_term187 = null;


        Object limit_tree=null;
        Object offset_tree=null;
        Object ORDER183_tree=null;
        Object BY184_tree=null;
        Object COMMA186_tree=null;
        Object LIMIT188_tree=null;
        Object OFFSET189_tree=null;
        Object COMMA190_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_OFFSET=new RewriteRuleTokenStream(adaptor,"token OFFSET");
        RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
        RewriteRuleSubtreeStream stream_ordering_term=new RewriteRuleSubtreeStream(adaptor,"rule ordering_term");
        try {
            // SqlParser.g:203:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // SqlParser.g:203:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1618);
            select_list182=select_list();

            state._fsp--;

            stream_select_list.add(select_list182.getTree());
            // SqlParser.g:204:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==ORDER) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // SqlParser.g:204:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER183=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1623);  
                    stream_ORDER.add(ORDER183);

                    BY184=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1625);  
                    stream_BY.add(BY184);

                    pushFollow(FOLLOW_ordering_term_in_select_stmt1627);
                    ordering_term185=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term185.getTree());
                    // SqlParser.g:204:27: ( COMMA ordering_term )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==COMMA) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // SqlParser.g:204:28: COMMA ordering_term
                    	    {
                    	    COMMA186=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1630);  
                    	    stream_COMMA.add(COMMA186);

                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1632);
                    	    ordering_term187=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term187.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            // SqlParser.g:205:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==LIMIT) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // SqlParser.g:205:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT188=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1641);  
                    stream_LIMIT.add(LIMIT188);

                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1645);  
                    stream_INTEGER.add(limit);

                    // SqlParser.g:205:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==COMMA||LA60_0==OFFSET) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // SqlParser.g:205:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // SqlParser.g:205:25: ( OFFSET | COMMA )
                            int alt59=2;
                            int LA59_0 = input.LA(1);

                            if ( (LA59_0==OFFSET) ) {
                                alt59=1;
                            }
                            else if ( (LA59_0==COMMA) ) {
                                alt59=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 59, 0, input);

                                throw nvae;
                            }
                            switch (alt59) {
                                case 1 :
                                    // SqlParser.g:205:26: OFFSET
                                    {
                                    OFFSET189=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1649);  
                                    stream_OFFSET.add(OFFSET189);


                                    }
                                    break;
                                case 2 :
                                    // SqlParser.g:205:35: COMMA
                                    {
                                    COMMA190=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1653);  
                                    stream_COMMA.add(COMMA190);


                                    }
                                    break;

                            }

                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1658);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: limit, ordering_term, offset, select_list, ORDER, LIMIT
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
            // 206:1: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // SqlParser.g:206:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());
                // SqlParser.g:207:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ordering_term.hasNext()||stream_ORDER.hasNext() ) {
                    // SqlParser.g:207:22: ^( ORDER ( ordering_term )+ )
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
                // SqlParser.g:207:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_limit.hasNext()||stream_offset.hasNext()||stream_LIMIT.hasNext() ) {
                    // SqlParser.g:207:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());
                    // SqlParser.g:207:62: ( $offset)?
                    if ( stream_offset.hasNext() ) {
                        adaptor.addChild(root_2, stream_offset.nextNode());

                    }
                    stream_offset.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_limit.reset();
                stream_offset.reset();
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
    // SqlParser.g:210:1: select_list : select_core ( select_op select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.select_core_return select_core191 = null;

        SqlParser.select_op_return select_op192 = null;

        SqlParser.select_core_return select_core193 = null;



        try {
            // SqlParser.g:210:12: ( select_core ( select_op select_core )* )
            // SqlParser.g:211:3: select_core ( select_op select_core )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_select_core_in_select_list1703);
            select_core191=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core191.getTree());
            // SqlParser.g:211:15: ( select_op select_core )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==EXCEPT||LA62_0==INTERSECT||LA62_0==UNION) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // SqlParser.g:211:16: select_op select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1706);
            	    select_op192=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op192.getTree(), root_0);
            	    pushFollow(FOLLOW_select_core_in_select_list1709);
            	    select_core193=select_core();

            	    state._fsp--;

            	    adaptor.addChild(root_0, select_core193.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // SqlParser.g:213:1: select_op : ( UNION ( ALL )? | INTERSECT | EXCEPT );
    public final SqlParser.select_op_return select_op() throws RecognitionException {
        SqlParser.select_op_return retval = new SqlParser.select_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNION194=null;
        Token ALL195=null;
        Token INTERSECT196=null;
        Token EXCEPT197=null;

        Object UNION194_tree=null;
        Object ALL195_tree=null;
        Object INTERSECT196_tree=null;
        Object EXCEPT197_tree=null;

        try {
            // SqlParser.g:213:10: ( UNION ( ALL )? | INTERSECT | EXCEPT )
            int alt64=3;
            switch ( input.LA(1) ) {
            case UNION:
                {
                alt64=1;
                }
                break;
            case INTERSECT:
                {
                alt64=2;
                }
                break;
            case EXCEPT:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // SqlParser.g:213:12: UNION ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UNION194=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1718); 
                    UNION194_tree = (Object)adaptor.create(UNION194);
                    root_0 = (Object)adaptor.becomeRoot(UNION194_tree, root_0);

                    // SqlParser.g:213:19: ( ALL )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==ALL) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // SqlParser.g:213:20: ALL
                            {
                            ALL195=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1722); 
                            ALL195_tree = (Object)adaptor.create(ALL195);
                            adaptor.addChild(root_0, ALL195_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:213:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();

                    INTERSECT196=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1728); 
                    INTERSECT196_tree = (Object)adaptor.create(INTERSECT196);
                    adaptor.addChild(root_0, INTERSECT196_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:213:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();

                    EXCEPT197=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1732); 
                    EXCEPT197_tree = (Object)adaptor.create(EXCEPT197);
                    adaptor.addChild(root_0, EXCEPT197_tree);


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
    // SqlParser.g:215:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
    public final SqlParser.select_core_return select_core() throws RecognitionException {
        SqlParser.select_core_return retval = new SqlParser.select_core_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT198=null;
        Token ALL199=null;
        Token DISTINCT200=null;
        Token COMMA202=null;
        Token FROM204=null;
        Token WHERE206=null;
        Token GROUP207=null;
        Token BY208=null;
        Token COMMA210=null;
        Token HAVING212=null;
        SqlParser.expr_return where_expr = null;

        SqlParser.expr_return having_expr = null;

        SqlParser.result_column_return result_column201 = null;

        SqlParser.result_column_return result_column203 = null;

        SqlParser.join_source_return join_source205 = null;

        SqlParser.ordering_term_return ordering_term209 = null;

        SqlParser.ordering_term_return ordering_term211 = null;


        Object SELECT198_tree=null;
        Object ALL199_tree=null;
        Object DISTINCT200_tree=null;
        Object COMMA202_tree=null;
        Object FROM204_tree=null;
        Object WHERE206_tree=null;
        Object GROUP207_tree=null;
        Object BY208_tree=null;
        Object COMMA210_tree=null;
        Object HAVING212_tree=null;
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
            // SqlParser.g:215:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // SqlParser.g:216:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT198=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1741);  
            stream_SELECT.add(SELECT198);

            // SqlParser.g:216:10: ( ALL | DISTINCT )?
            int alt65=3;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ALL) ) {
                int LA65_1 = input.LA(2);

                if ( ((LA65_1>=PLUS && LA65_1<=ASTERISK)||LA65_1==LPAREN||(LA65_1>=QUESTION && LA65_1<=AT)||(LA65_1>=ABORT && LA65_1<=FROM)||(LA65_1>=GROUP && LA65_1<=IMMEDIATE)||(LA65_1>=INDEX && LA65_1<=IS)||(LA65_1>=JOIN && LA65_1<=LEFT)||LA65_1==LIMIT||(LA65_1>=NATURAL && LA65_1<=NOT)||(LA65_1>=NULL && LA65_1<=REFERENCES)||(LA65_1>=REINDEX && LA65_1<=WHERE)||(LA65_1>=ID && LA65_1<=INTEGER)||(LA65_1>=FLOAT && LA65_1<=BLOB)) ) {
                    alt65=1;
                }
            }
            else if ( (LA65_0==DISTINCT) ) {
                int LA65_2 = input.LA(2);

                if ( ((LA65_2>=PLUS && LA65_2<=ASTERISK)||LA65_2==LPAREN||(LA65_2>=QUESTION && LA65_2<=AT)||(LA65_2>=ABORT && LA65_2<=FROM)||(LA65_2>=GROUP && LA65_2<=IMMEDIATE)||(LA65_2>=INDEX && LA65_2<=IS)||(LA65_2>=JOIN && LA65_2<=LEFT)||LA65_2==LIMIT||(LA65_2>=NATURAL && LA65_2<=NOT)||(LA65_2>=NULL && LA65_2<=REFERENCES)||(LA65_2>=REINDEX && LA65_2<=WHERE)||(LA65_2>=ID && LA65_2<=INTEGER)||(LA65_2>=FLOAT && LA65_2<=BLOB)) ) {
                    alt65=2;
                }
            }
            switch (alt65) {
                case 1 :
                    // SqlParser.g:216:11: ALL
                    {
                    ALL199=(Token)match(input,ALL,FOLLOW_ALL_in_select_core1744);  
                    stream_ALL.add(ALL199);


                    }
                    break;
                case 2 :
                    // SqlParser.g:216:17: DISTINCT
                    {
                    DISTINCT200=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core1748);  
                    stream_DISTINCT.add(DISTINCT200);


                    }
                    break;

            }

            pushFollow(FOLLOW_result_column_in_select_core1752);
            result_column201=result_column();

            state._fsp--;

            stream_result_column.add(result_column201.getTree());
            // SqlParser.g:216:42: ( COMMA result_column )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==COMMA) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // SqlParser.g:216:43: COMMA result_column
            	    {
            	    COMMA202=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1755);  
            	    stream_COMMA.add(COMMA202);

            	    pushFollow(FOLLOW_result_column_in_select_core1757);
            	    result_column203=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column203.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // SqlParser.g:216:65: ( FROM join_source )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==FROM) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // SqlParser.g:216:66: FROM join_source
                    {
                    FROM204=(Token)match(input,FROM,FOLLOW_FROM_in_select_core1762);  
                    stream_FROM.add(FROM204);

                    pushFollow(FOLLOW_join_source_in_select_core1764);
                    join_source205=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source205.getTree());

                    }
                    break;

            }

            // SqlParser.g:216:85: ( WHERE where_expr= expr )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==WHERE) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // SqlParser.g:216:86: WHERE where_expr= expr
                    {
                    WHERE206=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core1769);  
                    stream_WHERE.add(WHERE206);

                    pushFollow(FOLLOW_expr_in_select_core1773);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }

            // SqlParser.g:217:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==GROUP) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // SqlParser.g:217:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP207=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core1781);  
                    stream_GROUP.add(GROUP207);

                    BY208=(Token)match(input,BY,FOLLOW_BY_in_select_core1783);  
                    stream_BY.add(BY208);

                    pushFollow(FOLLOW_ordering_term_in_select_core1785);
                    ordering_term209=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term209.getTree());
                    // SqlParser.g:217:28: ( COMMA ordering_term )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==COMMA) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // SqlParser.g:217:29: COMMA ordering_term
                    	    {
                    	    COMMA210=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1788);  
                    	    stream_COMMA.add(COMMA210);

                    	    pushFollow(FOLLOW_ordering_term_in_select_core1790);
                    	    ordering_term211=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term211.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    // SqlParser.g:217:51: ( HAVING having_expr= expr )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==HAVING) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // SqlParser.g:217:52: HAVING having_expr= expr
                            {
                            HAVING212=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core1795);  
                            stream_HAVING.add(HAVING212);

                            pushFollow(FOLLOW_expr_in_select_core1799);
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
            // elements: WHERE, having_expr, HAVING, FROM, where_expr, join_source, DISTINCT, ordering_term, GROUP, result_column
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
            // 218:1: -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // SqlParser.g:218:4: ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CORE, "SELECT_CORE"), root_1);

                // SqlParser.g:219:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                }
                stream_DISTINCT.reset();
                // SqlParser.g:219:27: ^( COLUMNS ( result_column )+ )
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
                // SqlParser.g:219:53: ( ^( FROM join_source ) )?
                if ( stream_FROM.hasNext()||stream_join_source.hasNext() ) {
                    // SqlParser.g:219:53: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_FROM.reset();
                stream_join_source.reset();
                // SqlParser.g:219:74: ( ^( WHERE $where_expr) )?
                if ( stream_WHERE.hasNext()||stream_where_expr.hasNext() ) {
                    // SqlParser.g:219:74: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_WHERE.reset();
                stream_where_expr.reset();
                // SqlParser.g:220:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_having_expr.hasNext()||stream_HAVING.hasNext()||stream_ordering_term.hasNext()||stream_GROUP.hasNext() ) {
                    // SqlParser.g:220:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
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
                    // SqlParser.g:220:26: ( ^( HAVING $having_expr) )?
                    if ( stream_having_expr.hasNext()||stream_HAVING.hasNext() ) {
                        // SqlParser.g:220:26: ^( HAVING $having_expr)
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
                stream_HAVING.reset();
                stream_ordering_term.reset();
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
    // SqlParser.g:223:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );
    public final SqlParser.result_column_return result_column() throws RecognitionException {
        SqlParser.result_column_return retval = new SqlParser.result_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK213=null;
        Token DOT214=null;
        Token ASTERISK215=null;
        Token AS217=null;
        SqlParser.id_return table_name = null;

        SqlParser.id_return column_alias = null;

        SqlParser.expr_return expr216 = null;


        Object ASTERISK213_tree=null;
        Object DOT214_tree=null;
        Object ASTERISK215_tree=null;
        Object AS217_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // SqlParser.g:224:3: ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt74=3;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // SqlParser.g:224:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();

                    ASTERISK213=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1869); 
                    ASTERISK213_tree = (Object)adaptor.create(ASTERISK213);
                    adaptor.addChild(root_0, ASTERISK213_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:225:5: table_name= id DOT ASTERISK
                    {
                    pushFollow(FOLLOW_id_in_result_column1877);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());
                    DOT214=(Token)match(input,DOT,FOLLOW_DOT_in_result_column1879);  
                    stream_DOT.add(DOT214);

                    ASTERISK215=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1881);  
                    stream_ASTERISK.add(ASTERISK215);



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
                    // 225:32: -> ^( ASTERISK $table_name)
                    {
                        // SqlParser.g:225:35: ^( ASTERISK $table_name)
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
                    // SqlParser.g:226:5: expr ( ( AS )? column_alias= id )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column1896);
                    expr216=expr();

                    state._fsp--;

                    stream_expr.add(expr216.getTree());
                    // SqlParser.g:226:10: ( ( AS )? column_alias= id )?
                    int alt73=2;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // SqlParser.g:226:11: ( AS )? column_alias= id
                            {
                            // SqlParser.g:226:11: ( AS )?
                            int alt72=2;
                            alt72 = dfa72.predict(input);
                            switch (alt72) {
                                case 1 :
                                    // SqlParser.g:226:12: AS
                                    {
                                    AS217=(Token)match(input,AS,FOLLOW_AS_in_result_column1900);  
                                    stream_AS.add(AS217);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_result_column1906);
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
                    // 226:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // SqlParser.g:226:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // SqlParser.g:226:51: ( $column_alias)?
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
    // SqlParser.g:228:1: join_source : single_source ( join_op single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.single_source_return single_source218 = null;

        SqlParser.join_op_return join_op219 = null;

        SqlParser.single_source_return single_source220 = null;

        SqlParser.join_constraint_return join_constraint221 = null;



        try {
            // SqlParser.g:228:12: ( single_source ( join_op single_source ( join_constraint )? )* )
            // SqlParser.g:228:14: single_source ( join_op single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_source_in_join_source1927);
            single_source218=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source218.getTree());
            // SqlParser.g:228:28: ( join_op single_source ( join_constraint )? )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==COMMA||LA76_0==CROSS||LA76_0==INNER||LA76_0==JOIN||LA76_0==LEFT||LA76_0==NATURAL||LA76_0==OUTER) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // SqlParser.g:228:29: join_op single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source1930);
            	    join_op219=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op219.getTree(), root_0);
            	    pushFollow(FOLLOW_single_source_in_join_source1933);
            	    single_source220=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source220.getTree());
            	    // SqlParser.g:228:52: ( join_constraint )?
            	    int alt75=2;
            	    int LA75_0 = input.LA(1);

            	    if ( (LA75_0==ON||LA75_0==USING) ) {
            	        alt75=1;
            	    }
            	    switch (alt75) {
            	        case 1 :
            	            // SqlParser.g:228:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source1936);
            	            join_constraint221=join_constraint();

            	            state._fsp--;

            	            adaptor.addChild(root_0, join_constraint221.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
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
    // SqlParser.g:230:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );
    public final SqlParser.single_source_return single_source() throws RecognitionException {
        SqlParser.single_source_return retval = new SqlParser.single_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token table_name=null;
        Token table_alias=null;
        Token DOT222=null;
        Token AS223=null;
        Token INDEXED224=null;
        Token BY225=null;
        Token NOT226=null;
        Token INDEXED227=null;
        Token LPAREN228=null;
        Token RPAREN230=null;
        Token AS231=null;
        Token LPAREN232=null;
        Token RPAREN234=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.select_stmt_return select_stmt229 = null;

        SqlParser.join_source_return join_source233 = null;


        Object table_name_tree=null;
        Object table_alias_tree=null;
        Object DOT222_tree=null;
        Object AS223_tree=null;
        Object INDEXED224_tree=null;
        Object BY225_tree=null;
        Object NOT226_tree=null;
        Object INDEXED227_tree=null;
        Object LPAREN228_tree=null;
        Object RPAREN230_tree=null;
        Object AS231_tree=null;
        Object LPAREN232_tree=null;
        Object RPAREN234_tree=null;
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
            // SqlParser.g:231:3: ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN )
            int alt83=3;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=ABORT && LA83_0<=FROM)||(LA83_0>=GROUP && LA83_0<=IMMEDIATE)||(LA83_0>=INDEX && LA83_0<=IS)||(LA83_0>=JOIN && LA83_0<=LEFT)||LA83_0==LIMIT||LA83_0==NATURAL||(LA83_0>=NULL && LA83_0<=REFERENCES)||(LA83_0>=REINDEX && LA83_0<=WHERE)||LA83_0==ID) ) {
                alt83=1;
            }
            else if ( (LA83_0==LPAREN) ) {
                int LA83_2 = input.LA(2);

                if ( (LA83_2==LPAREN||(LA83_2>=ABORT && LA83_2<=FROM)||(LA83_2>=GROUP && LA83_2<=IMMEDIATE)||(LA83_2>=INDEX && LA83_2<=IS)||(LA83_2>=JOIN && LA83_2<=LEFT)||LA83_2==LIMIT||LA83_2==NATURAL||(LA83_2>=NULL && LA83_2<=REFERENCES)||(LA83_2>=REINDEX && LA83_2<=SAVEPOINT)||(LA83_2>=SET && LA83_2<=WHERE)||LA83_2==ID) ) {
                    alt83=3;
                }
                else if ( (LA83_2==SELECT) ) {
                    int LA83_4 = input.LA(3);

                    if ( (LA83_4==DOT) ) {
                        alt83=3;
                    }
                    else if ( ((LA83_4>=PLUS && LA83_4<=ASTERISK)||LA83_4==LPAREN||(LA83_4>=QUESTION && LA83_4<=AT)||(LA83_4>=ABORT && LA83_4<=FROM)||(LA83_4>=GROUP && LA83_4<=IMMEDIATE)||(LA83_4>=INDEX && LA83_4<=IS)||(LA83_4>=JOIN && LA83_4<=LEFT)||LA83_4==LIMIT||(LA83_4>=NATURAL && LA83_4<=NOT)||(LA83_4>=NULL && LA83_4<=REFERENCES)||(LA83_4>=REINDEX && LA83_4<=WHERE)||(LA83_4>=ID && LA83_4<=INTEGER)||(LA83_4>=FLOAT && LA83_4<=BLOB)) ) {
                        alt83=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // SqlParser.g:231:5: (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )?
                    {
                    // SqlParser.g:231:5: (database_name= id DOT )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==ID) ) {
                        int LA77_1 = input.LA(2);

                        if ( (LA77_1==DOT) ) {
                            alt77=1;
                        }
                    }
                    else if ( ((LA77_0>=ABORT && LA77_0<=FROM)||(LA77_0>=GROUP && LA77_0<=IMMEDIATE)||(LA77_0>=INDEX && LA77_0<=IS)||(LA77_0>=JOIN && LA77_0<=LEFT)||LA77_0==LIMIT||LA77_0==NATURAL||(LA77_0>=NULL && LA77_0<=REFERENCES)||(LA77_0>=REINDEX && LA77_0<=WHERE)) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // SqlParser.g:231:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_single_source1953);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT222=(Token)match(input,DOT,FOLLOW_DOT_in_single_source1955);  
                            stream_DOT.add(DOT222);


                            }
                            break;

                    }

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source1961);  
                    stream_ID.add(table_name);

                    // SqlParser.g:231:43: ( ( AS )? table_alias= ID )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==AS||LA79_0==ID) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // SqlParser.g:231:44: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:231:44: ( AS )?
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==AS) ) {
                                alt78=1;
                            }
                            switch (alt78) {
                                case 1 :
                                    // SqlParser.g:231:45: AS
                                    {
                                    AS223=(Token)match(input,AS,FOLLOW_AS_in_single_source1965);  
                                    stream_AS.add(AS223);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1971);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }

                    // SqlParser.g:231:67: ( INDEXED BY index_name= id | NOT INDEXED )?
                    int alt80=3;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==INDEXED) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==NOT) ) {
                        alt80=2;
                    }
                    switch (alt80) {
                        case 1 :
                            // SqlParser.g:231:68: INDEXED BY index_name= id
                            {
                            INDEXED224=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1976);  
                            stream_INDEXED.add(INDEXED224);

                            BY225=(Token)match(input,BY,FOLLOW_BY_in_single_source1978);  
                            stream_BY.add(BY225);

                            pushFollow(FOLLOW_id_in_single_source1982);
                            index_name=id();

                            state._fsp--;

                            stream_id.add(index_name.getTree());

                            }
                            break;
                        case 2 :
                            // SqlParser.g:231:95: NOT INDEXED
                            {
                            NOT226=(Token)match(input,NOT,FOLLOW_NOT_in_single_source1986);  
                            stream_NOT.add(NOT226);

                            INDEXED227=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1988);  
                            stream_INDEXED.add(INDEXED227);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: INDEXED, NOT, table_alias, table_name, index_name, database_name
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
                    // 232:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // SqlParser.g:232:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        // SqlParser.g:232:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // SqlParser.g:232:28: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // SqlParser.g:232:45: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();
                        // SqlParser.g:232:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_INDEXED.hasNext()||stream_NOT.hasNext()||stream_index_name.hasNext() ) {
                            // SqlParser.g:232:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_INDEXED.nextNode(), root_2);

                            // SqlParser.g:232:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, stream_NOT.nextNode());

                            }
                            stream_NOT.reset();
                            // SqlParser.g:232:74: ( $index_name)?
                            if ( stream_index_name.hasNext() ) {
                                adaptor.addChild(root_2, stream_index_name.nextTree());

                            }
                            stream_index_name.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_INDEXED.reset();
                        stream_NOT.reset();
                        stream_index_name.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:233:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN228=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2029);  
                    stream_LPAREN.add(LPAREN228);

                    pushFollow(FOLLOW_select_stmt_in_single_source2031);
                    select_stmt229=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt229.getTree());
                    RPAREN230=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2033);  
                    stream_RPAREN.add(RPAREN230);

                    // SqlParser.g:233:31: ( ( AS )? table_alias= ID )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==AS||LA82_0==ID) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // SqlParser.g:233:32: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:233:32: ( AS )?
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==AS) ) {
                                alt81=1;
                            }
                            switch (alt81) {
                                case 1 :
                                    // SqlParser.g:233:33: AS
                                    {
                                    AS231=(Token)match(input,AS,FOLLOW_AS_in_single_source2037);  
                                    stream_AS.add(AS231);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source2043);  
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
                    // 234:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // SqlParser.g:234:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());
                        // SqlParser.g:234:26: ( $table_alias)?
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
                    // SqlParser.g:235:5: LPAREN join_source RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN232=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2065); 
                    pushFollow(FOLLOW_join_source_in_single_source2068);
                    join_source233=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source233.getTree());
                    RPAREN234=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2070); 

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
    // SqlParser.g:237:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN );
    public final SqlParser.join_op_return join_op() throws RecognitionException {
        SqlParser.join_op_return retval = new SqlParser.join_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA235=null;
        Token NATURAL236=null;
        Token LEFT237=null;
        Token OUTER238=null;
        Token INNER239=null;
        Token CROSS240=null;
        Token JOIN241=null;

        Object COMMA235_tree=null;
        Object NATURAL236_tree=null;
        Object LEFT237_tree=null;
        Object OUTER238_tree=null;
        Object INNER239_tree=null;
        Object CROSS240_tree=null;
        Object JOIN241_tree=null;

        try {
            // SqlParser.g:238:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==COMMA) ) {
                alt88=1;
            }
            else if ( (LA88_0==CROSS||LA88_0==INNER||LA88_0==JOIN||LA88_0==LEFT||LA88_0==NATURAL||LA88_0==OUTER) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // SqlParser.g:238:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA235=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op2081); 
                    COMMA235_tree = (Object)adaptor.create(COMMA235);
                    adaptor.addChild(root_0, COMMA235_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:239:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:239:5: ( NATURAL )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==NATURAL) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // SqlParser.g:239:6: NATURAL
                            {
                            NATURAL236=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op2088); 
                            NATURAL236_tree = (Object)adaptor.create(NATURAL236);
                            adaptor.addChild(root_0, NATURAL236_tree);


                            }
                            break;

                    }

                    // SqlParser.g:239:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
                    int alt87=3;
                    switch ( input.LA(1) ) {
                    case JOIN:
                    case LEFT:
                    case OUTER:
                        {
                        alt87=1;
                        }
                        break;
                    case INNER:
                        {
                        alt87=2;
                        }
                        break;
                    case CROSS:
                        {
                        alt87=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }

                    switch (alt87) {
                        case 1 :
                            // SqlParser.g:239:17: ( LEFT )? ( OUTER )?
                            {
                            // SqlParser.g:239:17: ( LEFT )?
                            int alt85=2;
                            int LA85_0 = input.LA(1);

                            if ( (LA85_0==LEFT) ) {
                                alt85=1;
                            }
                            switch (alt85) {
                                case 1 :
                                    // SqlParser.g:239:18: LEFT
                                    {
                                    LEFT237=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op2094); 
                                    LEFT237_tree = (Object)adaptor.create(LEFT237);
                                    adaptor.addChild(root_0, LEFT237_tree);


                                    }
                                    break;

                            }

                            // SqlParser.g:239:25: ( OUTER )?
                            int alt86=2;
                            int LA86_0 = input.LA(1);

                            if ( (LA86_0==OUTER) ) {
                                alt86=1;
                            }
                            switch (alt86) {
                                case 1 :
                                    // SqlParser.g:239:26: OUTER
                                    {
                                    OUTER238=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op2099); 
                                    OUTER238_tree = (Object)adaptor.create(OUTER238);
                                    adaptor.addChild(root_0, OUTER238_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // SqlParser.g:239:36: INNER
                            {
                            INNER239=(Token)match(input,INNER,FOLLOW_INNER_in_join_op2105); 
                            INNER239_tree = (Object)adaptor.create(INNER239);
                            adaptor.addChild(root_0, INNER239_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:239:44: CROSS
                            {
                            CROSS240=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op2109); 
                            CROSS240_tree = (Object)adaptor.create(CROSS240);
                            adaptor.addChild(root_0, CROSS240_tree);


                            }
                            break;

                    }

                    JOIN241=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op2112); 
                    JOIN241_tree = (Object)adaptor.create(JOIN241);
                    root_0 = (Object)adaptor.becomeRoot(JOIN241_tree, root_0);


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
    // SqlParser.g:241:1: join_constraint : ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) );
    public final SqlParser.join_constraint_return join_constraint() throws RecognitionException {
        SqlParser.join_constraint_return retval = new SqlParser.join_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON242=null;
        Token USING244=null;
        Token LPAREN245=null;
        Token COMMA246=null;
        Token RPAREN247=null;
        List list_column_names=null;
        SqlParser.expr_return expr243 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object ON242_tree=null;
        Object USING244_tree=null;
        Object LPAREN245_tree=null;
        Object COMMA246_tree=null;
        Object RPAREN247_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:242:3: ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==ON) ) {
                alt90=1;
            }
            else if ( (LA90_0==USING) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // SqlParser.g:242:5: ON expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ON242=(Token)match(input,ON,FOLLOW_ON_in_join_constraint2123); 
                    ON242_tree = (Object)adaptor.create(ON242);
                    root_0 = (Object)adaptor.becomeRoot(ON242_tree, root_0);

                    pushFollow(FOLLOW_expr_in_join_constraint2126);
                    expr243=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr243.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:243:5: USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    USING244=(Token)match(input,USING,FOLLOW_USING_in_join_constraint2132);  
                    stream_USING.add(USING244);

                    LPAREN245=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint2134);  
                    stream_LPAREN.add(LPAREN245);

                    pushFollow(FOLLOW_id_in_join_constraint2138);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:243:35: ( COMMA column_names+= id )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==COMMA) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // SqlParser.g:243:36: COMMA column_names+= id
                    	    {
                    	    COMMA246=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint2141);  
                    	    stream_COMMA.add(COMMA246);

                    	    pushFollow(FOLLOW_id_in_join_constraint2145);
                    	    column_names=id();

                    	    state._fsp--;

                    	    stream_id.add(column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);

                    RPAREN247=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint2149);  
                    stream_RPAREN.add(RPAREN247);



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
                    // 243:68: -> ^( USING ( $column_names)+ )
                    {
                        // SqlParser.g:243:71: ^( USING ( $column_names)+ )
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
    // SqlParser.g:246:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
    public final SqlParser.insert_stmt_return insert_stmt() throws RecognitionException {
        SqlParser.insert_stmt_return retval = new SqlParser.insert_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT248=null;
        Token REPLACE250=null;
        Token INTO251=null;
        Token DOT252=null;
        Token LPAREN253=null;
        Token COMMA254=null;
        Token RPAREN255=null;
        Token VALUES256=null;
        Token LPAREN257=null;
        Token COMMA258=null;
        Token RPAREN259=null;
        Token DEFAULT261=null;
        Token VALUES262=null;
        List list_column_names=null;
        List list_values=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.operation_conflict_clause_return operation_conflict_clause249 = null;

        SqlParser.select_stmt_return select_stmt260 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        SqlParser.expr_return values = null;
         values = null;
        Object INSERT248_tree=null;
        Object REPLACE250_tree=null;
        Object INTO251_tree=null;
        Object DOT252_tree=null;
        Object LPAREN253_tree=null;
        Object COMMA254_tree=null;
        Object RPAREN255_tree=null;
        Object VALUES256_tree=null;
        Object LPAREN257_tree=null;
        Object COMMA258_tree=null;
        Object RPAREN259_tree=null;
        Object DEFAULT261_tree=null;
        Object VALUES262_tree=null;

        try {
            // SqlParser.g:246:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // SqlParser.g:246:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:246:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==INSERT) ) {
                alt92=1;
            }
            else if ( (LA92_0==REPLACE) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // SqlParser.g:246:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT248=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt2168); 
                    INSERT248_tree = (Object)adaptor.create(INSERT248);
                    adaptor.addChild(root_0, INSERT248_tree);

                    // SqlParser.g:246:22: ( operation_conflict_clause )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==OR) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // SqlParser.g:246:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt2171);
                            operation_conflict_clause249=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause249.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:246:53: REPLACE
                    {
                    REPLACE250=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt2177); 
                    REPLACE250_tree = (Object)adaptor.create(REPLACE250);
                    adaptor.addChild(root_0, REPLACE250_tree);


                    }
                    break;

            }

            INTO251=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt2180); 
            INTO251_tree = (Object)adaptor.create(INTO251);
            adaptor.addChild(root_0, INTO251_tree);

            // SqlParser.g:246:67: (database_name= id DOT )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==ID) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==DOT) ) {
                    alt93=1;
                }
            }
            else if ( ((LA93_0>=ABORT && LA93_0<=FROM)||(LA93_0>=GROUP && LA93_0<=IMMEDIATE)||(LA93_0>=INDEX && LA93_0<=IS)||(LA93_0>=JOIN && LA93_0<=LEFT)||LA93_0==LIMIT||LA93_0==NATURAL||(LA93_0>=NULL && LA93_0<=REFERENCES)||(LA93_0>=REINDEX && LA93_0<=WHERE)) ) {
                int LA93_2 = input.LA(2);

                if ( (LA93_2==DOT) ) {
                    alt93=1;
                }
            }
            switch (alt93) {
                case 1 :
                    // SqlParser.g:246:68: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_insert_stmt2185);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT252=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt2187); 
                    DOT252_tree = (Object)adaptor.create(DOT252);
                    adaptor.addChild(root_0, DOT252_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_insert_stmt2193);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:247:3: ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==LPAREN||LA98_0==SELECT||LA98_0==VALUES) ) {
                alt98=1;
            }
            else if ( (LA98_0==DEFAULT) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // SqlParser.g:247:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // SqlParser.g:247:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==LPAREN) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // SqlParser.g:247:6: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                            {
                            LPAREN253=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2200); 
                            LPAREN253_tree = (Object)adaptor.create(LPAREN253);
                            adaptor.addChild(root_0, LPAREN253_tree);

                            pushFollow(FOLLOW_id_in_insert_stmt2204);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:247:30: ( COMMA column_names+= id )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==COMMA) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // SqlParser.g:247:31: COMMA column_names+= id
                            	    {
                            	    COMMA254=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2207); 
                            	    COMMA254_tree = (Object)adaptor.create(COMMA254);
                            	    adaptor.addChild(root_0, COMMA254_tree);

                            	    pushFollow(FOLLOW_id_in_insert_stmt2211);
                            	    column_names=id();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop94;
                                }
                            } while (true);

                            RPAREN255=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2215); 
                            RPAREN255_tree = (Object)adaptor.create(RPAREN255);
                            adaptor.addChild(root_0, RPAREN255_tree);


                            }
                            break;

                    }

                    // SqlParser.g:248:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==VALUES) ) {
                        alt97=1;
                    }
                    else if ( (LA97_0==SELECT) ) {
                        alt97=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 0, input);

                        throw nvae;
                    }
                    switch (alt97) {
                        case 1 :
                            // SqlParser.g:248:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES256=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2224); 
                            VALUES256_tree = (Object)adaptor.create(VALUES256);
                            adaptor.addChild(root_0, VALUES256_tree);

                            LPAREN257=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2226); 
                            LPAREN257_tree = (Object)adaptor.create(LPAREN257);
                            adaptor.addChild(root_0, LPAREN257_tree);

                            pushFollow(FOLLOW_expr_in_insert_stmt2230);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());

                            // SqlParser.g:248:33: ( COMMA values+= expr )*
                            loop96:
                            do {
                                int alt96=2;
                                int LA96_0 = input.LA(1);

                                if ( (LA96_0==COMMA) ) {
                                    alt96=1;
                                }


                                switch (alt96) {
                            	case 1 :
                            	    // SqlParser.g:248:34: COMMA values+= expr
                            	    {
                            	    COMMA258=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2233); 
                            	    COMMA258_tree = (Object)adaptor.create(COMMA258);
                            	    adaptor.addChild(root_0, COMMA258_tree);

                            	    pushFollow(FOLLOW_expr_in_insert_stmt2237);
                            	    values=expr();

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

                            RPAREN259=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2241); 
                            RPAREN259_tree = (Object)adaptor.create(RPAREN259);
                            adaptor.addChild(root_0, RPAREN259_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:248:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt2245);
                            select_stmt260=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt260.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:249:5: DEFAULT VALUES
                    {
                    DEFAULT261=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt2252); 
                    DEFAULT261_tree = (Object)adaptor.create(DEFAULT261);
                    adaptor.addChild(root_0, DEFAULT261_tree);

                    VALUES262=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2254); 
                    VALUES262_tree = (Object)adaptor.create(VALUES262);
                    adaptor.addChild(root_0, VALUES262_tree);


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
    // SqlParser.g:252:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.update_stmt_return update_stmt() throws RecognitionException {
        SqlParser.update_stmt_return retval = new SqlParser.update_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UPDATE263=null;
        Token SET266=null;
        Token COMMA267=null;
        Token WHERE268=null;
        List list_values=null;
        SqlParser.operation_conflict_clause_return operation_conflict_clause264 = null;

        SqlParser.qualified_table_name_return qualified_table_name265 = null;

        SqlParser.expr_return expr269 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause270 = null;

        SqlParser.update_set_return values = null;
         values = null;
        Object UPDATE263_tree=null;
        Object SET266_tree=null;
        Object COMMA267_tree=null;
        Object WHERE268_tree=null;

        try {
            // SqlParser.g:252:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:252:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UPDATE263=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt2264); 
            UPDATE263_tree = (Object)adaptor.create(UPDATE263);
            adaptor.addChild(root_0, UPDATE263_tree);

            // SqlParser.g:252:21: ( operation_conflict_clause )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==OR) ) {
                int LA99_1 = input.LA(2);

                if ( (LA99_1==ABORT||LA99_1==FAIL||LA99_1==IGNORE||LA99_1==REPLACE||LA99_1==ROLLBACK) ) {
                    alt99=1;
                }
            }
            switch (alt99) {
                case 1 :
                    // SqlParser.g:252:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt2267);
                    operation_conflict_clause264=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause264.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_qualified_table_name_in_update_stmt2271);
            qualified_table_name265=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name265.getTree());
            SET266=(Token)match(input,SET,FOLLOW_SET_in_update_stmt2275); 
            SET266_tree = (Object)adaptor.create(SET266);
            adaptor.addChild(root_0, SET266_tree);

            pushFollow(FOLLOW_update_set_in_update_stmt2279);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());

            // SqlParser.g:253:26: ( COMMA values+= update_set )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==COMMA) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // SqlParser.g:253:27: COMMA values+= update_set
            	    {
            	    COMMA267=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt2282); 
            	    COMMA267_tree = (Object)adaptor.create(COMMA267);
            	    adaptor.addChild(root_0, COMMA267_tree);

            	    pushFollow(FOLLOW_update_set_in_update_stmt2286);
            	    values=update_set();

            	    state._fsp--;

            	    adaptor.addChild(root_0, values.getTree());
            	    if (list_values==null) list_values=new ArrayList();
            	    list_values.add(values.getTree());


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            // SqlParser.g:253:54: ( WHERE expr )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==WHERE) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // SqlParser.g:253:55: WHERE expr
                    {
                    WHERE268=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt2291); 
                    WHERE268_tree = (Object)adaptor.create(WHERE268);
                    adaptor.addChild(root_0, WHERE268_tree);

                    pushFollow(FOLLOW_expr_in_update_stmt2293);
                    expr269=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr269.getTree());

                    }
                    break;

            }

            // SqlParser.g:253:68: ( operation_limited_clause )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==LIMIT||LA102_0==ORDER) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // SqlParser.g:253:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt2298);
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
    // $ANTLR end "update_stmt"

    public static class update_set_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update_set"
    // SqlParser.g:255:1: update_set : column_name= id EQUALS expr ;
    public final SqlParser.update_set_return update_set() throws RecognitionException {
        SqlParser.update_set_return retval = new SqlParser.update_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALS271=null;
        SqlParser.id_return column_name = null;

        SqlParser.expr_return expr272 = null;


        Object EQUALS271_tree=null;

        try {
            // SqlParser.g:255:11: (column_name= id EQUALS expr )
            // SqlParser.g:255:13: column_name= id EQUALS expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_update_set2309);
            column_name=id();

            state._fsp--;

            adaptor.addChild(root_0, column_name.getTree());
            EQUALS271=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set2311); 
            EQUALS271_tree = (Object)adaptor.create(EQUALS271);
            adaptor.addChild(root_0, EQUALS271_tree);

            pushFollow(FOLLOW_expr_in_update_set2313);
            expr272=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr272.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:258:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
    public final SqlParser.delete_stmt_return delete_stmt() throws RecognitionException {
        SqlParser.delete_stmt_return retval = new SqlParser.delete_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE273=null;
        Token FROM274=null;
        Token WHERE276=null;
        SqlParser.qualified_table_name_return qualified_table_name275 = null;

        SqlParser.expr_return expr277 = null;

        SqlParser.operation_limited_clause_return operation_limited_clause278 = null;


        Object DELETE273_tree=null;
        Object FROM274_tree=null;
        Object WHERE276_tree=null;

        try {
            // SqlParser.g:258:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:258:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE273=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2321); 
            DELETE273_tree = (Object)adaptor.create(DELETE273);
            adaptor.addChild(root_0, DELETE273_tree);

            FROM274=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2323); 
            FROM274_tree = (Object)adaptor.create(FROM274);
            adaptor.addChild(root_0, FROM274_tree);

            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2325);
            qualified_table_name275=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name275.getTree());
            // SqlParser.g:258:47: ( WHERE expr )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==WHERE) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // SqlParser.g:258:48: WHERE expr
                    {
                    WHERE276=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2328); 
                    WHERE276_tree = (Object)adaptor.create(WHERE276);
                    adaptor.addChild(root_0, WHERE276_tree);

                    pushFollow(FOLLOW_expr_in_delete_stmt2330);
                    expr277=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr277.getTree());

                    }
                    break;

            }

            // SqlParser.g:258:61: ( operation_limited_clause )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==LIMIT||LA104_0==ORDER) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // SqlParser.g:258:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2335);
                    operation_limited_clause278=operation_limited_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_limited_clause278.getTree());

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
    // SqlParser.g:261:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
    public final SqlParser.begin_stmt_return begin_stmt() throws RecognitionException {
        SqlParser.begin_stmt_return retval = new SqlParser.begin_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN279=null;
        Token set280=null;
        Token TRANSACTION281=null;

        Object BEGIN279_tree=null;
        Object set280_tree=null;
        Object TRANSACTION281_tree=null;

        try {
            // SqlParser.g:261:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // SqlParser.g:261:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            BEGIN279=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2345); 
            BEGIN279_tree = (Object)adaptor.create(BEGIN279);
            adaptor.addChild(root_0, BEGIN279_tree);

            // SqlParser.g:261:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==DEFERRED||LA105_0==EXCLUSIVE||LA105_0==IMMEDIATE) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // SqlParser.g:
                    {
                    set280=(Token)input.LT(1);
                    if ( input.LA(1)==DEFERRED||input.LA(1)==EXCLUSIVE||input.LA(1)==IMMEDIATE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set280));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // SqlParser.g:261:55: ( TRANSACTION )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==TRANSACTION) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // SqlParser.g:261:56: TRANSACTION
                    {
                    TRANSACTION281=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2361); 
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
    // $ANTLR end "begin_stmt"

    public static class commit_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commit_stmt"
    // SqlParser.g:264:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set282=null;
        Token TRANSACTION283=null;

        Object set282_tree=null;
        Object TRANSACTION283_tree=null;

        try {
            // SqlParser.g:264:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // SqlParser.g:264:14: ( COMMIT | END ) ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            set282=(Token)input.LT(1);
            if ( input.LA(1)==COMMIT||input.LA(1)==END ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set282));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // SqlParser.g:264:29: ( TRANSACTION )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==TRANSACTION) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // SqlParser.g:264:30: TRANSACTION
                    {
                    TRANSACTION283=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2380); 
                    TRANSACTION283_tree = (Object)adaptor.create(TRANSACTION283);
                    adaptor.addChild(root_0, TRANSACTION283_tree);


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
    // SqlParser.g:267:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? ;
    public final SqlParser.rollback_stmt_return rollback_stmt() throws RecognitionException {
        SqlParser.rollback_stmt_return retval = new SqlParser.rollback_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ROLLBACK284=null;
        Token TRANSACTION285=null;
        Token TO286=null;
        Token SAVEPOINT287=null;
        SqlParser.id_return savepoint_name = null;


        Object ROLLBACK284_tree=null;
        Object TRANSACTION285_tree=null;
        Object TO286_tree=null;
        Object SAVEPOINT287_tree=null;

        try {
            // SqlParser.g:267:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? )
            // SqlParser.g:267:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK284=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2390); 
            ROLLBACK284_tree = (Object)adaptor.create(ROLLBACK284);
            adaptor.addChild(root_0, ROLLBACK284_tree);

            // SqlParser.g:267:25: ( TRANSACTION )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==TRANSACTION) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // SqlParser.g:267:26: TRANSACTION
                    {
                    TRANSACTION285=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2393); 
                    TRANSACTION285_tree = (Object)adaptor.create(TRANSACTION285);
                    adaptor.addChild(root_0, TRANSACTION285_tree);


                    }
                    break;

            }

            // SqlParser.g:267:40: ( TO ( SAVEPOINT )? savepoint_name= id )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==TO) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // SqlParser.g:267:41: TO ( SAVEPOINT )? savepoint_name= id
                    {
                    TO286=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2398); 
                    TO286_tree = (Object)adaptor.create(TO286);
                    adaptor.addChild(root_0, TO286_tree);

                    // SqlParser.g:267:44: ( SAVEPOINT )?
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
                            // SqlParser.g:267:45: SAVEPOINT
                            {
                            SAVEPOINT287=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2401); 
                            SAVEPOINT287_tree = (Object)adaptor.create(SAVEPOINT287);
                            adaptor.addChild(root_0, SAVEPOINT287_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_rollback_stmt2407);
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
    // SqlParser.g:270:1: savepoint_stmt : SAVEPOINT savepoint_name= id ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT288=null;
        SqlParser.id_return savepoint_name = null;


        Object SAVEPOINT288_tree=null;

        try {
            // SqlParser.g:270:15: ( SAVEPOINT savepoint_name= id )
            // SqlParser.g:270:17: SAVEPOINT savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT288=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2417); 
            SAVEPOINT288_tree = (Object)adaptor.create(SAVEPOINT288);
            adaptor.addChild(root_0, SAVEPOINT288_tree);

            pushFollow(FOLLOW_id_in_savepoint_stmt2421);
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
    // SqlParser.g:273:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= id ;
    public final SqlParser.release_stmt_return release_stmt() throws RecognitionException {
        SqlParser.release_stmt_return retval = new SqlParser.release_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RELEASE289=null;
        Token SAVEPOINT290=null;
        SqlParser.id_return savepoint_name = null;


        Object RELEASE289_tree=null;
        Object SAVEPOINT290_tree=null;

        try {
            // SqlParser.g:273:13: ( RELEASE ( SAVEPOINT )? savepoint_name= id )
            // SqlParser.g:273:15: RELEASE ( SAVEPOINT )? savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            RELEASE289=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2429); 
            RELEASE289_tree = (Object)adaptor.create(RELEASE289);
            adaptor.addChild(root_0, RELEASE289_tree);

            // SqlParser.g:273:23: ( SAVEPOINT )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==SAVEPOINT) ) {
                int LA111_1 = input.LA(2);

                if ( ((LA111_1>=ABORT && LA111_1<=FROM)||(LA111_1>=GROUP && LA111_1<=IMMEDIATE)||(LA111_1>=INDEX && LA111_1<=IS)||(LA111_1>=JOIN && LA111_1<=LEFT)||LA111_1==LIMIT||LA111_1==NATURAL||(LA111_1>=NULL && LA111_1<=REFERENCES)||(LA111_1>=REINDEX && LA111_1<=WHERE)||LA111_1==ID) ) {
                    alt111=1;
                }
            }
            switch (alt111) {
                case 1 :
                    // SqlParser.g:273:24: SAVEPOINT
                    {
                    SAVEPOINT290=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2432); 
                    SAVEPOINT290_tree = (Object)adaptor.create(SAVEPOINT290);
                    adaptor.addChild(root_0, SAVEPOINT290_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_release_stmt2438);
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
    // SqlParser.g:280:1: table_conflict_clause : ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.table_conflict_clause_return table_conflict_clause() throws RecognitionException {
        SqlParser.table_conflict_clause_return retval = new SqlParser.table_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON291=null;
        Token CONFLICT292=null;
        Token set293=null;

        Object ON291_tree=null;
        Object CONFLICT292_tree=null;
        Object set293_tree=null;

        try {
            // SqlParser.g:280:22: ( ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:280:24: ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            ON291=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2450); 
            CONFLICT292=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2453); 
            CONFLICT292_tree = (Object)adaptor.create(CONFLICT292);
            root_0 = (Object)adaptor.becomeRoot(CONFLICT292_tree, root_0);

            set293=(Token)input.LT(1);
            if ( input.LA(1)==ABORT||input.LA(1)==FAIL||input.LA(1)==IGNORE||input.LA(1)==REPLACE||input.LA(1)==ROLLBACK ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set293));
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
    // SqlParser.g:284:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? ;
    public final SqlParser.create_virtual_table_stmt_return create_virtual_table_stmt() throws RecognitionException {
        SqlParser.create_virtual_table_stmt_return retval = new SqlParser.create_virtual_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE294=null;
        Token VIRTUAL295=null;
        Token TABLE296=null;
        Token DOT297=null;
        Token USING298=null;
        Token LPAREN299=null;
        Token COMMA301=null;
        Token RPAREN303=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return module_name = null;

        SqlParser.column_def_return column_def300 = null;

        SqlParser.column_def_return column_def302 = null;


        Object CREATE294_tree=null;
        Object VIRTUAL295_tree=null;
        Object TABLE296_tree=null;
        Object DOT297_tree=null;
        Object USING298_tree=null;
        Object LPAREN299_tree=null;
        Object COMMA301_tree=null;
        Object RPAREN303_tree=null;

        try {
            // SqlParser.g:284:26: ( CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? )
            // SqlParser.g:284:28: CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            CREATE294=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2483); 
            CREATE294_tree = (Object)adaptor.create(CREATE294);
            adaptor.addChild(root_0, CREATE294_tree);

            VIRTUAL295=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2485); 
            VIRTUAL295_tree = (Object)adaptor.create(VIRTUAL295);
            adaptor.addChild(root_0, VIRTUAL295_tree);

            TABLE296=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2487); 
            TABLE296_tree = (Object)adaptor.create(TABLE296);
            adaptor.addChild(root_0, TABLE296_tree);

            // SqlParser.g:284:49: (database_name= id DOT )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==ID) ) {
                int LA112_1 = input.LA(2);

                if ( (LA112_1==DOT) ) {
                    alt112=1;
                }
            }
            else if ( ((LA112_0>=ABORT && LA112_0<=FROM)||(LA112_0>=GROUP && LA112_0<=IMMEDIATE)||(LA112_0>=INDEX && LA112_0<=IS)||(LA112_0>=JOIN && LA112_0<=LEFT)||LA112_0==LIMIT||LA112_0==NATURAL||(LA112_0>=NULL && LA112_0<=REFERENCES)||(LA112_0>=REINDEX && LA112_0<=WHERE)) ) {
                int LA112_2 = input.LA(2);

                if ( (LA112_2==DOT) ) {
                    alt112=1;
                }
            }
            switch (alt112) {
                case 1 :
                    // SqlParser.g:284:50: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_virtual_table_stmt2492);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT297=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2494); 
                    DOT297_tree = (Object)adaptor.create(DOT297);
                    adaptor.addChild(root_0, DOT297_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2500);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            USING298=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2504); 
            USING298_tree = (Object)adaptor.create(USING298);
            adaptor.addChild(root_0, USING298_tree);

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2508);
            module_name=id();

            state._fsp--;

            adaptor.addChild(root_0, module_name.getTree());
            // SqlParser.g:285:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==LPAREN) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // SqlParser.g:285:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN299=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2511); 
                    LPAREN299_tree = (Object)adaptor.create(LPAREN299);
                    adaptor.addChild(root_0, LPAREN299_tree);

                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2513);
                    column_def300=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def300.getTree());
                    // SqlParser.g:285:43: ( COMMA column_def )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==COMMA) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // SqlParser.g:285:44: COMMA column_def
                    	    {
                    	    COMMA301=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2516); 
                    	    COMMA301_tree = (Object)adaptor.create(COMMA301);
                    	    adaptor.addChild(root_0, COMMA301_tree);

                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2518);
                    	    column_def302=column_def();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, column_def302.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);

                    RPAREN303=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2522); 
                    RPAREN303_tree = (Object)adaptor.create(RPAREN303);
                    adaptor.addChild(root_0, RPAREN303_tree);


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
    // SqlParser.g:288:1: create_table_stmt : CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
    public final SqlParser.create_table_stmt_return create_table_stmt() throws RecognitionException {
        SqlParser.create_table_stmt_return retval = new SqlParser.create_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE304=null;
        Token TEMPORARY305=null;
        Token TABLE306=null;
        Token IF307=null;
        Token NOT308=null;
        Token EXISTS309=null;
        Token DOT310=null;
        Token LPAREN311=null;
        Token COMMA313=null;
        Token COMMA315=null;
        Token RPAREN317=null;
        Token AS318=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.column_def_return column_def312 = null;

        SqlParser.column_def_return column_def314 = null;

        SqlParser.table_constraint_return table_constraint316 = null;

        SqlParser.select_stmt_return select_stmt319 = null;


        Object CREATE304_tree=null;
        Object TEMPORARY305_tree=null;
        Object TABLE306_tree=null;
        Object IF307_tree=null;
        Object NOT308_tree=null;
        Object EXISTS309_tree=null;
        Object DOT310_tree=null;
        Object LPAREN311_tree=null;
        Object COMMA313_tree=null;
        Object COMMA315_tree=null;
        Object RPAREN317_tree=null;
        Object AS318_tree=null;
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
            // SqlParser.g:288:18: ( CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // SqlParser.g:288:20: CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE304=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2532);  
            stream_CREATE.add(CREATE304);

            // SqlParser.g:288:27: ( TEMPORARY )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==TEMPORARY) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // SqlParser.g:288:27: TEMPORARY
                    {
                    TEMPORARY305=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2534);  
                    stream_TEMPORARY.add(TEMPORARY305);


                    }
                    break;

            }

            TABLE306=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2537);  
            stream_TABLE.add(TABLE306);

            // SqlParser.g:288:44: ( IF NOT EXISTS )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==IF) ) {
                int LA116_1 = input.LA(2);

                if ( (LA116_1==NOT) ) {
                    alt116=1;
                }
            }
            switch (alt116) {
                case 1 :
                    // SqlParser.g:288:45: IF NOT EXISTS
                    {
                    IF307=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2540);  
                    stream_IF.add(IF307);

                    NOT308=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2542);  
                    stream_NOT.add(NOT308);

                    EXISTS309=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2544);  
                    stream_EXISTS.add(EXISTS309);


                    }
                    break;

            }

            // SqlParser.g:288:61: (database_name= id DOT )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==ID) ) {
                int LA117_1 = input.LA(2);

                if ( (LA117_1==DOT) ) {
                    alt117=1;
                }
            }
            else if ( ((LA117_0>=ABORT && LA117_0<=FROM)||(LA117_0>=GROUP && LA117_0<=IMMEDIATE)||(LA117_0>=INDEX && LA117_0<=IS)||(LA117_0>=JOIN && LA117_0<=LEFT)||LA117_0==LIMIT||LA117_0==NATURAL||(LA117_0>=NULL && LA117_0<=REFERENCES)||(LA117_0>=REINDEX && LA117_0<=WHERE)) ) {
                int LA117_2 = input.LA(2);

                if ( (LA117_2==DOT) ) {
                    alt117=1;
                }
            }
            switch (alt117) {
                case 1 :
                    // SqlParser.g:288:62: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_table_stmt2551);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT310=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2553);  
                    stream_DOT.add(DOT310);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_table_stmt2559);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            // SqlParser.g:289:3: ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==LPAREN) ) {
                alt120=1;
            }
            else if ( (LA120_0==AS) ) {
                alt120=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // SqlParser.g:289:5: LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN
                    {
                    LPAREN311=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2565);  
                    stream_LPAREN.add(LPAREN311);

                    pushFollow(FOLLOW_column_def_in_create_table_stmt2567);
                    column_def312=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def312.getTree());
                    // SqlParser.g:289:23: ( COMMA column_def )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==COMMA) ) {
                            switch ( input.LA(2) ) {
                            case PRIMARY:
                                {
                                int LA118_3 = input.LA(3);

                                if ( (LA118_3==COMMA||LA118_3==RPAREN||(LA118_3>=CHECK && LA118_3<=COLLATE)||LA118_3==CONSTRAINT||LA118_3==DEFAULT||LA118_3==NOT||LA118_3==PRIMARY||LA118_3==REFERENCES||LA118_3==UNIQUE||LA118_3==ID) ) {
                                    alt118=1;
                                }


                                }
                                break;
                            case UNIQUE:
                                {
                                int LA118_4 = input.LA(3);

                                if ( (LA118_4==COMMA||LA118_4==RPAREN||(LA118_4>=CHECK && LA118_4<=COLLATE)||LA118_4==CONSTRAINT||LA118_4==DEFAULT||LA118_4==NOT||LA118_4==PRIMARY||LA118_4==REFERENCES||LA118_4==UNIQUE||LA118_4==ID) ) {
                                    alt118=1;
                                }


                                }
                                break;
                            case CHECK:
                                {
                                int LA118_5 = input.LA(3);

                                if ( (LA118_5==COMMA||LA118_5==RPAREN||(LA118_5>=CHECK && LA118_5<=COLLATE)||LA118_5==CONSTRAINT||LA118_5==DEFAULT||LA118_5==NOT||LA118_5==PRIMARY||LA118_5==REFERENCES||LA118_5==UNIQUE||LA118_5==ID) ) {
                                    alt118=1;
                                }


                                }
                                break;
                            case FOREIGN:
                                {
                                int LA118_6 = input.LA(3);

                                if ( (LA118_6==COMMA||LA118_6==RPAREN||(LA118_6>=CHECK && LA118_6<=COLLATE)||LA118_6==CONSTRAINT||LA118_6==DEFAULT||LA118_6==NOT||LA118_6==PRIMARY||LA118_6==REFERENCES||LA118_6==UNIQUE||LA118_6==ID) ) {
                                    alt118=1;
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
                                alt118=1;
                                }
                                break;

                            }

                        }


                        switch (alt118) {
                    	case 1 :
                    	    // SqlParser.g:289:24: COMMA column_def
                    	    {
                    	    COMMA313=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2570);  
                    	    stream_COMMA.add(COMMA313);

                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2572);
                    	    column_def314=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def314.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);

                    // SqlParser.g:289:43: ( COMMA table_constraint )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==COMMA) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // SqlParser.g:289:44: COMMA table_constraint
                    	    {
                    	    COMMA315=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2577);  
                    	    stream_COMMA.add(COMMA315);

                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2579);
                    	    table_constraint316=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint316.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);

                    RPAREN317=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2583);  
                    stream_RPAREN.add(RPAREN317);


                    }
                    break;
                case 2 :
                    // SqlParser.g:290:5: AS select_stmt
                    {
                    AS318=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2589);  
                    stream_AS.add(AS318);

                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2591);
                    select_stmt319=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt319.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: select_stmt, table_name, database_name, table_constraint, EXISTS, column_def, TEMPORARY
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
            // 291:1: -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // SqlParser.g:291:4: ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE"), root_1);

                // SqlParser.g:291:19: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:291:29: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();
                // SqlParser.g:291:40: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:291:49: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:291:63: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:292:3: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // SqlParser.g:292:3: ^( COLUMNS ( column_def )+ )
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
                // SqlParser.g:292:27: ( ^( CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // SqlParser.g:292:27: ^( CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                    // SqlParser.g:292:41: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();
                // SqlParser.g:292:61: ( select_stmt )?
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
    // SqlParser.g:294:1: column_def : name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) ;
    public final SqlParser.column_def_return column_def() throws RecognitionException {
        SqlParser.column_def_return retval = new SqlParser.column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.id_column_def_return name = null;

        SqlParser.type_name_return type_name320 = null;

        SqlParser.column_constraint_return column_constraint321 = null;


        RewriteRuleSubtreeStream stream_column_constraint=new RewriteRuleSubtreeStream(adaptor,"rule column_constraint");
        RewriteRuleSubtreeStream stream_id_column_def=new RewriteRuleSubtreeStream(adaptor,"rule id_column_def");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        try {
            // SqlParser.g:294:11: (name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) )
            // SqlParser.g:294:13: name= id_column_def ( type_name )? ( column_constraint )*
            {
            pushFollow(FOLLOW_id_column_def_in_column_def2647);
            name=id_column_def();

            state._fsp--;

            stream_id_column_def.add(name.getTree());
            // SqlParser.g:294:32: ( type_name )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==ID) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // SqlParser.g:294:32: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2649);
                    type_name320=type_name();

                    state._fsp--;

                    stream_type_name.add(type_name320.getTree());

                    }
                    break;

            }

            // SqlParser.g:294:43: ( column_constraint )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( ((LA122_0>=CHECK && LA122_0<=COLLATE)||LA122_0==CONSTRAINT||LA122_0==DEFAULT||LA122_0==NOT||LA122_0==PRIMARY||LA122_0==REFERENCES||LA122_0==UNIQUE) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // SqlParser.g:294:43: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2652);
            	    column_constraint321=column_constraint();

            	    state._fsp--;

            	    stream_column_constraint.add(column_constraint321.getTree());

            	    }
            	    break;

            	default :
            	    break loop122;
                }
            } while (true);



            // AST REWRITE
            // elements: name, type_name, column_constraint
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 295:1: -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
            {
                // SqlParser.g:295:4: ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                // SqlParser.g:295:12: ^( CONSTRAINTS ( column_constraint )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                // SqlParser.g:295:26: ( column_constraint )*
                while ( stream_column_constraint.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_constraint.nextTree());

                }
                stream_column_constraint.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:295:46: ( type_name )?
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
    // SqlParser.g:297:1: column_constraint : ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) ;
    public final SqlParser.column_constraint_return column_constraint() throws RecognitionException {
        SqlParser.column_constraint_return retval = new SqlParser.column_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT322=null;
        SqlParser.id_return name = null;

        SqlParser.column_constraint_pk_return column_constraint_pk323 = null;

        SqlParser.column_constraint_not_null_return column_constraint_not_null324 = null;

        SqlParser.column_constraint_unique_return column_constraint_unique325 = null;

        SqlParser.column_constraint_check_return column_constraint_check326 = null;

        SqlParser.column_constraint_default_return column_constraint_default327 = null;

        SqlParser.column_constraint_collate_return column_constraint_collate328 = null;

        SqlParser.fk_clause_return fk_clause329 = null;


        Object CONSTRAINT322_tree=null;
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
            // SqlParser.g:297:18: ( ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) )
            // SqlParser.g:297:20: ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // SqlParser.g:297:20: ( CONSTRAINT name= id )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==CONSTRAINT) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // SqlParser.g:297:21: CONSTRAINT name= id
                    {
                    CONSTRAINT322=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2678);  
                    stream_CONSTRAINT.add(CONSTRAINT322);

                    pushFollow(FOLLOW_id_in_column_constraint2682);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:298:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            int alt124=7;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt124=1;
                }
                break;
            case NOT:
                {
                alt124=2;
                }
                break;
            case UNIQUE:
                {
                alt124=3;
                }
                break;
            case CHECK:
                {
                alt124=4;
                }
                break;
            case DEFAULT:
                {
                alt124=5;
                }
                break;
            case COLLATE:
                {
                alt124=6;
                }
                break;
            case REFERENCES:
                {
                alt124=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }

            switch (alt124) {
                case 1 :
                    // SqlParser.g:298:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2690);
                    column_constraint_pk323=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk323.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:299:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2696);
                    column_constraint_not_null324=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null324.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:300:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint2702);
                    column_constraint_unique325=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique325.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:301:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint2708);
                    column_constraint_check326=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check326.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:302:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint2714);
                    column_constraint_default327=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default327.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:303:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint2720);
                    column_constraint_collate328=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate328.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:304:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint2726);
                    fk_clause329=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause329.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: fk_clause, column_constraint_unique, column_constraint_default, column_constraint_check, column_constraint_pk, column_constraint_collate, name, column_constraint_not_null
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 305:1: -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
            {
                // SqlParser.g:305:4: ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT"), root_1);

                // SqlParser.g:306:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();
                // SqlParser.g:307:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();
                // SqlParser.g:308:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();
                // SqlParser.g:309:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();
                // SqlParser.g:310:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();
                // SqlParser.g:311:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();
                // SqlParser.g:312:3: ( fk_clause )?
                if ( stream_fk_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause.nextTree());

                }
                stream_fk_clause.reset();
                // SqlParser.g:313:3: ( $name)?
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
    // SqlParser.g:315:1: column_constraint_pk : PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
    public final SqlParser.column_constraint_pk_return column_constraint_pk() throws RecognitionException {
        SqlParser.column_constraint_pk_return retval = new SqlParser.column_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY330=null;
        Token KEY331=null;
        Token set332=null;
        Token AUTOINCREMENT334=null;
        SqlParser.table_conflict_clause_return table_conflict_clause333 = null;


        Object PRIMARY330_tree=null;
        Object KEY331_tree=null;
        Object set332_tree=null;
        Object AUTOINCREMENT334_tree=null;

        try {
            // SqlParser.g:315:21: ( PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // SqlParser.g:315:23: PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();

            PRIMARY330=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk2781); 
            PRIMARY330_tree = (Object)adaptor.create(PRIMARY330);
            root_0 = (Object)adaptor.becomeRoot(PRIMARY330_tree, root_0);

            KEY331=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk2784); 
            // SqlParser.g:315:37: ( ASC | DESC )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==ASC||LA125_0==DESC) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // SqlParser.g:
                    {
                    set332=(Token)input.LT(1);
                    if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set332));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // SqlParser.g:315:51: ( table_conflict_clause )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==ON) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // SqlParser.g:315:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk2796);
                    table_conflict_clause333=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause333.getTree());

                    }
                    break;

            }

            // SqlParser.g:315:74: ( AUTOINCREMENT )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==AUTOINCREMENT) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // SqlParser.g:315:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT334=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk2800); 
                    AUTOINCREMENT334_tree = (Object)adaptor.create(AUTOINCREMENT334);
                    adaptor.addChild(root_0, AUTOINCREMENT334_tree);


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
    // SqlParser.g:317:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) ;
    public final SqlParser.column_constraint_not_null_return column_constraint_not_null() throws RecognitionException {
        SqlParser.column_constraint_not_null_return retval = new SqlParser.column_constraint_not_null_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT335=null;
        Token NULL336=null;
        SqlParser.table_conflict_clause_return table_conflict_clause337 = null;


        Object NOT335_tree=null;
        Object NULL336_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:317:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) )
            // SqlParser.g:317:29: NOT NULL ( table_conflict_clause )?
            {
            NOT335=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null2809);  
            stream_NOT.add(NOT335);

            NULL336=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null2811);  
            stream_NULL.add(NULL336);

            // SqlParser.g:317:38: ( table_conflict_clause )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==ON) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // SqlParser.g:317:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null2813);
                    table_conflict_clause337=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause337.getTree());

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
            // 317:61: -> ^( NOT_NULL ( table_conflict_clause )? )
            {
                // SqlParser.g:317:64: ^( NOT_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_NULL, "NOT_NULL"), root_1);

                // SqlParser.g:317:75: ( table_conflict_clause )?
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
    // SqlParser.g:319:1: column_constraint_unique : UNIQUE ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE338=null;
        SqlParser.table_conflict_clause_return table_conflict_clause339 = null;


        Object UNIQUE338_tree=null;

        try {
            // SqlParser.g:319:25: ( UNIQUE ( table_conflict_clause )? )
            // SqlParser.g:319:27: UNIQUE ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UNIQUE338=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique2830); 
            UNIQUE338_tree = (Object)adaptor.create(UNIQUE338);
            root_0 = (Object)adaptor.becomeRoot(UNIQUE338_tree, root_0);

            // SqlParser.g:319:35: ( table_conflict_clause )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==ON) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // SqlParser.g:319:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique2833);
                    table_conflict_clause339=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause339.getTree());

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
    // SqlParser.g:321:1: column_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.column_constraint_check_return column_constraint_check() throws RecognitionException {
        SqlParser.column_constraint_check_return retval = new SqlParser.column_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK340=null;
        Token LPAREN341=null;
        Token RPAREN343=null;
        SqlParser.expr_return expr342 = null;


        Object CHECK340_tree=null;
        Object LPAREN341_tree=null;
        Object RPAREN343_tree=null;

        try {
            // SqlParser.g:321:24: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:321:26: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK340=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check2841); 
            CHECK340_tree = (Object)adaptor.create(CHECK340);
            root_0 = (Object)adaptor.becomeRoot(CHECK340_tree, root_0);

            LPAREN341=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check2844); 
            pushFollow(FOLLOW_expr_in_column_constraint_check2847);
            expr342=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr342.getTree());
            RPAREN343=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check2849); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:324:1: column_constraint_default : DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN ) ;
    public final SqlParser.column_constraint_default_return column_constraint_default() throws RecognitionException {
        SqlParser.column_constraint_default_return retval = new SqlParser.column_constraint_default_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT344=null;
        Token set345=null;
        Token set346=null;
        Token LPAREN348=null;
        Token RPAREN350=null;
        SqlParser.literal_value_return literal_value347 = null;

        SqlParser.expr_return expr349 = null;


        Object DEFAULT344_tree=null;
        Object set345_tree=null;
        Object set346_tree=null;
        Object LPAREN348_tree=null;
        Object RPAREN350_tree=null;

        try {
            // SqlParser.g:324:26: ( DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN ) )
            // SqlParser.g:324:28: DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT344=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default2858); 
            DEFAULT344_tree = (Object)adaptor.create(DEFAULT344);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT344_tree, root_0);

            // SqlParser.g:324:37: ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )
            int alt130=3;
            switch ( input.LA(1) ) {
            case PLUS:
            case MINUS:
                {
                alt130=1;
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
                alt130=2;
                }
                break;
            case LPAREN:
                {
                alt130=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // SqlParser.g:324:38: ( PLUS | MINUS ) ( INTEGER | FLOAT )
                    {
                    set345=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set345));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    set346=(Token)input.LT(1);
                    if ( input.LA(1)==INTEGER||input.LA(1)==FLOAT ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set346));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:324:73: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default2880);
                    literal_value347=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value347.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:324:89: LPAREN expr RPAREN
                    {
                    LPAREN348=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default2884); 
                    pushFollow(FOLLOW_expr_in_column_constraint_default2887);
                    expr349=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr349.getTree());
                    RPAREN350=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default2889); 

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
    // SqlParser.g:326:1: column_constraint_collate : COLLATE collation_name= id ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE351=null;
        SqlParser.id_return collation_name = null;


        Object COLLATE351_tree=null;

        try {
            // SqlParser.g:326:26: ( COLLATE collation_name= id )
            // SqlParser.g:326:28: COLLATE collation_name= id
            {
            root_0 = (Object)adaptor.nil();

            COLLATE351=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate2898); 
            COLLATE351_tree = (Object)adaptor.create(COLLATE351);
            root_0 = (Object)adaptor.becomeRoot(COLLATE351_tree, root_0);

            pushFollow(FOLLOW_id_in_column_constraint_collate2903);
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
    // SqlParser.g:328:1: table_constraint : ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) ;
    public final SqlParser.table_constraint_return table_constraint() throws RecognitionException {
        SqlParser.table_constraint_return retval = new SqlParser.table_constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRAINT352=null;
        SqlParser.id_return name = null;

        SqlParser.table_constraint_pk_return table_constraint_pk353 = null;

        SqlParser.table_constraint_unique_return table_constraint_unique354 = null;

        SqlParser.table_constraint_check_return table_constraint_check355 = null;

        SqlParser.table_constraint_fk_return table_constraint_fk356 = null;


        Object CONSTRAINT352_tree=null;
        RewriteRuleTokenStream stream_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token CONSTRAINT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_constraint_pk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_pk");
        RewriteRuleSubtreeStream stream_table_constraint_fk=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_fk");
        RewriteRuleSubtreeStream stream_table_constraint_unique=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_unique");
        RewriteRuleSubtreeStream stream_table_constraint_check=new RewriteRuleSubtreeStream(adaptor,"rule table_constraint_check");
        try {
            // SqlParser.g:328:17: ( ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) )
            // SqlParser.g:328:19: ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            {
            // SqlParser.g:328:19: ( CONSTRAINT name= id )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==CONSTRAINT) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // SqlParser.g:328:20: CONSTRAINT name= id
                    {
                    CONSTRAINT352=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint2912);  
                    stream_CONSTRAINT.add(CONSTRAINT352);

                    pushFollow(FOLLOW_id_in_table_constraint2916);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:329:3: ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            int alt132=4;
            switch ( input.LA(1) ) {
            case PRIMARY:
                {
                alt132=1;
                }
                break;
            case UNIQUE:
                {
                alt132=2;
                }
                break;
            case CHECK:
                {
                alt132=3;
                }
                break;
            case FOREIGN:
                {
                alt132=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // SqlParser.g:329:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint2924);
                    table_constraint_pk353=table_constraint_pk();

                    state._fsp--;

                    stream_table_constraint_pk.add(table_constraint_pk353.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:330:5: table_constraint_unique
                    {
                    pushFollow(FOLLOW_table_constraint_unique_in_table_constraint2930);
                    table_constraint_unique354=table_constraint_unique();

                    state._fsp--;

                    stream_table_constraint_unique.add(table_constraint_unique354.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:331:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint2936);
                    table_constraint_check355=table_constraint_check();

                    state._fsp--;

                    stream_table_constraint_check.add(table_constraint_check355.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:332:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint2942);
                    table_constraint_fk356=table_constraint_fk();

                    state._fsp--;

                    stream_table_constraint_fk.add(table_constraint_fk356.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_constraint_check, table_constraint_pk, table_constraint_fk, table_constraint_unique, name
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 333:1: -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
            {
                // SqlParser.g:333:4: ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE_CONSTRAINT, "TABLE_CONSTRAINT"), root_1);

                // SqlParser.g:334:3: ( table_constraint_pk )?
                if ( stream_table_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_pk.nextTree());

                }
                stream_table_constraint_pk.reset();
                // SqlParser.g:335:3: ( table_constraint_unique )?
                if ( stream_table_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_unique.nextTree());

                }
                stream_table_constraint_unique.reset();
                // SqlParser.g:336:3: ( table_constraint_check )?
                if ( stream_table_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_check.nextTree());

                }
                stream_table_constraint_check.reset();
                // SqlParser.g:337:3: ( table_constraint_fk )?
                if ( stream_table_constraint_fk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_fk.nextTree());

                }
                stream_table_constraint_fk.reset();
                // SqlParser.g:338:3: ( $name)?
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
    // SqlParser.g:340:1: table_constraint_pk : PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_pk_return table_constraint_pk() throws RecognitionException {
        SqlParser.table_constraint_pk_return retval = new SqlParser.table_constraint_pk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRIMARY357=null;
        Token KEY358=null;
        Token LPAREN359=null;
        Token COMMA360=null;
        Token RPAREN361=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause362 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object PRIMARY357_tree=null;
        Object KEY358_tree=null;
        Object LPAREN359_tree=null;
        Object COMMA360_tree=null;
        Object RPAREN361_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PRIMARY=new RewriteRuleTokenStream(adaptor,"token PRIMARY");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:340:20: ( PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:340:22: PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            PRIMARY357=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk2982);  
            stream_PRIMARY.add(PRIMARY357);

            KEY358=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk2984);  
            stream_KEY.add(KEY358);

            LPAREN359=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk2988);  
            stream_LPAREN.add(LPAREN359);

            pushFollow(FOLLOW_id_in_table_constraint_pk2992);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:341:30: ( COMMA indexed_columns+= id )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==COMMA) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // SqlParser.g:341:31: COMMA indexed_columns+= id
            	    {
            	    COMMA360=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk2995);  
            	    stream_COMMA.add(COMMA360);

            	    pushFollow(FOLLOW_id_in_table_constraint_pk2999);
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

            RPAREN361=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk3003);  
            stream_RPAREN.add(RPAREN361);

            // SqlParser.g:341:66: ( table_conflict_clause )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==ON) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // SqlParser.g:341:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk3005);
                    table_conflict_clause362=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause362.getTree());

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
            // 342:1: -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:342:4: ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PRIMARY.nextNode(), root_1);

                // SqlParser.g:342:14: ^( COLUMNS ( $indexed_columns)+ )
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
                // SqlParser.g:342:43: ( table_conflict_clause )?
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
    // SqlParser.g:344:1: table_constraint_unique : UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
    public final SqlParser.table_constraint_unique_return table_constraint_unique() throws RecognitionException {
        SqlParser.table_constraint_unique_return retval = new SqlParser.table_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE363=null;
        Token LPAREN364=null;
        Token COMMA365=null;
        Token RPAREN366=null;
        List list_indexed_columns=null;
        SqlParser.table_conflict_clause_return table_conflict_clause367 = null;

        SqlParser.id_return indexed_columns = null;
         indexed_columns = null;
        Object UNIQUE363_tree=null;
        Object LPAREN364_tree=null;
        Object COMMA365_tree=null;
        Object RPAREN366_tree=null;
        RewriteRuleTokenStream stream_UNIQUE=new RewriteRuleTokenStream(adaptor,"token UNIQUE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_table_conflict_clause=new RewriteRuleSubtreeStream(adaptor,"rule table_conflict_clause");
        try {
            // SqlParser.g:344:24: ( UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:344:26: UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            UNIQUE363=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_unique3030);  
            stream_UNIQUE.add(UNIQUE363);

            LPAREN364=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_unique3034);  
            stream_LPAREN.add(LPAREN364);

            pushFollow(FOLLOW_id_in_table_constraint_unique3038);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:345:30: ( COMMA indexed_columns+= id )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==COMMA) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // SqlParser.g:345:31: COMMA indexed_columns+= id
            	    {
            	    COMMA365=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_unique3041);  
            	    stream_COMMA.add(COMMA365);

            	    pushFollow(FOLLOW_id_in_table_constraint_unique3045);
            	    indexed_columns=id();

            	    state._fsp--;

            	    stream_id.add(indexed_columns.getTree());
            	    if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            	    list_indexed_columns.add(indexed_columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);

            RPAREN366=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_unique3049);  
            stream_RPAREN.add(RPAREN366);

            // SqlParser.g:345:66: ( table_conflict_clause )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==ON) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // SqlParser.g:345:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_unique3051);
                    table_conflict_clause367=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause367.getTree());

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
            // 346:1: -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:346:4: ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_UNIQUE.nextNode(), root_1);

                // SqlParser.g:346:13: ^( COLUMNS ( $indexed_columns)+ )
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
                // SqlParser.g:346:42: ( table_conflict_clause )?
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
    // SqlParser.g:348:1: table_constraint_check : CHECK LPAREN expr RPAREN ;
    public final SqlParser.table_constraint_check_return table_constraint_check() throws RecognitionException {
        SqlParser.table_constraint_check_return retval = new SqlParser.table_constraint_check_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CHECK368=null;
        Token LPAREN369=null;
        Token RPAREN371=null;
        SqlParser.expr_return expr370 = null;


        Object CHECK368_tree=null;
        Object LPAREN369_tree=null;
        Object RPAREN371_tree=null;

        try {
            // SqlParser.g:348:23: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:348:25: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK368=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check3076); 
            CHECK368_tree = (Object)adaptor.create(CHECK368);
            root_0 = (Object)adaptor.becomeRoot(CHECK368_tree, root_0);

            LPAREN369=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check3079); 
            pushFollow(FOLLOW_expr_in_table_constraint_check3082);
            expr370=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr370.getTree());
            RPAREN371=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check3084); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:350:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) ;
    public final SqlParser.table_constraint_fk_return table_constraint_fk() throws RecognitionException {
        SqlParser.table_constraint_fk_return retval = new SqlParser.table_constraint_fk_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOREIGN372=null;
        Token KEY373=null;
        Token LPAREN374=null;
        Token COMMA375=null;
        Token RPAREN376=null;
        List list_column_names=null;
        SqlParser.fk_clause_return fk_clause377 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object FOREIGN372_tree=null;
        Object KEY373_tree=null;
        Object LPAREN374_tree=null;
        Object COMMA375_tree=null;
        Object RPAREN376_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_FOREIGN=new RewriteRuleTokenStream(adaptor,"token FOREIGN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause");
        try {
            // SqlParser.g:350:20: ( FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) )
            // SqlParser.g:350:22: FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause
            {
            FOREIGN372=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk3092);  
            stream_FOREIGN.add(FOREIGN372);

            KEY373=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk3094);  
            stream_KEY.add(KEY373);

            LPAREN374=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk3096);  
            stream_LPAREN.add(LPAREN374);

            pushFollow(FOLLOW_id_in_table_constraint_fk3100);
            column_names=id();

            state._fsp--;

            stream_id.add(column_names.getTree());
            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names.getTree());

            // SqlParser.g:350:58: ( COMMA column_names+= id )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==COMMA) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // SqlParser.g:350:59: COMMA column_names+= id
            	    {
            	    COMMA375=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk3103);  
            	    stream_COMMA.add(COMMA375);

            	    pushFollow(FOLLOW_id_in_table_constraint_fk3107);
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

            RPAREN376=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk3111);  
            stream_RPAREN.add(RPAREN376);

            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk3113);
            fk_clause377=fk_clause();

            state._fsp--;

            stream_fk_clause.add(fk_clause377.getTree());


            // AST REWRITE
            // elements: fk_clause, FOREIGN, column_names
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: column_names
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"token column_names",list_column_names);
            root_0 = (Object)adaptor.nil();
            // 351:1: -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
            {
                // SqlParser.g:351:4: ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FOREIGN.nextNode(), root_1);

                // SqlParser.g:351:14: ^( COLUMNS ( $column_names)+ )
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
    // SqlParser.g:353:1: fk_clause : REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) ;
    public final SqlParser.fk_clause_return fk_clause() throws RecognitionException {
        SqlParser.fk_clause_return retval = new SqlParser.fk_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REFERENCES378=null;
        Token LPAREN379=null;
        Token COMMA380=null;
        Token RPAREN381=null;
        List list_column_names=null;
        SqlParser.id_return foreign_table = null;

        SqlParser.fk_clause_action_return fk_clause_action382 = null;

        SqlParser.fk_clause_deferrable_return fk_clause_deferrable383 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object REFERENCES378_tree=null;
        Object LPAREN379_tree=null;
        Object COMMA380_tree=null;
        Object RPAREN381_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_REFERENCES=new RewriteRuleTokenStream(adaptor,"token REFERENCES");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_fk_clause_action=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_action");
        RewriteRuleSubtreeStream stream_fk_clause_deferrable=new RewriteRuleSubtreeStream(adaptor,"rule fk_clause_deferrable");
        try {
            // SqlParser.g:353:10: ( REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) )
            // SqlParser.g:353:12: REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )?
            {
            REFERENCES378=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause3136);  
            stream_REFERENCES.add(REFERENCES378);

            pushFollow(FOLLOW_id_in_fk_clause3140);
            foreign_table=id();

            state._fsp--;

            stream_id.add(foreign_table.getTree());
            // SqlParser.g:353:40: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==LPAREN) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // SqlParser.g:353:41: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    LPAREN379=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause3143);  
                    stream_LPAREN.add(LPAREN379);

                    pushFollow(FOLLOW_id_in_fk_clause3147);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:353:65: ( COMMA column_names+= id )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==COMMA) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // SqlParser.g:353:66: COMMA column_names+= id
                    	    {
                    	    COMMA380=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause3150);  
                    	    stream_COMMA.add(COMMA380);

                    	    pushFollow(FOLLOW_id_in_fk_clause3154);
                    	    column_names=id();

                    	    state._fsp--;

                    	    stream_id.add(column_names.getTree());
                    	    if (list_column_names==null) list_column_names=new ArrayList();
                    	    list_column_names.add(column_names.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);

                    RPAREN381=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause3158);  
                    stream_RPAREN.add(RPAREN381);


                    }
                    break;

            }

            // SqlParser.g:354:3: ( fk_clause_action )+
            int cnt140=0;
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==MATCH||LA140_0==ON) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // SqlParser.g:354:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause3164);
            	    fk_clause_action382=fk_clause_action();

            	    state._fsp--;

            	    stream_fk_clause_action.add(fk_clause_action382.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt140 >= 1 ) break loop140;
                        EarlyExitException eee =
                            new EarlyExitException(140, input);
                        throw eee;
                }
                cnt140++;
            } while (true);

            // SqlParser.g:354:21: ( fk_clause_deferrable )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==NOT) ) {
                int LA141_1 = input.LA(2);

                if ( (LA141_1==DEFERRABLE) ) {
                    alt141=1;
                }
            }
            else if ( (LA141_0==DEFERRABLE) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // SqlParser.g:354:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause3167);
                    fk_clause_deferrable383=fk_clause_deferrable();

                    state._fsp--;

                    stream_fk_clause_deferrable.add(fk_clause_deferrable383.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: fk_clause_action, foreign_table, column_names, REFERENCES, fk_clause_deferrable
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
            // 355:1: -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
            {
                // SqlParser.g:355:4: ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_REFERENCES.nextNode(), root_1);

                adaptor.addChild(root_1, stream_foreign_table.nextTree());
                // SqlParser.g:355:32: ^( COLUMNS ( $column_names)+ )
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
                // SqlParser.g:355:76: ( fk_clause_deferrable )?
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
    // SqlParser.g:357:1: fk_clause_action : ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id );
    public final SqlParser.fk_clause_action_return fk_clause_action() throws RecognitionException {
        SqlParser.fk_clause_action_return retval = new SqlParser.fk_clause_action_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ON384=null;
        Token set385=null;
        Token SET386=null;
        Token NULL387=null;
        Token SET388=null;
        Token DEFAULT389=null;
        Token CASCADE390=null;
        Token RESTRICT391=null;
        Token MATCH392=null;
        SqlParser.id_return id393 = null;


        Object ON384_tree=null;
        Object set385_tree=null;
        Object SET386_tree=null;
        Object NULL387_tree=null;
        Object SET388_tree=null;
        Object DEFAULT389_tree=null;
        Object CASCADE390_tree=null;
        Object RESTRICT391_tree=null;
        Object MATCH392_tree=null;

        try {
            // SqlParser.g:358:3: ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==ON) ) {
                alt143=1;
            }
            else if ( (LA143_0==MATCH) ) {
                alt143=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // SqlParser.g:358:5: ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();

                    ON384=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action3201); 
                    ON384_tree = (Object)adaptor.create(ON384);
                    root_0 = (Object)adaptor.becomeRoot(ON384_tree, root_0);

                    set385=(Token)input.LT(1);
                    if ( input.LA(1)==DELETE||input.LA(1)==INSERT||input.LA(1)==UPDATE ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set385));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // SqlParser.g:358:36: ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    int alt142=4;
                    switch ( input.LA(1) ) {
                    case SET:
                        {
                        int LA142_1 = input.LA(2);

                        if ( (LA142_1==NULL) ) {
                            alt142=1;
                        }
                        else if ( (LA142_1==DEFAULT) ) {
                            alt142=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 142, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case CASCADE:
                        {
                        alt142=3;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt142=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 142, 0, input);

                        throw nvae;
                    }

                    switch (alt142) {
                        case 1 :
                            // SqlParser.g:358:37: SET NULL
                            {
                            SET386=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3217); 
                            NULL387=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action3220); 
                            NULL387_tree = (Object)adaptor.create(NULL387);
                            adaptor.addChild(root_0, NULL387_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:358:49: SET DEFAULT
                            {
                            SET388=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3224); 
                            DEFAULT389=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action3227); 
                            DEFAULT389_tree = (Object)adaptor.create(DEFAULT389);
                            adaptor.addChild(root_0, DEFAULT389_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:358:64: CASCADE
                            {
                            CASCADE390=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action3231); 
                            CASCADE390_tree = (Object)adaptor.create(CASCADE390);
                            adaptor.addChild(root_0, CASCADE390_tree);


                            }
                            break;
                        case 4 :
                            // SqlParser.g:358:74: RESTRICT
                            {
                            RESTRICT391=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action3235); 
                            RESTRICT391_tree = (Object)adaptor.create(RESTRICT391);
                            adaptor.addChild(root_0, RESTRICT391_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:359:5: MATCH id
                    {
                    root_0 = (Object)adaptor.nil();

                    MATCH392=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action3242); 
                    MATCH392_tree = (Object)adaptor.create(MATCH392);
                    root_0 = (Object)adaptor.becomeRoot(MATCH392_tree, root_0);

                    pushFollow(FOLLOW_id_in_fk_clause_action3245);
                    id393=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id393.getTree());

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
    // SqlParser.g:361:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? ;
    public final SqlParser.fk_clause_deferrable_return fk_clause_deferrable() throws RecognitionException {
        SqlParser.fk_clause_deferrable_return retval = new SqlParser.fk_clause_deferrable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT394=null;
        Token DEFERRABLE395=null;
        Token INITIALLY396=null;
        Token DEFERRED397=null;
        Token INITIALLY398=null;
        Token IMMEDIATE399=null;

        Object NOT394_tree=null;
        Object DEFERRABLE395_tree=null;
        Object INITIALLY396_tree=null;
        Object DEFERRED397_tree=null;
        Object INITIALLY398_tree=null;
        Object IMMEDIATE399_tree=null;

        try {
            // SqlParser.g:361:21: ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )
            // SqlParser.g:361:23: ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:361:23: ( NOT )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==NOT) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // SqlParser.g:361:24: NOT
                    {
                    NOT394=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable3253); 
                    NOT394_tree = (Object)adaptor.create(NOT394);
                    adaptor.addChild(root_0, NOT394_tree);


                    }
                    break;

            }

            DEFERRABLE395=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable3257); 
            DEFERRABLE395_tree = (Object)adaptor.create(DEFERRABLE395);
            root_0 = (Object)adaptor.becomeRoot(DEFERRABLE395_tree, root_0);

            // SqlParser.g:361:42: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            int alt145=3;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==INITIALLY) ) {
                int LA145_1 = input.LA(2);

                if ( (LA145_1==DEFERRED) ) {
                    alt145=1;
                }
                else if ( (LA145_1==IMMEDIATE) ) {
                    alt145=2;
                }
            }
            switch (alt145) {
                case 1 :
                    // SqlParser.g:361:43: INITIALLY DEFERRED
                    {
                    INITIALLY396=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3261); 
                    DEFERRED397=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable3264); 
                    DEFERRED397_tree = (Object)adaptor.create(DEFERRED397);
                    adaptor.addChild(root_0, DEFERRED397_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:361:65: INITIALLY IMMEDIATE
                    {
                    INITIALLY398=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3268); 
                    IMMEDIATE399=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable3271); 
                    IMMEDIATE399_tree = (Object)adaptor.create(IMMEDIATE399);
                    adaptor.addChild(root_0, IMMEDIATE399_tree);


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
    // SqlParser.g:364:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) ;
    public final SqlParser.drop_table_stmt_return drop_table_stmt() throws RecognitionException {
        SqlParser.drop_table_stmt_return retval = new SqlParser.drop_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP400=null;
        Token TABLE401=null;
        Token IF402=null;
        Token EXISTS403=null;
        Token DOT404=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;


        Object DROP400_tree=null;
        Object TABLE401_tree=null;
        Object IF402_tree=null;
        Object EXISTS403_tree=null;
        Object DOT404_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:364:16: ( DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) )
            // SqlParser.g:364:18: DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id
            {
            DROP400=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt3281);  
            stream_DROP.add(DROP400);

            TABLE401=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt3283);  
            stream_TABLE.add(TABLE401);

            // SqlParser.g:364:29: ( IF EXISTS )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==IF) ) {
                int LA146_1 = input.LA(2);

                if ( (LA146_1==EXISTS) ) {
                    alt146=1;
                }
            }
            switch (alt146) {
                case 1 :
                    // SqlParser.g:364:30: IF EXISTS
                    {
                    IF402=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt3286);  
                    stream_IF.add(IF402);

                    EXISTS403=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt3288);  
                    stream_EXISTS.add(EXISTS403);


                    }
                    break;

            }

            // SqlParser.g:364:42: (database_name= id DOT )?
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
                    // SqlParser.g:364:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_table_stmt3295);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT404=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt3297);  
                    stream_DOT.add(DOT404);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_table_stmt3303);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());


            // AST REWRITE
            // elements: EXISTS, table_name, database_name
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
            // 365:1: -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
            {
                // SqlParser.g:365:4: ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_TABLE, "DROP_TABLE"), root_1);

                // SqlParser.g:365:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:365:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:365:36: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:365:50: ( $database_name)?
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
    // SqlParser.g:368:1: alter_table_stmt : ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) ;
    public final SqlParser.alter_table_stmt_return alter_table_stmt() throws RecognitionException {
        SqlParser.alter_table_stmt_return retval = new SqlParser.alter_table_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALTER405=null;
        Token TABLE406=null;
        Token DOT407=null;
        Token RENAME408=null;
        Token TO409=null;
        Token ADD410=null;
        Token COLUMN411=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.id_return new_table_name = null;

        SqlParser.column_def_return column_def412 = null;


        Object ALTER405_tree=null;
        Object TABLE406_tree=null;
        Object DOT407_tree=null;
        Object RENAME408_tree=null;
        Object TO409_tree=null;
        Object ADD410_tree=null;
        Object COLUMN411_tree=null;

        try {
            // SqlParser.g:368:17: ( ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) )
            // SqlParser.g:368:19: ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();

            ALTER405=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt3333); 
            ALTER405_tree = (Object)adaptor.create(ALTER405);
            adaptor.addChild(root_0, ALTER405_tree);

            TABLE406=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt3335); 
            TABLE406_tree = (Object)adaptor.create(TABLE406);
            adaptor.addChild(root_0, TABLE406_tree);

            // SqlParser.g:368:31: (database_name= id DOT )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==ID) ) {
                int LA148_1 = input.LA(2);

                if ( (LA148_1==DOT) ) {
                    alt148=1;
                }
            }
            else if ( ((LA148_0>=ABORT && LA148_0<=FROM)||(LA148_0>=GROUP && LA148_0<=IMMEDIATE)||(LA148_0>=INDEX && LA148_0<=IS)||(LA148_0>=JOIN && LA148_0<=LEFT)||LA148_0==LIMIT||LA148_0==NATURAL||(LA148_0>=NULL && LA148_0<=REFERENCES)||(LA148_0>=REINDEX && LA148_0<=WHERE)) ) {
                int LA148_2 = input.LA(2);

                if ( (LA148_2==DOT) ) {
                    alt148=1;
                }
            }
            switch (alt148) {
                case 1 :
                    // SqlParser.g:368:32: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_alter_table_stmt3340);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT407=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt3342); 
                    DOT407_tree = (Object)adaptor.create(DOT407);
                    adaptor.addChild(root_0, DOT407_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_alter_table_stmt3348);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:368:69: ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==RENAME) ) {
                alt150=1;
            }
            else if ( (LA150_0==ADD) ) {
                alt150=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;
            }
            switch (alt150) {
                case 1 :
                    // SqlParser.g:368:70: RENAME TO new_table_name= id
                    {
                    RENAME408=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt3351); 
                    RENAME408_tree = (Object)adaptor.create(RENAME408);
                    adaptor.addChild(root_0, RENAME408_tree);

                    TO409=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt3353); 
                    TO409_tree = (Object)adaptor.create(TO409);
                    adaptor.addChild(root_0, TO409_tree);

                    pushFollow(FOLLOW_id_in_alter_table_stmt3357);
                    new_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, new_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:368:100: ADD ( COLUMN )? column_def
                    {
                    ADD410=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt3361); 
                    ADD410_tree = (Object)adaptor.create(ADD410);
                    adaptor.addChild(root_0, ADD410_tree);

                    // SqlParser.g:368:104: ( COLUMN )?
                    int alt149=2;
                    int LA149_0 = input.LA(1);

                    if ( (LA149_0==COLUMN) ) {
                        alt149=1;
                    }
                    switch (alt149) {
                        case 1 :
                            // SqlParser.g:368:105: COLUMN
                            {
                            COLUMN411=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt3364); 
                            COLUMN411_tree = (Object)adaptor.create(COLUMN411);
                            adaptor.addChild(root_0, COLUMN411_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_def_in_alter_table_stmt3368);
                    column_def412=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def412.getTree());

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
    // SqlParser.g:371:1: create_view_stmt : CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt ;
    public final SqlParser.create_view_stmt_return create_view_stmt() throws RecognitionException {
        SqlParser.create_view_stmt_return retval = new SqlParser.create_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE413=null;
        Token TEMPORARY414=null;
        Token VIEW415=null;
        Token IF416=null;
        Token NOT417=null;
        Token EXISTS418=null;
        Token DOT419=null;
        Token AS420=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;

        SqlParser.select_stmt_return select_stmt421 = null;


        Object CREATE413_tree=null;
        Object TEMPORARY414_tree=null;
        Object VIEW415_tree=null;
        Object IF416_tree=null;
        Object NOT417_tree=null;
        Object EXISTS418_tree=null;
        Object DOT419_tree=null;
        Object AS420_tree=null;

        try {
            // SqlParser.g:371:17: ( CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt )
            // SqlParser.g:371:19: CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt
            {
            root_0 = (Object)adaptor.nil();

            CREATE413=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt3377); 
            CREATE413_tree = (Object)adaptor.create(CREATE413);
            adaptor.addChild(root_0, CREATE413_tree);

            // SqlParser.g:371:26: ( TEMPORARY )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==TEMPORARY) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // SqlParser.g:371:26: TEMPORARY
                    {
                    TEMPORARY414=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_view_stmt3379); 
                    TEMPORARY414_tree = (Object)adaptor.create(TEMPORARY414);
                    adaptor.addChild(root_0, TEMPORARY414_tree);


                    }
                    break;

            }

            VIEW415=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt3382); 
            VIEW415_tree = (Object)adaptor.create(VIEW415);
            adaptor.addChild(root_0, VIEW415_tree);

            // SqlParser.g:371:42: ( IF NOT EXISTS )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==IF) ) {
                int LA152_1 = input.LA(2);

                if ( (LA152_1==NOT) ) {
                    alt152=1;
                }
            }
            switch (alt152) {
                case 1 :
                    // SqlParser.g:371:43: IF NOT EXISTS
                    {
                    IF416=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt3385); 
                    IF416_tree = (Object)adaptor.create(IF416);
                    adaptor.addChild(root_0, IF416_tree);

                    NOT417=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt3387); 
                    NOT417_tree = (Object)adaptor.create(NOT417);
                    adaptor.addChild(root_0, NOT417_tree);

                    EXISTS418=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt3389); 
                    EXISTS418_tree = (Object)adaptor.create(EXISTS418);
                    adaptor.addChild(root_0, EXISTS418_tree);


                    }
                    break;

            }

            // SqlParser.g:371:59: (database_name= id DOT )?
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
                    // SqlParser.g:371:60: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_view_stmt3396);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT419=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt3398); 
                    DOT419_tree = (Object)adaptor.create(DOT419);
                    adaptor.addChild(root_0, DOT419_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_view_stmt3404);
            view_name=id();

            state._fsp--;

            adaptor.addChild(root_0, view_name.getTree());
            AS420=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt3406); 
            AS420_tree = (Object)adaptor.create(AS420);
            adaptor.addChild(root_0, AS420_tree);

            pushFollow(FOLLOW_select_stmt_in_create_view_stmt3408);
            select_stmt421=select_stmt();

            state._fsp--;

            adaptor.addChild(root_0, select_stmt421.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:374:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id ;
    public final SqlParser.drop_view_stmt_return drop_view_stmt() throws RecognitionException {
        SqlParser.drop_view_stmt_return retval = new SqlParser.drop_view_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP422=null;
        Token VIEW423=null;
        Token IF424=null;
        Token EXISTS425=null;
        Token DOT426=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return view_name = null;


        Object DROP422_tree=null;
        Object VIEW423_tree=null;
        Object IF424_tree=null;
        Object EXISTS425_tree=null;
        Object DOT426_tree=null;

        try {
            // SqlParser.g:374:15: ( DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id )
            // SqlParser.g:374:17: DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP422=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt3416); 
            DROP422_tree = (Object)adaptor.create(DROP422);
            adaptor.addChild(root_0, DROP422_tree);

            VIEW423=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt3418); 
            VIEW423_tree = (Object)adaptor.create(VIEW423);
            adaptor.addChild(root_0, VIEW423_tree);

            // SqlParser.g:374:27: ( IF EXISTS )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==IF) ) {
                int LA154_1 = input.LA(2);

                if ( (LA154_1==EXISTS) ) {
                    alt154=1;
                }
            }
            switch (alt154) {
                case 1 :
                    // SqlParser.g:374:28: IF EXISTS
                    {
                    IF424=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt3421); 
                    IF424_tree = (Object)adaptor.create(IF424);
                    adaptor.addChild(root_0, IF424_tree);

                    EXISTS425=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt3423); 
                    EXISTS425_tree = (Object)adaptor.create(EXISTS425);
                    adaptor.addChild(root_0, EXISTS425_tree);


                    }
                    break;

            }

            // SqlParser.g:374:40: (database_name= id DOT )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==ID) ) {
                int LA155_1 = input.LA(2);

                if ( (LA155_1==DOT) ) {
                    alt155=1;
                }
            }
            else if ( ((LA155_0>=ABORT && LA155_0<=FROM)||(LA155_0>=GROUP && LA155_0<=IMMEDIATE)||(LA155_0>=INDEX && LA155_0<=IS)||(LA155_0>=JOIN && LA155_0<=LEFT)||LA155_0==LIMIT||LA155_0==NATURAL||(LA155_0>=NULL && LA155_0<=REFERENCES)||(LA155_0>=REINDEX && LA155_0<=WHERE)) ) {
                int LA155_2 = input.LA(2);

                if ( (LA155_2==DOT) ) {
                    alt155=1;
                }
            }
            switch (alt155) {
                case 1 :
                    // SqlParser.g:374:41: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_view_stmt3430);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT426=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt3432); 
                    DOT426_tree = (Object)adaptor.create(DOT426);
                    adaptor.addChild(root_0, DOT426_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_view_stmt3438);
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
    // SqlParser.g:377:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) ;
    public final SqlParser.create_index_stmt_return create_index_stmt() throws RecognitionException {
        SqlParser.create_index_stmt_return retval = new SqlParser.create_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE427=null;
        Token UNIQUE428=null;
        Token INDEX429=null;
        Token IF430=null;
        Token NOT431=null;
        Token EXISTS432=null;
        Token DOT433=null;
        Token ON434=null;
        Token LPAREN435=null;
        Token COMMA436=null;
        Token RPAREN437=null;
        List list_columns=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.indexed_column_return columns = null;
         columns = null;
        Object CREATE427_tree=null;
        Object UNIQUE428_tree=null;
        Object INDEX429_tree=null;
        Object IF430_tree=null;
        Object NOT431_tree=null;
        Object EXISTS432_tree=null;
        Object DOT433_tree=null;
        Object ON434_tree=null;
        Object LPAREN435_tree=null;
        Object COMMA436_tree=null;
        Object RPAREN437_tree=null;
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
            // SqlParser.g:377:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) )
            // SqlParser.g:377:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            CREATE427=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt3446);  
            stream_CREATE.add(CREATE427);

            // SqlParser.g:377:27: ( UNIQUE )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==UNIQUE) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // SqlParser.g:377:28: UNIQUE
                    {
                    UNIQUE428=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt3449);  
                    stream_UNIQUE.add(UNIQUE428);


                    }
                    break;

            }

            INDEX429=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt3453);  
            stream_INDEX.add(INDEX429);

            // SqlParser.g:377:43: ( IF NOT EXISTS )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==IF) ) {
                int LA157_1 = input.LA(2);

                if ( (LA157_1==NOT) ) {
                    alt157=1;
                }
            }
            switch (alt157) {
                case 1 :
                    // SqlParser.g:377:44: IF NOT EXISTS
                    {
                    IF430=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt3456);  
                    stream_IF.add(IF430);

                    NOT431=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt3458);  
                    stream_NOT.add(NOT431);

                    EXISTS432=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt3460);  
                    stream_EXISTS.add(EXISTS432);


                    }
                    break;

            }

            // SqlParser.g:377:60: (database_name= id DOT )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==ID) ) {
                int LA158_1 = input.LA(2);

                if ( (LA158_1==DOT) ) {
                    alt158=1;
                }
            }
            else if ( ((LA158_0>=ABORT && LA158_0<=FROM)||(LA158_0>=GROUP && LA158_0<=IMMEDIATE)||(LA158_0>=INDEX && LA158_0<=IS)||(LA158_0>=JOIN && LA158_0<=LEFT)||LA158_0==LIMIT||LA158_0==NATURAL||(LA158_0>=NULL && LA158_0<=REFERENCES)||(LA158_0>=REINDEX && LA158_0<=WHERE)) ) {
                int LA158_2 = input.LA(2);

                if ( (LA158_2==DOT) ) {
                    alt158=1;
                }
            }
            switch (alt158) {
                case 1 :
                    // SqlParser.g:377:61: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_index_stmt3467);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT433=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt3469);  
                    stream_DOT.add(DOT433);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_index_stmt3475);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());
            ON434=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt3479);  
            stream_ON.add(ON434);

            pushFollow(FOLLOW_id_in_create_index_stmt3483);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            LPAREN435=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt3485);  
            stream_LPAREN.add(LPAREN435);

            pushFollow(FOLLOW_indexed_column_in_create_index_stmt3489);
            columns=indexed_column();

            state._fsp--;

            stream_indexed_column.add(columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());

            // SqlParser.g:378:51: ( COMMA columns+= indexed_column )*
            loop159:
            do {
                int alt159=2;
                int LA159_0 = input.LA(1);

                if ( (LA159_0==COMMA) ) {
                    alt159=1;
                }


                switch (alt159) {
            	case 1 :
            	    // SqlParser.g:378:52: COMMA columns+= indexed_column
            	    {
            	    COMMA436=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt3492);  
            	    stream_COMMA.add(COMMA436);

            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt3496);
            	    columns=indexed_column();

            	    state._fsp--;

            	    stream_indexed_column.add(columns.getTree());
            	    if (list_columns==null) list_columns=new ArrayList();
            	    list_columns.add(columns.getTree());


            	    }
            	    break;

            	default :
            	    break loop159;
                }
            } while (true);

            RPAREN437=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt3500);  
            stream_RPAREN.add(RPAREN437);



            // AST REWRITE
            // elements: table_name, EXISTS, index_name, UNIQUE, database_name, columns
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
            // 379:1: -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
            {
                // SqlParser.g:379:4: ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_INDEX, "CREATE_INDEX"), root_1);

                // SqlParser.g:379:19: ^( OPTIONS ( UNIQUE )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:379:29: ( UNIQUE )?
                if ( stream_UNIQUE.hasNext() ) {
                    adaptor.addChild(root_2, stream_UNIQUE.nextNode());

                }
                stream_UNIQUE.reset();
                // SqlParser.g:379:37: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:379:46: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:379:60: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_table_name.nextTree());
                // SqlParser.g:379:89: ( ^( COLUMNS ( $columns)+ ) )?
                if ( stream_columns.hasNext() ) {
                    // SqlParser.g:379:89: ^( COLUMNS ( $columns)+ )
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
    // SqlParser.g:381:1: indexed_column : column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) ;
    public final SqlParser.indexed_column_return indexed_column() throws RecognitionException {
        SqlParser.indexed_column_return retval = new SqlParser.indexed_column_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE438=null;
        Token ASC439=null;
        Token DESC440=null;
        SqlParser.id_return column_name = null;

        SqlParser.id_return collation_name = null;


        Object COLLATE438_tree=null;
        Object ASC439_tree=null;
        Object DESC440_tree=null;
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_COLLATE=new RewriteRuleTokenStream(adaptor,"token COLLATE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:381:15: (column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) )
            // SqlParser.g:381:17: column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )?
            {
            pushFollow(FOLLOW_id_in_indexed_column3546);
            column_name=id();

            state._fsp--;

            stream_id.add(column_name.getTree());
            // SqlParser.g:381:32: ( COLLATE collation_name= id )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==COLLATE) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // SqlParser.g:381:33: COLLATE collation_name= id
                    {
                    COLLATE438=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column3549);  
                    stream_COLLATE.add(COLLATE438);

                    pushFollow(FOLLOW_id_in_indexed_column3553);
                    collation_name=id();

                    state._fsp--;

                    stream_id.add(collation_name.getTree());

                    }
                    break;

            }

            // SqlParser.g:381:61: ( ASC | DESC )?
            int alt161=3;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==ASC) ) {
                alt161=1;
            }
            else if ( (LA161_0==DESC) ) {
                alt161=2;
            }
            switch (alt161) {
                case 1 :
                    // SqlParser.g:381:62: ASC
                    {
                    ASC439=(Token)match(input,ASC,FOLLOW_ASC_in_indexed_column3558);  
                    stream_ASC.add(ASC439);


                    }
                    break;
                case 2 :
                    // SqlParser.g:381:68: DESC
                    {
                    DESC440=(Token)match(input,DESC,FOLLOW_DESC_in_indexed_column3562);  
                    stream_DESC.add(DESC440);


                    }
                    break;

            }



            // AST REWRITE
            // elements: DESC, column_name, COLLATE, ASC, collation_name
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
            // 382:1: -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
            {
                // SqlParser.g:382:4: ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_1);

                // SqlParser.g:382:19: ( ^( COLLATE $collation_name) )?
                if ( stream_COLLATE.hasNext()||stream_collation_name.hasNext() ) {
                    // SqlParser.g:382:19: ^( COLLATE $collation_name)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_COLLATE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_collation_name.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_COLLATE.reset();
                stream_collation_name.reset();
                // SqlParser.g:382:47: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:382:52: ( DESC )?
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
    // SqlParser.g:385:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) ;
    public final SqlParser.drop_index_stmt_return drop_index_stmt() throws RecognitionException {
        SqlParser.drop_index_stmt_return retval = new SqlParser.drop_index_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP441=null;
        Token INDEX442=null;
        Token IF443=null;
        Token EXISTS444=null;
        Token DOT445=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return index_name = null;


        Object DROP441_tree=null;
        Object INDEX442_tree=null;
        Object IF443_tree=null;
        Object EXISTS444_tree=null;
        Object DOT445_tree=null;
        RewriteRuleTokenStream stream_INDEX=new RewriteRuleTokenStream(adaptor,"token INDEX");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // SqlParser.g:385:16: ( DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) )
            // SqlParser.g:385:18: DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id
            {
            DROP441=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3593);  
            stream_DROP.add(DROP441);

            INDEX442=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3595);  
            stream_INDEX.add(INDEX442);

            // SqlParser.g:385:29: ( IF EXISTS )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==IF) ) {
                int LA162_1 = input.LA(2);

                if ( (LA162_1==EXISTS) ) {
                    alt162=1;
                }
            }
            switch (alt162) {
                case 1 :
                    // SqlParser.g:385:30: IF EXISTS
                    {
                    IF443=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt3598);  
                    stream_IF.add(IF443);

                    EXISTS444=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt3600);  
                    stream_EXISTS.add(EXISTS444);


                    }
                    break;

            }

            // SqlParser.g:385:42: (database_name= id DOT )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==ID) ) {
                int LA163_1 = input.LA(2);

                if ( (LA163_1==DOT) ) {
                    alt163=1;
                }
            }
            else if ( ((LA163_0>=ABORT && LA163_0<=FROM)||(LA163_0>=GROUP && LA163_0<=IMMEDIATE)||(LA163_0>=INDEX && LA163_0<=IS)||(LA163_0>=JOIN && LA163_0<=LEFT)||LA163_0==LIMIT||LA163_0==NATURAL||(LA163_0>=NULL && LA163_0<=REFERENCES)||(LA163_0>=REINDEX && LA163_0<=WHERE)) ) {
                int LA163_2 = input.LA(2);

                if ( (LA163_2==DOT) ) {
                    alt163=1;
                }
            }
            switch (alt163) {
                case 1 :
                    // SqlParser.g:385:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_index_stmt3607);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT445=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt3609);  
                    stream_DOT.add(DOT445);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_index_stmt3615);
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
            // 386:1: -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
            {
                // SqlParser.g:386:4: ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_INDEX, "DROP_INDEX"), root_1);

                // SqlParser.g:386:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:386:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:386:36: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:386:50: ( $database_name)?
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
    // SqlParser.g:389:1: create_trigger_stmt : CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END ;
    public final SqlParser.create_trigger_stmt_return create_trigger_stmt() throws RecognitionException {
        SqlParser.create_trigger_stmt_return retval = new SqlParser.create_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE446=null;
        Token TEMPORARY447=null;
        Token TRIGGER448=null;
        Token IF449=null;
        Token NOT450=null;
        Token EXISTS451=null;
        Token DOT452=null;
        Token BEFORE453=null;
        Token AFTER454=null;
        Token INSTEAD455=null;
        Token OF456=null;
        Token DELETE457=null;
        Token INSERT458=null;
        Token UPDATE459=null;
        Token OF460=null;
        Token COMMA461=null;
        Token ON462=null;
        Token FOR463=null;
        Token EACH464=null;
        Token ROW465=null;
        Token WHEN466=null;
        Token BEGIN468=null;
        Token SEMI473=null;
        Token END474=null;
        List list_column_names=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.expr_return expr467 = null;

        SqlParser.update_stmt_return update_stmt469 = null;

        SqlParser.insert_stmt_return insert_stmt470 = null;

        SqlParser.delete_stmt_return delete_stmt471 = null;

        SqlParser.select_stmt_return select_stmt472 = null;

        SqlParser.id_return column_names = null;
         column_names = null;
        Object CREATE446_tree=null;
        Object TEMPORARY447_tree=null;
        Object TRIGGER448_tree=null;
        Object IF449_tree=null;
        Object NOT450_tree=null;
        Object EXISTS451_tree=null;
        Object DOT452_tree=null;
        Object BEFORE453_tree=null;
        Object AFTER454_tree=null;
        Object INSTEAD455_tree=null;
        Object OF456_tree=null;
        Object DELETE457_tree=null;
        Object INSERT458_tree=null;
        Object UPDATE459_tree=null;
        Object OF460_tree=null;
        Object COMMA461_tree=null;
        Object ON462_tree=null;
        Object FOR463_tree=null;
        Object EACH464_tree=null;
        Object ROW465_tree=null;
        Object WHEN466_tree=null;
        Object BEGIN468_tree=null;
        Object SEMI473_tree=null;
        Object END474_tree=null;

        try {
            // SqlParser.g:389:20: ( CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END )
            // SqlParser.g:389:22: CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            root_0 = (Object)adaptor.nil();

            CREATE446=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt3645); 
            CREATE446_tree = (Object)adaptor.create(CREATE446);
            adaptor.addChild(root_0, CREATE446_tree);

            // SqlParser.g:389:29: ( TEMPORARY )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==TEMPORARY) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // SqlParser.g:389:29: TEMPORARY
                    {
                    TEMPORARY447=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_trigger_stmt3647); 
                    TEMPORARY447_tree = (Object)adaptor.create(TEMPORARY447);
                    adaptor.addChild(root_0, TEMPORARY447_tree);


                    }
                    break;

            }

            TRIGGER448=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt3650); 
            TRIGGER448_tree = (Object)adaptor.create(TRIGGER448);
            adaptor.addChild(root_0, TRIGGER448_tree);

            // SqlParser.g:389:48: ( IF NOT EXISTS )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==IF) ) {
                int LA165_1 = input.LA(2);

                if ( (LA165_1==NOT) ) {
                    alt165=1;
                }
            }
            switch (alt165) {
                case 1 :
                    // SqlParser.g:389:49: IF NOT EXISTS
                    {
                    IF449=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt3653); 
                    IF449_tree = (Object)adaptor.create(IF449);
                    adaptor.addChild(root_0, IF449_tree);

                    NOT450=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt3655); 
                    NOT450_tree = (Object)adaptor.create(NOT450);
                    adaptor.addChild(root_0, NOT450_tree);

                    EXISTS451=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt3657); 
                    EXISTS451_tree = (Object)adaptor.create(EXISTS451);
                    adaptor.addChild(root_0, EXISTS451_tree);


                    }
                    break;

            }

            // SqlParser.g:389:65: (database_name= id DOT )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==ID) ) {
                int LA166_1 = input.LA(2);

                if ( (LA166_1==DOT) ) {
                    alt166=1;
                }
            }
            else if ( ((LA166_0>=ABORT && LA166_0<=FROM)||(LA166_0>=GROUP && LA166_0<=IMMEDIATE)||(LA166_0>=INDEX && LA166_0<=IS)||(LA166_0>=JOIN && LA166_0<=LEFT)||LA166_0==LIMIT||LA166_0==NATURAL||(LA166_0>=NULL && LA166_0<=REFERENCES)||(LA166_0>=REINDEX && LA166_0<=WHERE)) ) {
                int LA166_2 = input.LA(2);

                if ( (LA166_2==DOT) ) {
                    alt166=1;
                }
            }
            switch (alt166) {
                case 1 :
                    // SqlParser.g:389:66: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_trigger_stmt3664);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT452=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt3666); 
                    DOT452_tree = (Object)adaptor.create(DOT452);
                    adaptor.addChild(root_0, DOT452_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_trigger_stmt3672);
            trigger_name=id();

            state._fsp--;

            adaptor.addChild(root_0, trigger_name.getTree());
            // SqlParser.g:390:3: ( BEFORE | AFTER | INSTEAD OF )?
            int alt167=4;
            switch ( input.LA(1) ) {
                case BEFORE:
                    {
                    alt167=1;
                    }
                    break;
                case AFTER:
                    {
                    alt167=2;
                    }
                    break;
                case INSTEAD:
                    {
                    alt167=3;
                    }
                    break;
            }

            switch (alt167) {
                case 1 :
                    // SqlParser.g:390:4: BEFORE
                    {
                    BEFORE453=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt3677); 
                    BEFORE453_tree = (Object)adaptor.create(BEFORE453);
                    adaptor.addChild(root_0, BEFORE453_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:390:13: AFTER
                    {
                    AFTER454=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt3681); 
                    AFTER454_tree = (Object)adaptor.create(AFTER454);
                    adaptor.addChild(root_0, AFTER454_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:390:21: INSTEAD OF
                    {
                    INSTEAD455=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt3685); 
                    INSTEAD455_tree = (Object)adaptor.create(INSTEAD455);
                    adaptor.addChild(root_0, INSTEAD455_tree);

                    OF456=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3687); 
                    OF456_tree = (Object)adaptor.create(OF456);
                    adaptor.addChild(root_0, OF456_tree);


                    }
                    break;

            }

            // SqlParser.g:390:34: ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? )
            int alt170=3;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt170=1;
                }
                break;
            case INSERT:
                {
                alt170=2;
                }
                break;
            case UPDATE:
                {
                alt170=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 170, 0, input);

                throw nvae;
            }

            switch (alt170) {
                case 1 :
                    // SqlParser.g:390:35: DELETE
                    {
                    DELETE457=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt3692); 
                    DELETE457_tree = (Object)adaptor.create(DELETE457);
                    adaptor.addChild(root_0, DELETE457_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:390:44: INSERT
                    {
                    INSERT458=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt3696); 
                    INSERT458_tree = (Object)adaptor.create(INSERT458);
                    adaptor.addChild(root_0, INSERT458_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:390:53: UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )?
                    {
                    UPDATE459=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt3700); 
                    UPDATE459_tree = (Object)adaptor.create(UPDATE459);
                    adaptor.addChild(root_0, UPDATE459_tree);

                    // SqlParser.g:390:60: ( OF column_names+= id ( COMMA column_names+= id )* )?
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==OF) ) {
                        alt169=1;
                    }
                    switch (alt169) {
                        case 1 :
                            // SqlParser.g:390:61: OF column_names+= id ( COMMA column_names+= id )*
                            {
                            OF460=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3703); 
                            OF460_tree = (Object)adaptor.create(OF460);
                            adaptor.addChild(root_0, OF460_tree);

                            pushFollow(FOLLOW_id_in_create_trigger_stmt3707);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:390:81: ( COMMA column_names+= id )*
                            loop168:
                            do {
                                int alt168=2;
                                int LA168_0 = input.LA(1);

                                if ( (LA168_0==COMMA) ) {
                                    alt168=1;
                                }


                                switch (alt168) {
                            	case 1 :
                            	    // SqlParser.g:390:82: COMMA column_names+= id
                            	    {
                            	    COMMA461=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt3710); 
                            	    COMMA461_tree = (Object)adaptor.create(COMMA461);
                            	    adaptor.addChild(root_0, COMMA461_tree);

                            	    pushFollow(FOLLOW_id_in_create_trigger_stmt3714);
                            	    column_names=id();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, column_names.getTree());
                            	    if (list_column_names==null) list_column_names=new ArrayList();
                            	    list_column_names.add(column_names.getTree());


                            	    }
                            	    break;

                            	default :
                            	    break loop168;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            ON462=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt3723); 
            ON462_tree = (Object)adaptor.create(ON462);
            adaptor.addChild(root_0, ON462_tree);

            pushFollow(FOLLOW_id_in_create_trigger_stmt3727);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:391:20: ( FOR EACH ROW )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==FOR) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // SqlParser.g:391:21: FOR EACH ROW
                    {
                    FOR463=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt3730); 
                    FOR463_tree = (Object)adaptor.create(FOR463);
                    adaptor.addChild(root_0, FOR463_tree);

                    EACH464=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt3732); 
                    EACH464_tree = (Object)adaptor.create(EACH464);
                    adaptor.addChild(root_0, EACH464_tree);

                    ROW465=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt3734); 
                    ROW465_tree = (Object)adaptor.create(ROW465);
                    adaptor.addChild(root_0, ROW465_tree);


                    }
                    break;

            }

            // SqlParser.g:391:36: ( WHEN expr )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==WHEN) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // SqlParser.g:391:37: WHEN expr
                    {
                    WHEN466=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt3739); 
                    WHEN466_tree = (Object)adaptor.create(WHEN466);
                    adaptor.addChild(root_0, WHEN466_tree);

                    pushFollow(FOLLOW_expr_in_create_trigger_stmt3741);
                    expr467=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr467.getTree());

                    }
                    break;

            }

            BEGIN468=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt3747); 
            BEGIN468_tree = (Object)adaptor.create(BEGIN468);
            adaptor.addChild(root_0, BEGIN468_tree);

            // SqlParser.g:392:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
            int cnt174=0;
            loop174:
            do {
                int alt174=2;
                int LA174_0 = input.LA(1);

                if ( (LA174_0==DELETE||LA174_0==INSERT||LA174_0==REPLACE||LA174_0==SELECT||LA174_0==UPDATE) ) {
                    alt174=1;
                }


                switch (alt174) {
            	case 1 :
            	    // SqlParser.g:392:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // SqlParser.g:392:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
            	    int alt173=4;
            	    switch ( input.LA(1) ) {
            	    case UPDATE:
            	        {
            	        alt173=1;
            	        }
            	        break;
            	    case INSERT:
            	    case REPLACE:
            	        {
            	        alt173=2;
            	        }
            	        break;
            	    case DELETE:
            	        {
            	        alt173=3;
            	        }
            	        break;
            	    case SELECT:
            	        {
            	        alt173=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 173, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt173) {
            	        case 1 :
            	            // SqlParser.g:392:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt3751);
            	            update_stmt469=update_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, update_stmt469.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // SqlParser.g:392:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt3755);
            	            insert_stmt470=insert_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, insert_stmt470.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // SqlParser.g:392:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt3759);
            	            delete_stmt471=delete_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, delete_stmt471.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // SqlParser.g:392:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt3763);
            	            select_stmt472=select_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, select_stmt472.getTree());

            	            }
            	            break;

            	    }

            	    SEMI473=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt3766); 
            	    SEMI473_tree = (Object)adaptor.create(SEMI473);
            	    adaptor.addChild(root_0, SEMI473_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt174 >= 1 ) break loop174;
                        EarlyExitException eee =
                            new EarlyExitException(174, input);
                        throw eee;
                }
                cnt174++;
            } while (true);

            END474=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt3770); 
            END474_tree = (Object)adaptor.create(END474);
            adaptor.addChild(root_0, END474_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:395:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id ;
    public final SqlParser.drop_trigger_stmt_return drop_trigger_stmt() throws RecognitionException {
        SqlParser.drop_trigger_stmt_return retval = new SqlParser.drop_trigger_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP475=null;
        Token TRIGGER476=null;
        Token IF477=null;
        Token EXISTS478=null;
        Token DOT479=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return trigger_name = null;


        Object DROP475_tree=null;
        Object TRIGGER476_tree=null;
        Object IF477_tree=null;
        Object EXISTS478_tree=null;
        Object DOT479_tree=null;

        try {
            // SqlParser.g:395:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id )
            // SqlParser.g:395:20: DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP475=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt3778); 
            DROP475_tree = (Object)adaptor.create(DROP475);
            adaptor.addChild(root_0, DROP475_tree);

            TRIGGER476=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt3780); 
            TRIGGER476_tree = (Object)adaptor.create(TRIGGER476);
            adaptor.addChild(root_0, TRIGGER476_tree);

            // SqlParser.g:395:33: ( IF EXISTS )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==IF) ) {
                int LA175_1 = input.LA(2);

                if ( (LA175_1==EXISTS) ) {
                    alt175=1;
                }
            }
            switch (alt175) {
                case 1 :
                    // SqlParser.g:395:34: IF EXISTS
                    {
                    IF477=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt3783); 
                    IF477_tree = (Object)adaptor.create(IF477);
                    adaptor.addChild(root_0, IF477_tree);

                    EXISTS478=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt3785); 
                    EXISTS478_tree = (Object)adaptor.create(EXISTS478);
                    adaptor.addChild(root_0, EXISTS478_tree);


                    }
                    break;

            }

            // SqlParser.g:395:46: (database_name= id DOT )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==ID) ) {
                int LA176_1 = input.LA(2);

                if ( (LA176_1==DOT) ) {
                    alt176=1;
                }
            }
            else if ( ((LA176_0>=ABORT && LA176_0<=FROM)||(LA176_0>=GROUP && LA176_0<=IMMEDIATE)||(LA176_0>=INDEX && LA176_0<=IS)||(LA176_0>=JOIN && LA176_0<=LEFT)||LA176_0==LIMIT||LA176_0==NATURAL||(LA176_0>=NULL && LA176_0<=REFERENCES)||(LA176_0>=REINDEX && LA176_0<=WHERE)) ) {
                int LA176_2 = input.LA(2);

                if ( (LA176_2==DOT) ) {
                    alt176=1;
                }
            }
            switch (alt176) {
                case 1 :
                    // SqlParser.g:395:47: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_trigger_stmt3792);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT479=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt3794); 
                    DOT479_tree = (Object)adaptor.create(DOT479);
                    adaptor.addChild(root_0, DOT479_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_trigger_stmt3800);
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
    // SqlParser.g:400:1: id : ( ID | keyword );
    public final SqlParser.id_return id() throws RecognitionException {
        SqlParser.id_return retval = new SqlParser.id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID480=null;
        SqlParser.keyword_return keyword481 = null;


        Object ID480_tree=null;

        try {
            // SqlParser.g:400:3: ( ID | keyword )
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==ID) ) {
                alt177=1;
            }
            else if ( ((LA177_0>=ABORT && LA177_0<=FROM)||(LA177_0>=GROUP && LA177_0<=IMMEDIATE)||(LA177_0>=INDEX && LA177_0<=IS)||(LA177_0>=JOIN && LA177_0<=LEFT)||LA177_0==LIMIT||LA177_0==NATURAL||(LA177_0>=NULL && LA177_0<=REFERENCES)||(LA177_0>=REINDEX && LA177_0<=WHERE)) ) {
                alt177=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 177, 0, input);

                throw nvae;
            }
            switch (alt177) {
                case 1 :
                    // SqlParser.g:400:5: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID480=(Token)match(input,ID,FOLLOW_ID_in_id3810); 
                    ID480_tree = (Object)adaptor.create(ID480);
                    adaptor.addChild(root_0, ID480_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:400:10: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_id3814);
                    keyword481=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword481.getTree());

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
    // SqlParser.g:402:1: keyword : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_return keyword() throws RecognitionException {
        SqlParser.keyword_return retval = new SqlParser.keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set482=null;

        Object set482_tree=null;

        try {
            // SqlParser.g:402:8: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:402:10: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GROUP | HAVING | IF | IGNORE | IMMEDIATE | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | JOIN | KEY | LEFT | LIMIT | NATURAL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set482=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=FROM)||(input.LA(1)>=GROUP && input.LA(1)<=IMMEDIATE)||(input.LA(1)>=INDEX && input.LA(1)<=IS)||(input.LA(1)>=JOIN && input.LA(1)<=LEFT)||input.LA(1)==LIMIT||input.LA(1)==NATURAL||(input.LA(1)>=NULL && input.LA(1)<=REFERENCES)||(input.LA(1)>=REINDEX && input.LA(1)<=WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set482));
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
    // SqlParser.g:521:1: id_column_def : ( ID | keyword_column_def );
    public final SqlParser.id_column_def_return id_column_def() throws RecognitionException {
        SqlParser.id_column_def_return retval = new SqlParser.id_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID483=null;
        SqlParser.keyword_column_def_return keyword_column_def484 = null;


        Object ID483_tree=null;

        try {
            // SqlParser.g:521:14: ( ID | keyword_column_def )
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==ID) ) {
                alt178=1;
            }
            else if ( ((LA178_0>=ABORT && LA178_0<=COLLATE)||(LA178_0>=COMMIT && LA178_0<=CONFLICT)||(LA178_0>=CREATE && LA178_0<=WHERE)) ) {
                alt178=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 178, 0, input);

                throw nvae;
            }
            switch (alt178) {
                case 1 :
                    // SqlParser.g:521:16: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID483=(Token)match(input,ID,FOLLOW_ID_in_id_column_def4488); 
                    ID483_tree = (Object)adaptor.create(ID483);
                    adaptor.addChild(root_0, ID483_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:521:21: keyword_column_def
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_column_def_in_id_column_def4492);
                    keyword_column_def484=keyword_column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword_column_def484.getTree());

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
    // SqlParser.g:523:1: keyword_column_def : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_column_def_return keyword_column_def() throws RecognitionException {
        SqlParser.keyword_column_def_return retval = new SqlParser.keyword_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set485=null;

        Object set485_tree=null;

        try {
            // SqlParser.g:523:19: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:523:21: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set485=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=COLLATE)||(input.LA(1)>=COMMIT && input.LA(1)<=CONFLICT)||(input.LA(1)>=CREATE && input.LA(1)<=WHERE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set485));
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
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
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
        "\15\1\16\1\17\2\uffff\1\23\1\20\1\uffff\1\21\1\24\1\30\1\26\1\22"+
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
            "\1\30\52\uffff\1\25\1\24\3\uffff\1\27\1\uffff\1\30\4\uffff"+
            "\1\26\1\23",
            "\1\33\52\uffff\1\31\4\uffff\1\34\6\uffff\1\32",
            "",
            "",
            "\1\25\4\uffff\1\27\6\uffff\1\26",
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
            return "63:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );";
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
            return "()* loopback of 97:18: ( OR or_subexpr )*";
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
            return "()* loopback of 99:25: ( AND and_subexpr )*";
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
            return "101:34: ( cond_expr )?";
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
            return "104:41: ( ESCAPE escape_expr= eq_subexpr )?";
        }
    }
    static final String DFA38_eotS =
        "\25\uffff";
    static final String DFA38_eofS =
        "\25\uffff";
    static final String DFA38_minS =
        "\1\32\1\uffff\4\4\1\uffff\1\4\1\30\1\21\1\30\1\21\1\30\3\uffff\1"+
        "\21\4\uffff";
    static final String DFA38_maxS =
        "\1\u00b4\1\uffff\4\u00af\1\uffff\1\u00af\1\32\1\u00b4\1\32\1\u00b4"+
        "\1\32\3\uffff\1\u00b4\4\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\6\uffff\1\3\1\4\1\6\1\uffff\1\5\1\7\1\10"+
        "\1\11";
    static final String DFA38_specialS =
        "\25\uffff}>";
    static final String[] DFA38_transitionS = {
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
            "\3\21\6\uffff\1\21\1\uffff\3\21\33\uffff\62\21\1\uffff\5\21"+
            "\1\uffff\11\21\1\uffff\3\21\1\uffff\1\21\1\uffff\2\21\1\uffff"+
            "\15\21\1\uffff\10\21\1\20\21\21\1\uffff\3\21\1\uffff\2\21",
            "\1\15\1\uffff\1\22",
            "\3\23\4\uffff\1\15\1\uffff\1\23\1\uffff\3\23\33\uffff\62\23"+
            "\1\uffff\5\23\1\uffff\11\23\1\uffff\3\23\1\uffff\1\23\1\uffff"+
            "\2\23\1\uffff\15\23\1\uffff\32\23\1\uffff\3\23\1\uffff\2\23",
            "\1\15\1\uffff\1\24",
            "",
            "",
            "",
            "\4\22\3\uffff\1\21\1\uffff\1\22\1\uffff\3\22\33\uffff\62\22"+
            "\1\uffff\5\22\1\uffff\11\22\1\uffff\3\22\1\uffff\1\22\1\uffff"+
            "\2\22\1\uffff\15\22\1\uffff\32\22\1\uffff\3\22\1\uffff\2\22",
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
            return "133:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );";
        }
    }
    static final String DFA74_eotS =
        "\17\uffff";
    static final String DFA74_eofS =
        "\17\uffff";
    static final String DFA74_minS =
        "\1\21\1\uffff\2\4\1\uffff\3\4\2\30\1\21\2\30\1\24\1\uffff";
    static final String DFA74_maxS =
        "\1\u00b4\1\uffff\2\u00af\1\uffff\3\u00af\2\32\1\u00b4\1\32\1\30"+
        "\1\u00af\1\uffff";
    static final String DFA74_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\11\uffff\1\2";
    static final String DFA74_specialS =
        "\17\uffff}>";
    static final String[] DFA74_transitionS = {
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
            return "223:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );";
        }
    }
    static final String DFA73_eotS =
        "\33\uffff";
    static final String DFA73_eofS =
        "\33\uffff";
    static final String DFA73_minS =
        "\1\27\1\uffff\1\27\1\uffff\1\21\6\27\1\30\1\21\7\30\1\21\6\30";
    static final String DFA73_maxS =
        "\1\u00af\1\uffff\1\u00af\1\uffff\1\u00b4\5\u00ad\1\u00b1\1\u00af"+
        "\1\u00b4\1\110\3\u009c\1\110\1\u00b1\1\u00af\1\u00b4\1\110\3\u009c"+
        "\1\110\1\u00b1";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\27\uffff";
    static final String DFA73_specialS =
        "\33\uffff}>";
    static final String[] DFA73_transitionS = {
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
            return "226:10: ( ( AS )? column_alias= id )?";
        }
    }
    static final String DFA72_eotS =
        "\34\uffff";
    static final String DFA72_eofS =
        "\34\uffff";
    static final String DFA72_minS =
        "\1\72\1\27\1\uffff\1\27\1\21\6\27\1\uffff\1\30\1\21\7\30\1\21\6"+
        "\30";
    static final String DFA72_maxS =
        "\2\u00af\1\uffff\1\u00af\1\u00b4\5\u00ad\1\u00b1\1\uffff\1\u00af"+
        "\1\u00b4\1\110\3\u009c\1\110\1\u00b1\1\u00af\1\u00b4\1\110\3\u009c"+
        "\1\110\1\u00b1";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\10\uffff\1\1\20\uffff";
    static final String DFA72_specialS =
        "\34\uffff}>";
    static final String[] DFA72_transitionS = {
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
            return "226:11: ( AS )?";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list167 = new BitSet(new long[]{0xC000000000000002L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt177 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB14000L});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt182 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt188 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualified_table_name364 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name366 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_qualified_table_name372 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name377 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_qualified_table_name381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name385 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_number396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_set_in_signed_number405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OR_in_expr421 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_or_subexpr_in_expr424 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_or_subexpr436 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr439 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr448 = new BitSet(new long[]{0x00000000000000F2L,0x1804100000000080L,0x0000000000080035L});
    public static final BitSet FOLLOW_cond_expr_in_and_subexpr450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr462 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000080015L});
    public static final BitSet FOLLOW_match_op_in_cond_expr465 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr469 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ESCAPE_in_cond_expr472 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr504 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_IN_in_cond_expr507 = new BitSet(new long[]{0xFC00000004000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_in_source_in_cond_expr510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_cond_expr517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_cond_expr525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_cond_expr535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_cond_expr545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_cond_expr553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_cond_expr555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_cond_expr557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cond_expr568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_BETWEEN_in_cond_expr571 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_cond_expr577 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cond_expr603 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_eq_subexpr_in_cond_expr620 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_match_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_in_source656 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_in_source659 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_in_source662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_in_source669 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_in_source671 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_in_source674 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_in_source676 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_in_source680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_in_source698 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_in_source700 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_in_source706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr727 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_set_in_eq_subexpr730 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr747 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr756 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_set_in_neq_subexpr759 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr776 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr785 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_bit_subexpr788 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr797 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr806 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_set_in_add_subexpr809 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr822 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr831 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_mul_subexpr834 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr837 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_set_in_con_subexpr846 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_atom_expr906 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr908 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_atom_expr914 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_atom_expr922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr951 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr953 = new BitSet(new long[]{0xFC0000007C1E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr957 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr963 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr966 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr970 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr976 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr986 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr989 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr998 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1000 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_atom_expr1004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr1006 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_atom_expr1017 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr1021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_atom_expr1023 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr1031 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_atom_expr1039 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_THEN_in_atom_expr1043 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1045 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_ELSE_in_atom_expr1050 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_atom_expr1052 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_END_in_atom_expr1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal_value1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal_value1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal_value1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOB_in_literal_value1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal_value1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_literal_value1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_DATE_in_literal_value1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_literal_value1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_bind_parameter1215 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_bind_parameter1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_bind_parameter1234 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_bind_parameter1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function1258 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function1261 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function1265 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_set_in_raise_function1269 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_STRING_in_raise_function1286 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name1299 = new BitSet(new long[]{0x0000000004000002L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_name1303 = new BitSet(new long[]{0x0000000000060000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1307 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name1310 = new BitSet(new long[]{0x0000000000060000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1314 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1350 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1355 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1357 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1363 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1366 = new BitSet(new long[]{0xFC00000000060000L,0xEFFBEFFFFFFFFFFFL,0x000BBFFFFFF7FFCAL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1372 = new BitSet(new long[]{0xFC00000000060000L,0xEFFBEFFFFFFFFFFFL,0x000BBFFFFFF7FFCAL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1374 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_number_in_pragma_value1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_pragma_value1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1403 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0001BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1406 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0001BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_STRING_in_attach_stmt1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_attach_stmt1417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1420 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_attach_stmt1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1432 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1435 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_detach_stmt1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1449 = new BitSet(new long[]{0xFC00000000000002L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1460 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1462 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1476 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1481 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1483 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1508 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1535 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1576 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1578 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1581 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1583 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1595 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1618 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_stmt1625 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1627 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1630 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1632 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1645 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1703 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_select_op_in_select_list1706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_core_in_select_list1709 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_UNION_in_select_op1718 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ALL_in_select_op1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1741 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ALL_in_select_core1744 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_DISTINCT_in_select_core1748 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_result_column_in_select_core1752 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1755 = new BitSet(new long[]{0xFC000000741E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_result_column_in_select_core1757 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_FROM_in_select_core1762 = new BitSet(new long[]{0xFC00000004000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_join_source_in_select_core1764 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_WHERE_in_select_core1769 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_select_core1773 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_GROUP_in_select_core1781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_core1783 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1785 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1788 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1790 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_HAVING_in_select_core1795 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_select_core1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_result_column1877 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_result_column1879 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column1896 = new BitSet(new long[]{0xFC00000000000002L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_AS_in_result_column1900 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_result_column1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source1927 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_join_op_in_join_source1930 = new BitSet(new long[]{0xFC00000004000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_single_source_in_join_source1933 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000008000001208L});
    public static final BitSet FOLLOW_join_constraint_in_join_source1936 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_id_in_single_source1953 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_single_source1955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1961 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000002L,0x0000800000000010L});
    public static final BitSet FOLLOW_AS_in_single_source1965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1971 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_single_source1978 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_single_source1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source1986 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_single_source2031 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2033 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_AS_in_single_source2037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2065 = new BitSet(new long[]{0xFC00000004000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_join_source_in_single_source2068 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op2088 = new BitSet(new long[]{0x0000000000000000L,0xA040000000080000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_in_join_op2094 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_OUTER_in_join_op2099 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_INNER_in_join_op2105 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_CROSS_in_join_op2109 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_JOIN_in_join_op2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint2123 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_join_constraint2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint2132 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint2134 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_join_constraint2138 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint2141 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_join_constraint2145 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt2168 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt2171 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt2177 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt2180 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2185 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt2187 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2193 = new BitSet(new long[]{0x0000000004000000L,0x0000000001000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2200 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2204 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2207 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_insert_stmt2211 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2224 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2226 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2230 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2233 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2237 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt2252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt2264 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt2267 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt2271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_SET_in_update_stmt2275 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2279 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt2282 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2286 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt2291 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_update_stmt2293 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_update_set2309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_update_set2311 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_update_set2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2321 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2323 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2325 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2328 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_delete_stmt2330 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2345 = new BitSet(new long[]{0x0000000000000002L,0x0002002004000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_set_in_begin_stmt2347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2371 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2390 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2393 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2398 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2401 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_rollback_stmt2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2417 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_savepoint_stmt2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2429 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2432 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_release_stmt2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2453 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2487 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2492 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2494 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2504 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2508 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2511 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2513 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2516 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2518 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2537 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2542 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2544 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2551 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2553 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2559 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2565 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2567 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2570 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2572 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2577 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2579 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_column_def_in_column_def2647 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000802000048010L});
    public static final BitSet FOLLOW_type_name_in_column_def2649 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2652 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2678 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_column_constraint2682 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk2781 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk2784 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000014L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_column_constraint_pk2787 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk2796 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null2809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null2811 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique2830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check2841 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check2844 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_column_constraint_check2847 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default2858 = new BitSet(new long[]{0x0000000004060000L,0x0000000000700000L,0x001B000000000040L});
    public static final BitSet FOLLOW_set_in_column_constraint_default2862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_set_in_column_constraint_default2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default2884 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_column_constraint_default2887 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate2898 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_column_constraint_collate2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint2912 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint2916 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_unique_in_table_constraint2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk2982 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk2984 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk2988 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk2992 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk2995 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk2999 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk3003 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_unique3030 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_unique3034 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3038 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_unique3041 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique3045 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_unique3049 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_unique3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check3076 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check3079 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_table_constraint_check3082 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk3092 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk3094 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk3096 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3100 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk3103 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3107 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk3111 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause3136 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause3140 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause3143 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause3147 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause3150 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause3154 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause3158 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause3164 = new BitSet(new long[]{0x0000000004000002L,0x0000000002000000L,0x0000000000000214L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action3201 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_set_in_fk_clause_action3204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000021000000L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3224 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action3242 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_fk_clause_action3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable3253 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable3257 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3261 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3268 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt3281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt3283 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt3286 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt3288 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3295 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt3297 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt3333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt3335 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3340 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt3342 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3348 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt3351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt3353 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt3361 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt3364 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt3377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040080000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_view_stmt3379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt3382 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_view_stmt3385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt3387 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt3389 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3396 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt3398 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt3406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt3416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt3418 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt3421 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt3423 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3430 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt3432 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt3446 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt3449 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt3453 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_index_stmt3456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt3458 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt3460 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3467 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt3469 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt3479 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3483 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt3485 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3489 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt3492 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3496 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_indexed_column3546 = new BitSet(new long[]{0x0000000000000002L,0x0000000010002004L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column3549 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_indexed_column3553 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_indexed_column3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_indexed_column3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3593 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3595 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt3598 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt3600 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3607 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt3609 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt3645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000880000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_trigger_stmt3647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt3650 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt3653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt3655 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt3657 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3664 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt3666 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3672 = new BitSet(new long[]{0x1000000000000000L,0x0180000008000020L,0x0000004000000000L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt3677 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt3681 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt3685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3687 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt3692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt3696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt3700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3703 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3707 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt3710 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3714 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt3723 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3727 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt3730 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt3732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt3734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt3739 = new BitSet(new long[]{0xFC000000740E0000L,0xEFFBEFFFFFFFFFFFL,0x001BBFFFFFF7FFDAL});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt3741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt3747 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt3751 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt3755 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt3759 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt3763 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt3766 = new BitSet(new long[]{0x0000000000000000L,0x0080000408000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt3778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt3780 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt3783 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt3785 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3792 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt3794 = new BitSet(new long[]{0xFC00000000000000L,0xEFFBEFFFFFFFFFFFL,0x0000BFFFFFF7FFCAL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_id3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_column_def4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_column_def_in_id_column_def4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword_column_def4499 = new BitSet(new long[]{0x0000000000000002L});

}