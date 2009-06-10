// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 SqlParser.g 2009-06-09 00:09:33

  package org.tmatesoft.sqljet.core.internal.lang;


import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteEarlyExitException;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;

public class SqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQUALS", "EQUALS2", "NOT_EQUALS", "NOT_EQUALS2", "LESS", "LESS_OR_EQ", "GREATER", "GREATER_OR_EQ", "SHIFT_LEFT", "SHIFT_RIGHT", "AMPERSAND", "PIPE", "DOUBLE_PIPE", "PLUS", "MINUS", "TILDA", "ASTERISK", "SLASH", "PERCENT", "SEMI", "DOT", "COMMA", "LPAREN", "RPAREN", "QUESTION", "COLON", "AT", "DOLLAR", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ABORT", "ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "AS", "ASC", "ATTACH", "AUTOINCREMENT", "BEFORE", "BEGIN", "BETWEEN", "BY", "CASCADE", "CASE", "CAST", "CHECK", "COLLATE", "COLUMN", "COMMIT", "CONFLICT", "CONSTRAINT", "CREATE", "CROSS", "CURRENT_TIME", "CURRENT_DATE", "CURRENT_TIMESTAMP", "DATABASE", "DEFAULT", "DEFERRABLE", "DEFERRED", "DELETE", "DESC", "DETACH", "DISTINCT", "DROP", "EACH", "ELSE", "END", "ESCAPE", "EXCEPT", "EXCLUSIVE", "EXISTS", "EXPLAIN", "FAIL", "FOR", "FOREIGN", "FROM", "GLOB", "GROUP", "HAVING", "IF", "IGNORE", "IMMEDIATE", "IN", "INDEX", "INDEXED", "INITIALLY", "INNER", "INSERT", "INSTEAD", "INTERSECT", "INTO", "IS", "ISNULL", "JOIN", "KEY", "LEFT", "LIKE", "LIMIT", "MATCH", "NATURAL", "NOT", "NOTNULL", "NULL", "OF", "OFFSET", "ON", "OR", "ORDER", "OUTER", "PLAN", "PRAGMA", "PRIMARY", "QUERY", "RAISE", "REFERENCES", "REGEXP", "REINDEX", "RELEASE", "RENAME", "REPLACE", "RESTRICT", "ROLLBACK", "ROW", "SAVEPOINT", "SELECT", "SET", "TABLE", "TEMPORARY", "THEN", "TO", "TRANSACTION", "TRIGGER", "UNION", "UNIQUE", "UPDATE", "USING", "VACUUM", "VALUES", "VIEW", "VIRTUAL", "WHEN", "WHERE", "ID_START", "ID", "STRING", "INTEGER", "FLOAT_EXP", "FLOAT", "BLOB", "COMMENT", "LINE_COMMENT", "WS", "ALIAS", "BIND", "BIND_NAME", "BLOB_LITERAL", "COLUMN_CONSTRAINT", "COLUMN_EXPRESSION", "COLUMNS", "CONSTRAINTS", "CREATE_INDEX", "CREATE_TABLE", "DROP_INDEX", "DROP_TABLE", "FLOAT_LITERAL", "FUNCTION_LITERAL", "INTEGER_LITERAL", "IS_NULL", "NOT_NULL", "OPTIONS", "ORDERING", "SELECT_CORE", "STRING_LITERAL", "TABLE_CONSTRAINT", "TYPE", "TYPE_PARAMS"
    };
    public static final int ROW=154;
    public static final int BLOB_LITERAL=187;
    public static final int TYPE_PARAMS=207;
    public static final int NOT=132;
    public static final int EXCEPT=100;
    public static final int FOREIGN=106;
    public static final int EOF=-1;
    public static final int TYPE=206;
    public static final int RPAREN=27;
    public static final int CREATE=82;
    public static final int STRING_LITERAL=204;
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
    public static final int NOT_NULL=200;
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
    public static final int OPTIONS=201;
    public static final int STRING=176;
    public static final int CAST=75;
    public static final int TABLE_CONSTRAINT=205;
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
    public static final int SELECT_CORE=203;
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
    public static final int ORDERING=202;
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
    // SqlParser.g:58:1: sql_stmt_list : ( sql_stmt )+ ;
    public final SqlParser.sql_stmt_list_return sql_stmt_list() throws RecognitionException {
        SqlParser.sql_stmt_list_return retval = new SqlParser.sql_stmt_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.sql_stmt_return sql_stmt1 = null;



        try {
            // SqlParser.g:58:14: ( ( sql_stmt )+ )
            // SqlParser.g:58:16: ( sql_stmt )+
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:58:16: ( sql_stmt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // SqlParser.g:58:17: sql_stmt
            	    {
            	    pushFollow(FOLLOW_sql_stmt_in_sql_stmt_list169);
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
    // SqlParser.g:60:1: sql_stmt : ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI ;
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
            // SqlParser.g:60:9: ( ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI )
            // SqlParser.g:60:11: ( EXPLAIN ( QUERY PLAN )? )? sql_stmt_core SEMI
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:60:11: ( EXPLAIN ( QUERY PLAN )? )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // SqlParser.g:60:12: EXPLAIN ( QUERY PLAN )?
                    {
                    EXPLAIN2=(Token)match(input,EXPLAIN,FOLLOW_EXPLAIN_in_sql_stmt179); 
                    EXPLAIN2_tree = (Object)adaptor.create(EXPLAIN2);
                    adaptor.addChild(root_0, EXPLAIN2_tree);

                    // SqlParser.g:60:20: ( QUERY PLAN )?
                    int alt2=2;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // SqlParser.g:60:21: QUERY PLAN
                            {
                            QUERY3=(Token)match(input,QUERY,FOLLOW_QUERY_in_sql_stmt182); 
                            QUERY3_tree = (Object)adaptor.create(QUERY3);
                            adaptor.addChild(root_0, QUERY3_tree);

                            PLAN4=(Token)match(input,PLAN,FOLLOW_PLAN_in_sql_stmt184); 
                            PLAN4_tree = (Object)adaptor.create(PLAN4);
                            adaptor.addChild(root_0, PLAN4_tree);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_sql_stmt_core_in_sql_stmt190);
            sql_stmt_core5=sql_stmt_core();

            state._fsp--;

            adaptor.addChild(root_0, sql_stmt_core5.getTree());
            SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_sql_stmt192); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:62:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );
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
            // SqlParser.g:63:3: ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt )
            int alt4=25;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // SqlParser.g:63:5: pragma_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pragma_stmt_in_sql_stmt_core203);
                    pragma_stmt7=pragma_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_stmt7.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:64:5: attach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attach_stmt_in_sql_stmt_core209);
                    attach_stmt8=attach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, attach_stmt8.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:65:5: detach_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_detach_stmt_in_sql_stmt_core215);
                    detach_stmt9=detach_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, detach_stmt9.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:66:5: analyze_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_analyze_stmt_in_sql_stmt_core221);
                    analyze_stmt10=analyze_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, analyze_stmt10.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:67:5: reindex_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reindex_stmt_in_sql_stmt_core227);
                    reindex_stmt11=reindex_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, reindex_stmt11.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:68:5: vacuum_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_vacuum_stmt_in_sql_stmt_core233);
                    vacuum_stmt12=vacuum_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, vacuum_stmt12.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:70:5: select_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_select_stmt_in_sql_stmt_core242);
                    select_stmt13=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt13.getTree());

                    }
                    break;
                case 8 :
                    // SqlParser.g:71:5: insert_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_insert_stmt_in_sql_stmt_core248);
                    insert_stmt14=insert_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_stmt14.getTree());

                    }
                    break;
                case 9 :
                    // SqlParser.g:72:5: update_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_update_stmt_in_sql_stmt_core254);
                    update_stmt15=update_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, update_stmt15.getTree());

                    }
                    break;
                case 10 :
                    // SqlParser.g:73:5: delete_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_delete_stmt_in_sql_stmt_core260);
                    delete_stmt16=delete_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_stmt16.getTree());

                    }
                    break;
                case 11 :
                    // SqlParser.g:74:5: begin_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_begin_stmt_in_sql_stmt_core266);
                    begin_stmt17=begin_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, begin_stmt17.getTree());

                    }
                    break;
                case 12 :
                    // SqlParser.g:75:5: commit_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_commit_stmt_in_sql_stmt_core272);
                    commit_stmt18=commit_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, commit_stmt18.getTree());

                    }
                    break;
                case 13 :
                    // SqlParser.g:76:5: rollback_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rollback_stmt_in_sql_stmt_core278);
                    rollback_stmt19=rollback_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, rollback_stmt19.getTree());

                    }
                    break;
                case 14 :
                    // SqlParser.g:77:5: savepoint_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_savepoint_stmt_in_sql_stmt_core284);
                    savepoint_stmt20=savepoint_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, savepoint_stmt20.getTree());

                    }
                    break;
                case 15 :
                    // SqlParser.g:78:5: release_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_release_stmt_in_sql_stmt_core290);
                    release_stmt21=release_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, release_stmt21.getTree());

                    }
                    break;
                case 16 :
                    // SqlParser.g:80:5: create_virtual_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_virtual_table_stmt_in_sql_stmt_core299);
                    create_virtual_table_stmt22=create_virtual_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_virtual_table_stmt22.getTree());

                    }
                    break;
                case 17 :
                    // SqlParser.g:81:5: create_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_table_stmt_in_sql_stmt_core305);
                    create_table_stmt23=create_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_table_stmt23.getTree());

                    }
                    break;
                case 18 :
                    // SqlParser.g:82:5: drop_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_table_stmt_in_sql_stmt_core311);
                    drop_table_stmt24=drop_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_table_stmt24.getTree());

                    }
                    break;
                case 19 :
                    // SqlParser.g:83:5: alter_table_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_alter_table_stmt_in_sql_stmt_core317);
                    alter_table_stmt25=alter_table_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, alter_table_stmt25.getTree());

                    }
                    break;
                case 20 :
                    // SqlParser.g:84:5: create_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_view_stmt_in_sql_stmt_core323);
                    create_view_stmt26=create_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_view_stmt26.getTree());

                    }
                    break;
                case 21 :
                    // SqlParser.g:85:5: drop_view_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_view_stmt_in_sql_stmt_core329);
                    drop_view_stmt27=drop_view_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_view_stmt27.getTree());

                    }
                    break;
                case 22 :
                    // SqlParser.g:86:5: create_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_index_stmt_in_sql_stmt_core335);
                    create_index_stmt28=create_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_index_stmt28.getTree());

                    }
                    break;
                case 23 :
                    // SqlParser.g:87:5: drop_index_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_index_stmt_in_sql_stmt_core341);
                    drop_index_stmt29=drop_index_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, drop_index_stmt29.getTree());

                    }
                    break;
                case 24 :
                    // SqlParser.g:88:5: create_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_create_trigger_stmt_in_sql_stmt_core347);
                    create_trigger_stmt30=create_trigger_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, create_trigger_stmt30.getTree());

                    }
                    break;
                case 25 :
                    // SqlParser.g:89:5: drop_trigger_stmt
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_drop_trigger_stmt_in_sql_stmt_core353);
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
    // SqlParser.g:92:1: qualified_table_name : (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? ;
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
            // SqlParser.g:92:21: ( (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )? )
            // SqlParser.g:92:23: (database_name= id DOT )? table_name= id ( INDEXED BY index_name= id | NOT INDEXED )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:92:23: (database_name= id DOT )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // SqlParser.g:92:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_qualified_table_name366);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_qualified_table_name368); 
                    DOT32_tree = (Object)adaptor.create(DOT32);
                    adaptor.addChild(root_0, DOT32_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_qualified_table_name374);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:92:61: ( INDEXED BY index_name= id | NOT INDEXED )?
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
                    // SqlParser.g:92:62: INDEXED BY index_name= id
                    {
                    INDEXED33=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name377); 
                    INDEXED33_tree = (Object)adaptor.create(INDEXED33);
                    adaptor.addChild(root_0, INDEXED33_tree);

                    BY34=(Token)match(input,BY,FOLLOW_BY_in_qualified_table_name379); 
                    BY34_tree = (Object)adaptor.create(BY34);
                    adaptor.addChild(root_0, BY34_tree);

                    pushFollow(FOLLOW_id_in_qualified_table_name383);
                    index_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, index_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:92:89: NOT INDEXED
                    {
                    NOT35=(Token)match(input,NOT,FOLLOW_NOT_in_qualified_table_name387); 
                    NOT35_tree = (Object)adaptor.create(NOT35);
                    adaptor.addChild(root_0, NOT35_tree);

                    INDEXED36=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_qualified_table_name389); 
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
    // SqlParser.g:94:1: signed_number : ( PLUS | MINUS )? ( INTEGER | FLOAT ) ;
    public final SqlParser.signed_number_return signed_number() throws RecognitionException {
        SqlParser.signed_number_return retval = new SqlParser.signed_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set37=null;
        Token set38=null;

        Object set37_tree=null;
        Object set38_tree=null;

        try {
            // SqlParser.g:94:14: ( ( PLUS | MINUS )? ( INTEGER | FLOAT ) )
            // SqlParser.g:94:16: ( PLUS | MINUS )? ( INTEGER | FLOAT )
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:94:16: ( PLUS | MINUS )?
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
    // SqlParser.g:96:1: expr : or_subexpr ( OR or_subexpr )* ;
    public final SqlParser.expr_return expr() throws RecognitionException {
        SqlParser.expr_return retval = new SqlParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR40=null;
        SqlParser.or_subexpr_return or_subexpr39 = null;

        SqlParser.or_subexpr_return or_subexpr41 = null;


        Object OR40_tree=null;

        try {
            // SqlParser.g:96:5: ( or_subexpr ( OR or_subexpr )* )
            // SqlParser.g:96:7: or_subexpr ( OR or_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_subexpr_in_expr420);
            or_subexpr39=or_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, or_subexpr39.getTree());
            // SqlParser.g:96:18: ( OR or_subexpr )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // SqlParser.g:96:19: OR or_subexpr
            	    {
            	    OR40=(Token)match(input,OR,FOLLOW_OR_in_expr423); 
            	    OR40_tree = (Object)adaptor.create(OR40);
            	    root_0 = (Object)adaptor.becomeRoot(OR40_tree, root_0);

            	    pushFollow(FOLLOW_or_subexpr_in_expr426);
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
    // SqlParser.g:98:1: or_subexpr : and_subexpr ( AND and_subexpr )* ;
    public final SqlParser.or_subexpr_return or_subexpr() throws RecognitionException {
        SqlParser.or_subexpr_return retval = new SqlParser.or_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND43=null;
        SqlParser.and_subexpr_return and_subexpr42 = null;

        SqlParser.and_subexpr_return and_subexpr44 = null;


        Object AND43_tree=null;

        try {
            // SqlParser.g:98:11: ( and_subexpr ( AND and_subexpr )* )
            // SqlParser.g:98:13: and_subexpr ( AND and_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_subexpr_in_or_subexpr435);
            and_subexpr42=and_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, and_subexpr42.getTree());
            // SqlParser.g:98:25: ( AND and_subexpr )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // SqlParser.g:98:26: AND and_subexpr
            	    {
            	    AND43=(Token)match(input,AND,FOLLOW_AND_in_or_subexpr438); 
            	    AND43_tree = (Object)adaptor.create(AND43);
            	    root_0 = (Object)adaptor.becomeRoot(AND43_tree, root_0);

            	    pushFollow(FOLLOW_and_subexpr_in_or_subexpr441);
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

    public static class in_source_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in_source"
    // SqlParser.g:100:1: in_source : ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id );
    public final SqlParser.in_source_return in_source() throws RecognitionException {
        SqlParser.in_source_return retval = new SqlParser.in_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN45=null;
        Token COMMA48=null;
        Token RPAREN50=null;
        Token DOT51=null;
        SqlParser.id_return database_name = null;

        SqlParser.id_return table_name = null;

        SqlParser.select_stmt_return select_stmt46 = null;

        SqlParser.expr_return expr47 = null;

        SqlParser.expr_return expr49 = null;


        Object LPAREN45_tree=null;
        Object COMMA48_tree=null;
        Object RPAREN50_tree=null;
        Object DOT51_tree=null;

        try {
            // SqlParser.g:101:3: ( LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN | (database_name= id DOT )? table_name= id )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LPAREN) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=ABORT && LA13_0<=WHERE)||LA13_0==ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // SqlParser.g:101:5: LPAREN ( select_stmt | expr ( COMMA expr )* )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN45=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in_source453); 
                    LPAREN45_tree = (Object)adaptor.create(LPAREN45);
                    adaptor.addChild(root_0, LPAREN45_tree);

                    // SqlParser.g:101:12: ( select_stmt | expr ( COMMA expr )* )?
                    int alt11=3;
                    alt11 = dfa11.predict(input);
                    switch (alt11) {
                        case 1 :
                            // SqlParser.g:101:13: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_in_source456);
                            select_stmt46=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt46.getTree());

                            }
                            break;
                        case 2 :
                            // SqlParser.g:101:27: expr ( COMMA expr )*
                            {
                            pushFollow(FOLLOW_expr_in_in_source460);
                            expr47=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr47.getTree());
                            // SqlParser.g:101:32: ( COMMA expr )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==COMMA) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // SqlParser.g:101:33: COMMA expr
                            	    {
                            	    COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_source463); 
                            	    COMMA48_tree = (Object)adaptor.create(COMMA48);
                            	    adaptor.addChild(root_0, COMMA48_tree);

                            	    pushFollow(FOLLOW_expr_in_in_source465);
                            	    expr49=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, expr49.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    RPAREN50=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in_source471); 
                    RPAREN50_tree = (Object)adaptor.create(RPAREN50);
                    adaptor.addChild(root_0, RPAREN50_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:102:5: (database_name= id DOT )? table_name= id
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:102:5: (database_name= id DOT )?
                    int alt12=2;
                    alt12 = dfa12.predict(input);
                    switch (alt12) {
                        case 1 :
                            // SqlParser.g:102:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_in_source480);
                            database_name=id();

                            state._fsp--;

                            adaptor.addChild(root_0, database_name.getTree());
                            DOT51=(Token)match(input,DOT,FOLLOW_DOT_in_in_source482); 
                            DOT51_tree = (Object)adaptor.create(DOT51);
                            adaptor.addChild(root_0, DOT51_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_in_source488);
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
    // SqlParser.g:105:1: and_subexpr : ( eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )* | ( NOT )? op= ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE escape_subexpr= eq_subexpr )? -> ^( $op eq_subexpr ( NOT )? ( ^( ESCAPE $escape_subexpr) )? ) | ( NOT )? IN in_source | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | IS NOT NULL -> NOT_NULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN $e1 $e2 ( NOT )? ) );
    public final SqlParser.and_subexpr_return and_subexpr() throws RecognitionException {
        SqlParser.and_subexpr_return retval = new SqlParser.and_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token set53=null;
        Token NOT55=null;
        Token LIKE56=null;
        Token GLOB57=null;
        Token REGEXP58=null;
        Token MATCH59=null;
        Token ESCAPE61=null;
        Token NOT62=null;
        Token IN63=null;
        Token ISNULL65=null;
        Token NOTNULL66=null;
        Token IS67=null;
        Token NULL68=null;
        Token IS69=null;
        Token NOT70=null;
        Token NULL71=null;
        Token NOT72=null;
        Token BETWEEN73=null;
        Token AND74=null;
        SqlParser.eq_subexpr_return escape_subexpr = null;

        SqlParser.eq_subexpr_return e1 = null;

        SqlParser.eq_subexpr_return e2 = null;

        SqlParser.eq_subexpr_return eq_subexpr52 = null;

        SqlParser.eq_subexpr_return eq_subexpr54 = null;

        SqlParser.eq_subexpr_return eq_subexpr60 = null;

        SqlParser.in_source_return in_source64 = null;


        Object op_tree=null;
        Object set53_tree=null;
        Object NOT55_tree=null;
        Object LIKE56_tree=null;
        Object GLOB57_tree=null;
        Object REGEXP58_tree=null;
        Object MATCH59_tree=null;
        Object ESCAPE61_tree=null;
        Object NOT62_tree=null;
        Object IN63_tree=null;
        Object ISNULL65_tree=null;
        Object NOTNULL66_tree=null;
        Object IS67_tree=null;
        Object NULL68_tree=null;
        Object IS69_tree=null;
        Object NOT70_tree=null;
        Object NULL71_tree=null;
        Object NOT72_tree=null;
        Object BETWEEN73_tree=null;
        Object AND74_tree=null;
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
            // SqlParser.g:106:3: ( eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )* | ( NOT )? op= ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE escape_subexpr= eq_subexpr )? -> ^( $op eq_subexpr ( NOT )? ( ^( ESCAPE $escape_subexpr) )? ) | ( NOT )? IN in_source | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | IS NOT NULL -> NOT_NULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN $e1 $e2 ( NOT )? ) )
            int alt21=5;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // SqlParser.g:106:5: eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr501);
                    eq_subexpr52=eq_subexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, eq_subexpr52.getTree());
                    // SqlParser.g:106:16: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )*
                    loop14:
                    do {
                        int alt14=2;
                        alt14 = dfa14.predict(input);
                        switch (alt14) {
                    	case 1 :
                    	    // SqlParser.g:106:17: ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr
                    	    {
                    	    set53=(Token)input.LT(1);
                    	    set53=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=EQUALS && input.LA(1)<=NOT_EQUALS2) ) {
                    	        input.consume();
                    	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set53), root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr521);
                    	    eq_subexpr54=eq_subexpr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, eq_subexpr54.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // SqlParser.g:107:5: ( NOT )? op= ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE escape_subexpr= eq_subexpr )?
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
                            NOT55=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr529);  
                            stream_NOT.add(NOT55);


                            }
                            break;

                    }

                    // SqlParser.g:107:13: ( LIKE | GLOB | REGEXP | MATCH )
                    int alt16=4;
                    switch ( input.LA(1) ) {
                    case LIKE:
                        {
                        alt16=1;
                        }
                        break;
                    case GLOB:
                        {
                        alt16=2;
                        }
                        break;
                    case REGEXP:
                        {
                        alt16=3;
                        }
                        break;
                    case MATCH:
                        {
                        alt16=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // SqlParser.g:107:14: LIKE
                            {
                            LIKE56=(Token)match(input,LIKE,FOLLOW_LIKE_in_and_subexpr535);  
                            stream_LIKE.add(LIKE56);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:107:21: GLOB
                            {
                            GLOB57=(Token)match(input,GLOB,FOLLOW_GLOB_in_and_subexpr539);  
                            stream_GLOB.add(GLOB57);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:107:28: REGEXP
                            {
                            REGEXP58=(Token)match(input,REGEXP,FOLLOW_REGEXP_in_and_subexpr543);  
                            stream_REGEXP.add(REGEXP58);


                            }
                            break;
                        case 4 :
                            // SqlParser.g:107:37: MATCH
                            {
                            MATCH59=(Token)match(input,MATCH,FOLLOW_MATCH_in_and_subexpr547);  
                            stream_MATCH.add(MATCH59);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr550);
                    eq_subexpr60=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(eq_subexpr60.getTree());
                    // SqlParser.g:107:55: ( ESCAPE escape_subexpr= eq_subexpr )?
                    int alt17=2;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1 :
                            // SqlParser.g:107:56: ESCAPE escape_subexpr= eq_subexpr
                            {
                            ESCAPE61=(Token)match(input,ESCAPE,FOLLOW_ESCAPE_in_and_subexpr553);  
                            stream_ESCAPE.add(ESCAPE61);

                            pushFollow(FOLLOW_eq_subexpr_in_and_subexpr557);
                            escape_subexpr=eq_subexpr();

                            state._fsp--;

                            stream_eq_subexpr.add(escape_subexpr.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: op, eq_subexpr, ESCAPE, NOT, escape_subexpr
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
                    // 107:91: -> ^( $op eq_subexpr ( NOT )? ( ^( ESCAPE $escape_subexpr) )? )
                    {
                        // SqlParser.g:107:94: ^( $op eq_subexpr ( NOT )? ( ^( ESCAPE $escape_subexpr) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_op.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_eq_subexpr.nextTree());
                        // SqlParser.g:107:111: ( NOT )?
                        if ( stream_NOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_NOT.nextNode());

                        }
                        stream_NOT.reset();
                        // SqlParser.g:107:116: ( ^( ESCAPE $escape_subexpr) )?
                        if ( stream_ESCAPE.hasNext()||stream_escape_subexpr.hasNext() ) {
                            // SqlParser.g:107:116: ^( ESCAPE $escape_subexpr)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_ESCAPE.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_escape_subexpr.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_ESCAPE.reset();
                        stream_escape_subexpr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // SqlParser.g:108:5: ( NOT )? IN in_source
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:108:5: ( NOT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NOT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // SqlParser.g:108:5: NOT
                            {
                            NOT62=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr585); 
                            NOT62_tree = (Object)adaptor.create(NOT62);
                            adaptor.addChild(root_0, NOT62_tree);


                            }
                            break;

                    }

                    IN63=(Token)match(input,IN,FOLLOW_IN_in_and_subexpr588); 
                    IN63_tree = (Object)adaptor.create(IN63);
                    root_0 = (Object)adaptor.becomeRoot(IN63_tree, root_0);

                    pushFollow(FOLLOW_in_source_in_and_subexpr591);
                    in_source64=in_source();

                    state._fsp--;

                    adaptor.addChild(root_0, in_source64.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:109:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | IS NOT NULL -> NOT_NULL )
                    {
                    // SqlParser.g:109:5: ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | IS NOT NULL -> NOT_NULL )
                    int alt19=4;
                    switch ( input.LA(1) ) {
                    case ISNULL:
                        {
                        alt19=1;
                        }
                        break;
                    case NOTNULL:
                        {
                        alt19=2;
                        }
                        break;
                    case IS:
                        {
                        int LA19_3 = input.LA(2);

                        if ( (LA19_3==NULL) ) {
                            alt19=3;
                        }
                        else if ( (LA19_3==NOT) ) {
                            alt19=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // SqlParser.g:109:6: ISNULL
                            {
                            ISNULL65=(Token)match(input,ISNULL,FOLLOW_ISNULL_in_and_subexpr598);  
                            stream_ISNULL.add(ISNULL65);



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
                            // 109:13: -> IS_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(IS_NULL, "IS_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 2 :
                            // SqlParser.g:109:26: NOTNULL
                            {
                            NOTNULL66=(Token)match(input,NOTNULL,FOLLOW_NOTNULL_in_and_subexpr606);  
                            stream_NOTNULL.add(NOTNULL66);



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
                            // 109:34: -> NOT_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(NOT_NULL, "NOT_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 3 :
                            // SqlParser.g:109:48: IS NULL
                            {
                            IS67=(Token)match(input,IS,FOLLOW_IS_in_and_subexpr614);  
                            stream_IS.add(IS67);

                            NULL68=(Token)match(input,NULL,FOLLOW_NULL_in_and_subexpr616);  
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
                            // 109:56: -> IS_NULL
                            {
                                adaptor.addChild(root_0, (Object)adaptor.create(IS_NULL, "IS_NULL"));

                            }

                            retval.tree = root_0;
                            }
                            break;
                        case 4 :
                            // SqlParser.g:109:122: IS NOT NULL
                            {
                            IS69=(Token)match(input,IS,FOLLOW_IS_in_and_subexpr625);  
                            stream_IS.add(IS69);

                            NOT70=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr627);  
                            stream_NOT.add(NOT70);

                            NULL71=(Token)match(input,NULL,FOLLOW_NULL_in_and_subexpr629);  
                            stream_NULL.add(NULL71);



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
                            // 109:134: -> NOT_NULL
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
                    // SqlParser.g:110:5: ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr
                    {
                    // SqlParser.g:110:5: ( NOT )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==NOT) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // SqlParser.g:110:5: NOT
                            {
                            NOT72=(Token)match(input,NOT,FOLLOW_NOT_in_and_subexpr640);  
                            stream_NOT.add(NOT72);


                            }
                            break;

                    }

                    BETWEEN73=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_and_subexpr643);  
                    stream_BETWEEN.add(BETWEEN73);

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr647);
                    e1=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e1.getTree());
                    AND74=(Token)match(input,AND,FOLLOW_AND_in_and_subexpr649);  
                    stream_AND.add(AND74);

                    pushFollow(FOLLOW_eq_subexpr_in_and_subexpr653);
                    e2=eq_subexpr();

                    state._fsp--;

                    stream_eq_subexpr.add(e2.getTree());


                    // AST REWRITE
                    // elements: NOT, e2, e1, BETWEEN
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
                    // 110:50: -> ^( BETWEEN $e1 $e2 ( NOT )? )
                    {
                        // SqlParser.g:110:53: ^( BETWEEN $e1 $e2 ( NOT )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BETWEEN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());
                        adaptor.addChild(root_1, stream_e2.nextTree());
                        // SqlParser.g:110:71: ( NOT )?
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
    // SqlParser.g:113:1: eq_subexpr : neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* ;
    public final SqlParser.eq_subexpr_return eq_subexpr() throws RecognitionException {
        SqlParser.eq_subexpr_return retval = new SqlParser.eq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set76=null;
        SqlParser.neq_subexpr_return neq_subexpr75 = null;

        SqlParser.neq_subexpr_return neq_subexpr77 = null;


        Object set76_tree=null;

        try {
            // SqlParser.g:113:11: ( neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )* )
            // SqlParser.g:113:13: neq_subexpr ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr678);
            neq_subexpr75=neq_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, neq_subexpr75.getTree());
            // SqlParser.g:113:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // SqlParser.g:113:26: ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr
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

            	    pushFollow(FOLLOW_neq_subexpr_in_eq_subexpr698);
            	    neq_subexpr77=neq_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, neq_subexpr77.getTree());

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
    // SqlParser.g:115:1: neq_subexpr : bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* ;
    public final SqlParser.neq_subexpr_return neq_subexpr() throws RecognitionException {
        SqlParser.neq_subexpr_return retval = new SqlParser.neq_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;
        SqlParser.bit_subexpr_return bit_subexpr78 = null;

        SqlParser.bit_subexpr_return bit_subexpr80 = null;


        Object set79_tree=null;

        try {
            // SqlParser.g:115:12: ( bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )* )
            // SqlParser.g:115:14: bit_subexpr ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr707);
            bit_subexpr78=bit_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, bit_subexpr78.getTree());
            // SqlParser.g:115:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // SqlParser.g:115:27: ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr
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

            	    pushFollow(FOLLOW_bit_subexpr_in_neq_subexpr727);
            	    bit_subexpr80=bit_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bit_subexpr80.getTree());

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
    // SqlParser.g:117:1: bit_subexpr : add_subexpr ( ( PLUS | MINUS ) add_subexpr )* ;
    public final SqlParser.bit_subexpr_return bit_subexpr() throws RecognitionException {
        SqlParser.bit_subexpr_return retval = new SqlParser.bit_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set82=null;
        SqlParser.add_subexpr_return add_subexpr81 = null;

        SqlParser.add_subexpr_return add_subexpr83 = null;


        Object set82_tree=null;

        try {
            // SqlParser.g:117:12: ( add_subexpr ( ( PLUS | MINUS ) add_subexpr )* )
            // SqlParser.g:117:14: add_subexpr ( ( PLUS | MINUS ) add_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_subexpr_in_bit_subexpr736);
            add_subexpr81=add_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, add_subexpr81.getTree());
            // SqlParser.g:117:26: ( ( PLUS | MINUS ) add_subexpr )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // SqlParser.g:117:27: ( PLUS | MINUS ) add_subexpr
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

            	    pushFollow(FOLLOW_add_subexpr_in_bit_subexpr748);
            	    add_subexpr83=add_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add_subexpr83.getTree());

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
    // SqlParser.g:119:1: add_subexpr : mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* ;
    public final SqlParser.add_subexpr_return add_subexpr() throws RecognitionException {
        SqlParser.add_subexpr_return retval = new SqlParser.add_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set85=null;
        SqlParser.mul_subexpr_return mul_subexpr84 = null;

        SqlParser.mul_subexpr_return mul_subexpr86 = null;


        Object set85_tree=null;

        try {
            // SqlParser.g:119:12: ( mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )* )
            // SqlParser.g:119:14: mul_subexpr ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mul_subexpr_in_add_subexpr757);
            mul_subexpr84=mul_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, mul_subexpr84.getTree());
            // SqlParser.g:119:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // SqlParser.g:119:27: ( ASTERISK | SLASH | PERCENT ) mul_subexpr
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

            	    pushFollow(FOLLOW_mul_subexpr_in_add_subexpr773);
            	    mul_subexpr86=mul_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_subexpr86.getTree());

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
    // SqlParser.g:121:1: mul_subexpr : con_subexpr ( DOUBLE_PIPE con_subexpr )* ;
    public final SqlParser.mul_subexpr_return mul_subexpr() throws RecognitionException {
        SqlParser.mul_subexpr_return retval = new SqlParser.mul_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_PIPE88=null;
        SqlParser.con_subexpr_return con_subexpr87 = null;

        SqlParser.con_subexpr_return con_subexpr89 = null;


        Object DOUBLE_PIPE88_tree=null;

        try {
            // SqlParser.g:121:12: ( con_subexpr ( DOUBLE_PIPE con_subexpr )* )
            // SqlParser.g:121:14: con_subexpr ( DOUBLE_PIPE con_subexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_con_subexpr_in_mul_subexpr782);
            con_subexpr87=con_subexpr();

            state._fsp--;

            adaptor.addChild(root_0, con_subexpr87.getTree());
            // SqlParser.g:121:26: ( DOUBLE_PIPE con_subexpr )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // SqlParser.g:121:27: DOUBLE_PIPE con_subexpr
            	    {
            	    DOUBLE_PIPE88=(Token)match(input,DOUBLE_PIPE,FOLLOW_DOUBLE_PIPE_in_mul_subexpr785); 
            	    DOUBLE_PIPE88_tree = (Object)adaptor.create(DOUBLE_PIPE88);
            	    root_0 = (Object)adaptor.becomeRoot(DOUBLE_PIPE88_tree, root_0);

            	    pushFollow(FOLLOW_con_subexpr_in_mul_subexpr788);
            	    con_subexpr89=con_subexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, con_subexpr89.getTree());

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
    // SqlParser.g:123:1: con_subexpr : ( PLUS | MINUS | TILDA | NOT )? unary_subexpr ;
    public final SqlParser.con_subexpr_return con_subexpr() throws RecognitionException {
        SqlParser.con_subexpr_return retval = new SqlParser.con_subexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set90=null;
        SqlParser.unary_subexpr_return unary_subexpr91 = null;


        Object set90_tree=null;

        try {
            // SqlParser.g:123:12: ( ( PLUS | MINUS | TILDA | NOT )? unary_subexpr )
            // SqlParser.g:123:14: ( PLUS | MINUS | TILDA | NOT )? unary_subexpr
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:123:14: ( PLUS | MINUS | TILDA | NOT )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
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

            pushFollow(FOLLOW_unary_subexpr_in_con_subexpr814);
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
    // SqlParser.g:125:1: unary_subexpr : atom_expr ( COLLATE collation_name= ID )? ;
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
            // SqlParser.g:125:14: ( atom_expr ( COLLATE collation_name= ID )? )
            // SqlParser.g:125:16: atom_expr ( COLLATE collation_name= ID )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_unary_subexpr821);
            atom_expr92=atom_expr();

            state._fsp--;

            adaptor.addChild(root_0, atom_expr92.getTree());
            // SqlParser.g:125:26: ( COLLATE collation_name= ID )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // SqlParser.g:125:27: COLLATE collation_name= ID
                    {
                    COLLATE93=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_unary_subexpr824); 
                    COLLATE93_tree = (Object)adaptor.create(COLLATE93);
                    root_0 = (Object)adaptor.becomeRoot(COLLATE93_tree, root_0);

                    collation_name=(Token)match(input,ID,FOLLOW_ID_in_unary_subexpr829); 
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
    // SqlParser.g:127:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );
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
            // SqlParser.g:128:3: ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function )
            int alt38=9;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // SqlParser.g:128:5: literal_value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_value_in_atom_expr841);
                    literal_value94=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value94.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:129:5: bind_parameter
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bind_parameter_in_atom_expr847);
                    bind_parameter95=bind_parameter();

                    state._fsp--;

                    adaptor.addChild(root_0, bind_parameter95.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:130:5: ( (database_name= id DOT )? table_name= id DOT )? column_name= ID
                    {
                    // SqlParser.g:130:5: ( (database_name= id DOT )? table_name= id DOT )?
                    int alt30=2;
                    alt30 = dfa30.predict(input);
                    switch (alt30) {
                        case 1 :
                            // SqlParser.g:130:6: (database_name= id DOT )? table_name= id DOT
                            {
                            // SqlParser.g:130:6: (database_name= id DOT )?
                            int alt29=2;
                            alt29 = dfa29.predict(input);
                            switch (alt29) {
                                case 1 :
                                    // SqlParser.g:130:7: database_name= id DOT
                                    {
                                    pushFollow(FOLLOW_id_in_atom_expr857);
                                    database_name=id();

                                    state._fsp--;

                                    stream_id.add(database_name.getTree());
                                    DOT96=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr859);  
                                    stream_DOT.add(DOT96);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_atom_expr865);
                            table_name=id();

                            state._fsp--;

                            stream_id.add(table_name.getTree());
                            DOT97=(Token)match(input,DOT,FOLLOW_DOT_in_atom_expr867);  
                            stream_DOT.add(DOT97);


                            }
                            break;

                    }

                    column_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr873);  
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
                    // 130:65: -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                    {
                        // SqlParser.g:130:68: ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_EXPRESSION, "COLUMN_EXPRESSION"), root_1);

                        // SqlParser.g:130:88: ^( $column_name ( ^( $table_name ( $database_name)? ) )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_2);

                        // SqlParser.g:130:103: ( ^( $table_name ( $database_name)? ) )?
                        if ( stream_database_name.hasNext()||stream_table_name.hasNext() ) {
                            // SqlParser.g:130:103: ^( $table_name ( $database_name)? )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            root_3 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_3);

                            // SqlParser.g:130:117: ( $database_name)?
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
                    // SqlParser.g:131:5: function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    function_name=(Token)match(input,ID,FOLLOW_ID_in_atom_expr902); 
                    function_name_tree = (Object)adaptor.create(function_name);
                    adaptor.addChild(root_0, function_name_tree);

                    LPAREN98=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr904); 
                    LPAREN98_tree = (Object)adaptor.create(LPAREN98);
                    adaptor.addChild(root_0, LPAREN98_tree);

                    // SqlParser.g:131:29: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?
                    int alt33=3;
                    alt33 = dfa33.predict(input);
                    switch (alt33) {
                        case 1 :
                            // SqlParser.g:131:30: ( DISTINCT )? args+= expr ( COMMA args+= expr )*
                            {
                            // SqlParser.g:131:30: ( DISTINCT )?
                            int alt31=2;
                            alt31 = dfa31.predict(input);
                            switch (alt31) {
                                case 1 :
                                    // SqlParser.g:131:31: DISTINCT
                                    {
                                    DISTINCT99=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_atom_expr908); 
                                    DISTINCT99_tree = (Object)adaptor.create(DISTINCT99);
                                    adaptor.addChild(root_0, DISTINCT99_tree);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_atom_expr914);
                            args=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, args.getTree());
                            if (list_args==null) list_args=new ArrayList();
                            list_args.add(args.getTree());

                            // SqlParser.g:131:53: ( COMMA args+= expr )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==COMMA) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // SqlParser.g:131:54: COMMA args+= expr
                            	    {
                            	    COMMA100=(Token)match(input,COMMA,FOLLOW_COMMA_in_atom_expr917); 
                            	    COMMA100_tree = (Object)adaptor.create(COMMA100);
                            	    adaptor.addChild(root_0, COMMA100_tree);

                            	    pushFollow(FOLLOW_expr_in_atom_expr921);
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
                            // SqlParser.g:131:75: ASTERISK
                            {
                            ASTERISK101=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_atom_expr927); 
                            ASTERISK101_tree = (Object)adaptor.create(ASTERISK101);
                            adaptor.addChild(root_0, ASTERISK101_tree);


                            }
                            break;

                    }

                    RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr931); 
                    RPAREN102_tree = (Object)adaptor.create(RPAREN102);
                    adaptor.addChild(root_0, RPAREN102_tree);


                    }
                    break;
                case 5 :
                    // SqlParser.g:132:5: LPAREN expr RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr937); 
                    pushFollow(FOLLOW_expr_in_atom_expr940);
                    expr104=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr104.getTree());
                    RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr942); 

                    }
                    break;
                case 6 :
                    // SqlParser.g:133:5: CAST LPAREN expr AS type_name RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    CAST106=(Token)match(input,CAST,FOLLOW_CAST_in_atom_expr949); 
                    CAST106_tree = (Object)adaptor.create(CAST106);
                    adaptor.addChild(root_0, CAST106_tree);

                    LPAREN107=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr951); 
                    LPAREN107_tree = (Object)adaptor.create(LPAREN107);
                    adaptor.addChild(root_0, LPAREN107_tree);

                    pushFollow(FOLLOW_expr_in_atom_expr953);
                    expr108=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr108.getTree());
                    AS109=(Token)match(input,AS,FOLLOW_AS_in_atom_expr955); 
                    AS109_tree = (Object)adaptor.create(AS109);
                    adaptor.addChild(root_0, AS109_tree);

                    pushFollow(FOLLOW_type_name_in_atom_expr957);
                    type_name110=type_name();

                    state._fsp--;

                    adaptor.addChild(root_0, type_name110.getTree());
                    RPAREN111=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr959); 
                    RPAREN111_tree = (Object)adaptor.create(RPAREN111);
                    adaptor.addChild(root_0, RPAREN111_tree);


                    }
                    break;
                case 7 :
                    // SqlParser.g:134:5: ( EXISTS )? LPAREN select_stmt RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:134:5: ( EXISTS )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==EXISTS) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // SqlParser.g:134:53: EXISTS
                            {
                            EXISTS112=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_atom_expr968); 
                            EXISTS112_tree = (Object)adaptor.create(EXISTS112);
                            adaptor.addChild(root_0, EXISTS112_tree);


                            }
                            break;

                    }

                    LPAREN113=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom_expr972); 
                    LPAREN113_tree = (Object)adaptor.create(LPAREN113);
                    adaptor.addChild(root_0, LPAREN113_tree);

                    pushFollow(FOLLOW_select_stmt_in_atom_expr974);
                    select_stmt114=select_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, select_stmt114.getTree());
                    RPAREN115=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom_expr976); 
                    RPAREN115_tree = (Object)adaptor.create(RPAREN115);
                    adaptor.addChild(root_0, RPAREN115_tree);


                    }
                    break;
                case 8 :
                    // SqlParser.g:135:5: CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END
                    {
                    root_0 = (Object)adaptor.nil();

                    CASE116=(Token)match(input,CASE,FOLLOW_CASE_in_atom_expr982); 
                    CASE116_tree = (Object)adaptor.create(CASE116);
                    adaptor.addChild(root_0, CASE116_tree);

                    // SqlParser.g:135:10: ( expr )?
                    int alt35=2;
                    alt35 = dfa35.predict(input);
                    switch (alt35) {
                        case 1 :
                            // SqlParser.g:135:11: expr
                            {
                            pushFollow(FOLLOW_expr_in_atom_expr985);
                            expr117=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr117.getTree());

                            }
                            break;

                    }

                    // SqlParser.g:135:18: ( WHEN expr THEN expr )+
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
                    	    // SqlParser.g:135:19: WHEN expr THEN expr
                    	    {
                    	    WHEN118=(Token)match(input,WHEN,FOLLOW_WHEN_in_atom_expr990); 
                    	    WHEN118_tree = (Object)adaptor.create(WHEN118);
                    	    adaptor.addChild(root_0, WHEN118_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr992);
                    	    expr119=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr119.getTree());
                    	    THEN120=(Token)match(input,THEN,FOLLOW_THEN_in_atom_expr994); 
                    	    THEN120_tree = (Object)adaptor.create(THEN120);
                    	    adaptor.addChild(root_0, THEN120_tree);

                    	    pushFollow(FOLLOW_expr_in_atom_expr996);
                    	    expr121=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expr121.getTree());

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

                    // SqlParser.g:135:41: ( ELSE expr )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ELSE) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // SqlParser.g:135:42: ELSE expr
                            {
                            ELSE122=(Token)match(input,ELSE,FOLLOW_ELSE_in_atom_expr1001); 
                            ELSE122_tree = (Object)adaptor.create(ELSE122);
                            adaptor.addChild(root_0, ELSE122_tree);

                            pushFollow(FOLLOW_expr_in_atom_expr1003);
                            expr123=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr123.getTree());

                            }
                            break;

                    }

                    END124=(Token)match(input,END,FOLLOW_END_in_atom_expr1007); 
                    END124_tree = (Object)adaptor.create(END124);
                    adaptor.addChild(root_0, END124_tree);


                    }
                    break;
                case 9 :
                    // SqlParser.g:136:5: raise_function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_raise_function_in_atom_expr1013);
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
    // SqlParser.g:139:1: literal_value : ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) );
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
            // SqlParser.g:140:3: ( INTEGER -> ^( INTEGER_LITERAL INTEGER ) | FLOAT -> ^( FLOAT_LITERAL FLOAT ) | STRING -> ^( STRING_LITERAL STRING ) | BLOB -> ^( BLOB_LITERAL BLOB ) | NULL | CURRENT_TIME -> ^( FUNCTION_LITERAL CURRENT_TIME ) | CURRENT_DATE -> ^( FUNCTION_LITERAL CURRENT_DATE ) | CURRENT_TIMESTAMP -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP ) )
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
                    // SqlParser.g:140:5: INTEGER
                    {
                    INTEGER126=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal_value1026);  
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
                    // 140:13: -> ^( INTEGER_LITERAL INTEGER )
                    {
                        // SqlParser.g:140:16: ^( INTEGER_LITERAL INTEGER )
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
                    // SqlParser.g:141:5: FLOAT
                    {
                    FLOAT127=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal_value1040);  
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
                    // 141:11: -> ^( FLOAT_LITERAL FLOAT )
                    {
                        // SqlParser.g:141:14: ^( FLOAT_LITERAL FLOAT )
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
                    // SqlParser.g:142:5: STRING
                    {
                    STRING128=(Token)match(input,STRING,FOLLOW_STRING_in_literal_value1054);  
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
                    // 142:12: -> ^( STRING_LITERAL STRING )
                    {
                        // SqlParser.g:142:15: ^( STRING_LITERAL STRING )
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
                    // SqlParser.g:143:5: BLOB
                    {
                    BLOB129=(Token)match(input,BLOB,FOLLOW_BLOB_in_literal_value1068);  
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
                    // 143:10: -> ^( BLOB_LITERAL BLOB )
                    {
                        // SqlParser.g:143:13: ^( BLOB_LITERAL BLOB )
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
                    // SqlParser.g:144:5: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL130=(Token)match(input,NULL,FOLLOW_NULL_in_literal_value1082); 
                    NULL130_tree = (Object)adaptor.create(NULL130);
                    adaptor.addChild(root_0, NULL130_tree);


                    }
                    break;
                case 6 :
                    // SqlParser.g:145:5: CURRENT_TIME
                    {
                    CURRENT_TIME131=(Token)match(input,CURRENT_TIME,FOLLOW_CURRENT_TIME_in_literal_value1088);  
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
                    // 145:18: -> ^( FUNCTION_LITERAL CURRENT_TIME )
                    {
                        // SqlParser.g:145:21: ^( FUNCTION_LITERAL CURRENT_TIME )
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
                    // SqlParser.g:146:5: CURRENT_DATE
                    {
                    CURRENT_DATE132=(Token)match(input,CURRENT_DATE,FOLLOW_CURRENT_DATE_in_literal_value1102);  
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
                    // 146:18: -> ^( FUNCTION_LITERAL CURRENT_DATE )
                    {
                        // SqlParser.g:146:21: ^( FUNCTION_LITERAL CURRENT_DATE )
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
                    // SqlParser.g:147:5: CURRENT_TIMESTAMP
                    {
                    CURRENT_TIMESTAMP133=(Token)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_literal_value1116);  
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
                    // 147:23: -> ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
                    {
                        // SqlParser.g:147:26: ^( FUNCTION_LITERAL CURRENT_TIMESTAMP )
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
    // SqlParser.g:150:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );
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
            // SqlParser.g:151:3: ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) )
            int alt40=4;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // SqlParser.g:151:5: QUESTION
                    {
                    QUESTION134=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1137);  
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
                    // 151:14: -> BIND
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(BIND, "BIND"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // SqlParser.g:152:5: QUESTION position= INTEGER
                    {
                    QUESTION135=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_bind_parameter1147);  
                    stream_QUESTION.add(QUESTION135);

                    position=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_bind_parameter1151);  
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
                    // 152:31: -> ^( BIND $position)
                    {
                        // SqlParser.g:152:34: ^( BIND $position)
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
                    // SqlParser.g:153:5: COLON name= id
                    {
                    COLON136=(Token)match(input,COLON,FOLLOW_COLON_in_bind_parameter1166);  
                    stream_COLON.add(COLON136);

                    pushFollow(FOLLOW_id_in_bind_parameter1170);
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
                    // 153:19: -> ^( BIND_NAME $name)
                    {
                        // SqlParser.g:153:22: ^( BIND_NAME $name)
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
                    // SqlParser.g:154:5: AT name= id
                    {
                    AT137=(Token)match(input,AT,FOLLOW_AT_in_bind_parameter1185);  
                    stream_AT.add(AT137);

                    pushFollow(FOLLOW_id_in_bind_parameter1189);
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
                    // 154:16: -> ^( BIND_NAME $name)
                    {
                        // SqlParser.g:154:19: ^( BIND_NAME $name)
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
    // SqlParser.g:158:1: raise_function : RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN ;
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
            // SqlParser.g:158:15: ( RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN )
            // SqlParser.g:158:17: RAISE LPAREN ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING ) RPAREN
            {
            root_0 = (Object)adaptor.nil();

            RAISE138=(Token)match(input,RAISE,FOLLOW_RAISE_in_raise_function1209); 
            RAISE138_tree = (Object)adaptor.create(RAISE138);
            root_0 = (Object)adaptor.becomeRoot(RAISE138_tree, root_0);

            LPAREN139=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_raise_function1212); 
            // SqlParser.g:158:32: ( IGNORE | ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING )
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
                    // SqlParser.g:158:33: IGNORE
                    {
                    IGNORE140=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_raise_function1216); 
                    IGNORE140_tree = (Object)adaptor.create(IGNORE140);
                    adaptor.addChild(root_0, IGNORE140_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:158:42: ( ROLLBACK | ABORT | FAIL ) COMMA error_message= STRING
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

                    COMMA142=(Token)match(input,COMMA,FOLLOW_COMMA_in_raise_function1232); 
                    error_message=(Token)match(input,STRING,FOLLOW_STRING_in_raise_function1237); 
                    error_message_tree = (Object)adaptor.create(error_message);
                    adaptor.addChild(root_0, error_message_tree);


                    }
                    break;

            }

            RPAREN143=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_raise_function1240); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:160:1: type_name : (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) ;
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
            // SqlParser.g:160:10: ( (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )? -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ ) )
            // SqlParser.g:160:12: (names+= ID )+ ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            {
            // SqlParser.g:160:17: (names+= ID )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // SqlParser.g:160:17: names+= ID
            	    {
            	    names=(Token)match(input,ID,FOLLOW_ID_in_type_name1250);  
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

            // SqlParser.g:160:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // SqlParser.g:160:24: LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN
                    {
                    LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_type_name1254);  
                    stream_LPAREN.add(LPAREN144);

                    pushFollow(FOLLOW_signed_number_in_type_name1258);
                    size1=signed_number();

                    state._fsp--;

                    stream_signed_number.add(size1.getTree());
                    // SqlParser.g:160:51: ( COMMA size2= signed_number )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==COMMA) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // SqlParser.g:160:52: COMMA size2= signed_number
                            {
                            COMMA145=(Token)match(input,COMMA,FOLLOW_COMMA_in_type_name1261);  
                            stream_COMMA.add(COMMA145);

                            pushFollow(FOLLOW_signed_number_in_type_name1265);
                            size2=signed_number();

                            state._fsp--;

                            stream_signed_number.add(size2.getTree());

                            }
                            break;

                    }

                    RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_type_name1269);  
                    stream_RPAREN.add(RPAREN146);


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
            // 161:1: -> ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
            {
                // SqlParser.g:161:4: ^( TYPE ^( TYPE_PARAMS ( $size1)? ( $size2)? ) ( $names)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                // SqlParser.g:161:11: ^( TYPE_PARAMS ( $size1)? ( $size2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE_PARAMS, "TYPE_PARAMS"), root_2);

                // SqlParser.g:161:25: ( $size1)?
                if ( stream_size1.hasNext() ) {
                    adaptor.addChild(root_2, stream_size1.nextTree());

                }
                stream_size1.reset();
                // SqlParser.g:161:33: ( $size2)?
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
    // SqlParser.g:164:1: pragma_stmt : PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? ;
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
            // SqlParser.g:164:12: ( PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )? )
            // SqlParser.g:164:14: PRAGMA (database_name= id DOT )? pragma_name= id ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            PRAGMA147=(Token)match(input,PRAGMA,FOLLOW_PRAGMA_in_pragma_stmt1301); 
            PRAGMA147_tree = (Object)adaptor.create(PRAGMA147);
            adaptor.addChild(root_0, PRAGMA147_tree);

            // SqlParser.g:164:21: (database_name= id DOT )?
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // SqlParser.g:164:22: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_pragma_stmt1306);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT148=(Token)match(input,DOT,FOLLOW_DOT_in_pragma_stmt1308); 
                    DOT148_tree = (Object)adaptor.create(DOT148);
                    adaptor.addChild(root_0, DOT148_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_pragma_stmt1314);
            pragma_name=id();

            state._fsp--;

            adaptor.addChild(root_0, pragma_name.getTree());
            // SqlParser.g:164:60: ( EQUALS pragma_value | LPAREN pragma_value RPAREN )?
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
                    // SqlParser.g:164:61: EQUALS pragma_value
                    {
                    EQUALS149=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pragma_stmt1317); 
                    EQUALS149_tree = (Object)adaptor.create(EQUALS149);
                    adaptor.addChild(root_0, EQUALS149_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1319);
                    pragma_value150=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value150.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:164:83: LPAREN pragma_value RPAREN
                    {
                    LPAREN151=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pragma_stmt1323); 
                    LPAREN151_tree = (Object)adaptor.create(LPAREN151);
                    adaptor.addChild(root_0, LPAREN151_tree);

                    pushFollow(FOLLOW_pragma_value_in_pragma_stmt1325);
                    pragma_value152=pragma_value();

                    state._fsp--;

                    adaptor.addChild(root_0, pragma_value152.getTree());
                    RPAREN153=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pragma_stmt1327); 
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
    // SqlParser.g:166:1: pragma_value : ( signed_number | name= id | STRING );
    public final SqlParser.pragma_value_return pragma_value() throws RecognitionException {
        SqlParser.pragma_value_return retval = new SqlParser.pragma_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING155=null;
        SqlParser.id_return name = null;

        SqlParser.signed_number_return signed_number154 = null;


        Object STRING155_tree=null;

        try {
            // SqlParser.g:166:13: ( signed_number | name= id | STRING )
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
                    // SqlParser.g:166:15: signed_number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_signed_number_in_pragma_value1336);
                    signed_number154=signed_number();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_number154.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:166:31: name= id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_pragma_value1342);
                    name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, name.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:166:41: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING155=(Token)match(input,STRING,FOLLOW_STRING_in_pragma_value1346); 
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
    // SqlParser.g:169:1: attach_stmt : ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id ;
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
            // SqlParser.g:169:12: ( ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id )
            // SqlParser.g:169:14: ATTACH ( DATABASE )? filename= ( STRING | id ) AS database_name= id
            {
            root_0 = (Object)adaptor.nil();

            ATTACH156=(Token)match(input,ATTACH,FOLLOW_ATTACH_in_attach_stmt1354); 
            ATTACH156_tree = (Object)adaptor.create(ATTACH156);
            adaptor.addChild(root_0, ATTACH156_tree);

            // SqlParser.g:169:21: ( DATABASE )?
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // SqlParser.g:169:22: DATABASE
                    {
                    DATABASE157=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_attach_stmt1357); 
                    DATABASE157_tree = (Object)adaptor.create(DATABASE157);
                    adaptor.addChild(root_0, DATABASE157_tree);


                    }
                    break;

            }

            // SqlParser.g:169:42: ( STRING | id )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==STRING) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=ABORT && LA49_0<=WHERE)||LA49_0==ID) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // SqlParser.g:169:43: STRING
                    {
                    STRING158=(Token)match(input,STRING,FOLLOW_STRING_in_attach_stmt1364); 
                    STRING158_tree = (Object)adaptor.create(STRING158);
                    adaptor.addChild(root_0, STRING158_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:169:52: id
                    {
                    pushFollow(FOLLOW_id_in_attach_stmt1368);
                    id159=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id159.getTree());

                    }
                    break;

            }

            AS160=(Token)match(input,AS,FOLLOW_AS_in_attach_stmt1371); 
            AS160_tree = (Object)adaptor.create(AS160);
            adaptor.addChild(root_0, AS160_tree);

            pushFollow(FOLLOW_id_in_attach_stmt1375);
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
    // SqlParser.g:172:1: detach_stmt : DETACH ( DATABASE )? database_name= id ;
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
            // SqlParser.g:172:12: ( DETACH ( DATABASE )? database_name= id )
            // SqlParser.g:172:14: DETACH ( DATABASE )? database_name= id
            {
            root_0 = (Object)adaptor.nil();

            DETACH161=(Token)match(input,DETACH,FOLLOW_DETACH_in_detach_stmt1383); 
            DETACH161_tree = (Object)adaptor.create(DETACH161);
            adaptor.addChild(root_0, DETACH161_tree);

            // SqlParser.g:172:21: ( DATABASE )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==DATABASE) ) {
                int LA50_1 = input.LA(2);

                if ( ((LA50_1>=ABORT && LA50_1<=WHERE)||LA50_1==ID) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // SqlParser.g:172:22: DATABASE
                    {
                    DATABASE162=(Token)match(input,DATABASE,FOLLOW_DATABASE_in_detach_stmt1386); 
                    DATABASE162_tree = (Object)adaptor.create(DATABASE162);
                    adaptor.addChild(root_0, DATABASE162_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_detach_stmt1392);
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
    // SqlParser.g:175:1: analyze_stmt : ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? ;
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
            // SqlParser.g:175:13: ( ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )? )
            // SqlParser.g:175:15: ANALYZE (database_or_table_name= id | database_name= id DOT table_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ANALYZE163=(Token)match(input,ANALYZE,FOLLOW_ANALYZE_in_analyze_stmt1400); 
            ANALYZE163_tree = (Object)adaptor.create(ANALYZE163);
            adaptor.addChild(root_0, ANALYZE163_tree);

            // SqlParser.g:175:23: (database_or_table_name= id | database_name= id DOT table_name= id )?
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
            else if ( ((LA51_0>=ABORT && LA51_0<=WHERE)) ) {
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
                    // SqlParser.g:175:24: database_or_table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1405);
                    database_or_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_or_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:175:52: database_name= id DOT table_name= id
                    {
                    pushFollow(FOLLOW_id_in_analyze_stmt1411);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT164=(Token)match(input,DOT,FOLLOW_DOT_in_analyze_stmt1413); 
                    DOT164_tree = (Object)adaptor.create(DOT164);
                    adaptor.addChild(root_0, DOT164_tree);

                    pushFollow(FOLLOW_id_in_analyze_stmt1417);
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
    // SqlParser.g:178:1: reindex_stmt : REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id ;
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
            // SqlParser.g:178:13: ( REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id )
            // SqlParser.g:178:15: REINDEX (database_name= id DOT )? collation_or_table_or_index_name= id
            {
            root_0 = (Object)adaptor.nil();

            REINDEX165=(Token)match(input,REINDEX,FOLLOW_REINDEX_in_reindex_stmt1427); 
            REINDEX165_tree = (Object)adaptor.create(REINDEX165);
            adaptor.addChild(root_0, REINDEX165_tree);

            // SqlParser.g:178:23: (database_name= id DOT )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==DOT) ) {
                    alt52=1;
                }
            }
            else if ( ((LA52_0>=ABORT && LA52_0<=WHERE)) ) {
                int LA52_2 = input.LA(2);

                if ( (LA52_2==DOT) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // SqlParser.g:178:24: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_reindex_stmt1432);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT166=(Token)match(input,DOT,FOLLOW_DOT_in_reindex_stmt1434); 
                    DOT166_tree = (Object)adaptor.create(DOT166);
                    adaptor.addChild(root_0, DOT166_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_reindex_stmt1440);
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
    // SqlParser.g:181:1: vacuum_stmt : VACUUM ;
    public final SqlParser.vacuum_stmt_return vacuum_stmt() throws RecognitionException {
        SqlParser.vacuum_stmt_return retval = new SqlParser.vacuum_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VACUUM167=null;

        Object VACUUM167_tree=null;

        try {
            // SqlParser.g:181:12: ( VACUUM )
            // SqlParser.g:181:14: VACUUM
            {
            root_0 = (Object)adaptor.nil();

            VACUUM167=(Token)match(input,VACUUM,FOLLOW_VACUUM_in_vacuum_stmt1448); 
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
    // SqlParser.g:187:1: operation_conflict_clause : OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
    public final SqlParser.operation_conflict_clause_return operation_conflict_clause() throws RecognitionException {
        SqlParser.operation_conflict_clause_return retval = new SqlParser.operation_conflict_clause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR168=null;
        Token set169=null;

        Object OR168_tree=null;
        Object set169_tree=null;

        try {
            // SqlParser.g:187:26: ( OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:187:28: OR ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            OR168=(Token)match(input,OR,FOLLOW_OR_in_operation_conflict_clause1459); 
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
    // SqlParser.g:189:1: ordering_term : expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) ;
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
            // SqlParser.g:189:14: ( expr ( ASC | DESC )? -> ^( ORDERING expr ( ASC )? ( DESC )? ) )
            // SqlParser.g:189:16: expr ( ASC | DESC )?
            {
            pushFollow(FOLLOW_expr_in_ordering_term1486);
            expr170=expr();

            state._fsp--;

            stream_expr.add(expr170.getTree());
            // SqlParser.g:189:82: ( ASC | DESC )?
            int alt53=3;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // SqlParser.g:189:83: ASC
                    {
                    ASC171=(Token)match(input,ASC,FOLLOW_ASC_in_ordering_term1491);  
                    stream_ASC.add(ASC171);


                    }
                    break;
                case 2 :
                    // SqlParser.g:189:89: DESC
                    {
                    DESC172=(Token)match(input,DESC,FOLLOW_DESC_in_ordering_term1495);  
                    stream_DESC.add(DESC172);


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
            // 190:1: -> ^( ORDERING expr ( ASC )? ( DESC )? )
            {
                // SqlParser.g:190:4: ^( ORDERING expr ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDERING, "ORDERING"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // SqlParser.g:190:20: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:190:27: ( DESC )?
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
    // SqlParser.g:192:1: operation_limited_clause : ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? ;
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
            // SqlParser.g:192:25: ( ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )
            // SqlParser.g:193:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )? LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:193:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ORDER) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // SqlParser.g:193:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER173=(Token)match(input,ORDER,FOLLOW_ORDER_in_operation_limited_clause1525); 
                    ORDER173_tree = (Object)adaptor.create(ORDER173);
                    adaptor.addChild(root_0, ORDER173_tree);

                    BY174=(Token)match(input,BY,FOLLOW_BY_in_operation_limited_clause1527); 
                    BY174_tree = (Object)adaptor.create(BY174);
                    adaptor.addChild(root_0, BY174_tree);

                    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1529);
                    ordering_term175=ordering_term();

                    state._fsp--;

                    adaptor.addChild(root_0, ordering_term175.getTree());
                    // SqlParser.g:193:27: ( COMMA ordering_term )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==COMMA) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // SqlParser.g:193:28: COMMA ordering_term
                    	    {
                    	    COMMA176=(Token)match(input,COMMA,FOLLOW_COMMA_in_operation_limited_clause1532); 
                    	    COMMA176_tree = (Object)adaptor.create(COMMA176);
                    	    adaptor.addChild(root_0, COMMA176_tree);

                    	    pushFollow(FOLLOW_ordering_term_in_operation_limited_clause1534);
                    	    ordering_term177=ordering_term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, ordering_term177.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            LIMIT178=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_operation_limited_clause1542); 
            LIMIT178_tree = (Object)adaptor.create(LIMIT178);
            adaptor.addChild(root_0, LIMIT178_tree);

            limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1546); 
            limit_tree = (Object)adaptor.create(limit);
            adaptor.addChild(root_0, limit_tree);

            // SqlParser.g:194:23: ( ( OFFSET | COMMA ) offset= INTEGER )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==COMMA||LA56_0==OFFSET) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // SqlParser.g:194:24: ( OFFSET | COMMA ) offset= INTEGER
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

                    offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_operation_limited_clause1559); 
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
    // SqlParser.g:197:1: select_stmt : select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) ;
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
            // SqlParser.g:197:12: ( select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )? -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? ) )
            // SqlParser.g:197:14: select_list ( ORDER BY ordering_term ( COMMA ordering_term )* )? ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            {
            pushFollow(FOLLOW_select_list_in_select_stmt1569);
            select_list180=select_list();

            state._fsp--;

            stream_select_list.add(select_list180.getTree());
            // SqlParser.g:198:3: ( ORDER BY ordering_term ( COMMA ordering_term )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==ORDER) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // SqlParser.g:198:4: ORDER BY ordering_term ( COMMA ordering_term )*
                    {
                    ORDER181=(Token)match(input,ORDER,FOLLOW_ORDER_in_select_stmt1574);  
                    stream_ORDER.add(ORDER181);

                    BY182=(Token)match(input,BY,FOLLOW_BY_in_select_stmt1576);  
                    stream_BY.add(BY182);

                    pushFollow(FOLLOW_ordering_term_in_select_stmt1578);
                    ordering_term183=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term183.getTree());
                    // SqlParser.g:198:27: ( COMMA ordering_term )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==COMMA) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // SqlParser.g:198:28: COMMA ordering_term
                    	    {
                    	    COMMA184=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1581);  
                    	    stream_COMMA.add(COMMA184);

                    	    pushFollow(FOLLOW_ordering_term_in_select_stmt1583);
                    	    ordering_term185=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term185.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            // SqlParser.g:199:3: ( LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )? )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==LIMIT) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // SqlParser.g:199:4: LIMIT limit= INTEGER ( ( OFFSET | COMMA ) offset= INTEGER )?
                    {
                    LIMIT186=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_select_stmt1592);  
                    stream_LIMIT.add(LIMIT186);

                    limit=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1596);  
                    stream_INTEGER.add(limit);

                    // SqlParser.g:199:24: ( ( OFFSET | COMMA ) offset= INTEGER )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==COMMA||LA60_0==OFFSET) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // SqlParser.g:199:25: ( OFFSET | COMMA ) offset= INTEGER
                            {
                            // SqlParser.g:199:25: ( OFFSET | COMMA )
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
                                    // SqlParser.g:199:26: OFFSET
                                    {
                                    OFFSET187=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_select_stmt1600);  
                                    stream_OFFSET.add(OFFSET187);


                                    }
                                    break;
                                case 2 :
                                    // SqlParser.g:199:35: COMMA
                                    {
                                    COMMA188=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_stmt1604);  
                                    stream_COMMA.add(COMMA188);


                                    }
                                    break;

                            }

                            offset=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_select_stmt1609);  
                            stream_INTEGER.add(offset);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: limit, ORDER, select_list, LIMIT, ordering_term, offset
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
            // 200:1: -> ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
            {
                // SqlParser.g:200:4: ^( SELECT select_list ( ^( ORDER ( ordering_term )+ ) )? ( ^( LIMIT $limit ( $offset)? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_select_list.nextTree());
                // SqlParser.g:201:22: ( ^( ORDER ( ordering_term )+ ) )?
                if ( stream_ORDER.hasNext()||stream_ordering_term.hasNext() ) {
                    // SqlParser.g:201:22: ^( ORDER ( ordering_term )+ )
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
                // SqlParser.g:201:47: ( ^( LIMIT $limit ( $offset)? ) )?
                if ( stream_limit.hasNext()||stream_LIMIT.hasNext()||stream_offset.hasNext() ) {
                    // SqlParser.g:201:47: ^( LIMIT $limit ( $offset)? )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_limit.nextNode());
                    // SqlParser.g:201:62: ( $offset)?
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
    // SqlParser.g:204:1: select_list : select_core ( select_op select_core )* ;
    public final SqlParser.select_list_return select_list() throws RecognitionException {
        SqlParser.select_list_return retval = new SqlParser.select_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.select_core_return select_core189 = null;

        SqlParser.select_op_return select_op190 = null;

        SqlParser.select_core_return select_core191 = null;



        try {
            // SqlParser.g:204:12: ( select_core ( select_op select_core )* )
            // SqlParser.g:205:3: select_core ( select_op select_core )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_select_core_in_select_list1654);
            select_core189=select_core();

            state._fsp--;

            adaptor.addChild(root_0, select_core189.getTree());
            // SqlParser.g:205:15: ( select_op select_core )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==EXCEPT||LA62_0==INTERSECT||LA62_0==UNION) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // SqlParser.g:205:16: select_op select_core
            	    {
            	    pushFollow(FOLLOW_select_op_in_select_list1657);
            	    select_op190=select_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(select_op190.getTree(), root_0);
            	    pushFollow(FOLLOW_select_core_in_select_list1660);
            	    select_core191=select_core();

            	    state._fsp--;

            	    adaptor.addChild(root_0, select_core191.getTree());

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
    // SqlParser.g:207:1: select_op : ( UNION ( ALL )? | INTERSECT | EXCEPT );
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
            // SqlParser.g:207:10: ( UNION ( ALL )? | INTERSECT | EXCEPT )
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
                    // SqlParser.g:207:12: UNION ( ALL )?
                    {
                    root_0 = (Object)adaptor.nil();

                    UNION192=(Token)match(input,UNION,FOLLOW_UNION_in_select_op1669); 
                    UNION192_tree = (Object)adaptor.create(UNION192);
                    root_0 = (Object)adaptor.becomeRoot(UNION192_tree, root_0);

                    // SqlParser.g:207:19: ( ALL )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==ALL) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // SqlParser.g:207:20: ALL
                            {
                            ALL193=(Token)match(input,ALL,FOLLOW_ALL_in_select_op1673); 
                            ALL193_tree = (Object)adaptor.create(ALL193);
                            adaptor.addChild(root_0, ALL193_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:207:28: INTERSECT
                    {
                    root_0 = (Object)adaptor.nil();

                    INTERSECT194=(Token)match(input,INTERSECT,FOLLOW_INTERSECT_in_select_op1679); 
                    INTERSECT194_tree = (Object)adaptor.create(INTERSECT194);
                    adaptor.addChild(root_0, INTERSECT194_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:207:40: EXCEPT
                    {
                    root_0 = (Object)adaptor.nil();

                    EXCEPT195=(Token)match(input,EXCEPT,FOLLOW_EXCEPT_in_select_op1683); 
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
    // SqlParser.g:209:1: select_core : SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) ;
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
            // SqlParser.g:209:12: ( SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )? -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? ) )
            // SqlParser.g:210:3: SELECT ( ALL | DISTINCT )? result_column ( COMMA result_column )* ( FROM join_source )? ( WHERE where_expr= expr )? ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            {
            SELECT196=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_core1692);  
            stream_SELECT.add(SELECT196);

            // SqlParser.g:210:10: ( ALL | DISTINCT )?
            int alt65=3;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // SqlParser.g:210:11: ALL
                    {
                    ALL197=(Token)match(input,ALL,FOLLOW_ALL_in_select_core1695);  
                    stream_ALL.add(ALL197);


                    }
                    break;
                case 2 :
                    // SqlParser.g:210:17: DISTINCT
                    {
                    DISTINCT198=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_core1699);  
                    stream_DISTINCT.add(DISTINCT198);


                    }
                    break;

            }

            pushFollow(FOLLOW_result_column_in_select_core1703);
            result_column199=result_column();

            state._fsp--;

            stream_result_column.add(result_column199.getTree());
            // SqlParser.g:210:42: ( COMMA result_column )*
            loop66:
            do {
                int alt66=2;
                alt66 = dfa66.predict(input);
                switch (alt66) {
            	case 1 :
            	    // SqlParser.g:210:43: COMMA result_column
            	    {
            	    COMMA200=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1706);  
            	    stream_COMMA.add(COMMA200);

            	    pushFollow(FOLLOW_result_column_in_select_core1708);
            	    result_column201=result_column();

            	    state._fsp--;

            	    stream_result_column.add(result_column201.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // SqlParser.g:210:65: ( FROM join_source )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // SqlParser.g:210:66: FROM join_source
                    {
                    FROM202=(Token)match(input,FROM,FOLLOW_FROM_in_select_core1713);  
                    stream_FROM.add(FROM202);

                    pushFollow(FOLLOW_join_source_in_select_core1715);
                    join_source203=join_source();

                    state._fsp--;

                    stream_join_source.add(join_source203.getTree());

                    }
                    break;

            }

            // SqlParser.g:210:85: ( WHERE where_expr= expr )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // SqlParser.g:210:86: WHERE where_expr= expr
                    {
                    WHERE204=(Token)match(input,WHERE,FOLLOW_WHERE_in_select_core1720);  
                    stream_WHERE.add(WHERE204);

                    pushFollow(FOLLOW_expr_in_select_core1724);
                    where_expr=expr();

                    state._fsp--;

                    stream_expr.add(where_expr.getTree());

                    }
                    break;

            }

            // SqlParser.g:211:3: ( GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )? )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==GROUP) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // SqlParser.g:211:5: GROUP BY ordering_term ( COMMA ordering_term )* ( HAVING having_expr= expr )?
                    {
                    GROUP205=(Token)match(input,GROUP,FOLLOW_GROUP_in_select_core1732);  
                    stream_GROUP.add(GROUP205);

                    BY206=(Token)match(input,BY,FOLLOW_BY_in_select_core1734);  
                    stream_BY.add(BY206);

                    pushFollow(FOLLOW_ordering_term_in_select_core1736);
                    ordering_term207=ordering_term();

                    state._fsp--;

                    stream_ordering_term.add(ordering_term207.getTree());
                    // SqlParser.g:211:28: ( COMMA ordering_term )*
                    loop69:
                    do {
                        int alt69=2;
                        alt69 = dfa69.predict(input);
                        switch (alt69) {
                    	case 1 :
                    	    // SqlParser.g:211:29: COMMA ordering_term
                    	    {
                    	    COMMA208=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_core1739);  
                    	    stream_COMMA.add(COMMA208);

                    	    pushFollow(FOLLOW_ordering_term_in_select_core1741);
                    	    ordering_term209=ordering_term();

                    	    state._fsp--;

                    	    stream_ordering_term.add(ordering_term209.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    // SqlParser.g:211:51: ( HAVING having_expr= expr )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==HAVING) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // SqlParser.g:211:52: HAVING having_expr= expr
                            {
                            HAVING210=(Token)match(input,HAVING,FOLLOW_HAVING_in_select_core1746);  
                            stream_HAVING.add(HAVING210);

                            pushFollow(FOLLOW_expr_in_select_core1750);
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
            // elements: WHERE, HAVING, FROM, having_expr, where_expr, ordering_term, DISTINCT, join_source, result_column, GROUP
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
            // 212:1: -> ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
            {
                // SqlParser.g:212:4: ^( SELECT_CORE ( DISTINCT )? ^( COLUMNS ( result_column )+ ) ( ^( FROM join_source ) )? ( ^( WHERE $where_expr) )? ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CORE, "SELECT_CORE"), root_1);

                // SqlParser.g:213:15: ( DISTINCT )?
                if ( stream_DISTINCT.hasNext() ) {
                    adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                }
                stream_DISTINCT.reset();
                // SqlParser.g:213:27: ^( COLUMNS ( result_column )+ )
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
                // SqlParser.g:213:53: ( ^( FROM join_source ) )?
                if ( stream_FROM.hasNext()||stream_join_source.hasNext() ) {
                    // SqlParser.g:213:53: ^( FROM join_source )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_join_source.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_FROM.reset();
                stream_join_source.reset();
                // SqlParser.g:213:74: ( ^( WHERE $where_expr) )?
                if ( stream_WHERE.hasNext()||stream_where_expr.hasNext() ) {
                    // SqlParser.g:213:74: ^( WHERE $where_expr)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_where_expr.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_WHERE.reset();
                stream_where_expr.reset();
                // SqlParser.g:214:3: ( ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? ) )?
                if ( stream_HAVING.hasNext()||stream_having_expr.hasNext()||stream_ordering_term.hasNext()||stream_GROUP.hasNext() ) {
                    // SqlParser.g:214:3: ^( GROUP ( ordering_term )+ ( ^( HAVING $having_expr) )? )
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
                    // SqlParser.g:214:26: ( ^( HAVING $having_expr) )?
                    if ( stream_HAVING.hasNext()||stream_having_expr.hasNext() ) {
                        // SqlParser.g:214:26: ^( HAVING $having_expr)
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
                stream_having_expr.reset();
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
    // SqlParser.g:217:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );
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
            // SqlParser.g:218:3: ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) )
            int alt74=3;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // SqlParser.g:218:5: ASTERISK
                    {
                    root_0 = (Object)adaptor.nil();

                    ASTERISK211=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1820); 
                    ASTERISK211_tree = (Object)adaptor.create(ASTERISK211);
                    adaptor.addChild(root_0, ASTERISK211_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:219:5: table_name= id DOT ASTERISK
                    {
                    pushFollow(FOLLOW_id_in_result_column1828);
                    table_name=id();

                    state._fsp--;

                    stream_id.add(table_name.getTree());
                    DOT212=(Token)match(input,DOT,FOLLOW_DOT_in_result_column1830);  
                    stream_DOT.add(DOT212);

                    ASTERISK213=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_result_column1832);  
                    stream_ASTERISK.add(ASTERISK213);



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
                    // 219:32: -> ^( ASTERISK $table_name)
                    {
                        // SqlParser.g:219:35: ^( ASTERISK $table_name)
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
                    // SqlParser.g:220:5: expr ( ( AS )? column_alias= id )?
                    {
                    pushFollow(FOLLOW_expr_in_result_column1847);
                    expr214=expr();

                    state._fsp--;

                    stream_expr.add(expr214.getTree());
                    // SqlParser.g:220:10: ( ( AS )? column_alias= id )?
                    int alt73=2;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // SqlParser.g:220:11: ( AS )? column_alias= id
                            {
                            // SqlParser.g:220:11: ( AS )?
                            int alt72=2;
                            alt72 = dfa72.predict(input);
                            switch (alt72) {
                                case 1 :
                                    // SqlParser.g:220:12: AS
                                    {
                                    AS215=(Token)match(input,AS,FOLLOW_AS_in_result_column1851);  
                                    stream_AS.add(AS215);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_id_in_result_column1857);
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
                    // 220:35: -> ^( ALIAS expr ( $column_alias)? )
                    {
                        // SqlParser.g:220:38: ^( ALIAS expr ( $column_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // SqlParser.g:220:51: ( $column_alias)?
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
    // SqlParser.g:222:1: join_source : single_source ( join_op single_source ( join_constraint )? )* ;
    public final SqlParser.join_source_return join_source() throws RecognitionException {
        SqlParser.join_source_return retval = new SqlParser.join_source_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SqlParser.single_source_return single_source216 = null;

        SqlParser.join_op_return join_op217 = null;

        SqlParser.single_source_return single_source218 = null;

        SqlParser.join_constraint_return join_constraint219 = null;



        try {
            // SqlParser.g:222:12: ( single_source ( join_op single_source ( join_constraint )? )* )
            // SqlParser.g:222:14: single_source ( join_op single_source ( join_constraint )? )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_source_in_join_source1878);
            single_source216=single_source();

            state._fsp--;

            adaptor.addChild(root_0, single_source216.getTree());
            // SqlParser.g:222:28: ( join_op single_source ( join_constraint )? )*
            loop76:
            do {
                int alt76=2;
                alt76 = dfa76.predict(input);
                switch (alt76) {
            	case 1 :
            	    // SqlParser.g:222:29: join_op single_source ( join_constraint )?
            	    {
            	    pushFollow(FOLLOW_join_op_in_join_source1881);
            	    join_op217=join_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(join_op217.getTree(), root_0);
            	    pushFollow(FOLLOW_single_source_in_join_source1884);
            	    single_source218=single_source();

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_source218.getTree());
            	    // SqlParser.g:222:52: ( join_constraint )?
            	    int alt75=2;
            	    alt75 = dfa75.predict(input);
            	    switch (alt75) {
            	        case 1 :
            	            // SqlParser.g:222:53: join_constraint
            	            {
            	            pushFollow(FOLLOW_join_constraint_in_join_source1887);
            	            join_constraint219=join_constraint();

            	            state._fsp--;

            	            adaptor.addChild(root_0, join_constraint219.getTree());

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
    // SqlParser.g:224:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );
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
            // SqlParser.g:225:3: ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN )
            int alt83=3;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // SqlParser.g:225:5: (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )?
                    {
                    // SqlParser.g:225:5: (database_name= id DOT )?
                    int alt77=2;
                    alt77 = dfa77.predict(input);
                    switch (alt77) {
                        case 1 :
                            // SqlParser.g:225:6: database_name= id DOT
                            {
                            pushFollow(FOLLOW_id_in_single_source1904);
                            database_name=id();

                            state._fsp--;

                            stream_id.add(database_name.getTree());
                            DOT220=(Token)match(input,DOT,FOLLOW_DOT_in_single_source1906);  
                            stream_DOT.add(DOT220);


                            }
                            break;

                    }

                    table_name=(Token)match(input,ID,FOLLOW_ID_in_single_source1912);  
                    stream_ID.add(table_name);

                    // SqlParser.g:225:43: ( ( AS )? table_alias= ID )?
                    int alt79=2;
                    alt79 = dfa79.predict(input);
                    switch (alt79) {
                        case 1 :
                            // SqlParser.g:225:44: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:225:44: ( AS )?
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==AS) ) {
                                alt78=1;
                            }
                            switch (alt78) {
                                case 1 :
                                    // SqlParser.g:225:45: AS
                                    {
                                    AS221=(Token)match(input,AS,FOLLOW_AS_in_single_source1916);  
                                    stream_AS.add(AS221);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1922);  
                            stream_ID.add(table_alias);


                            }
                            break;

                    }

                    // SqlParser.g:225:67: ( INDEXED BY index_name= id | NOT INDEXED )?
                    int alt80=3;
                    alt80 = dfa80.predict(input);
                    switch (alt80) {
                        case 1 :
                            // SqlParser.g:225:68: INDEXED BY index_name= id
                            {
                            INDEXED222=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1927);  
                            stream_INDEXED.add(INDEXED222);

                            BY223=(Token)match(input,BY,FOLLOW_BY_in_single_source1929);  
                            stream_BY.add(BY223);

                            pushFollow(FOLLOW_id_in_single_source1933);
                            index_name=id();

                            state._fsp--;

                            stream_id.add(index_name.getTree());

                            }
                            break;
                        case 2 :
                            // SqlParser.g:225:95: NOT INDEXED
                            {
                            NOT224=(Token)match(input,NOT,FOLLOW_NOT_in_single_source1937);  
                            stream_NOT.add(NOT224);

                            INDEXED225=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_single_source1939);  
                            stream_INDEXED.add(INDEXED225);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: INDEXED, database_name, table_name, NOT, index_name, table_alias
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
                    // 226:3: -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                    {
                        // SqlParser.g:226:6: ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        // SqlParser.g:226:14: ^( $table_name ( $database_name)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                        // SqlParser.g:226:28: ( $database_name)?
                        if ( stream_database_name.hasNext() ) {
                            adaptor.addChild(root_2, stream_database_name.nextTree());

                        }
                        stream_database_name.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // SqlParser.g:226:45: ( $table_alias)?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextNode());

                        }
                        stream_table_alias.reset();
                        // SqlParser.g:226:59: ( ^( INDEXED ( NOT )? ( $index_name)? ) )?
                        if ( stream_INDEXED.hasNext()||stream_NOT.hasNext()||stream_index_name.hasNext() ) {
                            // SqlParser.g:226:59: ^( INDEXED ( NOT )? ( $index_name)? )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(stream_INDEXED.nextNode(), root_2);

                            // SqlParser.g:226:69: ( NOT )?
                            if ( stream_NOT.hasNext() ) {
                                adaptor.addChild(root_2, stream_NOT.nextNode());

                            }
                            stream_NOT.reset();
                            // SqlParser.g:226:74: ( $index_name)?
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
                    // SqlParser.g:227:5: LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )?
                    {
                    LPAREN226=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source1980);  
                    stream_LPAREN.add(LPAREN226);

                    pushFollow(FOLLOW_select_stmt_in_single_source1982);
                    select_stmt227=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt227.getTree());
                    RPAREN228=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source1984);  
                    stream_RPAREN.add(RPAREN228);

                    // SqlParser.g:227:31: ( ( AS )? table_alias= ID )?
                    int alt82=2;
                    alt82 = dfa82.predict(input);
                    switch (alt82) {
                        case 1 :
                            // SqlParser.g:227:32: ( AS )? table_alias= ID
                            {
                            // SqlParser.g:227:32: ( AS )?
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==AS) ) {
                                alt81=1;
                            }
                            switch (alt81) {
                                case 1 :
                                    // SqlParser.g:227:33: AS
                                    {
                                    AS229=(Token)match(input,AS,FOLLOW_AS_in_single_source1988);  
                                    stream_AS.add(AS229);


                                    }
                                    break;

                            }

                            table_alias=(Token)match(input,ID,FOLLOW_ID_in_single_source1994);  
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
                    // 228:3: -> ^( ALIAS select_stmt ( $table_alias)? )
                    {
                        // SqlParser.g:228:6: ^( ALIAS select_stmt ( $table_alias)? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ALIAS, "ALIAS"), root_1);

                        adaptor.addChild(root_1, stream_select_stmt.nextTree());
                        // SqlParser.g:228:26: ( $table_alias)?
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
                    // SqlParser.g:229:5: LPAREN join_source RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    LPAREN230=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_single_source2016); 
                    pushFollow(FOLLOW_join_source_in_single_source2019);
                    join_source231=join_source();

                    state._fsp--;

                    adaptor.addChild(root_0, join_source231.getTree());
                    RPAREN232=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_single_source2021); 

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
    // SqlParser.g:231:1: join_op : ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN );
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
            // SqlParser.g:232:3: ( COMMA | ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN )
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
                    // SqlParser.g:232:5: COMMA
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA233=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_op2032); 
                    COMMA233_tree = (Object)adaptor.create(COMMA233);
                    adaptor.addChild(root_0, COMMA233_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:233:5: ( NATURAL )? ( ( LEFT )? ( OUTER )? | INNER | CROSS ) JOIN
                    {
                    root_0 = (Object)adaptor.nil();

                    // SqlParser.g:233:5: ( NATURAL )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==NATURAL) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // SqlParser.g:233:6: NATURAL
                            {
                            NATURAL234=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join_op2039); 
                            NATURAL234_tree = (Object)adaptor.create(NATURAL234);
                            adaptor.addChild(root_0, NATURAL234_tree);


                            }
                            break;

                    }

                    // SqlParser.g:233:16: ( ( LEFT )? ( OUTER )? | INNER | CROSS )
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
                            // SqlParser.g:233:17: ( LEFT )? ( OUTER )?
                            {
                            // SqlParser.g:233:17: ( LEFT )?
                            int alt85=2;
                            int LA85_0 = input.LA(1);

                            if ( (LA85_0==LEFT) ) {
                                alt85=1;
                            }
                            switch (alt85) {
                                case 1 :
                                    // SqlParser.g:233:18: LEFT
                                    {
                                    LEFT235=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_op2045); 
                                    LEFT235_tree = (Object)adaptor.create(LEFT235);
                                    adaptor.addChild(root_0, LEFT235_tree);


                                    }
                                    break;

                            }

                            // SqlParser.g:233:25: ( OUTER )?
                            int alt86=2;
                            int LA86_0 = input.LA(1);

                            if ( (LA86_0==OUTER) ) {
                                alt86=1;
                            }
                            switch (alt86) {
                                case 1 :
                                    // SqlParser.g:233:26: OUTER
                                    {
                                    OUTER236=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_op2050); 
                                    OUTER236_tree = (Object)adaptor.create(OUTER236);
                                    adaptor.addChild(root_0, OUTER236_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // SqlParser.g:233:36: INNER
                            {
                            INNER237=(Token)match(input,INNER,FOLLOW_INNER_in_join_op2056); 
                            INNER237_tree = (Object)adaptor.create(INNER237);
                            adaptor.addChild(root_0, INNER237_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:233:44: CROSS
                            {
                            CROSS238=(Token)match(input,CROSS,FOLLOW_CROSS_in_join_op2060); 
                            CROSS238_tree = (Object)adaptor.create(CROSS238);
                            adaptor.addChild(root_0, CROSS238_tree);


                            }
                            break;

                    }

                    JOIN239=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_op2063); 
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
    // SqlParser.g:235:1: join_constraint : ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) );
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
            // SqlParser.g:236:3: ( ON expr | USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN -> ^( USING ( $column_names)+ ) )
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
                    // SqlParser.g:236:5: ON expr
                    {
                    root_0 = (Object)adaptor.nil();

                    ON240=(Token)match(input,ON,FOLLOW_ON_in_join_constraint2074); 
                    ON240_tree = (Object)adaptor.create(ON240);
                    root_0 = (Object)adaptor.becomeRoot(ON240_tree, root_0);

                    pushFollow(FOLLOW_expr_in_join_constraint2077);
                    expr241=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr241.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:237:5: USING LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    USING242=(Token)match(input,USING,FOLLOW_USING_in_join_constraint2083);  
                    stream_USING.add(USING242);

                    LPAREN243=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join_constraint2085);  
                    stream_LPAREN.add(LPAREN243);

                    pushFollow(FOLLOW_id_in_join_constraint2089);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:237:35: ( COMMA column_names+= id )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==COMMA) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // SqlParser.g:237:36: COMMA column_names+= id
                    	    {
                    	    COMMA244=(Token)match(input,COMMA,FOLLOW_COMMA_in_join_constraint2092);  
                    	    stream_COMMA.add(COMMA244);

                    	    pushFollow(FOLLOW_id_in_join_constraint2096);
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

                    RPAREN245=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join_constraint2100);  
                    stream_RPAREN.add(RPAREN245);



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
                    // 237:68: -> ^( USING ( $column_names)+ )
                    {
                        // SqlParser.g:237:71: ^( USING ( $column_names)+ )
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
    // SqlParser.g:240:1: insert_stmt : ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) ;
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
            // SqlParser.g:240:12: ( ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES ) )
            // SqlParser.g:240:14: ( INSERT ( operation_conflict_clause )? | REPLACE ) INTO (database_name= id DOT )? table_name= id ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:240:14: ( INSERT ( operation_conflict_clause )? | REPLACE )
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
                    // SqlParser.g:240:15: INSERT ( operation_conflict_clause )?
                    {
                    INSERT246=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt2119); 
                    INSERT246_tree = (Object)adaptor.create(INSERT246);
                    adaptor.addChild(root_0, INSERT246_tree);

                    // SqlParser.g:240:22: ( operation_conflict_clause )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==OR) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // SqlParser.g:240:23: operation_conflict_clause
                            {
                            pushFollow(FOLLOW_operation_conflict_clause_in_insert_stmt2122);
                            operation_conflict_clause247=operation_conflict_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, operation_conflict_clause247.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:240:53: REPLACE
                    {
                    REPLACE248=(Token)match(input,REPLACE,FOLLOW_REPLACE_in_insert_stmt2128); 
                    REPLACE248_tree = (Object)adaptor.create(REPLACE248);
                    adaptor.addChild(root_0, REPLACE248_tree);


                    }
                    break;

            }

            INTO249=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt2131); 
            INTO249_tree = (Object)adaptor.create(INTO249);
            adaptor.addChild(root_0, INTO249_tree);

            // SqlParser.g:240:67: (database_name= id DOT )?
            int alt93=2;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // SqlParser.g:240:68: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_insert_stmt2136);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT250=(Token)match(input,DOT,FOLLOW_DOT_in_insert_stmt2138); 
                    DOT250_tree = (Object)adaptor.create(DOT250);
                    adaptor.addChild(root_0, DOT250_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_insert_stmt2144);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:241:3: ( ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt ) | DEFAULT VALUES )
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
                    // SqlParser.g:241:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
                    {
                    // SqlParser.g:241:5: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==LPAREN) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // SqlParser.g:241:6: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                            {
                            LPAREN251=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2151); 
                            LPAREN251_tree = (Object)adaptor.create(LPAREN251);
                            adaptor.addChild(root_0, LPAREN251_tree);

                            pushFollow(FOLLOW_id_in_insert_stmt2155);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:241:30: ( COMMA column_names+= id )*
                            loop94:
                            do {
                                int alt94=2;
                                int LA94_0 = input.LA(1);

                                if ( (LA94_0==COMMA) ) {
                                    alt94=1;
                                }


                                switch (alt94) {
                            	case 1 :
                            	    // SqlParser.g:241:31: COMMA column_names+= id
                            	    {
                            	    COMMA252=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2158); 
                            	    COMMA252_tree = (Object)adaptor.create(COMMA252);
                            	    adaptor.addChild(root_0, COMMA252_tree);

                            	    pushFollow(FOLLOW_id_in_insert_stmt2162);
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

                            RPAREN253=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2166); 
                            RPAREN253_tree = (Object)adaptor.create(RPAREN253);
                            adaptor.addChild(root_0, RPAREN253_tree);


                            }
                            break;

                    }

                    // SqlParser.g:242:5: ( VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN | select_stmt )
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
                            // SqlParser.g:242:6: VALUES LPAREN values+= expr ( COMMA values+= expr )* RPAREN
                            {
                            VALUES254=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2175); 
                            VALUES254_tree = (Object)adaptor.create(VALUES254);
                            adaptor.addChild(root_0, VALUES254_tree);

                            LPAREN255=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_stmt2177); 
                            LPAREN255_tree = (Object)adaptor.create(LPAREN255);
                            adaptor.addChild(root_0, LPAREN255_tree);

                            pushFollow(FOLLOW_expr_in_insert_stmt2181);
                            values=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, values.getTree());
                            if (list_values==null) list_values=new ArrayList();
                            list_values.add(values.getTree());

                            // SqlParser.g:242:33: ( COMMA values+= expr )*
                            loop96:
                            do {
                                int alt96=2;
                                int LA96_0 = input.LA(1);

                                if ( (LA96_0==COMMA) ) {
                                    alt96=1;
                                }


                                switch (alt96) {
                            	case 1 :
                            	    // SqlParser.g:242:34: COMMA values+= expr
                            	    {
                            	    COMMA256=(Token)match(input,COMMA,FOLLOW_COMMA_in_insert_stmt2184); 
                            	    COMMA256_tree = (Object)adaptor.create(COMMA256);
                            	    adaptor.addChild(root_0, COMMA256_tree);

                            	    pushFollow(FOLLOW_expr_in_insert_stmt2188);
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

                            RPAREN257=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_stmt2192); 
                            RPAREN257_tree = (Object)adaptor.create(RPAREN257);
                            adaptor.addChild(root_0, RPAREN257_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:242:64: select_stmt
                            {
                            pushFollow(FOLLOW_select_stmt_in_insert_stmt2196);
                            select_stmt258=select_stmt();

                            state._fsp--;

                            adaptor.addChild(root_0, select_stmt258.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:243:5: DEFAULT VALUES
                    {
                    DEFAULT259=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_insert_stmt2203); 
                    DEFAULT259_tree = (Object)adaptor.create(DEFAULT259);
                    adaptor.addChild(root_0, DEFAULT259_tree);

                    VALUES260=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt2205); 
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
    // SqlParser.g:246:1: update_stmt : UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? ;
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
            // SqlParser.g:246:12: ( UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:246:14: UPDATE ( operation_conflict_clause )? qualified_table_name SET values+= update_set ( COMMA values+= update_set )* ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UPDATE261=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update_stmt2215); 
            UPDATE261_tree = (Object)adaptor.create(UPDATE261);
            adaptor.addChild(root_0, UPDATE261_tree);

            // SqlParser.g:246:21: ( operation_conflict_clause )?
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
                    // SqlParser.g:246:22: operation_conflict_clause
                    {
                    pushFollow(FOLLOW_operation_conflict_clause_in_update_stmt2218);
                    operation_conflict_clause262=operation_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_conflict_clause262.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_qualified_table_name_in_update_stmt2222);
            qualified_table_name263=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name263.getTree());
            SET264=(Token)match(input,SET,FOLLOW_SET_in_update_stmt2226); 
            SET264_tree = (Object)adaptor.create(SET264);
            adaptor.addChild(root_0, SET264_tree);

            pushFollow(FOLLOW_update_set_in_update_stmt2230);
            values=update_set();

            state._fsp--;

            adaptor.addChild(root_0, values.getTree());
            if (list_values==null) list_values=new ArrayList();
            list_values.add(values.getTree());

            // SqlParser.g:247:26: ( COMMA values+= update_set )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==COMMA) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // SqlParser.g:247:27: COMMA values+= update_set
            	    {
            	    COMMA265=(Token)match(input,COMMA,FOLLOW_COMMA_in_update_stmt2233); 
            	    COMMA265_tree = (Object)adaptor.create(COMMA265);
            	    adaptor.addChild(root_0, COMMA265_tree);

            	    pushFollow(FOLLOW_update_set_in_update_stmt2237);
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

            // SqlParser.g:247:54: ( WHERE expr )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==WHERE) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // SqlParser.g:247:55: WHERE expr
                    {
                    WHERE266=(Token)match(input,WHERE,FOLLOW_WHERE_in_update_stmt2242); 
                    WHERE266_tree = (Object)adaptor.create(WHERE266);
                    adaptor.addChild(root_0, WHERE266_tree);

                    pushFollow(FOLLOW_expr_in_update_stmt2244);
                    expr267=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr267.getTree());

                    }
                    break;

            }

            // SqlParser.g:247:68: ( operation_limited_clause )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==LIMIT||LA102_0==ORDER) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // SqlParser.g:247:69: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_update_stmt2249);
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
    // SqlParser.g:249:1: update_set : column_name= id EQUALS expr ;
    public final SqlParser.update_set_return update_set() throws RecognitionException {
        SqlParser.update_set_return retval = new SqlParser.update_set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALS269=null;
        SqlParser.id_return column_name = null;

        SqlParser.expr_return expr270 = null;


        Object EQUALS269_tree=null;

        try {
            // SqlParser.g:249:11: (column_name= id EQUALS expr )
            // SqlParser.g:249:13: column_name= id EQUALS expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_update_set2260);
            column_name=id();

            state._fsp--;

            adaptor.addChild(root_0, column_name.getTree());
            EQUALS269=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_update_set2262); 
            EQUALS269_tree = (Object)adaptor.create(EQUALS269);
            adaptor.addChild(root_0, EQUALS269_tree);

            pushFollow(FOLLOW_expr_in_update_set2264);
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
    // SqlParser.g:252:1: delete_stmt : DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? ;
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
            // SqlParser.g:252:12: ( DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )? )
            // SqlParser.g:252:14: DELETE FROM qualified_table_name ( WHERE expr )? ( operation_limited_clause )?
            {
            root_0 = (Object)adaptor.nil();

            DELETE271=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete_stmt2272); 
            DELETE271_tree = (Object)adaptor.create(DELETE271);
            adaptor.addChild(root_0, DELETE271_tree);

            FROM272=(Token)match(input,FROM,FOLLOW_FROM_in_delete_stmt2274); 
            FROM272_tree = (Object)adaptor.create(FROM272);
            adaptor.addChild(root_0, FROM272_tree);

            pushFollow(FOLLOW_qualified_table_name_in_delete_stmt2276);
            qualified_table_name273=qualified_table_name();

            state._fsp--;

            adaptor.addChild(root_0, qualified_table_name273.getTree());
            // SqlParser.g:252:47: ( WHERE expr )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==WHERE) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // SqlParser.g:252:48: WHERE expr
                    {
                    WHERE274=(Token)match(input,WHERE,FOLLOW_WHERE_in_delete_stmt2279); 
                    WHERE274_tree = (Object)adaptor.create(WHERE274);
                    adaptor.addChild(root_0, WHERE274_tree);

                    pushFollow(FOLLOW_expr_in_delete_stmt2281);
                    expr275=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr275.getTree());

                    }
                    break;

            }

            // SqlParser.g:252:61: ( operation_limited_clause )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==LIMIT||LA104_0==ORDER) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // SqlParser.g:252:62: operation_limited_clause
                    {
                    pushFollow(FOLLOW_operation_limited_clause_in_delete_stmt2286);
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
    // SqlParser.g:255:1: begin_stmt : BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? ;
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
            // SqlParser.g:255:11: ( BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )? )
            // SqlParser.g:255:13: BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
            {
            root_0 = (Object)adaptor.nil();

            BEGIN277=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_begin_stmt2296); 
            BEGIN277_tree = (Object)adaptor.create(BEGIN277);
            adaptor.addChild(root_0, BEGIN277_tree);

            // SqlParser.g:255:19: ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==DEFERRED||LA105_0==EXCLUSIVE||LA105_0==IMMEDIATE) ) {
                alt105=1;
            }
            switch (alt105) {
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

            // SqlParser.g:255:55: ( TRANSACTION )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==TRANSACTION) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // SqlParser.g:255:56: TRANSACTION
                    {
                    TRANSACTION279=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_begin_stmt2312); 
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
    // SqlParser.g:258:1: commit_stmt : ( COMMIT | END ) ( TRANSACTION )? ;
    public final SqlParser.commit_stmt_return commit_stmt() throws RecognitionException {
        SqlParser.commit_stmt_return retval = new SqlParser.commit_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set280=null;
        Token TRANSACTION281=null;

        Object set280_tree=null;
        Object TRANSACTION281_tree=null;

        try {
            // SqlParser.g:258:12: ( ( COMMIT | END ) ( TRANSACTION )? )
            // SqlParser.g:258:14: ( COMMIT | END ) ( TRANSACTION )?
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

            // SqlParser.g:258:29: ( TRANSACTION )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==TRANSACTION) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // SqlParser.g:258:30: TRANSACTION
                    {
                    TRANSACTION281=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_commit_stmt2331); 
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
    // SqlParser.g:261:1: rollback_stmt : ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? ;
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
            // SqlParser.g:261:14: ( ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )? )
            // SqlParser.g:261:16: ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name= id )?
            {
            root_0 = (Object)adaptor.nil();

            ROLLBACK282=(Token)match(input,ROLLBACK,FOLLOW_ROLLBACK_in_rollback_stmt2341); 
            ROLLBACK282_tree = (Object)adaptor.create(ROLLBACK282);
            adaptor.addChild(root_0, ROLLBACK282_tree);

            // SqlParser.g:261:25: ( TRANSACTION )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==TRANSACTION) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // SqlParser.g:261:26: TRANSACTION
                    {
                    TRANSACTION283=(Token)match(input,TRANSACTION,FOLLOW_TRANSACTION_in_rollback_stmt2344); 
                    TRANSACTION283_tree = (Object)adaptor.create(TRANSACTION283);
                    adaptor.addChild(root_0, TRANSACTION283_tree);


                    }
                    break;

            }

            // SqlParser.g:261:40: ( TO ( SAVEPOINT )? savepoint_name= id )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==TO) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // SqlParser.g:261:41: TO ( SAVEPOINT )? savepoint_name= id
                    {
                    TO284=(Token)match(input,TO,FOLLOW_TO_in_rollback_stmt2349); 
                    TO284_tree = (Object)adaptor.create(TO284);
                    adaptor.addChild(root_0, TO284_tree);

                    // SqlParser.g:261:44: ( SAVEPOINT )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==SAVEPOINT) ) {
                        int LA109_1 = input.LA(2);

                        if ( ((LA109_1>=ABORT && LA109_1<=WHERE)||LA109_1==ID) ) {
                            alt109=1;
                        }
                    }
                    switch (alt109) {
                        case 1 :
                            // SqlParser.g:261:45: SAVEPOINT
                            {
                            SAVEPOINT285=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_rollback_stmt2352); 
                            SAVEPOINT285_tree = (Object)adaptor.create(SAVEPOINT285);
                            adaptor.addChild(root_0, SAVEPOINT285_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_id_in_rollback_stmt2358);
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
    // SqlParser.g:264:1: savepoint_stmt : SAVEPOINT savepoint_name= id ;
    public final SqlParser.savepoint_stmt_return savepoint_stmt() throws RecognitionException {
        SqlParser.savepoint_stmt_return retval = new SqlParser.savepoint_stmt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SAVEPOINT286=null;
        SqlParser.id_return savepoint_name = null;


        Object SAVEPOINT286_tree=null;

        try {
            // SqlParser.g:264:15: ( SAVEPOINT savepoint_name= id )
            // SqlParser.g:264:17: SAVEPOINT savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            SAVEPOINT286=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_savepoint_stmt2368); 
            SAVEPOINT286_tree = (Object)adaptor.create(SAVEPOINT286);
            adaptor.addChild(root_0, SAVEPOINT286_tree);

            pushFollow(FOLLOW_id_in_savepoint_stmt2372);
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
    // SqlParser.g:267:1: release_stmt : RELEASE ( SAVEPOINT )? savepoint_name= id ;
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
            // SqlParser.g:267:13: ( RELEASE ( SAVEPOINT )? savepoint_name= id )
            // SqlParser.g:267:15: RELEASE ( SAVEPOINT )? savepoint_name= id
            {
            root_0 = (Object)adaptor.nil();

            RELEASE287=(Token)match(input,RELEASE,FOLLOW_RELEASE_in_release_stmt2380); 
            RELEASE287_tree = (Object)adaptor.create(RELEASE287);
            adaptor.addChild(root_0, RELEASE287_tree);

            // SqlParser.g:267:23: ( SAVEPOINT )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==SAVEPOINT) ) {
                int LA111_1 = input.LA(2);

                if ( ((LA111_1>=ABORT && LA111_1<=WHERE)||LA111_1==ID) ) {
                    alt111=1;
                }
            }
            switch (alt111) {
                case 1 :
                    // SqlParser.g:267:24: SAVEPOINT
                    {
                    SAVEPOINT288=(Token)match(input,SAVEPOINT,FOLLOW_SAVEPOINT_in_release_stmt2383); 
                    SAVEPOINT288_tree = (Object)adaptor.create(SAVEPOINT288);
                    adaptor.addChild(root_0, SAVEPOINT288_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_release_stmt2389);
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
    // SqlParser.g:274:1: table_conflict_clause : ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) ;
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
            // SqlParser.g:274:22: ( ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )
            // SqlParser.g:274:24: ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
            {
            root_0 = (Object)adaptor.nil();

            ON289=(Token)match(input,ON,FOLLOW_ON_in_table_conflict_clause2401); 
            CONFLICT290=(Token)match(input,CONFLICT,FOLLOW_CONFLICT_in_table_conflict_clause2404); 
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
    // SqlParser.g:278:1: create_virtual_table_stmt : CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? ;
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
            // SqlParser.g:278:26: ( CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )? )
            // SqlParser.g:278:28: CREATE VIRTUAL TABLE (database_name= id DOT )? table_name= id USING module_name= id ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            {
            root_0 = (Object)adaptor.nil();

            CREATE292=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_virtual_table_stmt2434); 
            CREATE292_tree = (Object)adaptor.create(CREATE292);
            adaptor.addChild(root_0, CREATE292_tree);

            VIRTUAL293=(Token)match(input,VIRTUAL,FOLLOW_VIRTUAL_in_create_virtual_table_stmt2436); 
            VIRTUAL293_tree = (Object)adaptor.create(VIRTUAL293);
            adaptor.addChild(root_0, VIRTUAL293_tree);

            TABLE294=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_virtual_table_stmt2438); 
            TABLE294_tree = (Object)adaptor.create(TABLE294);
            adaptor.addChild(root_0, TABLE294_tree);

            // SqlParser.g:278:49: (database_name= id DOT )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==ID) ) {
                int LA112_1 = input.LA(2);

                if ( (LA112_1==DOT) ) {
                    alt112=1;
                }
            }
            else if ( ((LA112_0>=ABORT && LA112_0<=WHERE)) ) {
                int LA112_2 = input.LA(2);

                if ( (LA112_2==DOT) ) {
                    alt112=1;
                }
            }
            switch (alt112) {
                case 1 :
                    // SqlParser.g:278:50: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_virtual_table_stmt2443);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT295=(Token)match(input,DOT,FOLLOW_DOT_in_create_virtual_table_stmt2445); 
                    DOT295_tree = (Object)adaptor.create(DOT295);
                    adaptor.addChild(root_0, DOT295_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2451);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            USING296=(Token)match(input,USING,FOLLOW_USING_in_create_virtual_table_stmt2455); 
            USING296_tree = (Object)adaptor.create(USING296);
            adaptor.addChild(root_0, USING296_tree);

            pushFollow(FOLLOW_id_in_create_virtual_table_stmt2459);
            module_name=id();

            state._fsp--;

            adaptor.addChild(root_0, module_name.getTree());
            // SqlParser.g:279:24: ( LPAREN column_def ( COMMA column_def )* RPAREN )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==LPAREN) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // SqlParser.g:279:25: LPAREN column_def ( COMMA column_def )* RPAREN
                    {
                    LPAREN297=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_virtual_table_stmt2462); 
                    LPAREN297_tree = (Object)adaptor.create(LPAREN297);
                    adaptor.addChild(root_0, LPAREN297_tree);

                    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2464);
                    column_def298=column_def();

                    state._fsp--;

                    adaptor.addChild(root_0, column_def298.getTree());
                    // SqlParser.g:279:43: ( COMMA column_def )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==COMMA) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // SqlParser.g:279:44: COMMA column_def
                    	    {
                    	    COMMA299=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_virtual_table_stmt2467); 
                    	    COMMA299_tree = (Object)adaptor.create(COMMA299);
                    	    adaptor.addChild(root_0, COMMA299_tree);

                    	    pushFollow(FOLLOW_column_def_in_create_virtual_table_stmt2469);
                    	    column_def300=column_def();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, column_def300.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);

                    RPAREN301=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_virtual_table_stmt2473); 
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
    // SqlParser.g:282:1: create_table_stmt : CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) ;
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
            // SqlParser.g:282:18: ( CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt ) -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? ) )
            // SqlParser.g:282:20: CREATE ( TEMPORARY )? TABLE ( IF NOT EXISTS )? (database_name= id DOT )? table_name= id ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
            {
            CREATE302=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_table_stmt2483);  
            stream_CREATE.add(CREATE302);

            // SqlParser.g:282:27: ( TEMPORARY )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==TEMPORARY) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // SqlParser.g:282:27: TEMPORARY
                    {
                    TEMPORARY303=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_table_stmt2485);  
                    stream_TEMPORARY.add(TEMPORARY303);


                    }
                    break;

            }

            TABLE304=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_table_stmt2488);  
            stream_TABLE.add(TABLE304);

            // SqlParser.g:282:44: ( IF NOT EXISTS )?
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
                    // SqlParser.g:282:45: IF NOT EXISTS
                    {
                    IF305=(Token)match(input,IF,FOLLOW_IF_in_create_table_stmt2491);  
                    stream_IF.add(IF305);

                    NOT306=(Token)match(input,NOT,FOLLOW_NOT_in_create_table_stmt2493);  
                    stream_NOT.add(NOT306);

                    EXISTS307=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_table_stmt2495);  
                    stream_EXISTS.add(EXISTS307);


                    }
                    break;

            }

            // SqlParser.g:282:61: (database_name= id DOT )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==ID) ) {
                int LA117_1 = input.LA(2);

                if ( (LA117_1==DOT) ) {
                    alt117=1;
                }
            }
            else if ( ((LA117_0>=ABORT && LA117_0<=WHERE)) ) {
                int LA117_2 = input.LA(2);

                if ( (LA117_2==DOT) ) {
                    alt117=1;
                }
            }
            switch (alt117) {
                case 1 :
                    // SqlParser.g:282:62: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_table_stmt2502);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT308=(Token)match(input,DOT,FOLLOW_DOT_in_create_table_stmt2504);  
                    stream_DOT.add(DOT308);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_table_stmt2510);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            // SqlParser.g:283:3: ( LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN | AS select_stmt )
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
                    // SqlParser.g:283:5: LPAREN column_def ( COMMA column_def )* ( COMMA table_constraint )* RPAREN
                    {
                    LPAREN309=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_table_stmt2516);  
                    stream_LPAREN.add(LPAREN309);

                    pushFollow(FOLLOW_column_def_in_create_table_stmt2518);
                    column_def310=column_def();

                    state._fsp--;

                    stream_column_def.add(column_def310.getTree());
                    // SqlParser.g:283:23: ( COMMA column_def )*
                    loop118:
                    do {
                        int alt118=2;
                        alt118 = dfa118.predict(input);
                        switch (alt118) {
                    	case 1 :
                    	    // SqlParser.g:283:24: COMMA column_def
                    	    {
                    	    COMMA311=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2521);  
                    	    stream_COMMA.add(COMMA311);

                    	    pushFollow(FOLLOW_column_def_in_create_table_stmt2523);
                    	    column_def312=column_def();

                    	    state._fsp--;

                    	    stream_column_def.add(column_def312.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);

                    // SqlParser.g:283:43: ( COMMA table_constraint )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==COMMA) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // SqlParser.g:283:44: COMMA table_constraint
                    	    {
                    	    COMMA313=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_table_stmt2528);  
                    	    stream_COMMA.add(COMMA313);

                    	    pushFollow(FOLLOW_table_constraint_in_create_table_stmt2530);
                    	    table_constraint314=table_constraint();

                    	    state._fsp--;

                    	    stream_table_constraint.add(table_constraint314.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);

                    RPAREN315=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_table_stmt2534);  
                    stream_RPAREN.add(RPAREN315);


                    }
                    break;
                case 2 :
                    // SqlParser.g:284:5: AS select_stmt
                    {
                    AS316=(Token)match(input,AS,FOLLOW_AS_in_create_table_stmt2540);  
                    stream_AS.add(AS316);

                    pushFollow(FOLLOW_select_stmt_in_create_table_stmt2542);
                    select_stmt317=select_stmt();

                    state._fsp--;

                    stream_select_stmt.add(select_stmt317.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: select_stmt, column_def, table_constraint, database_name, table_name, TEMPORARY, EXISTS
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
            // 285:1: -> ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
            {
                // SqlParser.g:285:4: ^( CREATE_TABLE ^( OPTIONS ( TEMPORARY )? ( EXISTS )? ) ^( $table_name ( $database_name)? ) ( ^( COLUMNS ( column_def )+ ) )? ( ^( CONSTRAINTS ( table_constraint )* ) )? ( select_stmt )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_TABLE, "CREATE_TABLE"), root_1);

                // SqlParser.g:285:19: ^( OPTIONS ( TEMPORARY )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:285:29: ( TEMPORARY )?
                if ( stream_TEMPORARY.hasNext() ) {
                    adaptor.addChild(root_2, stream_TEMPORARY.nextNode());

                }
                stream_TEMPORARY.reset();
                // SqlParser.g:285:40: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:285:49: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:285:63: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:286:3: ( ^( COLUMNS ( column_def )+ ) )?
                if ( stream_column_def.hasNext() ) {
                    // SqlParser.g:286:3: ^( COLUMNS ( column_def )+ )
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
                // SqlParser.g:286:27: ( ^( CONSTRAINTS ( table_constraint )* ) )?
                if ( stream_table_constraint.hasNext() ) {
                    // SqlParser.g:286:27: ^( CONSTRAINTS ( table_constraint )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                    // SqlParser.g:286:41: ( table_constraint )*
                    while ( stream_table_constraint.hasNext() ) {
                        adaptor.addChild(root_2, stream_table_constraint.nextTree());

                    }
                    stream_table_constraint.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_table_constraint.reset();
                // SqlParser.g:286:61: ( select_stmt )?
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
    // SqlParser.g:288:1: column_def : name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) ;
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
            // SqlParser.g:288:11: (name= id_column_def ( type_name )? ( column_constraint )* -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? ) )
            // SqlParser.g:288:13: name= id_column_def ( type_name )? ( column_constraint )*
            {
            pushFollow(FOLLOW_id_column_def_in_column_def2598);
            name=id_column_def();

            state._fsp--;

            stream_id_column_def.add(name.getTree());
            // SqlParser.g:288:32: ( type_name )?
            int alt121=2;
            alt121 = dfa121.predict(input);
            switch (alt121) {
                case 1 :
                    // SqlParser.g:288:32: type_name
                    {
                    pushFollow(FOLLOW_type_name_in_column_def2600);
                    type_name318=type_name();

                    state._fsp--;

                    stream_type_name.add(type_name318.getTree());

                    }
                    break;

            }

            // SqlParser.g:288:43: ( column_constraint )*
            loop122:
            do {
                int alt122=2;
                alt122 = dfa122.predict(input);
                switch (alt122) {
            	case 1 :
            	    // SqlParser.g:288:43: column_constraint
            	    {
            	    pushFollow(FOLLOW_column_constraint_in_column_def2603);
            	    column_constraint319=column_constraint();

            	    state._fsp--;

            	    stream_column_constraint.add(column_constraint319.getTree());

            	    }
            	    break;

            	default :
            	    break loop122;
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
            // 289:1: -> ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
            {
                // SqlParser.g:289:4: ^( $name ^( CONSTRAINTS ( column_constraint )* ) ( type_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_name.nextNode(), root_1);

                // SqlParser.g:289:12: ^( CONSTRAINTS ( column_constraint )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRAINTS, "CONSTRAINTS"), root_2);

                // SqlParser.g:289:26: ( column_constraint )*
                while ( stream_column_constraint.hasNext() ) {
                    adaptor.addChild(root_2, stream_column_constraint.nextTree());

                }
                stream_column_constraint.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:289:46: ( type_name )?
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
    // SqlParser.g:291:1: column_constraint : ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) ;
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
            // SqlParser.g:291:18: ( ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause ) -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? ) )
            // SqlParser.g:291:20: ( CONSTRAINT name= id )? ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
            {
            // SqlParser.g:291:20: ( CONSTRAINT name= id )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==CONSTRAINT) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // SqlParser.g:291:21: CONSTRAINT name= id
                    {
                    CONSTRAINT320=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_column_constraint2629);  
                    stream_CONSTRAINT.add(CONSTRAINT320);

                    pushFollow(FOLLOW_id_in_column_constraint2633);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:292:3: ( column_constraint_pk | column_constraint_not_null | column_constraint_unique | column_constraint_check | column_constraint_default | column_constraint_collate | fk_clause )
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
                    // SqlParser.g:292:5: column_constraint_pk
                    {
                    pushFollow(FOLLOW_column_constraint_pk_in_column_constraint2641);
                    column_constraint_pk321=column_constraint_pk();

                    state._fsp--;

                    stream_column_constraint_pk.add(column_constraint_pk321.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:293:5: column_constraint_not_null
                    {
                    pushFollow(FOLLOW_column_constraint_not_null_in_column_constraint2647);
                    column_constraint_not_null322=column_constraint_not_null();

                    state._fsp--;

                    stream_column_constraint_not_null.add(column_constraint_not_null322.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:294:5: column_constraint_unique
                    {
                    pushFollow(FOLLOW_column_constraint_unique_in_column_constraint2653);
                    column_constraint_unique323=column_constraint_unique();

                    state._fsp--;

                    stream_column_constraint_unique.add(column_constraint_unique323.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:295:5: column_constraint_check
                    {
                    pushFollow(FOLLOW_column_constraint_check_in_column_constraint2659);
                    column_constraint_check324=column_constraint_check();

                    state._fsp--;

                    stream_column_constraint_check.add(column_constraint_check324.getTree());

                    }
                    break;
                case 5 :
                    // SqlParser.g:296:5: column_constraint_default
                    {
                    pushFollow(FOLLOW_column_constraint_default_in_column_constraint2665);
                    column_constraint_default325=column_constraint_default();

                    state._fsp--;

                    stream_column_constraint_default.add(column_constraint_default325.getTree());

                    }
                    break;
                case 6 :
                    // SqlParser.g:297:5: column_constraint_collate
                    {
                    pushFollow(FOLLOW_column_constraint_collate_in_column_constraint2671);
                    column_constraint_collate326=column_constraint_collate();

                    state._fsp--;

                    stream_column_constraint_collate.add(column_constraint_collate326.getTree());

                    }
                    break;
                case 7 :
                    // SqlParser.g:298:5: fk_clause
                    {
                    pushFollow(FOLLOW_fk_clause_in_column_constraint2677);
                    fk_clause327=fk_clause();

                    state._fsp--;

                    stream_fk_clause.add(fk_clause327.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: column_constraint_collate, name, fk_clause, column_constraint_unique, column_constraint_default, column_constraint_check, column_constraint_not_null, column_constraint_pk
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 299:1: -> ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
            {
                // SqlParser.g:299:4: ^( COLUMN_CONSTRAINT ( column_constraint_pk )? ( column_constraint_not_null )? ( column_constraint_unique )? ( column_constraint_check )? ( column_constraint_default )? ( column_constraint_collate )? ( fk_clause )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLUMN_CONSTRAINT, "COLUMN_CONSTRAINT"), root_1);

                // SqlParser.g:300:3: ( column_constraint_pk )?
                if ( stream_column_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_pk.nextTree());

                }
                stream_column_constraint_pk.reset();
                // SqlParser.g:301:3: ( column_constraint_not_null )?
                if ( stream_column_constraint_not_null.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_not_null.nextTree());

                }
                stream_column_constraint_not_null.reset();
                // SqlParser.g:302:3: ( column_constraint_unique )?
                if ( stream_column_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_unique.nextTree());

                }
                stream_column_constraint_unique.reset();
                // SqlParser.g:303:3: ( column_constraint_check )?
                if ( stream_column_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_check.nextTree());

                }
                stream_column_constraint_check.reset();
                // SqlParser.g:304:3: ( column_constraint_default )?
                if ( stream_column_constraint_default.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_default.nextTree());

                }
                stream_column_constraint_default.reset();
                // SqlParser.g:305:3: ( column_constraint_collate )?
                if ( stream_column_constraint_collate.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_constraint_collate.nextTree());

                }
                stream_column_constraint_collate.reset();
                // SqlParser.g:306:3: ( fk_clause )?
                if ( stream_fk_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_fk_clause.nextTree());

                }
                stream_fk_clause.reset();
                // SqlParser.g:307:3: ( $name)?
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
    // SqlParser.g:309:1: column_constraint_pk : PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? ;
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
            // SqlParser.g:309:21: ( PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )? )
            // SqlParser.g:309:23: PRIMARY KEY ( ASC | DESC )? ( table_conflict_clause )? ( AUTOINCREMENT )?
            {
            root_0 = (Object)adaptor.nil();

            PRIMARY328=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_column_constraint_pk2732); 
            PRIMARY328_tree = (Object)adaptor.create(PRIMARY328);
            root_0 = (Object)adaptor.becomeRoot(PRIMARY328_tree, root_0);

            KEY329=(Token)match(input,KEY,FOLLOW_KEY_in_column_constraint_pk2735); 
            // SqlParser.g:309:37: ( ASC | DESC )?
            int alt125=2;
            alt125 = dfa125.predict(input);
            switch (alt125) {
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

            // SqlParser.g:309:51: ( table_conflict_clause )?
            int alt126=2;
            alt126 = dfa126.predict(input);
            switch (alt126) {
                case 1 :
                    // SqlParser.g:309:51: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_pk2747);
                    table_conflict_clause331=table_conflict_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, table_conflict_clause331.getTree());

                    }
                    break;

            }

            // SqlParser.g:309:74: ( AUTOINCREMENT )?
            int alt127=2;
            alt127 = dfa127.predict(input);
            switch (alt127) {
                case 1 :
                    // SqlParser.g:309:75: AUTOINCREMENT
                    {
                    AUTOINCREMENT332=(Token)match(input,AUTOINCREMENT,FOLLOW_AUTOINCREMENT_in_column_constraint_pk2751); 
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
    // SqlParser.g:311:1: column_constraint_not_null : NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) ;
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
            // SqlParser.g:311:27: ( NOT NULL ( table_conflict_clause )? -> ^( NOT_NULL ( table_conflict_clause )? ) )
            // SqlParser.g:311:29: NOT NULL ( table_conflict_clause )?
            {
            NOT333=(Token)match(input,NOT,FOLLOW_NOT_in_column_constraint_not_null2760);  
            stream_NOT.add(NOT333);

            NULL334=(Token)match(input,NULL,FOLLOW_NULL_in_column_constraint_not_null2762);  
            stream_NULL.add(NULL334);

            // SqlParser.g:311:38: ( table_conflict_clause )?
            int alt128=2;
            alt128 = dfa128.predict(input);
            switch (alt128) {
                case 1 :
                    // SqlParser.g:311:38: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_not_null2764);
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
            // 311:61: -> ^( NOT_NULL ( table_conflict_clause )? )
            {
                // SqlParser.g:311:64: ^( NOT_NULL ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_NULL, "NOT_NULL"), root_1);

                // SqlParser.g:311:75: ( table_conflict_clause )?
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
    // SqlParser.g:313:1: column_constraint_unique : UNIQUE ( table_conflict_clause )? ;
    public final SqlParser.column_constraint_unique_return column_constraint_unique() throws RecognitionException {
        SqlParser.column_constraint_unique_return retval = new SqlParser.column_constraint_unique_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNIQUE336=null;
        SqlParser.table_conflict_clause_return table_conflict_clause337 = null;


        Object UNIQUE336_tree=null;

        try {
            // SqlParser.g:313:25: ( UNIQUE ( table_conflict_clause )? )
            // SqlParser.g:313:27: UNIQUE ( table_conflict_clause )?
            {
            root_0 = (Object)adaptor.nil();

            UNIQUE336=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_column_constraint_unique2781); 
            UNIQUE336_tree = (Object)adaptor.create(UNIQUE336);
            root_0 = (Object)adaptor.becomeRoot(UNIQUE336_tree, root_0);

            // SqlParser.g:313:35: ( table_conflict_clause )?
            int alt129=2;
            alt129 = dfa129.predict(input);
            switch (alt129) {
                case 1 :
                    // SqlParser.g:313:35: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_column_constraint_unique2784);
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
    // SqlParser.g:315:1: column_constraint_check : CHECK LPAREN expr RPAREN ;
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
            // SqlParser.g:315:24: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:315:26: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK338=(Token)match(input,CHECK,FOLLOW_CHECK_in_column_constraint_check2792); 
            CHECK338_tree = (Object)adaptor.create(CHECK338);
            root_0 = (Object)adaptor.becomeRoot(CHECK338_tree, root_0);

            LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_check2795); 
            pushFollow(FOLLOW_expr_in_column_constraint_check2798);
            expr340=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr340.getTree());
            RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_check2800); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:318:1: column_constraint_default : DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN ) ;
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
            // SqlParser.g:318:26: ( DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN ) )
            // SqlParser.g:318:28: DEFAULT ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT342=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_column_constraint_default2809); 
            DEFAULT342_tree = (Object)adaptor.create(DEFAULT342);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT342_tree, root_0);

            // SqlParser.g:318:37: ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )
            int alt130=3;
            alt130 = dfa130.predict(input);
            switch (alt130) {
                case 1 :
                    // SqlParser.g:318:38: ( PLUS | MINUS ) ( INTEGER | FLOAT )
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
                    // SqlParser.g:318:73: literal_value
                    {
                    pushFollow(FOLLOW_literal_value_in_column_constraint_default2831);
                    literal_value345=literal_value();

                    state._fsp--;

                    adaptor.addChild(root_0, literal_value345.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:318:89: LPAREN expr RPAREN
                    {
                    LPAREN346=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_constraint_default2835); 
                    pushFollow(FOLLOW_expr_in_column_constraint_default2838);
                    expr347=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr347.getTree());
                    RPAREN348=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_constraint_default2840); 

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
    // SqlParser.g:320:1: column_constraint_collate : COLLATE collation_name= id ;
    public final SqlParser.column_constraint_collate_return column_constraint_collate() throws RecognitionException {
        SqlParser.column_constraint_collate_return retval = new SqlParser.column_constraint_collate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLLATE349=null;
        SqlParser.id_return collation_name = null;


        Object COLLATE349_tree=null;

        try {
            // SqlParser.g:320:26: ( COLLATE collation_name= id )
            // SqlParser.g:320:28: COLLATE collation_name= id
            {
            root_0 = (Object)adaptor.nil();

            COLLATE349=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_column_constraint_collate2849); 
            COLLATE349_tree = (Object)adaptor.create(COLLATE349);
            root_0 = (Object)adaptor.becomeRoot(COLLATE349_tree, root_0);

            pushFollow(FOLLOW_id_in_column_constraint_collate2854);
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
    // SqlParser.g:322:1: table_constraint : ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) ;
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
            // SqlParser.g:322:17: ( ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk ) -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? ) )
            // SqlParser.g:322:19: ( CONSTRAINT name= id )? ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
            {
            // SqlParser.g:322:19: ( CONSTRAINT name= id )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==CONSTRAINT) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // SqlParser.g:322:20: CONSTRAINT name= id
                    {
                    CONSTRAINT350=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_table_constraint2863);  
                    stream_CONSTRAINT.add(CONSTRAINT350);

                    pushFollow(FOLLOW_id_in_table_constraint2867);
                    name=id();

                    state._fsp--;

                    stream_id.add(name.getTree());

                    }
                    break;

            }

            // SqlParser.g:323:3: ( table_constraint_pk | table_constraint_unique | table_constraint_check | table_constraint_fk )
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
                    // SqlParser.g:323:5: table_constraint_pk
                    {
                    pushFollow(FOLLOW_table_constraint_pk_in_table_constraint2875);
                    table_constraint_pk351=table_constraint_pk();

                    state._fsp--;

                    stream_table_constraint_pk.add(table_constraint_pk351.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:324:5: table_constraint_unique
                    {
                    pushFollow(FOLLOW_table_constraint_unique_in_table_constraint2881);
                    table_constraint_unique352=table_constraint_unique();

                    state._fsp--;

                    stream_table_constraint_unique.add(table_constraint_unique352.getTree());

                    }
                    break;
                case 3 :
                    // SqlParser.g:325:5: table_constraint_check
                    {
                    pushFollow(FOLLOW_table_constraint_check_in_table_constraint2887);
                    table_constraint_check353=table_constraint_check();

                    state._fsp--;

                    stream_table_constraint_check.add(table_constraint_check353.getTree());

                    }
                    break;
                case 4 :
                    // SqlParser.g:326:5: table_constraint_fk
                    {
                    pushFollow(FOLLOW_table_constraint_fk_in_table_constraint2893);
                    table_constraint_fk354=table_constraint_fk();

                    state._fsp--;

                    stream_table_constraint_fk.add(table_constraint_fk354.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: name, table_constraint_pk, table_constraint_check, table_constraint_unique, table_constraint_fk
            // token labels: 
            // rule labels: retval, name
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);

            root_0 = (Object)adaptor.nil();
            // 327:1: -> ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
            {
                // SqlParser.g:327:4: ^( TABLE_CONSTRAINT ( table_constraint_pk )? ( table_constraint_unique )? ( table_constraint_check )? ( table_constraint_fk )? ( $name)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE_CONSTRAINT, "TABLE_CONSTRAINT"), root_1);

                // SqlParser.g:328:3: ( table_constraint_pk )?
                if ( stream_table_constraint_pk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_pk.nextTree());

                }
                stream_table_constraint_pk.reset();
                // SqlParser.g:329:3: ( table_constraint_unique )?
                if ( stream_table_constraint_unique.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_unique.nextTree());

                }
                stream_table_constraint_unique.reset();
                // SqlParser.g:330:3: ( table_constraint_check )?
                if ( stream_table_constraint_check.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_check.nextTree());

                }
                stream_table_constraint_check.reset();
                // SqlParser.g:331:3: ( table_constraint_fk )?
                if ( stream_table_constraint_fk.hasNext() ) {
                    adaptor.addChild(root_1, stream_table_constraint_fk.nextTree());

                }
                stream_table_constraint_fk.reset();
                // SqlParser.g:332:3: ( $name)?
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
    // SqlParser.g:334:1: table_constraint_pk : PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
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
            // SqlParser.g:334:20: ( PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:334:22: PRIMARY KEY LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            PRIMARY355=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_table_constraint_pk2933);  
            stream_PRIMARY.add(PRIMARY355);

            KEY356=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_pk2935);  
            stream_KEY.add(KEY356);

            LPAREN357=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_pk2939);  
            stream_LPAREN.add(LPAREN357);

            pushFollow(FOLLOW_id_in_table_constraint_pk2943);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:335:30: ( COMMA indexed_columns+= id )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==COMMA) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // SqlParser.g:335:31: COMMA indexed_columns+= id
            	    {
            	    COMMA358=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_pk2946);  
            	    stream_COMMA.add(COMMA358);

            	    pushFollow(FOLLOW_id_in_table_constraint_pk2950);
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

            RPAREN359=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_pk2954);  
            stream_RPAREN.add(RPAREN359);

            // SqlParser.g:335:66: ( table_conflict_clause )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==ON) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // SqlParser.g:335:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_pk2956);
                    table_conflict_clause360=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause360.getTree());

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
            // 336:1: -> ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:336:4: ^( PRIMARY ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PRIMARY.nextNode(), root_1);

                // SqlParser.g:336:14: ^( COLUMNS ( $indexed_columns)+ )
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
                // SqlParser.g:336:43: ( table_conflict_clause )?
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
    // SqlParser.g:338:1: table_constraint_unique : UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) ;
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
            // SqlParser.g:338:24: ( UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )? -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? ) )
            // SqlParser.g:338:26: UNIQUE LPAREN indexed_columns+= id ( COMMA indexed_columns+= id )* RPAREN ( table_conflict_clause )?
            {
            UNIQUE361=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_table_constraint_unique2981);  
            stream_UNIQUE.add(UNIQUE361);

            LPAREN362=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_unique2985);  
            stream_LPAREN.add(LPAREN362);

            pushFollow(FOLLOW_id_in_table_constraint_unique2989);
            indexed_columns=id();

            state._fsp--;

            stream_id.add(indexed_columns.getTree());
            if (list_indexed_columns==null) list_indexed_columns=new ArrayList();
            list_indexed_columns.add(indexed_columns.getTree());

            // SqlParser.g:339:30: ( COMMA indexed_columns+= id )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==COMMA) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // SqlParser.g:339:31: COMMA indexed_columns+= id
            	    {
            	    COMMA363=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_unique2992);  
            	    stream_COMMA.add(COMMA363);

            	    pushFollow(FOLLOW_id_in_table_constraint_unique2996);
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

            RPAREN364=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_unique3000);  
            stream_RPAREN.add(RPAREN364);

            // SqlParser.g:339:66: ( table_conflict_clause )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==ON) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // SqlParser.g:339:66: table_conflict_clause
                    {
                    pushFollow(FOLLOW_table_conflict_clause_in_table_constraint_unique3002);
                    table_conflict_clause365=table_conflict_clause();

                    state._fsp--;

                    stream_table_conflict_clause.add(table_conflict_clause365.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: table_conflict_clause, UNIQUE, indexed_columns
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: indexed_columns
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_indexed_columns=new RewriteRuleSubtreeStream(adaptor,"token indexed_columns",list_indexed_columns);
            root_0 = (Object)adaptor.nil();
            // 340:1: -> ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
            {
                // SqlParser.g:340:4: ^( UNIQUE ^( COLUMNS ( $indexed_columns)+ ) ( table_conflict_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_UNIQUE.nextNode(), root_1);

                // SqlParser.g:340:13: ^( COLUMNS ( $indexed_columns)+ )
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
                // SqlParser.g:340:42: ( table_conflict_clause )?
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
    // SqlParser.g:342:1: table_constraint_check : CHECK LPAREN expr RPAREN ;
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
            // SqlParser.g:342:23: ( CHECK LPAREN expr RPAREN )
            // SqlParser.g:342:25: CHECK LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            CHECK366=(Token)match(input,CHECK,FOLLOW_CHECK_in_table_constraint_check3027); 
            CHECK366_tree = (Object)adaptor.create(CHECK366);
            root_0 = (Object)adaptor.becomeRoot(CHECK366_tree, root_0);

            LPAREN367=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_check3030); 
            pushFollow(FOLLOW_expr_in_table_constraint_check3033);
            expr368=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr368.getTree());
            RPAREN369=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_check3035); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
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
    // SqlParser.g:344:1: table_constraint_fk : FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) ;
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
            // SqlParser.g:344:20: ( FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause ) )
            // SqlParser.g:344:22: FOREIGN KEY LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN fk_clause
            {
            FOREIGN370=(Token)match(input,FOREIGN,FOLLOW_FOREIGN_in_table_constraint_fk3043);  
            stream_FOREIGN.add(FOREIGN370);

            KEY371=(Token)match(input,KEY,FOLLOW_KEY_in_table_constraint_fk3045);  
            stream_KEY.add(KEY371);

            LPAREN372=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_constraint_fk3047);  
            stream_LPAREN.add(LPAREN372);

            pushFollow(FOLLOW_id_in_table_constraint_fk3051);
            column_names=id();

            state._fsp--;

            stream_id.add(column_names.getTree());
            if (list_column_names==null) list_column_names=new ArrayList();
            list_column_names.add(column_names.getTree());

            // SqlParser.g:344:58: ( COMMA column_names+= id )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==COMMA) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // SqlParser.g:344:59: COMMA column_names+= id
            	    {
            	    COMMA373=(Token)match(input,COMMA,FOLLOW_COMMA_in_table_constraint_fk3054);  
            	    stream_COMMA.add(COMMA373);

            	    pushFollow(FOLLOW_id_in_table_constraint_fk3058);
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

            RPAREN374=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_constraint_fk3062);  
            stream_RPAREN.add(RPAREN374);

            pushFollow(FOLLOW_fk_clause_in_table_constraint_fk3064);
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
            // 345:1: -> ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
            {
                // SqlParser.g:345:4: ^( FOREIGN ^( COLUMNS ( $column_names)+ ) fk_clause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FOREIGN.nextNode(), root_1);

                // SqlParser.g:345:14: ^( COLUMNS ( $column_names)+ )
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
    // SqlParser.g:347:1: fk_clause : REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) ;
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
            // SqlParser.g:347:10: ( REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )? -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? ) )
            // SqlParser.g:347:12: REFERENCES foreign_table= id ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )? ( fk_clause_action )+ ( fk_clause_deferrable )?
            {
            REFERENCES376=(Token)match(input,REFERENCES,FOLLOW_REFERENCES_in_fk_clause3087);  
            stream_REFERENCES.add(REFERENCES376);

            pushFollow(FOLLOW_id_in_fk_clause3091);
            foreign_table=id();

            state._fsp--;

            stream_id.add(foreign_table.getTree());
            // SqlParser.g:347:40: ( LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==LPAREN) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // SqlParser.g:347:41: LPAREN column_names+= id ( COMMA column_names+= id )* RPAREN
                    {
                    LPAREN377=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fk_clause3094);  
                    stream_LPAREN.add(LPAREN377);

                    pushFollow(FOLLOW_id_in_fk_clause3098);
                    column_names=id();

                    state._fsp--;

                    stream_id.add(column_names.getTree());
                    if (list_column_names==null) list_column_names=new ArrayList();
                    list_column_names.add(column_names.getTree());

                    // SqlParser.g:347:65: ( COMMA column_names+= id )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==COMMA) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // SqlParser.g:347:66: COMMA column_names+= id
                    	    {
                    	    COMMA378=(Token)match(input,COMMA,FOLLOW_COMMA_in_fk_clause3101);  
                    	    stream_COMMA.add(COMMA378);

                    	    pushFollow(FOLLOW_id_in_fk_clause3105);
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

                    RPAREN379=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fk_clause3109);  
                    stream_RPAREN.add(RPAREN379);


                    }
                    break;

            }

            // SqlParser.g:348:3: ( fk_clause_action )+
            int cnt140=0;
            loop140:
            do {
                int alt140=2;
                alt140 = dfa140.predict(input);
                switch (alt140) {
            	case 1 :
            	    // SqlParser.g:348:3: fk_clause_action
            	    {
            	    pushFollow(FOLLOW_fk_clause_action_in_fk_clause3115);
            	    fk_clause_action380=fk_clause_action();

            	    state._fsp--;

            	    stream_fk_clause_action.add(fk_clause_action380.getTree());

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

            // SqlParser.g:348:21: ( fk_clause_deferrable )?
            int alt141=2;
            alt141 = dfa141.predict(input);
            switch (alt141) {
                case 1 :
                    // SqlParser.g:348:21: fk_clause_deferrable
                    {
                    pushFollow(FOLLOW_fk_clause_deferrable_in_fk_clause3118);
                    fk_clause_deferrable381=fk_clause_deferrable();

                    state._fsp--;

                    stream_fk_clause_deferrable.add(fk_clause_deferrable381.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: foreign_table, REFERENCES, fk_clause_action, column_names, fk_clause_deferrable
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
            // 349:1: -> ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
            {
                // SqlParser.g:349:4: ^( REFERENCES $foreign_table ^( COLUMNS ( $column_names)+ ) ( fk_clause_action )+ ( fk_clause_deferrable )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_REFERENCES.nextNode(), root_1);

                adaptor.addChild(root_1, stream_foreign_table.nextTree());
                // SqlParser.g:349:32: ^( COLUMNS ( $column_names)+ )
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
                // SqlParser.g:349:76: ( fk_clause_deferrable )?
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
    // SqlParser.g:351:1: fk_clause_action : ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id );
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
            // SqlParser.g:352:3: ( ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT ) | MATCH id )
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
                    // SqlParser.g:352:5: ON ( DELETE | UPDATE | INSERT ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
                    {
                    root_0 = (Object)adaptor.nil();

                    ON382=(Token)match(input,ON,FOLLOW_ON_in_fk_clause_action3152); 
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

                    // SqlParser.g:352:36: ( SET NULL | SET DEFAULT | CASCADE | RESTRICT )
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
                            // SqlParser.g:352:37: SET NULL
                            {
                            SET384=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3168); 
                            NULL385=(Token)match(input,NULL,FOLLOW_NULL_in_fk_clause_action3171); 
                            NULL385_tree = (Object)adaptor.create(NULL385);
                            adaptor.addChild(root_0, NULL385_tree);


                            }
                            break;
                        case 2 :
                            // SqlParser.g:352:49: SET DEFAULT
                            {
                            SET386=(Token)match(input,SET,FOLLOW_SET_in_fk_clause_action3175); 
                            DEFAULT387=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_fk_clause_action3178); 
                            DEFAULT387_tree = (Object)adaptor.create(DEFAULT387);
                            adaptor.addChild(root_0, DEFAULT387_tree);


                            }
                            break;
                        case 3 :
                            // SqlParser.g:352:64: CASCADE
                            {
                            CASCADE388=(Token)match(input,CASCADE,FOLLOW_CASCADE_in_fk_clause_action3182); 
                            CASCADE388_tree = (Object)adaptor.create(CASCADE388);
                            adaptor.addChild(root_0, CASCADE388_tree);


                            }
                            break;
                        case 4 :
                            // SqlParser.g:352:74: RESTRICT
                            {
                            RESTRICT389=(Token)match(input,RESTRICT,FOLLOW_RESTRICT_in_fk_clause_action3186); 
                            RESTRICT389_tree = (Object)adaptor.create(RESTRICT389);
                            adaptor.addChild(root_0, RESTRICT389_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SqlParser.g:353:5: MATCH id
                    {
                    root_0 = (Object)adaptor.nil();

                    MATCH390=(Token)match(input,MATCH,FOLLOW_MATCH_in_fk_clause_action3193); 
                    MATCH390_tree = (Object)adaptor.create(MATCH390);
                    root_0 = (Object)adaptor.becomeRoot(MATCH390_tree, root_0);

                    pushFollow(FOLLOW_id_in_fk_clause_action3196);
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
    // SqlParser.g:355:1: fk_clause_deferrable : ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? ;
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
            // SqlParser.g:355:21: ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )
            // SqlParser.g:355:23: ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            {
            root_0 = (Object)adaptor.nil();

            // SqlParser.g:355:23: ( NOT )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==NOT) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // SqlParser.g:355:24: NOT
                    {
                    NOT392=(Token)match(input,NOT,FOLLOW_NOT_in_fk_clause_deferrable3204); 
                    NOT392_tree = (Object)adaptor.create(NOT392);
                    adaptor.addChild(root_0, NOT392_tree);


                    }
                    break;

            }

            DEFERRABLE393=(Token)match(input,DEFERRABLE,FOLLOW_DEFERRABLE_in_fk_clause_deferrable3208); 
            DEFERRABLE393_tree = (Object)adaptor.create(DEFERRABLE393);
            root_0 = (Object)adaptor.becomeRoot(DEFERRABLE393_tree, root_0);

            // SqlParser.g:355:42: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
            int alt145=3;
            alt145 = dfa145.predict(input);
            switch (alt145) {
                case 1 :
                    // SqlParser.g:355:43: INITIALLY DEFERRED
                    {
                    INITIALLY394=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3212); 
                    DEFERRED395=(Token)match(input,DEFERRED,FOLLOW_DEFERRED_in_fk_clause_deferrable3215); 
                    DEFERRED395_tree = (Object)adaptor.create(DEFERRED395);
                    adaptor.addChild(root_0, DEFERRED395_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:355:65: INITIALLY IMMEDIATE
                    {
                    INITIALLY396=(Token)match(input,INITIALLY,FOLLOW_INITIALLY_in_fk_clause_deferrable3219); 
                    IMMEDIATE397=(Token)match(input,IMMEDIATE,FOLLOW_IMMEDIATE_in_fk_clause_deferrable3222); 
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
    // SqlParser.g:358:1: drop_table_stmt : DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) ;
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
            // SqlParser.g:358:16: ( DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) ) )
            // SqlParser.g:358:18: DROP TABLE ( IF EXISTS )? (database_name= id DOT )? table_name= id
            {
            DROP398=(Token)match(input,DROP,FOLLOW_DROP_in_drop_table_stmt3232);  
            stream_DROP.add(DROP398);

            TABLE399=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_table_stmt3234);  
            stream_TABLE.add(TABLE399);

            // SqlParser.g:358:29: ( IF EXISTS )?
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
                    // SqlParser.g:358:30: IF EXISTS
                    {
                    IF400=(Token)match(input,IF,FOLLOW_IF_in_drop_table_stmt3237);  
                    stream_IF.add(IF400);

                    EXISTS401=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_table_stmt3239);  
                    stream_EXISTS.add(EXISTS401);


                    }
                    break;

            }

            // SqlParser.g:358:42: (database_name= id DOT )?
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
                    // SqlParser.g:358:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_table_stmt3246);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT402=(Token)match(input,DOT,FOLLOW_DOT_in_drop_table_stmt3248);  
                    stream_DOT.add(DOT402);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_table_stmt3254);
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
            // 359:1: -> ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
            {
                // SqlParser.g:359:4: ^( DROP_TABLE ^( OPTIONS ( EXISTS )? ) ^( $table_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_TABLE, "DROP_TABLE"), root_1);

                // SqlParser.g:359:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:359:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:359:36: ^( $table_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_table_name.nextNode(), root_2);

                // SqlParser.g:359:50: ( $database_name)?
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
    // SqlParser.g:362:1: alter_table_stmt : ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) ;
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
            // SqlParser.g:362:17: ( ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def ) )
            // SqlParser.g:362:19: ALTER TABLE (database_name= id DOT )? table_name= id ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
            {
            root_0 = (Object)adaptor.nil();

            ALTER403=(Token)match(input,ALTER,FOLLOW_ALTER_in_alter_table_stmt3284); 
            ALTER403_tree = (Object)adaptor.create(ALTER403);
            adaptor.addChild(root_0, ALTER403_tree);

            TABLE404=(Token)match(input,TABLE,FOLLOW_TABLE_in_alter_table_stmt3286); 
            TABLE404_tree = (Object)adaptor.create(TABLE404);
            adaptor.addChild(root_0, TABLE404_tree);

            // SqlParser.g:362:31: (database_name= id DOT )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==ID) ) {
                int LA148_1 = input.LA(2);

                if ( (LA148_1==DOT) ) {
                    alt148=1;
                }
            }
            else if ( ((LA148_0>=ABORT && LA148_0<=WHERE)) ) {
                int LA148_2 = input.LA(2);

                if ( (LA148_2==DOT) ) {
                    alt148=1;
                }
            }
            switch (alt148) {
                case 1 :
                    // SqlParser.g:362:32: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_alter_table_stmt3291);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT405=(Token)match(input,DOT,FOLLOW_DOT_in_alter_table_stmt3293); 
                    DOT405_tree = (Object)adaptor.create(DOT405);
                    adaptor.addChild(root_0, DOT405_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_alter_table_stmt3299);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:362:69: ( RENAME TO new_table_name= id | ADD ( COLUMN )? column_def )
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
                    // SqlParser.g:362:70: RENAME TO new_table_name= id
                    {
                    RENAME406=(Token)match(input,RENAME,FOLLOW_RENAME_in_alter_table_stmt3302); 
                    RENAME406_tree = (Object)adaptor.create(RENAME406);
                    adaptor.addChild(root_0, RENAME406_tree);

                    TO407=(Token)match(input,TO,FOLLOW_TO_in_alter_table_stmt3304); 
                    TO407_tree = (Object)adaptor.create(TO407);
                    adaptor.addChild(root_0, TO407_tree);

                    pushFollow(FOLLOW_id_in_alter_table_stmt3308);
                    new_table_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, new_table_name.getTree());

                    }
                    break;
                case 2 :
                    // SqlParser.g:362:100: ADD ( COLUMN )? column_def
                    {
                    ADD408=(Token)match(input,ADD,FOLLOW_ADD_in_alter_table_stmt3312); 
                    ADD408_tree = (Object)adaptor.create(ADD408);
                    adaptor.addChild(root_0, ADD408_tree);

                    // SqlParser.g:362:104: ( COLUMN )?
                    int alt149=2;
                    int LA149_0 = input.LA(1);

                    if ( (LA149_0==COLUMN) ) {
                        alt149=1;
                    }
                    switch (alt149) {
                        case 1 :
                            // SqlParser.g:362:105: COLUMN
                            {
                            COLUMN409=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_alter_table_stmt3315); 
                            COLUMN409_tree = (Object)adaptor.create(COLUMN409);
                            adaptor.addChild(root_0, COLUMN409_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_column_def_in_alter_table_stmt3319);
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
    // SqlParser.g:365:1: create_view_stmt : CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt ;
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
            // SqlParser.g:365:17: ( CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt )
            // SqlParser.g:365:19: CREATE ( TEMPORARY )? VIEW ( IF NOT EXISTS )? (database_name= id DOT )? view_name= id AS select_stmt
            {
            root_0 = (Object)adaptor.nil();

            CREATE411=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_view_stmt3328); 
            CREATE411_tree = (Object)adaptor.create(CREATE411);
            adaptor.addChild(root_0, CREATE411_tree);

            // SqlParser.g:365:26: ( TEMPORARY )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==TEMPORARY) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // SqlParser.g:365:26: TEMPORARY
                    {
                    TEMPORARY412=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_view_stmt3330); 
                    TEMPORARY412_tree = (Object)adaptor.create(TEMPORARY412);
                    adaptor.addChild(root_0, TEMPORARY412_tree);


                    }
                    break;

            }

            VIEW413=(Token)match(input,VIEW,FOLLOW_VIEW_in_create_view_stmt3333); 
            VIEW413_tree = (Object)adaptor.create(VIEW413);
            adaptor.addChild(root_0, VIEW413_tree);

            // SqlParser.g:365:42: ( IF NOT EXISTS )?
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
                    // SqlParser.g:365:43: IF NOT EXISTS
                    {
                    IF414=(Token)match(input,IF,FOLLOW_IF_in_create_view_stmt3336); 
                    IF414_tree = (Object)adaptor.create(IF414);
                    adaptor.addChild(root_0, IF414_tree);

                    NOT415=(Token)match(input,NOT,FOLLOW_NOT_in_create_view_stmt3338); 
                    NOT415_tree = (Object)adaptor.create(NOT415);
                    adaptor.addChild(root_0, NOT415_tree);

                    EXISTS416=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_view_stmt3340); 
                    EXISTS416_tree = (Object)adaptor.create(EXISTS416);
                    adaptor.addChild(root_0, EXISTS416_tree);


                    }
                    break;

            }

            // SqlParser.g:365:59: (database_name= id DOT )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==ID) ) {
                int LA153_1 = input.LA(2);

                if ( (LA153_1==DOT) ) {
                    alt153=1;
                }
            }
            else if ( ((LA153_0>=ABORT && LA153_0<=WHERE)) ) {
                int LA153_2 = input.LA(2);

                if ( (LA153_2==DOT) ) {
                    alt153=1;
                }
            }
            switch (alt153) {
                case 1 :
                    // SqlParser.g:365:60: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_view_stmt3347);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT417=(Token)match(input,DOT,FOLLOW_DOT_in_create_view_stmt3349); 
                    DOT417_tree = (Object)adaptor.create(DOT417);
                    adaptor.addChild(root_0, DOT417_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_view_stmt3355);
            view_name=id();

            state._fsp--;

            adaptor.addChild(root_0, view_name.getTree());
            AS418=(Token)match(input,AS,FOLLOW_AS_in_create_view_stmt3357); 
            AS418_tree = (Object)adaptor.create(AS418);
            adaptor.addChild(root_0, AS418_tree);

            pushFollow(FOLLOW_select_stmt_in_create_view_stmt3359);
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
    // SqlParser.g:368:1: drop_view_stmt : DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id ;
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
            // SqlParser.g:368:15: ( DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id )
            // SqlParser.g:368:17: DROP VIEW ( IF EXISTS )? (database_name= id DOT )? view_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP420=(Token)match(input,DROP,FOLLOW_DROP_in_drop_view_stmt3367); 
            DROP420_tree = (Object)adaptor.create(DROP420);
            adaptor.addChild(root_0, DROP420_tree);

            VIEW421=(Token)match(input,VIEW,FOLLOW_VIEW_in_drop_view_stmt3369); 
            VIEW421_tree = (Object)adaptor.create(VIEW421);
            adaptor.addChild(root_0, VIEW421_tree);

            // SqlParser.g:368:27: ( IF EXISTS )?
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
                    // SqlParser.g:368:28: IF EXISTS
                    {
                    IF422=(Token)match(input,IF,FOLLOW_IF_in_drop_view_stmt3372); 
                    IF422_tree = (Object)adaptor.create(IF422);
                    adaptor.addChild(root_0, IF422_tree);

                    EXISTS423=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_view_stmt3374); 
                    EXISTS423_tree = (Object)adaptor.create(EXISTS423);
                    adaptor.addChild(root_0, EXISTS423_tree);


                    }
                    break;

            }

            // SqlParser.g:368:40: (database_name= id DOT )?
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
                    // SqlParser.g:368:41: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_view_stmt3381);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT424=(Token)match(input,DOT,FOLLOW_DOT_in_drop_view_stmt3383); 
                    DOT424_tree = (Object)adaptor.create(DOT424);
                    adaptor.addChild(root_0, DOT424_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_view_stmt3389);
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
    // SqlParser.g:371:1: create_index_stmt : CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) ;
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
            // SqlParser.g:371:18: ( CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? ) )
            // SqlParser.g:371:20: CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )? (database_name= id DOT )? index_name= id ON table_name= id LPAREN columns+= indexed_column ( COMMA columns+= indexed_column )* RPAREN
            {
            CREATE425=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_index_stmt3397);  
            stream_CREATE.add(CREATE425);

            // SqlParser.g:371:27: ( UNIQUE )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==UNIQUE) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // SqlParser.g:371:28: UNIQUE
                    {
                    UNIQUE426=(Token)match(input,UNIQUE,FOLLOW_UNIQUE_in_create_index_stmt3400);  
                    stream_UNIQUE.add(UNIQUE426);


                    }
                    break;

            }

            INDEX427=(Token)match(input,INDEX,FOLLOW_INDEX_in_create_index_stmt3404);  
            stream_INDEX.add(INDEX427);

            // SqlParser.g:371:43: ( IF NOT EXISTS )?
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
                    // SqlParser.g:371:44: IF NOT EXISTS
                    {
                    IF428=(Token)match(input,IF,FOLLOW_IF_in_create_index_stmt3407);  
                    stream_IF.add(IF428);

                    NOT429=(Token)match(input,NOT,FOLLOW_NOT_in_create_index_stmt3409);  
                    stream_NOT.add(NOT429);

                    EXISTS430=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_index_stmt3411);  
                    stream_EXISTS.add(EXISTS430);


                    }
                    break;

            }

            // SqlParser.g:371:60: (database_name= id DOT )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==ID) ) {
                int LA158_1 = input.LA(2);

                if ( (LA158_1==DOT) ) {
                    alt158=1;
                }
            }
            else if ( ((LA158_0>=ABORT && LA158_0<=WHERE)) ) {
                int LA158_2 = input.LA(2);

                if ( (LA158_2==DOT) ) {
                    alt158=1;
                }
            }
            switch (alt158) {
                case 1 :
                    // SqlParser.g:371:61: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_index_stmt3418);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT431=(Token)match(input,DOT,FOLLOW_DOT_in_create_index_stmt3420);  
                    stream_DOT.add(DOT431);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_index_stmt3426);
            index_name=id();

            state._fsp--;

            stream_id.add(index_name.getTree());
            ON432=(Token)match(input,ON,FOLLOW_ON_in_create_index_stmt3430);  
            stream_ON.add(ON432);

            pushFollow(FOLLOW_id_in_create_index_stmt3434);
            table_name=id();

            state._fsp--;

            stream_id.add(table_name.getTree());
            LPAREN433=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_index_stmt3436);  
            stream_LPAREN.add(LPAREN433);

            pushFollow(FOLLOW_indexed_column_in_create_index_stmt3440);
            columns=indexed_column();

            state._fsp--;

            stream_indexed_column.add(columns.getTree());
            if (list_columns==null) list_columns=new ArrayList();
            list_columns.add(columns.getTree());

            // SqlParser.g:372:51: ( COMMA columns+= indexed_column )*
            loop159:
            do {
                int alt159=2;
                int LA159_0 = input.LA(1);

                if ( (LA159_0==COMMA) ) {
                    alt159=1;
                }


                switch (alt159) {
            	case 1 :
            	    // SqlParser.g:372:52: COMMA columns+= indexed_column
            	    {
            	    COMMA434=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_index_stmt3443);  
            	    stream_COMMA.add(COMMA434);

            	    pushFollow(FOLLOW_indexed_column_in_create_index_stmt3447);
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

            RPAREN435=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_index_stmt3451);  
            stream_RPAREN.add(RPAREN435);



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
            // 373:1: -> ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
            {
                // SqlParser.g:373:4: ^( CREATE_INDEX ^( OPTIONS ( UNIQUE )? ( EXISTS )? ) ^( $index_name ( $database_name)? ) $table_name ( ^( COLUMNS ( $columns)+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CREATE_INDEX, "CREATE_INDEX"), root_1);

                // SqlParser.g:373:19: ^( OPTIONS ( UNIQUE )? ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:373:29: ( UNIQUE )?
                if ( stream_UNIQUE.hasNext() ) {
                    adaptor.addChild(root_2, stream_UNIQUE.nextNode());

                }
                stream_UNIQUE.reset();
                // SqlParser.g:373:37: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:373:46: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:373:60: ( $database_name)?
                if ( stream_database_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_database_name.nextTree());

                }
                stream_database_name.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_table_name.nextTree());
                // SqlParser.g:373:89: ( ^( COLUMNS ( $columns)+ ) )?
                if ( stream_columns.hasNext() ) {
                    // SqlParser.g:373:89: ^( COLUMNS ( $columns)+ )
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
    // SqlParser.g:375:1: indexed_column : column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) ;
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
            // SqlParser.g:375:15: (column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )? -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? ) )
            // SqlParser.g:375:17: column_name= id ( COLLATE collation_name= id )? ( ASC | DESC )?
            {
            pushFollow(FOLLOW_id_in_indexed_column3497);
            column_name=id();

            state._fsp--;

            stream_id.add(column_name.getTree());
            // SqlParser.g:375:32: ( COLLATE collation_name= id )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==COLLATE) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // SqlParser.g:375:33: COLLATE collation_name= id
                    {
                    COLLATE436=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_indexed_column3500);  
                    stream_COLLATE.add(COLLATE436);

                    pushFollow(FOLLOW_id_in_indexed_column3504);
                    collation_name=id();

                    state._fsp--;

                    stream_id.add(collation_name.getTree());

                    }
                    break;

            }

            // SqlParser.g:375:61: ( ASC | DESC )?
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
                    // SqlParser.g:375:62: ASC
                    {
                    ASC437=(Token)match(input,ASC,FOLLOW_ASC_in_indexed_column3509);  
                    stream_ASC.add(ASC437);


                    }
                    break;
                case 2 :
                    // SqlParser.g:375:68: DESC
                    {
                    DESC438=(Token)match(input,DESC,FOLLOW_DESC_in_indexed_column3513);  
                    stream_DESC.add(DESC438);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ASC, collation_name, DESC, column_name, COLLATE
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
            // 376:1: -> ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
            {
                // SqlParser.g:376:4: ^( $column_name ( ^( COLLATE $collation_name) )? ( ASC )? ( DESC )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_column_name.nextNode(), root_1);

                // SqlParser.g:376:19: ( ^( COLLATE $collation_name) )?
                if ( stream_collation_name.hasNext()||stream_COLLATE.hasNext() ) {
                    // SqlParser.g:376:19: ^( COLLATE $collation_name)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_COLLATE.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_collation_name.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_collation_name.reset();
                stream_COLLATE.reset();
                // SqlParser.g:376:47: ( ASC )?
                if ( stream_ASC.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASC.nextNode());

                }
                stream_ASC.reset();
                // SqlParser.g:376:52: ( DESC )?
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
    // SqlParser.g:379:1: drop_index_stmt : DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) ;
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
            // SqlParser.g:379:16: ( DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) ) )
            // SqlParser.g:379:18: DROP INDEX ( IF EXISTS )? (database_name= id DOT )? index_name= id
            {
            DROP439=(Token)match(input,DROP,FOLLOW_DROP_in_drop_index_stmt3544);  
            stream_DROP.add(DROP439);

            INDEX440=(Token)match(input,INDEX,FOLLOW_INDEX_in_drop_index_stmt3546);  
            stream_INDEX.add(INDEX440);

            // SqlParser.g:379:29: ( IF EXISTS )?
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
                    // SqlParser.g:379:30: IF EXISTS
                    {
                    IF441=(Token)match(input,IF,FOLLOW_IF_in_drop_index_stmt3549);  
                    stream_IF.add(IF441);

                    EXISTS442=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_index_stmt3551);  
                    stream_EXISTS.add(EXISTS442);


                    }
                    break;

            }

            // SqlParser.g:379:42: (database_name= id DOT )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==ID) ) {
                int LA163_1 = input.LA(2);

                if ( (LA163_1==DOT) ) {
                    alt163=1;
                }
            }
            else if ( ((LA163_0>=ABORT && LA163_0<=WHERE)) ) {
                int LA163_2 = input.LA(2);

                if ( (LA163_2==DOT) ) {
                    alt163=1;
                }
            }
            switch (alt163) {
                case 1 :
                    // SqlParser.g:379:43: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_index_stmt3558);
                    database_name=id();

                    state._fsp--;

                    stream_id.add(database_name.getTree());
                    DOT443=(Token)match(input,DOT,FOLLOW_DOT_in_drop_index_stmt3560);  
                    stream_DOT.add(DOT443);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_index_stmt3566);
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
            // 380:1: -> ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
            {
                // SqlParser.g:380:4: ^( DROP_INDEX ^( OPTIONS ( EXISTS )? ) ^( $index_name ( $database_name)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DROP_INDEX, "DROP_INDEX"), root_1);

                // SqlParser.g:380:17: ^( OPTIONS ( EXISTS )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTIONS, "OPTIONS"), root_2);

                // SqlParser.g:380:27: ( EXISTS )?
                if ( stream_EXISTS.hasNext() ) {
                    adaptor.addChild(root_2, stream_EXISTS.nextNode());

                }
                stream_EXISTS.reset();

                adaptor.addChild(root_1, root_2);
                }
                // SqlParser.g:380:36: ^( $index_name ( $database_name)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_index_name.nextNode(), root_2);

                // SqlParser.g:380:50: ( $database_name)?
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
    // SqlParser.g:383:1: create_trigger_stmt : CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END ;
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
            // SqlParser.g:383:20: ( CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END )
            // SqlParser.g:383:22: CREATE ( TEMPORARY )? TRIGGER ( IF NOT EXISTS )? (database_name= id DOT )? trigger_name= id ( BEFORE | AFTER | INSTEAD OF )? ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? ) ON table_name= id ( FOR EACH ROW )? ( WHEN expr )? BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+ END
            {
            root_0 = (Object)adaptor.nil();

            CREATE444=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_trigger_stmt3596); 
            CREATE444_tree = (Object)adaptor.create(CREATE444);
            adaptor.addChild(root_0, CREATE444_tree);

            // SqlParser.g:383:29: ( TEMPORARY )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==TEMPORARY) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // SqlParser.g:383:29: TEMPORARY
                    {
                    TEMPORARY445=(Token)match(input,TEMPORARY,FOLLOW_TEMPORARY_in_create_trigger_stmt3598); 
                    TEMPORARY445_tree = (Object)adaptor.create(TEMPORARY445);
                    adaptor.addChild(root_0, TEMPORARY445_tree);


                    }
                    break;

            }

            TRIGGER446=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_create_trigger_stmt3601); 
            TRIGGER446_tree = (Object)adaptor.create(TRIGGER446);
            adaptor.addChild(root_0, TRIGGER446_tree);

            // SqlParser.g:383:48: ( IF NOT EXISTS )?
            int alt165=2;
            alt165 = dfa165.predict(input);
            switch (alt165) {
                case 1 :
                    // SqlParser.g:383:49: IF NOT EXISTS
                    {
                    IF447=(Token)match(input,IF,FOLLOW_IF_in_create_trigger_stmt3604); 
                    IF447_tree = (Object)adaptor.create(IF447);
                    adaptor.addChild(root_0, IF447_tree);

                    NOT448=(Token)match(input,NOT,FOLLOW_NOT_in_create_trigger_stmt3606); 
                    NOT448_tree = (Object)adaptor.create(NOT448);
                    adaptor.addChild(root_0, NOT448_tree);

                    EXISTS449=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_create_trigger_stmt3608); 
                    EXISTS449_tree = (Object)adaptor.create(EXISTS449);
                    adaptor.addChild(root_0, EXISTS449_tree);


                    }
                    break;

            }

            // SqlParser.g:383:65: (database_name= id DOT )?
            int alt166=2;
            alt166 = dfa166.predict(input);
            switch (alt166) {
                case 1 :
                    // SqlParser.g:383:66: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_create_trigger_stmt3615);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT450=(Token)match(input,DOT,FOLLOW_DOT_in_create_trigger_stmt3617); 
                    DOT450_tree = (Object)adaptor.create(DOT450);
                    adaptor.addChild(root_0, DOT450_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_create_trigger_stmt3623);
            trigger_name=id();

            state._fsp--;

            adaptor.addChild(root_0, trigger_name.getTree());
            // SqlParser.g:384:3: ( BEFORE | AFTER | INSTEAD OF )?
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
                    // SqlParser.g:384:4: BEFORE
                    {
                    BEFORE451=(Token)match(input,BEFORE,FOLLOW_BEFORE_in_create_trigger_stmt3628); 
                    BEFORE451_tree = (Object)adaptor.create(BEFORE451);
                    adaptor.addChild(root_0, BEFORE451_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:384:13: AFTER
                    {
                    AFTER452=(Token)match(input,AFTER,FOLLOW_AFTER_in_create_trigger_stmt3632); 
                    AFTER452_tree = (Object)adaptor.create(AFTER452);
                    adaptor.addChild(root_0, AFTER452_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:384:21: INSTEAD OF
                    {
                    INSTEAD453=(Token)match(input,INSTEAD,FOLLOW_INSTEAD_in_create_trigger_stmt3636); 
                    INSTEAD453_tree = (Object)adaptor.create(INSTEAD453);
                    adaptor.addChild(root_0, INSTEAD453_tree);

                    OF454=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3638); 
                    OF454_tree = (Object)adaptor.create(OF454);
                    adaptor.addChild(root_0, OF454_tree);


                    }
                    break;

            }

            // SqlParser.g:384:34: ( DELETE | INSERT | UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )? )
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
                    // SqlParser.g:384:35: DELETE
                    {
                    DELETE455=(Token)match(input,DELETE,FOLLOW_DELETE_in_create_trigger_stmt3643); 
                    DELETE455_tree = (Object)adaptor.create(DELETE455);
                    adaptor.addChild(root_0, DELETE455_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:384:44: INSERT
                    {
                    INSERT456=(Token)match(input,INSERT,FOLLOW_INSERT_in_create_trigger_stmt3647); 
                    INSERT456_tree = (Object)adaptor.create(INSERT456);
                    adaptor.addChild(root_0, INSERT456_tree);


                    }
                    break;
                case 3 :
                    // SqlParser.g:384:53: UPDATE ( OF column_names+= id ( COMMA column_names+= id )* )?
                    {
                    UPDATE457=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_create_trigger_stmt3651); 
                    UPDATE457_tree = (Object)adaptor.create(UPDATE457);
                    adaptor.addChild(root_0, UPDATE457_tree);

                    // SqlParser.g:384:60: ( OF column_names+= id ( COMMA column_names+= id )* )?
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==OF) ) {
                        alt169=1;
                    }
                    switch (alt169) {
                        case 1 :
                            // SqlParser.g:384:61: OF column_names+= id ( COMMA column_names+= id )*
                            {
                            OF458=(Token)match(input,OF,FOLLOW_OF_in_create_trigger_stmt3654); 
                            OF458_tree = (Object)adaptor.create(OF458);
                            adaptor.addChild(root_0, OF458_tree);

                            pushFollow(FOLLOW_id_in_create_trigger_stmt3658);
                            column_names=id();

                            state._fsp--;

                            adaptor.addChild(root_0, column_names.getTree());
                            if (list_column_names==null) list_column_names=new ArrayList();
                            list_column_names.add(column_names.getTree());

                            // SqlParser.g:384:81: ( COMMA column_names+= id )*
                            loop168:
                            do {
                                int alt168=2;
                                int LA168_0 = input.LA(1);

                                if ( (LA168_0==COMMA) ) {
                                    alt168=1;
                                }


                                switch (alt168) {
                            	case 1 :
                            	    // SqlParser.g:384:82: COMMA column_names+= id
                            	    {
                            	    COMMA459=(Token)match(input,COMMA,FOLLOW_COMMA_in_create_trigger_stmt3661); 
                            	    COMMA459_tree = (Object)adaptor.create(COMMA459);
                            	    adaptor.addChild(root_0, COMMA459_tree);

                            	    pushFollow(FOLLOW_id_in_create_trigger_stmt3665);
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

            ON460=(Token)match(input,ON,FOLLOW_ON_in_create_trigger_stmt3674); 
            ON460_tree = (Object)adaptor.create(ON460);
            adaptor.addChild(root_0, ON460_tree);

            pushFollow(FOLLOW_id_in_create_trigger_stmt3678);
            table_name=id();

            state._fsp--;

            adaptor.addChild(root_0, table_name.getTree());
            // SqlParser.g:385:20: ( FOR EACH ROW )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==FOR) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // SqlParser.g:385:21: FOR EACH ROW
                    {
                    FOR461=(Token)match(input,FOR,FOLLOW_FOR_in_create_trigger_stmt3681); 
                    FOR461_tree = (Object)adaptor.create(FOR461);
                    adaptor.addChild(root_0, FOR461_tree);

                    EACH462=(Token)match(input,EACH,FOLLOW_EACH_in_create_trigger_stmt3683); 
                    EACH462_tree = (Object)adaptor.create(EACH462);
                    adaptor.addChild(root_0, EACH462_tree);

                    ROW463=(Token)match(input,ROW,FOLLOW_ROW_in_create_trigger_stmt3685); 
                    ROW463_tree = (Object)adaptor.create(ROW463);
                    adaptor.addChild(root_0, ROW463_tree);


                    }
                    break;

            }

            // SqlParser.g:385:36: ( WHEN expr )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==WHEN) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // SqlParser.g:385:37: WHEN expr
                    {
                    WHEN464=(Token)match(input,WHEN,FOLLOW_WHEN_in_create_trigger_stmt3690); 
                    WHEN464_tree = (Object)adaptor.create(WHEN464);
                    adaptor.addChild(root_0, WHEN464_tree);

                    pushFollow(FOLLOW_expr_in_create_trigger_stmt3692);
                    expr465=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr465.getTree());

                    }
                    break;

            }

            BEGIN466=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_create_trigger_stmt3698); 
            BEGIN466_tree = (Object)adaptor.create(BEGIN466);
            adaptor.addChild(root_0, BEGIN466_tree);

            // SqlParser.g:386:9: ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI )+
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
            	    // SqlParser.g:386:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt ) SEMI
            	    {
            	    // SqlParser.g:386:10: ( update_stmt | insert_stmt | delete_stmt | select_stmt )
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
            	            // SqlParser.g:386:11: update_stmt
            	            {
            	            pushFollow(FOLLOW_update_stmt_in_create_trigger_stmt3702);
            	            update_stmt467=update_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, update_stmt467.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // SqlParser.g:386:25: insert_stmt
            	            {
            	            pushFollow(FOLLOW_insert_stmt_in_create_trigger_stmt3706);
            	            insert_stmt468=insert_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, insert_stmt468.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // SqlParser.g:386:39: delete_stmt
            	            {
            	            pushFollow(FOLLOW_delete_stmt_in_create_trigger_stmt3710);
            	            delete_stmt469=delete_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, delete_stmt469.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // SqlParser.g:386:53: select_stmt
            	            {
            	            pushFollow(FOLLOW_select_stmt_in_create_trigger_stmt3714);
            	            select_stmt470=select_stmt();

            	            state._fsp--;

            	            adaptor.addChild(root_0, select_stmt470.getTree());

            	            }
            	            break;

            	    }

            	    SEMI471=(Token)match(input,SEMI,FOLLOW_SEMI_in_create_trigger_stmt3717); 
            	    SEMI471_tree = (Object)adaptor.create(SEMI471);
            	    adaptor.addChild(root_0, SEMI471_tree);


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

            END472=(Token)match(input,END,FOLLOW_END_in_create_trigger_stmt3721); 
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
    // SqlParser.g:389:1: drop_trigger_stmt : DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id ;
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
            // SqlParser.g:389:18: ( DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id )
            // SqlParser.g:389:20: DROP TRIGGER ( IF EXISTS )? (database_name= id DOT )? trigger_name= id
            {
            root_0 = (Object)adaptor.nil();

            DROP473=(Token)match(input,DROP,FOLLOW_DROP_in_drop_trigger_stmt3729); 
            DROP473_tree = (Object)adaptor.create(DROP473);
            adaptor.addChild(root_0, DROP473_tree);

            TRIGGER474=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_drop_trigger_stmt3731); 
            TRIGGER474_tree = (Object)adaptor.create(TRIGGER474);
            adaptor.addChild(root_0, TRIGGER474_tree);

            // SqlParser.g:389:33: ( IF EXISTS )?
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
                    // SqlParser.g:389:34: IF EXISTS
                    {
                    IF475=(Token)match(input,IF,FOLLOW_IF_in_drop_trigger_stmt3734); 
                    IF475_tree = (Object)adaptor.create(IF475);
                    adaptor.addChild(root_0, IF475_tree);

                    EXISTS476=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_trigger_stmt3736); 
                    EXISTS476_tree = (Object)adaptor.create(EXISTS476);
                    adaptor.addChild(root_0, EXISTS476_tree);


                    }
                    break;

            }

            // SqlParser.g:389:46: (database_name= id DOT )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==ID) ) {
                int LA176_1 = input.LA(2);

                if ( (LA176_1==DOT) ) {
                    alt176=1;
                }
            }
            else if ( ((LA176_0>=ABORT && LA176_0<=WHERE)) ) {
                int LA176_2 = input.LA(2);

                if ( (LA176_2==DOT) ) {
                    alt176=1;
                }
            }
            switch (alt176) {
                case 1 :
                    // SqlParser.g:389:47: database_name= id DOT
                    {
                    pushFollow(FOLLOW_id_in_drop_trigger_stmt3743);
                    database_name=id();

                    state._fsp--;

                    adaptor.addChild(root_0, database_name.getTree());
                    DOT477=(Token)match(input,DOT,FOLLOW_DOT_in_drop_trigger_stmt3745); 
                    DOT477_tree = (Object)adaptor.create(DOT477);
                    adaptor.addChild(root_0, DOT477_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_drop_trigger_stmt3751);
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
    // SqlParser.g:394:1: id : ( ID | keyword );
    public final SqlParser.id_return id() throws RecognitionException {
        SqlParser.id_return retval = new SqlParser.id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID478=null;
        SqlParser.keyword_return keyword479 = null;


        Object ID478_tree=null;

        try {
            // SqlParser.g:394:3: ( ID | keyword )
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==ID) ) {
                alt177=1;
            }
            else if ( ((LA177_0>=ABORT && LA177_0<=WHERE)) ) {
                alt177=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 177, 0, input);

                throw nvae;
            }
            switch (alt177) {
                case 1 :
                    // SqlParser.g:394:5: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID478=(Token)match(input,ID,FOLLOW_ID_in_id3761); 
                    ID478_tree = (Object)adaptor.create(ID478);
                    adaptor.addChild(root_0, ID478_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:394:10: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_id3765);
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
    // SqlParser.g:396:1: keyword : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_return keyword() throws RecognitionException {
        SqlParser.keyword_return retval = new SqlParser.keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set480=null;

        Object set480_tree=null;

        try {
            // SqlParser.g:396:8: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:396:10: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COLUMN | COMMIT | CONFLICT | CONSTRAINT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
            {
            root_0 = (Object)adaptor.nil();

            set480=(Token)input.LT(1);
            if ( (input.LA(1)>=ABORT && input.LA(1)<=WHERE) ) {
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
    // SqlParser.g:515:1: id_column_def : ( ID | keyword_column_def );
    public final SqlParser.id_column_def_return id_column_def() throws RecognitionException {
        SqlParser.id_column_def_return retval = new SqlParser.id_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID481=null;
        SqlParser.keyword_column_def_return keyword_column_def482 = null;


        Object ID481_tree=null;

        try {
            // SqlParser.g:515:14: ( ID | keyword_column_def )
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
                    // SqlParser.g:515:16: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID481=(Token)match(input,ID,FOLLOW_ID_in_id_column_def4479); 
                    ID481_tree = (Object)adaptor.create(ID481);
                    adaptor.addChild(root_0, ID481_tree);


                    }
                    break;
                case 2 :
                    // SqlParser.g:515:21: keyword_column_def
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_column_def_in_id_column_def4483);
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
    // SqlParser.g:517:1: keyword_column_def : ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) ;
    public final SqlParser.keyword_column_def_return keyword_column_def() throws RecognitionException {
        SqlParser.keyword_column_def_return retval = new SqlParser.keyword_column_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set483=null;

        Object set483_tree=null;

        try {
            // SqlParser.g:517:19: ( ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE ) )
            // SqlParser.g:517:21: ( ABORT | ADD | AFTER | ALL | ALTER | ANALYZE | AND | AS | ASC | ATTACH | AUTOINCREMENT | BEFORE | BEGIN | BETWEEN | BY | CASCADE | CASE | CAST | CHECK | COLLATE | COMMIT | CONFLICT | CREATE | CROSS | CURRENT_TIME | CURRENT_DATE | CURRENT_TIMESTAMP | DATABASE | DEFAULT | DEFERRABLE | DEFERRED | DELETE | DESC | DETACH | DISTINCT | DROP | EACH | ELSE | END | ESCAPE | EXCEPT | EXCLUSIVE | EXISTS | EXPLAIN | FAIL | FOR | FOREIGN | FROM | GLOB | GROUP | HAVING | IF | IGNORE | IMMEDIATE | IN | INDEX | INDEXED | INITIALLY | INNER | INSERT | INSTEAD | INTERSECT | INTO | IS | ISNULL | JOIN | KEY | LEFT | LIKE | LIMIT | MATCH | NATURAL | NOT | NOTNULL | NULL | OF | OFFSET | ON | OR | ORDER | OUTER | PLAN | PRAGMA | PRIMARY | QUERY | RAISE | REFERENCES | REGEXP | REINDEX | RELEASE | RENAME | REPLACE | RESTRICT | ROLLBACK | ROW | SAVEPOINT | SELECT | SET | TABLE | TEMPORARY | THEN | TO | TRANSACTION | TRIGGER | UNION | UNIQUE | UPDATE | USING | VACUUM | VALUES | VIEW | VIRTUAL | WHEN | WHERE )
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA118 dfa118 = new DFA118(this);
    protected DFA121 dfa121 = new DFA121(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA125 dfa125 = new DFA125(this);
    protected DFA126 dfa126 = new DFA126(this);
    protected DFA127 dfa127 = new DFA127(this);
    protected DFA128 dfa128 = new DFA128(this);
    protected DFA129 dfa129 = new DFA129(this);
    protected DFA130 dfa130 = new DFA130(this);
    protected DFA140 dfa140 = new DFA140(this);
    protected DFA141 dfa141 = new DFA141(this);
    protected DFA145 dfa145 = new DFA145(this);
    protected DFA165 dfa165 = new DFA165(this);
    protected DFA166 dfa166 = new DFA166(this);
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
            return "()+ loopback of 58:16: ( sql_stmt )+";
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
            return "60:11: ( EXPLAIN ( QUERY PLAN )? )?";
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
            return "60:20: ( QUERY PLAN )?";
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
        "\1\14\1\15\1\16\1\17\2\uffff\1\23\1\20\1\uffff\1\24\1\30\1\26\1"+
        "\uffff\1\21\1\22\1\25\1\27\1\31\3\uffff";
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
            "\1\30\52\uffff\1\32\1\25\3\uffff\1\27\1\uffff\1\30\4\uffff"+
            "\1\26\1\24",
            "\1\35\52\uffff\1\33\4\uffff\1\36\6\uffff\1\34",
            "",
            "",
            "\1\32\4\uffff\1\27\6\uffff\1\26",
            "",
            "",
            "",
            "",
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
            return "62:1: sql_stmt_core : ( pragma_stmt | attach_stmt | detach_stmt | analyze_stmt | reindex_stmt | vacuum_stmt | select_stmt | insert_stmt | update_stmt | delete_stmt | begin_stmt | commit_stmt | rollback_stmt | savepoint_stmt | release_stmt | create_virtual_table_stmt | create_table_stmt | drop_table_stmt | alter_table_stmt | create_view_stmt | drop_view_stmt | create_index_stmt | drop_index_stmt | create_trigger_stmt | drop_trigger_stmt );";
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
            return "92:23: (database_name= id DOT )?";
        }
    }
    static final String DFA8_eotS =
        "\165\uffff";
    static final String DFA8_eofS =
        "\165\uffff";
    static final String DFA8_minS =
        "\1\27\33\uffff\1\21\35\uffff\1\30\1\uffff\1\21\6\30\62\uffff";
    static final String DFA8_maxS =
        "\1\u00af\33\uffff\1\u00b4\35\uffff\1\u00af\1\uffff\1\u00b4\1\110"+
        "\3\u009c\1\110\1\u00b1\62\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\34\uffff\1\1\126\uffff";
    static final String DFA8_specialS =
        "\165\uffff}>";
    static final String[] DFA8_transitionS = {
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
            "\30\36\1\76\10\36\1\74\1\uffff\3\36\1\uffff\2\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\uffff\3\1\1\uffff\2\1",
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
            return "()* loopback of 96:18: ( OR or_subexpr )*";
        }
    }
    static final String DFA9_eotS =
        "\166\uffff";
    static final String DFA9_eofS =
        "\166\uffff";
    static final String DFA9_minS =
        "\1\27\34\uffff\1\21\35\uffff\1\30\1\uffff\1\21\6\30\62\uffff";
    static final String DFA9_maxS =
        "\1\u00af\34\uffff\1\u00b4\35\uffff\1\u00af\1\uffff\1\u00b4\1\110"+
        "\3\u009c\1\110\1\u00b1\62\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\35\uffff\1\1\126\uffff";
    static final String DFA9_specialS =
        "\166\uffff}>";
    static final String[] DFA9_transitionS = {
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
            "\3\37\3\uffff\1\1\1\uffff\1\1\1\37\1\1\3\37\33\uffff\52\37"+
            "\1\101\6\37\1\73\1\37\1\76\13\37\1\100\7\37\1\103\11\37\1\102"+
            "\30\37\1\77\10\37\1\75\1\uffff\3\37\1\uffff\2\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\3\1\4\uffff\1\37\1\uffff\1\1\1\uffff\3\1\33\uffff\164\1\1"+
            "\uffff\3\1\1\uffff\2\1",
            "\1\37\57\uffff\1\1",
            "\1\37\44\uffff\1\1\136\uffff\1\1",
            "\1\37\u0083\uffff\1\1",
            "\1\37\u0083\uffff\1\1",
            "\1\37\57\uffff\1\1",
            "\1\37\u0098\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 98:25: ( AND and_subexpr )*";
        }
    }
    static final String DFA11_eotS =
        "\101\uffff";
    static final String DFA11_eofS =
        "\101\uffff";
    static final String DFA11_minS =
        "\2\21\77\uffff";
    static final String DFA11_maxS =
        "\2\u00b4\77\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\34\uffff\1\3\1\uffff\1\1\37\uffff";
    static final String DFA11_specialS =
        "\101\uffff}>";
    static final String[] DFA11_transitionS = {
            "\3\2\6\uffff\1\2\1\37\3\2\33\uffff\142\2\1\1\21\2\1\uffff\3"+
            "\2\1\uffff\2\2",
            "\4\41\3\uffff\1\2\1\uffff\1\41\1\uffff\3\41\33\uffff\164\41"+
            "\1\uffff\3\41\1\uffff\2\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "101:12: ( select_stmt | expr ( COMMA expr )* )?";
        }
    }
    static final String DFA12_eotS =
        "\101\uffff";
    static final String DFA12_eofS =
        "\101\uffff";
    static final String DFA12_minS =
        "\1\72\2\27\76\uffff";
    static final String DFA12_maxS =
        "\3\u00af\76\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\1\1\2\74\uffff";
    static final String DFA12_specialS =
        "\101\uffff}>";
    static final String[] DFA12_transitionS = {
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
            return "102:5: (database_name= id DOT )?";
        }
    }
    static final String DFA21_eotS =
        "\u0152\uffff";
    static final String DFA21_eofS =
        "\u0152\uffff";
    static final String DFA21_minS =
        "\1\21\1\30\22\uffff\4\21\1\30\2\27\1\30\1\21\22\uffff\1\21\1\30"+
        "\4\21\u011d\uffff";
    static final String DFA21_maxS =
        "\2\u00b4\22\uffff\4\u00b4\3\u00af\1\u0086\1\u00b4\22\uffff\1\u00b4"+
        "\1\u00af\4\u00b4\u011d\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\1\64\uffff\1\2\124\uffff\1\3\2\uffff\1\4\101\uffff\1"+
        "\5\u0080\uffff";
    static final String DFA21_specialS =
        "\u0152\uffff}>";
    static final String[] DFA21_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\3\2\33\uffff\15\2\1\34\44\2\1\25\5"+
            "\2\1\30\10\2\1\33\1\31\3\2\1\24\1\2\1\27\1\2\1\1\1\32\15\2\1"+
            "\26\32\2\1\uffff\3\2\1\uffff\2\2",
            "\1\2\1\uffff\1\2\1\uffff\3\2\33\uffff\15\2\1\57\44\2\1\62\5"+
            "\2\1\60\15\2\1\61\1\2\1\64\20\2\1\63\32\2\1\uffff\3\2\1\uffff"+
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\67\4\uffff\1\2\1\uffff\1\67\1\uffff\3\67\33\uffff\164\67"+
            "\1\uffff\3\67\1\uffff\2\67",
            "\3\67\4\uffff\1\2\1\uffff\1\67\1\uffff\3\67\33\uffff\164\67"+
            "\1\uffff\3\67\1\uffff\2\67",
            "\3\67\4\uffff\1\2\1\uffff\1\67\1\uffff\3\67\33\uffff\164\67"+
            "\1\uffff\3\67\1\uffff\2\67",
            "\3\67\4\uffff\1\2\1\uffff\1\67\1\uffff\3\67\33\uffff\164\67"+
            "\1\uffff\3\67\1\uffff\2\67",
            "\1\2\1\uffff\1\u008c\37\uffff\164\u008c\1\uffff\1\u008c",
            "\1\u008f\1\2\1\u008f\1\uffff\1\u008f\36\uffff\164\u008f\1\uffff"+
            "\1\u008f",
            "\1\u008f\1\2\1\u008f\1\uffff\1\u008f\36\uffff\164\u008f\1\uffff"+
            "\1\u008f",
            "\1\2\153\uffff\1\u008f\1\uffff\1\u008f",
            "\3\u00d1\4\uffff\1\2\1\uffff\1\u00d1\1\uffff\3\u00d1\33\uffff"+
            "\164\u00d1\1\uffff\3\u00d1\1\uffff\2\u00d1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\3\u00d1\4\uffff\1\2\1\uffff\1\u00d1\1\uffff\3\u00d1\33\uffff"+
            "\164\u00d1\1\uffff\3\u00d1\1\uffff\2\u00d1",
            "\1\2\1\uffff\1\u008c\37\uffff\164\u008c\1\uffff\1\u008c",
            "\3\67\4\uffff\1\2\1\uffff\1\67\1\uffff\3\67\33\uffff\164\67"+
            "\1\uffff\3\67\1\uffff\2\67",
            "\3\67\4\uffff\1\2\1\uffff\1\67\1\uffff\3\67\33\uffff\164\67"+
            "\1\uffff\3\67\1\uffff\2\67",
            "\3\67\4\uffff\1\2\1\uffff\1\67\1\uffff\3\67\33\uffff\164\67"+
            "\1\uffff\3\67\1\uffff\2\67",
            "\3\67\4\uffff\1\2\1\uffff\1\67\1\uffff\3\67\33\uffff\164\67"+
            "\1\uffff\3\67\1\uffff\2\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "105:1: and_subexpr : ( eq_subexpr ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )* | ( NOT )? op= ( LIKE | GLOB | REGEXP | MATCH ) eq_subexpr ( ESCAPE escape_subexpr= eq_subexpr )? -> ^( $op eq_subexpr ( NOT )? ( ^( ESCAPE $escape_subexpr) )? ) | ( NOT )? IN in_source | ( ISNULL -> IS_NULL | NOTNULL -> NOT_NULL | IS NULL -> IS_NULL | IS NOT NULL -> NOT_NULL ) | ( NOT )? BETWEEN e1= eq_subexpr AND e2= eq_subexpr -> ^( BETWEEN $e1 $e2 ( NOT )? ) );";
        }
    }
    static final String DFA14_eotS =
        "\40\uffff";
    static final String DFA14_eofS =
        "\40\uffff";
    static final String DFA14_minS =
        "\1\4\37\uffff";
    static final String DFA14_maxS =
        "\1\u00af\37\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\2\35\uffff\1\1";
    static final String DFA14_specialS =
        "\40\uffff}>";
    static final String[] DFA14_transitionS = {
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
            return "()* loopback of 106:16: ( ( EQUALS | EQUALS2 | NOT_EQUALS | NOT_EQUALS2 ) eq_subexpr )*";
        }
    }
    static final String DFA17_eotS =
        "\156\uffff";
    static final String DFA17_eofS =
        "\156\uffff";
    static final String DFA17_minS =
        "\1\27\1\21\61\uffff\1\30\1\uffff\1\21\6\30\62\uffff";
    static final String DFA17_maxS =
        "\1\u00af\1\u00b4\61\uffff\1\u00af\1\uffff\1\u00b4\1\110\3\u009c"+
        "\1\110\1\u00b1\62\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\35\uffff\1\1\115\uffff";
    static final String DFA17_specialS =
        "\156\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\uffff\1\2\1\uffff\1\2\36\uffff\51\2\1\1\112\2\1\uffff"+
            "\1\2",
            "\3\40\3\uffff\1\2\1\uffff\1\2\1\40\1\2\3\40\33\uffff\52\40"+
            "\1\71\6\40\1\63\1\40\1\66\13\40\1\70\7\40\1\73\11\40\1\72\30"+
            "\40\1\67\10\40\1\65\1\uffff\3\40\1\uffff\2\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40\1\uffff\1\2\37\uffff\164\2\1\uffff\1\2",
            "",
            "\3\2\4\uffff\1\40\1\uffff\1\2\1\uffff\3\2\33\uffff\164\2\1"+
            "\uffff\3\2\1\uffff\2\2",
            "\1\40\57\uffff\1\2",
            "\1\40\44\uffff\1\2\136\uffff\1\2",
            "\1\40\u0083\uffff\1\2",
            "\1\40\u0083\uffff\1\2",
            "\1\40\57\uffff\1\2",
            "\1\40\u0098\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "107:55: ( ESCAPE escape_subexpr= eq_subexpr )?";
        }
    }
    static final String DFA22_eotS =
        "\42\uffff";
    static final String DFA22_eofS =
        "\42\uffff";
    static final String DFA22_minS =
        "\1\4\41\uffff";
    static final String DFA22_maxS =
        "\1\u00af\41\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\37\uffff\1\1";
    static final String DFA22_specialS =
        "\42\uffff}>";
    static final String[] DFA22_transitionS = {
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
            return "()* loopback of 113:25: ( ( LESS | LESS_OR_EQ | GREATER | GREATER_OR_EQ ) neq_subexpr )*";
        }
    }
    static final String DFA23_eotS =
        "\43\uffff";
    static final String DFA23_eofS =
        "\43\uffff";
    static final String DFA23_minS =
        "\1\4\42\uffff";
    static final String DFA23_maxS =
        "\1\u00af\42\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\2\40\uffff\1\1";
    static final String DFA23_specialS =
        "\43\uffff}>";
    static final String[] DFA23_transitionS = {
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
            return "()* loopback of 115:26: ( ( SHIFT_LEFT | SHIFT_RIGHT | AMPERSAND | PIPE ) bit_subexpr )*";
        }
    }
    static final String DFA24_eotS =
        "\44\uffff";
    static final String DFA24_eofS =
        "\44\uffff";
    static final String DFA24_minS =
        "\1\4\43\uffff";
    static final String DFA24_maxS =
        "\1\u00af\43\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\1\2\41\uffff\1\1";
    static final String DFA24_specialS =
        "\44\uffff}>";
    static final String[] DFA24_transitionS = {
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
            return "()* loopback of 117:26: ( ( PLUS | MINUS ) add_subexpr )*";
        }
    }
    static final String DFA25_eotS =
        "\45\uffff";
    static final String DFA25_eofS =
        "\45\uffff";
    static final String DFA25_minS =
        "\1\4\44\uffff";
    static final String DFA25_maxS =
        "\1\u00af\44\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\42\uffff\1\1";
    static final String DFA25_specialS =
        "\45\uffff}>";
    static final String[] DFA25_transitionS = {
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
            return "()* loopback of 119:26: ( ( ASTERISK | SLASH | PERCENT ) mul_subexpr )*";
        }
    }
    static final String DFA26_eotS =
        "\46\uffff";
    static final String DFA26_eofS =
        "\46\uffff";
    static final String DFA26_minS =
        "\1\4\45\uffff";
    static final String DFA26_maxS =
        "\1\u00af\45\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\43\uffff\1\1";
    static final String DFA26_specialS =
        "\46\uffff}>";
    static final String[] DFA26_transitionS = {
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
            return "()* loopback of 121:26: ( DOUBLE_PIPE con_subexpr )*";
        }
    }
    static final String DFA27_eotS =
        "\50\uffff";
    static final String DFA27_eofS =
        "\50\uffff";
    static final String DFA27_minS =
        "\1\21\1\30\46\uffff";
    static final String DFA27_maxS =
        "\2\u00b4\46\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\13\uffff\1\1\31\uffff";
    static final String DFA27_specialS =
        "\50\uffff}>";
    static final String[] DFA27_transitionS = {
            "\3\16\6\uffff\1\2\1\uffff\3\2\33\uffff\112\2\1\1\51\2\1\uffff"+
            "\3\2\1\uffff\2\2",
            "\1\2\1\uffff\1\16\1\uffff\3\16\33\uffff\164\16\1\uffff\3\16"+
            "\1\uffff\2\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "123:14: ( PLUS | MINUS | TILDA | NOT )?";
        }
    }
    static final String DFA28_eotS =
        "\63\uffff";
    static final String DFA28_eofS =
        "\63\uffff";
    static final String DFA28_minS =
        "\1\4\1\27\61\uffff";
    static final String DFA28_maxS =
        "\2\u00af\61\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\44\uffff\1\1\13\uffff";
    static final String DFA28_specialS =
        "\63\uffff}>";
    static final String[] DFA28_transitionS = {
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
            return "125:26: ( COLLATE collation_name= ID )?";
        }
    }
    static final String DFA38_eotS =
        "\u013b\uffff";
    static final String DFA38_eofS =
        "\u013b\uffff";
    static final String DFA38_minS =
        "\1\32\4\uffff\4\4\3\uffff\1\4\1\30\1\21\1\30\1\21\1\30\u00e3\uffff"+
        "\1\21\105\uffff";
    static final String DFA38_maxS =
        "\1\u00b4\4\uffff\4\u00af\3\uffff\1\u00af\1\32\1\u00b4\1\32\1\u00b4"+
        "\1\32\u00e3\uffff\1\u00b4\105\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\10\uffff\1\3\u009c\uffff\1\4\47\uffff\1"+
        "\6\1\uffff\1\5\36\uffff\1\7\1\uffff\1\10\35\uffff\1\11\42\uffff";
    static final String DFA38_specialS =
        "\u013b\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\16\1\uffff\3\11\33\uffff\20\22\1\20\1\15\10\22\1\6\1\7\1"+
            "\10\17\22\1\17\37\22\1\5\12\22\1\21\34\22\1\uffff\1\14\2\1\1"+
            "\uffff\2\1",
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
            "\3\u00d9\6\uffff\1\u00d9\1\uffff\3\u00d9\33\uffff\142\u00d9"+
            "\1\u00f5\21\u00d9\1\uffff\3\u00d9\1\uffff\2\u00d9",
            "\1\22\1\uffff\1\u00f8",
            "\3\u00fa\4\uffff\1\22\1\uffff\1\u00fa\1\uffff\3\u00fa\33\uffff"+
            "\164\u00fa\1\uffff\3\u00fa\1\uffff\2\u00fa",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\4\u00f8\3\uffff\1\u00d9\1\uffff\1\u00f8\1\uffff\3\u00f8\33"+
            "\uffff\164\u00f8\1\uffff\3\u00f8\1\uffff\2\u00f8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "127:1: atom_expr : ( literal_value | bind_parameter | ( (database_name= id DOT )? table_name= id DOT )? column_name= ID -> ^( COLUMN_EXPRESSION ^( $column_name ( ^( $table_name ( $database_name)? ) )? ) ) | function_name= ID LPAREN ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )? RPAREN | LPAREN expr RPAREN | CAST LPAREN expr AS type_name RPAREN | ( EXISTS )? LPAREN select_stmt RPAREN | CASE ( expr )? ( WHEN expr THEN expr )+ ( ELSE expr )? END | raise_function );";
        }
    }
    static final String DFA30_eotS =
        "\52\uffff";
    static final String DFA30_eofS =
        "\52\uffff";
    static final String DFA30_minS =
        "\1\72\1\4\50\uffff";
    static final String DFA30_maxS =
        "\2\u00af\50\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\45\uffff";
    static final String DFA30_specialS =
        "\52\uffff}>";
    static final String[] DFA30_transitionS = {
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
            return "130:5: ( (database_name= id DOT )? table_name= id DOT )?";
        }
    }
    static final String DFA29_eotS =
        "\127\uffff";
    static final String DFA29_eofS =
        "\127\uffff";
    static final String DFA29_minS =
        "\1\72\2\30\2\72\1\4\1\uffff\1\4\117\uffff";
    static final String DFA29_maxS =
        "\1\u00af\2\30\3\u00af\1\uffff\1\u00af\117\uffff";
    static final String DFA29_acceptS =
        "\6\uffff\1\1\3\uffff\1\2\114\uffff";
    static final String DFA29_specialS =
        "\127\uffff}>";
    static final String[] DFA29_transitionS = {
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
            return "130:6: (database_name= id DOT )?";
        }
    }
    static final String DFA33_eotS =
        "\41\uffff";
    static final String DFA33_eofS =
        "\41\uffff";
    static final String DFA33_minS =
        "\1\21\40\uffff";
    static final String DFA33_maxS =
        "\1\u00b4\40\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\35\uffff\1\2\1\3";
    static final String DFA33_specialS =
        "\41\uffff}>";
    static final String[] DFA33_transitionS = {
            "\3\1\1\37\5\uffff\1\1\1\40\3\1\33\uffff\164\1\1\uffff\3\1\1"+
            "\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "131:29: ( ( DISTINCT )? args+= expr ( COMMA args+= expr )* | ASTERISK )?";
        }
    }
    static final String DFA31_eotS =
        "\75\uffff";
    static final String DFA31_eofS =
        "\75\uffff";
    static final String DFA31_minS =
        "\2\21\73\uffff";
    static final String DFA31_maxS =
        "\2\u00b4\73\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\34\uffff\1\1\35\uffff";
    static final String DFA31_specialS =
        "\75\uffff}>";
    static final String[] DFA31_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\3\2\33\uffff\44\2\1\1\117\2\1\uffff"+
            "\3\2\1\uffff\2\2",
            "\3\37\4\uffff\1\2\1\uffff\1\37\1\uffff\3\37\33\uffff\164\37"+
            "\1\uffff\3\37\1\uffff\2\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "131:30: ( DISTINCT )?";
        }
    }
    static final String DFA35_eotS =
        "\75\uffff";
    static final String DFA35_eofS =
        "\75\uffff";
    static final String DFA35_minS =
        "\1\21\34\uffff\1\21\37\uffff";
    static final String DFA35_maxS =
        "\1\u00b4\34\uffff\1\u00b4\37\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\36\uffff\1\2\34\uffff";
    static final String DFA35_specialS =
        "\75\uffff}>";
    static final String[] DFA35_transitionS = {
            "\3\1\6\uffff\1\1\1\uffff\3\1\33\uffff\162\1\1\35\1\1\1\uffff"+
            "\3\1\1\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            "\1\uffff\3\40\1\uffff\2\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "135:10: ( expr )?";
        }
    }
    static final String DFA40_eotS =
        "\53\uffff";
    static final String DFA40_eofS =
        "\53\uffff";
    static final String DFA40_minS =
        "\1\34\1\4\51\uffff";
    static final String DFA40_maxS =
        "\1\36\1\u00b1\51\uffff";
    static final String DFA40_acceptS =
        "\2\uffff\1\3\1\4\1\2\1\1\45\uffff";
    static final String DFA40_specialS =
        "\53\uffff}>";
    static final String[] DFA40_transitionS = {
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
            return "150:1: bind_parameter : ( QUESTION -> BIND | QUESTION position= INTEGER -> ^( BIND $position) | COLON name= id -> ^( BIND_NAME $name) | AT name= id -> ^( BIND_NAME $name) );";
        }
    }
    static final String DFA42_eotS =
        "\16\uffff";
    static final String DFA42_eofS =
        "\16\uffff";
    static final String DFA42_minS =
        "\1\27\15\uffff";
    static final String DFA42_maxS =
        "\1\u00af\15\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\2\13\uffff\1\1";
    static final String DFA42_specialS =
        "\16\uffff}>";
    static final String[] DFA42_transitionS = {
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
            return "()+ loopback of 160:17: (names+= ID )+";
        }
    }
    static final String DFA44_eotS =
        "\15\uffff";
    static final String DFA44_eofS =
        "\15\uffff";
    static final String DFA44_minS =
        "\1\27\14\uffff";
    static final String DFA44_maxS =
        "\1\u00a5\14\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA44_specialS =
        "\15\uffff}>";
    static final String[] DFA44_transitionS = {
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
            return "160:23: ( LPAREN size1= signed_number ( COMMA size2= signed_number )? RPAREN )?";
        }
    }
    static final String DFA45_eotS =
        "\13\uffff";
    static final String DFA45_eofS =
        "\13\uffff";
    static final String DFA45_minS =
        "\1\72\2\4\10\uffff";
    static final String DFA45_maxS =
        "\1\u00af\2\32\10\uffff";
    static final String DFA45_acceptS =
        "\3\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String DFA45_specialS =
        "\13\uffff}>";
    static final String[] DFA45_transitionS = {
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
            return "164:21: (database_name= id DOT )?";
        }
    }
    static final String DFA48_eotS =
        "\17\uffff";
    static final String DFA48_eofS =
        "\17\uffff";
    static final String DFA48_minS =
        "\2\72\5\uffff\1\72\2\uffff\1\27\4\uffff";
    static final String DFA48_maxS =
        "\2\u00b0\5\uffff\1\u00af\2\uffff\1\u00af\4\uffff";
    static final String DFA48_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\11\uffff";
    static final String DFA48_specialS =
        "\17\uffff}>";
    static final String[] DFA48_transitionS = {
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

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "169:21: ( DATABASE )?";
        }
    }
    static final String DFA53_eotS =
        "\14\uffff";
    static final String DFA53_eofS =
        "\14\uffff";
    static final String DFA53_minS =
        "\1\27\13\uffff";
    static final String DFA53_maxS =
        "\1\u00a4\13\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\1\1\2\1\3\10\uffff";
    static final String DFA53_specialS =
        "\14\uffff}>";
    static final String[] DFA53_transitionS = {
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

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "189:82: ( ASC | DESC )?";
        }
    }
    static final String DFA65_eotS =
        "\137\uffff";
    static final String DFA65_eofS =
        "\137\uffff";
    static final String DFA65_minS =
        "\3\21\134\uffff";
    static final String DFA65_maxS =
        "\3\u00b4\134\uffff";
    static final String DFA65_acceptS =
        "\3\uffff\1\3\36\uffff\1\1\36\uffff\1\2\35\uffff";
    static final String DFA65_specialS =
        "\137\uffff}>";
    static final String[] DFA65_transitionS = {
            "\4\3\5\uffff\1\3\1\uffff\3\3\33\uffff\3\3\1\1\40\3\1\2\117\3"+
            "\1\uffff\3\3\1\uffff\2\3",
            "\4\42\3\uffff\1\3\1\uffff\1\42\1\uffff\3\42\33\uffff\164\42"+
            "\1\uffff\3\42\1\uffff\2\42",
            "\4\101\3\uffff\1\3\1\uffff\1\101\1\uffff\3\101\33\uffff\164"+
            "\101\1\uffff\3\101\1\uffff\2\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "210:10: ( ALL | DISTINCT )?";
        }
    }
    static final String DFA66_eotS =
        "\14\uffff";
    static final String DFA66_eofS =
        "\14\uffff";
    static final String DFA66_minS =
        "\1\27\13\uffff";
    static final String DFA66_maxS =
        "\1\u00ad\13\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA66_specialS =
        "\14\uffff}>";
    static final String[] DFA66_transitionS = {
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
            return "()* loopback of 210:42: ( COMMA result_column )*";
        }
    }
    static final String DFA67_eotS =
        "\13\uffff";
    static final String DFA67_eofS =
        "\13\uffff";
    static final String DFA67_minS =
        "\1\27\12\uffff";
    static final String DFA67_maxS =
        "\1\u00ad\12\uffff";
    static final String DFA67_acceptS =
        "\1\uffff\1\1\1\2\10\uffff";
    static final String DFA67_specialS =
        "\13\uffff}>";
    static final String[] DFA67_transitionS = {
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
            return "210:65: ( FROM join_source )?";
        }
    }
    static final String DFA68_eotS =
        "\12\uffff";
    static final String DFA68_eofS =
        "\12\uffff";
    static final String DFA68_minS =
        "\1\27\11\uffff";
    static final String DFA68_maxS =
        "\1\u00ad\11\uffff";
    static final String DFA68_acceptS =
        "\1\uffff\1\1\1\2\7\uffff";
    static final String DFA68_specialS =
        "\12\uffff}>";
    static final String[] DFA68_transitionS = {
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
            return "210:85: ( WHERE where_expr= expr )?";
        }
    }
    static final String DFA69_eotS =
        "\12\uffff";
    static final String DFA69_eofS =
        "\12\uffff";
    static final String DFA69_minS =
        "\1\27\11\uffff";
    static final String DFA69_maxS =
        "\1\u00a4\11\uffff";
    static final String DFA69_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA69_specialS =
        "\12\uffff}>";
    static final String[] DFA69_transitionS = {
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
            return "()* loopback of 211:28: ( COMMA ordering_term )*";
        }
    }
    static final String DFA74_eotS =
        "\u01a5\uffff";
    static final String DFA74_eofS =
        "\u01a5\uffff";
    static final String DFA74_minS =
        "\1\21\1\uffff\1\4\1\30\1\4\5\uffff\3\4\1\30\4\uffff\1\30\1\21\1"+
        "\30\4\21\1\30\2\27\1\30\1\21\1\30\1\uffff\1\24\34\uffff\1\24\23"+
        "\uffff\1\24\27\uffff\1\24\27\uffff\1\24\27\uffff\1\24\30\uffff\2"+
        "\24\1\uffff\1\24\37\uffff\2\24\24\uffff\1\24\24\uffff\1\24\24\uffff"+
        "\1\24\24\uffff\1\24\3\uffff\1\24\20\uffff\1\24\22\uffff\1\24\24"+
        "\uffff\2\24\74\uffff";
    static final String DFA74_maxS =
        "\1\u00b4\1\uffff\1\u00af\1\u00b4\1\u00af\5\uffff\3\u00af\1\32\4"+
        "\uffff\1\32\1\u00b4\1\32\4\u00b4\3\u00af\1\u0086\1\u00b4\1\30\1"+
        "\uffff\1\u00af\34\uffff\1\u00af\23\uffff\1\u00af\27\uffff\1\u00af"+
        "\27\uffff\1\u00af\27\uffff\1\u00af\30\uffff\2\u00af\1\uffff\1\u00af"+
        "\37\uffff\2\u00af\24\uffff\1\u00af\24\uffff\1\u00af\24\uffff\1\u00af"+
        "\24\uffff\1\u00af\3\uffff\1\u00af\20\uffff\1\u00af\22\uffff\1\u00af"+
        "\24\uffff\2\u00af\74\uffff";
    static final String DFA74_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\u0163\uffff\1\2\73\uffff";
    static final String DFA74_specialS =
        "\u01a5\uffff}>";
    static final String[] DFA74_transitionS = {
            "\3\5\1\1\5\uffff\1\5\1\uffff\3\5\33\uffff\15\36\1\35\2\36\1"+
            "\23\1\15\10\36\1\12\1\13\1\14\17\36\1\22\5\36\1\26\5\36\1\31"+
            "\10\36\1\34\1\32\3\36\1\25\1\36\1\30\1\36\1\3\1\33\1\4\12\36"+
            "\1\24\1\36\1\27\32\36\1\uffff\1\2\2\5\1\uffff\2\5",
            "",
            "\17\5\1\uffff\4\5\1\40\3\5\36\uffff\164\5\1\uffff\1\5",
            "\1\75\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5\1\uffff\3\5\1"+
            "\uffff\2\5",
            "\17\5\1\uffff\4\5\1\121\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff"+
            "\1\5",
            "",
            "",
            "",
            "",
            "",
            "\17\5\1\uffff\4\5\1\151\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff"+
            "\1\5",
            "\17\5\1\uffff\4\5\1\u0081\1\5\1\uffff\1\5\36\uffff\164\5\1"+
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
            "\1\uffff\3\5\1\uffff\2\5",
            "\1\u00d5\1\uffff\1\5",
            "\3\5\4\uffff\1\u00d6\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5"+
            "\1\uffff\3\5\1\uffff\2\5",
            "\3\5\4\uffff\1\u00eb\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5"+
            "\1\uffff\3\5\1\uffff\2\5",
            "\3\5\4\uffff\1\u0100\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5"+
            "\1\uffff\3\5\1\uffff\2\5",
            "\3\5\4\uffff\1\u0115\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5"+
            "\1\uffff\3\5\1\uffff\2\5",
            "\1\u012a\1\uffff\1\5\37\uffff\164\5\1\uffff\1\5",
            "\1\5\1\u012e\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff\1\5",
            "\1\5\1\u013f\1\5\1\uffff\1\5\36\uffff\164\5\1\uffff\1\5",
            "\1\u0152\153\uffff\1\5\1\uffff\1\5",
            "\3\5\4\uffff\1\u0167\1\uffff\1\5\1\uffff\3\5\33\uffff\164\5"+
            "\1\uffff\3\5\1\uffff\2\5",
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
            return "217:1: result_column : ( ASTERISK | table_name= id DOT ASTERISK -> ^( ASTERISK $table_name) | expr ( ( AS )? column_alias= id )? -> ^( ALIAS expr ( $column_alias)? ) );";
        }
    }
    static final String DFA73_eotS =
        "\u00ec\uffff";
    static final String DFA73_eofS =
        "\u00ec\uffff";
    static final String DFA73_minS =
        "\1\27\2\uffff\1\27\1\uffff\1\21\6\27\4\uffff\1\30\1\21\6\30\41\uffff"+
        "\1\30\1\uffff\1\21\6\30\u00aa\uffff";
    static final String DFA73_maxS =
        "\1\u00af\2\uffff\1\u00af\1\uffff\1\u00b4\5\u00ad\1\u00b1\4\uffff"+
        "\1\u00af\1\u00b4\1\110\3\u009c\1\110\1\u00b1\41\uffff\1\u00af\1"+
        "\uffff\1\u00b4\1\110\3\u009c\1\110\1\u00b1\u00aa\uffff";
    static final String DFA73_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\u00e7\uffff";
    static final String DFA73_specialS =
        "\u00ec\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\4\1\uffff\1\4\1\uffff\1\4\36\uffff\52\1\1\11\6\1\1\3\1\1"+
            "\1\6\13\1\1\10\7\1\1\13\11\1\1\12\30\1\1\7\10\1\1\5\1\uffff"+
            "\1\1",
            "",
            "",
            "\1\1\1\uffff\1\1\1\4\1\1\36\uffff\52\4\1\25\6\4\1\20\1\4\1"+
            "\22\13\4\1\24\7\4\1\27\11\4\1\26\30\4\1\23\10\4\1\21\1\uffff"+
            "\1\4",
            "",
            "\3\4\3\uffff\1\1\1\uffff\1\1\1\4\1\1\3\4\33\uffff\52\4\1\77"+
            "\6\4\1\71\1\4\1\74\13\4\1\76\7\4\1\101\11\4\1\100\30\4\1\75"+
            "\10\4\1\73\1\uffff\3\4\1\uffff\2\4",
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
            "\3\1\4\uffff\1\4\1\uffff\1\1\1\uffff\3\1\33\uffff\164\1\1\uffff"+
            "\3\1\1\uffff\2\1",
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
            "\1\4\1\uffff\1\1\37\uffff\164\1\1\uffff\1\1",
            "",
            "\3\1\4\uffff\1\4\1\uffff\1\1\1\uffff\3\1\33\uffff\164\1\1\uffff"+
            "\3\1\1\uffff\2\1",
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
            return "220:10: ( ( AS )? column_alias= id )?";
        }
    }
    static final String DFA72_eotS =
        "\u00ee\uffff";
    static final String DFA72_eofS =
        "\u00ee\uffff";
    static final String DFA72_minS =
        "\1\72\1\27\3\uffff\1\27\1\uffff\1\21\6\27\4\uffff\1\30\1\21\6\30"+
        "\41\uffff\1\30\1\uffff\1\21\6\30\u00aa\uffff";
    static final String DFA72_maxS =
        "\2\u00af\3\uffff\1\u00af\1\uffff\1\u00b4\5\u00ad\1\u00b1\4\uffff"+
        "\1\u00af\1\u00b4\1\110\3\u009c\1\110\1\u00b1\41\uffff\1\u00af\1"+
        "\uffff\1\u00b4\1\110\3\u009c\1\110\1\u00b1\u00aa\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\u00e9\uffff";
    static final String DFA72_specialS =
        "\u00ee\uffff}>";
    static final String[] DFA72_transitionS = {
            "\7\2\1\1\154\2\1\uffff\1\2",
            "\1\2\1\uffff\1\2\1\uffff\1\2\36\uffff\52\4\1\13\6\4\1\5\1\4"+
            "\1\10\13\4\1\12\7\4\1\15\11\4\1\14\30\4\1\11\10\4\1\7\1\uffff"+
            "\1\4",
            "",
            "",
            "",
            "\1\4\1\uffff\1\4\1\2\1\4\36\uffff\52\2\1\27\6\2\1\22\1\2\1"+
            "\24\13\2\1\26\7\2\1\31\11\2\1\30\30\2\1\25\10\2\1\23\1\uffff"+
            "\1\2",
            "",
            "\3\2\3\uffff\1\4\1\uffff\1\4\1\2\1\4\3\2\33\uffff\52\2\1\101"+
            "\6\2\1\73\1\2\1\76\13\2\1\100\7\2\1\103\11\2\1\102\30\2\1\77"+
            "\10\2\1\75\1\uffff\3\2\1\uffff\2\2",
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
            "\3\4\4\uffff\1\2\1\uffff\1\4\1\uffff\3\4\33\uffff\164\4\1\uffff"+
            "\3\4\1\uffff\2\4",
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
            "\1\2\1\uffff\1\4\37\uffff\164\4\1\uffff\1\4",
            "",
            "\3\4\4\uffff\1\2\1\uffff\1\4\1\uffff\3\4\33\uffff\164\4\1\uffff"+
            "\3\4\1\uffff\2\4",
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
            return "220:11: ( AS )?";
        }
    }
    static final String DFA76_eotS =
        "\21\uffff";
    static final String DFA76_eofS =
        "\21\uffff";
    static final String DFA76_minS =
        "\1\27\20\uffff";
    static final String DFA76_maxS =
        "\1\u00ad\20\uffff";
    static final String DFA76_acceptS =
        "\1\uffff\1\2\10\uffff\1\1\6\uffff";
    static final String DFA76_specialS =
        "\21\uffff}>";
    static final String[] DFA76_transitionS = {
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
            return "()* loopback of 222:28: ( join_op single_source ( join_constraint )? )*";
        }
    }
    static final String DFA75_eotS =
        "\23\uffff";
    static final String DFA75_eofS =
        "\23\uffff";
    static final String DFA75_minS =
        "\1\27\22\uffff";
    static final String DFA75_maxS =
        "\1\u00ad\22\uffff";
    static final String DFA75_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\17\uffff";
    static final String DFA75_specialS =
        "\23\uffff}>";
    static final String[] DFA75_transitionS = {
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
            return "222:52: ( join_constraint )?";
        }
    }
    static final String DFA83_eotS =
        "\51\uffff";
    static final String DFA83_eofS =
        "\51\uffff";
    static final String DFA83_minS =
        "\1\32\2\uffff\1\32\1\21\44\uffff";
    static final String DFA83_maxS =
        "\1\u00af\2\uffff\1\u00af\1\u00b4\44\uffff";
    static final String DFA83_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\2\uffff\1\2\40\uffff";
    static final String DFA83_specialS =
        "\51\uffff}>";
    static final String[] DFA83_transitionS = {
            "\1\3\37\uffff\164\1\1\uffff\1\1",
            "",
            "",
            "\1\5\37\uffff\142\5\1\4\21\5\1\uffff\1\5",
            "\4\10\3\uffff\1\5\1\uffff\1\10\1\uffff\3\10\33\uffff\164\10"+
            "\1\uffff\3\10\1\uffff\2\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "224:1: single_source : ( (database_name= id DOT )? table_name= ID ( ( AS )? table_alias= ID )? ( INDEXED BY index_name= id | NOT INDEXED )? -> ^( ALIAS ^( $table_name ( $database_name)? ) ( $table_alias)? ( ^( INDEXED ( NOT )? ( $index_name)? ) )? ) | LPAREN select_stmt RPAREN ( ( AS )? table_alias= ID )? -> ^( ALIAS select_stmt ( $table_alias)? ) | LPAREN join_source RPAREN );";
        }
    }
    static final String DFA77_eotS =
        "\32\uffff";
    static final String DFA77_eofS =
        "\32\uffff";
    static final String DFA77_minS =
        "\1\72\1\27\30\uffff";
    static final String DFA77_maxS =
        "\2\u00af\30\uffff";
    static final String DFA77_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\25\uffff";
    static final String DFA77_specialS =
        "\32\uffff}>";
    static final String[] DFA77_transitionS = {
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
            return "225:5: (database_name= id DOT )?";
        }
    }
    static final String DFA79_eotS =
        "\27\uffff";
    static final String DFA79_eofS =
        "\27\uffff";
    static final String DFA79_minS =
        "\1\27\26\uffff";
    static final String DFA79_maxS =
        "\1\u00af\26\uffff";
    static final String DFA79_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\23\uffff";
    static final String DFA79_specialS =
        "\27\uffff}>";
    static final String[] DFA79_transitionS = {
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
            return "225:43: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA80_eotS =
        "\25\uffff";
    static final String DFA80_eofS =
        "\25\uffff";
    static final String DFA80_minS =
        "\1\27\24\uffff";
    static final String DFA80_maxS =
        "\1\u00ad\24\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\1\2\1\3\21\uffff";
    static final String DFA80_specialS =
        "\25\uffff}>";
    static final String[] DFA80_transitionS = {
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
            return "225:67: ( INDEXED BY index_name= id | NOT INDEXED )?";
        }
    }
    static final String DFA82_eotS =
        "\25\uffff";
    static final String DFA82_eofS =
        "\25\uffff";
    static final String DFA82_minS =
        "\1\27\24\uffff";
    static final String DFA82_maxS =
        "\1\u00af\24\uffff";
    static final String DFA82_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\21\uffff";
    static final String DFA82_specialS =
        "\25\uffff}>";
    static final String[] DFA82_transitionS = {
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
            return "227:31: ( ( AS )? table_alias= ID )?";
        }
    }
    static final String DFA93_eotS =
        "\15\uffff";
    static final String DFA93_eofS =
        "\15\uffff";
    static final String DFA93_minS =
        "\1\72\2\30\12\uffff";
    static final String DFA93_maxS =
        "\1\u00af\2\u00a9\12\uffff";
    static final String DFA93_acceptS =
        "\3\uffff\1\2\3\uffff\1\1\5\uffff";
    static final String DFA93_specialS =
        "\15\uffff}>";
    static final String[] DFA93_transitionS = {
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

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "240:67: (database_name= id DOT )?";
        }
    }
    static final String DFA118_eotS =
        "\72\uffff";
    static final String DFA118_eofS =
        "\72\uffff";
    static final String DFA118_minS =
        "\1\31\1\72\2\uffff\1\31\1\uffff\3\31\61\uffff";
    static final String DFA118_maxS =
        "\1\33\1\u00af\2\uffff\1\u00af\1\uffff\3\u00af\61\uffff";
    static final String DFA118_acceptS =
        "\2\uffff\1\2\1\1\66\uffff";
    static final String DFA118_specialS =
        "\72\uffff}>";
    static final String[] DFA118_transitionS = {
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
            return "()* loopback of 283:23: ( COMMA column_def )*";
        }
    }
    static final String DFA121_eotS =
        "\15\uffff";
    static final String DFA121_eofS =
        "\15\uffff";
    static final String DFA121_minS =
        "\1\27\14\uffff";
    static final String DFA121_maxS =
        "\1\u00af\14\uffff";
    static final String DFA121_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA121_specialS =
        "\15\uffff}>";
    static final String[] DFA121_transitionS = {
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
            return "288:32: ( type_name )?";
        }
    }
    static final String DFA122_eotS =
        "\14\uffff";
    static final String DFA122_eofS =
        "\14\uffff";
    static final String DFA122_minS =
        "\1\27\13\uffff";
    static final String DFA122_maxS =
        "\1\u00a5\13\uffff";
    static final String DFA122_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA122_specialS =
        "\14\uffff}>";
    static final String[] DFA122_transitionS = {
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
            return "()* loopback of 288:43: ( column_constraint )*";
        }
    }
    static final String DFA125_eotS =
        "\17\uffff";
    static final String DFA125_eofS =
        "\17\uffff";
    static final String DFA125_minS =
        "\1\27\16\uffff";
    static final String DFA125_maxS =
        "\1\u00a5\16\uffff";
    static final String DFA125_acceptS =
        "\1\uffff\1\1\1\2\14\uffff";
    static final String DFA125_specialS =
        "\17\uffff}>";
    static final String[] DFA125_transitionS = {
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
            return "309:37: ( ASC | DESC )?";
        }
    }
    static final String DFA126_eotS =
        "\16\uffff";
    static final String DFA126_eofS =
        "\16\uffff";
    static final String DFA126_minS =
        "\1\27\15\uffff";
    static final String DFA126_maxS =
        "\1\u00a5\15\uffff";
    static final String DFA126_acceptS =
        "\1\uffff\1\1\1\2\13\uffff";
    static final String DFA126_specialS =
        "\16\uffff}>";
    static final String[] DFA126_transitionS = {
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
            return "309:51: ( table_conflict_clause )?";
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
            return "309:74: ( AUTOINCREMENT )?";
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
            return "311:38: ( table_conflict_clause )?";
        }
    }
    static final String DFA129_eotS =
        "\15\uffff";
    static final String DFA129_eofS =
        "\15\uffff";
    static final String DFA129_minS =
        "\1\27\14\uffff";
    static final String DFA129_maxS =
        "\1\u00a5\14\uffff";
    static final String DFA129_acceptS =
        "\1\uffff\1\1\1\2\12\uffff";
    static final String DFA129_specialS =
        "\15\uffff}>";
    static final String[] DFA129_transitionS = {
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
            return "313:35: ( table_conflict_clause )?";
        }
    }
    static final String DFA130_eotS =
        "\13\uffff";
    static final String DFA130_eofS =
        "\13\uffff";
    static final String DFA130_minS =
        "\1\21\12\uffff";
    static final String DFA130_maxS =
        "\1\u00b4\12\uffff";
    static final String DFA130_acceptS =
        "\1\uffff\1\1\1\2\7\uffff\1\3";
    static final String DFA130_specialS =
        "\13\uffff}>";
    static final String[] DFA130_transitionS = {
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

    static final short[] DFA130_eot = DFA.unpackEncodedString(DFA130_eotS);
    static final short[] DFA130_eof = DFA.unpackEncodedString(DFA130_eofS);
    static final char[] DFA130_min = DFA.unpackEncodedStringToUnsignedChars(DFA130_minS);
    static final char[] DFA130_max = DFA.unpackEncodedStringToUnsignedChars(DFA130_maxS);
    static final short[] DFA130_accept = DFA.unpackEncodedString(DFA130_acceptS);
    static final short[] DFA130_special = DFA.unpackEncodedString(DFA130_specialS);
    static final short[][] DFA130_transition;

    static {
        int numStates = DFA130_transitionS.length;
        DFA130_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA130_transition[i] = DFA.unpackEncodedString(DFA130_transitionS[i]);
        }
    }

    class DFA130 extends DFA {

        public DFA130(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 130;
            this.eot = DFA130_eot;
            this.eof = DFA130_eof;
            this.min = DFA130_min;
            this.max = DFA130_max;
            this.accept = DFA130_accept;
            this.special = DFA130_special;
            this.transition = DFA130_transition;
        }
        public String getDescription() {
            return "318:37: ( ( PLUS | MINUS ) ( INTEGER | FLOAT ) | literal_value | LPAREN expr RPAREN )";
        }
    }
    static final String DFA140_eotS =
        "\17\uffff";
    static final String DFA140_eofS =
        "\17\uffff";
    static final String DFA140_minS =
        "\1\27\16\uffff";
    static final String DFA140_maxS =
        "\1\u00a5\16\uffff";
    static final String DFA140_acceptS =
        "\1\uffff\1\2\13\uffff\1\1\1\uffff";
    static final String DFA140_specialS =
        "\17\uffff}>";
    static final String[] DFA140_transitionS = {
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
            return "()+ loopback of 348:3: ( fk_clause_action )+";
        }
    }
    static final String DFA141_eotS =
        "\17\uffff";
    static final String DFA141_eofS =
        "\17\uffff";
    static final String DFA141_minS =
        "\1\27\1\131\15\uffff";
    static final String DFA141_maxS =
        "\1\u00a5\1\u0086\15\uffff";
    static final String DFA141_acceptS =
        "\2\uffff\1\1\1\2\13\uffff";
    static final String DFA141_specialS =
        "\17\uffff}>";
    static final String[] DFA141_transitionS = {
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
            return "348:21: ( fk_clause_deferrable )?";
        }
    }
    static final String DFA145_eotS =
        "\17\uffff";
    static final String DFA145_eofS =
        "\17\uffff";
    static final String DFA145_minS =
        "\1\27\1\132\15\uffff";
    static final String DFA145_maxS =
        "\1\u00a5\1\161\15\uffff";
    static final String DFA145_acceptS =
        "\2\uffff\1\3\12\uffff\1\1\1\2";
    static final String DFA145_specialS =
        "\17\uffff}>";
    static final String[] DFA145_transitionS = {
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

    static final short[] DFA145_eot = DFA.unpackEncodedString(DFA145_eotS);
    static final short[] DFA145_eof = DFA.unpackEncodedString(DFA145_eofS);
    static final char[] DFA145_min = DFA.unpackEncodedStringToUnsignedChars(DFA145_minS);
    static final char[] DFA145_max = DFA.unpackEncodedStringToUnsignedChars(DFA145_maxS);
    static final short[] DFA145_accept = DFA.unpackEncodedString(DFA145_acceptS);
    static final short[] DFA145_special = DFA.unpackEncodedString(DFA145_specialS);
    static final short[][] DFA145_transition;

    static {
        int numStates = DFA145_transitionS.length;
        DFA145_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA145_transition[i] = DFA.unpackEncodedString(DFA145_transitionS[i]);
        }
    }

    class DFA145 extends DFA {

        public DFA145(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 145;
            this.eot = DFA145_eot;
            this.eof = DFA145_eof;
            this.min = DFA145_min;
            this.max = DFA145_max;
            this.accept = DFA145_accept;
            this.special = DFA145_special;
            this.transition = DFA145_transition;
        }
        public String getDescription() {
            return "355:42: ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?";
        }
    }
    static final String DFA165_eotS =
        "\14\uffff";
    static final String DFA165_eofS =
        "\14\uffff";
    static final String DFA165_minS =
        "\1\72\1\30\12\uffff";
    static final String DFA165_maxS =
        "\1\u00af\1\u00a6\12\uffff";
    static final String DFA165_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\7\uffff";
    static final String DFA165_specialS =
        "\14\uffff}>";
    static final String[] DFA165_transitionS = {
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
            return "383:48: ( IF NOT EXISTS )?";
        }
    }
    static final String DFA166_eotS =
        "\21\uffff";
    static final String DFA166_eofS =
        "\21\uffff";
    static final String DFA166_minS =
        "\1\72\2\30\16\uffff";
    static final String DFA166_maxS =
        "\1\u00af\2\u00a6\16\uffff";
    static final String DFA166_acceptS =
        "\3\uffff\1\1\1\2\14\uffff";
    static final String DFA166_specialS =
        "\21\uffff}>";
    static final String[] DFA166_transitionS = {
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

    static final short[] DFA166_eot = DFA.unpackEncodedString(DFA166_eotS);
    static final short[] DFA166_eof = DFA.unpackEncodedString(DFA166_eofS);
    static final char[] DFA166_min = DFA.unpackEncodedStringToUnsignedChars(DFA166_minS);
    static final char[] DFA166_max = DFA.unpackEncodedStringToUnsignedChars(DFA166_maxS);
    static final short[] DFA166_accept = DFA.unpackEncodedString(DFA166_acceptS);
    static final short[] DFA166_special = DFA.unpackEncodedString(DFA166_specialS);
    static final short[][] DFA166_transition;

    static {
        int numStates = DFA166_transitionS.length;
        DFA166_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA166_transition[i] = DFA.unpackEncodedString(DFA166_transitionS[i]);
        }
    }

    class DFA166 extends DFA {

        public DFA166(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 166;
            this.eot = DFA166_eot;
            this.eof = DFA166_eof;
            this.min = DFA166_min;
            this.max = DFA166_max;
            this.accept = DFA166_accept;
            this.special = DFA166_special;
            this.transition = DFA166_transition;
        }
        public String getDescription() {
            return "383:65: (database_name= id DOT )?";
        }
    }
 

    public static final BitSet FOLLOW_sql_stmt_in_sql_stmt_list169 = new BitSet(new long[]{0xC000000000000002L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_EXPLAIN_in_sql_stmt179 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB14000L});
    public static final BitSet FOLLOW_QUERY_in_sql_stmt182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLAN_in_sql_stmt184 = new BitSet(new long[]{0xC000000000800000L,0x00800084A8048048L,0x000001401AB04000L});
    public static final BitSet FOLLOW_sql_stmt_core_in_sql_stmt190 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_sql_stmt192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_stmt_in_sql_stmt_core203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attach_stmt_in_sql_stmt_core209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_detach_stmt_in_sql_stmt_core215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_analyze_stmt_in_sql_stmt_core221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reindex_stmt_in_sql_stmt_core227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vacuum_stmt_in_sql_stmt_core233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_sql_stmt_core242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_stmt_in_sql_stmt_core248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_stmt_in_sql_stmt_core254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_stmt_in_sql_stmt_core260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_stmt_in_sql_stmt_core266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commit_stmt_in_sql_stmt_core272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_stmt_in_sql_stmt_core278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_savepoint_stmt_in_sql_stmt_core284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_release_stmt_in_sql_stmt_core290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_virtual_table_stmt_in_sql_stmt_core299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_table_stmt_in_sql_stmt_core305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_table_stmt_in_sql_stmt_core311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alter_table_stmt_in_sql_stmt_core317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_view_stmt_in_sql_stmt_core323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_view_stmt_in_sql_stmt_core329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_index_stmt_in_sql_stmt_core335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_index_stmt_in_sql_stmt_core341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_trigger_stmt_in_sql_stmt_core347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_trigger_stmt_in_sql_stmt_core353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_qualified_table_name366 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_qualified_table_name368 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_qualified_table_name374 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_qualified_table_name379 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_qualified_table_name383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_qualified_table_name387 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_qualified_table_name389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_number398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_set_in_signed_number407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_subexpr_in_expr420 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OR_in_expr423 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_or_subexpr_in_expr426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_or_subexpr438 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_and_subexpr_in_or_subexpr441 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_LPAREN_in_in_source453 = new BitSet(new long[]{0xFC0000007C0E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_select_stmt_in_in_source456 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_expr_in_in_source460 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_in_source463 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_in_source465 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_in_source471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_in_source480 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_in_source482 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_in_source488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr501 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_and_subexpr504 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr521 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr529 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000080005L});
    public static final BitSet FOLLOW_LIKE_in_and_subexpr535 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_GLOB_in_and_subexpr539 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_REGEXP_in_and_subexpr543 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_MATCH_in_and_subexpr547 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr550 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_ESCAPE_in_and_subexpr553 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr585 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_IN_in_and_subexpr588 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_in_source_in_and_subexpr591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNULL_in_and_subexpr598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTNULL_in_and_subexpr606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_and_subexpr614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_and_subexpr616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_and_subexpr625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_and_subexpr629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_and_subexpr640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_BETWEEN_in_and_subexpr643 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_AND_in_and_subexpr649 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_eq_subexpr_in_and_subexpr653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr678 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_set_in_eq_subexpr681 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_neq_subexpr_in_eq_subexpr698 = new BitSet(new long[]{0x0000000000000F02L});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr707 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_set_in_neq_subexpr710 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_bit_subexpr_in_neq_subexpr727 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr736 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_bit_subexpr739 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_add_subexpr_in_bit_subexpr748 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr757 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_set_in_add_subexpr760 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_mul_subexpr_in_add_subexpr773 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr782 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DOUBLE_PIPE_in_mul_subexpr785 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_con_subexpr_in_mul_subexpr788 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_set_in_con_subexpr797 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_unary_subexpr_in_con_subexpr814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_unary_subexpr821 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_COLLATE_in_unary_subexpr824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_unary_subexpr829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_atom_expr841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_parameter_in_atom_expr847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_atom_expr857 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr859 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_atom_expr865 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_atom_expr867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_atom_expr873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom_expr902 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr904 = new BitSet(new long[]{0xFC0000007C1E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_atom_expr908 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr914 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_atom_expr917 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr921 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_ASTERISK_in_atom_expr927 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr937 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr940 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_atom_expr949 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr951 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_atom_expr955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_type_name_in_atom_expr957 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_atom_expr968 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_atom_expr972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_atom_expr974 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom_expr976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_atom_expr982 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_atom_expr990 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_THEN_in_atom_expr994 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr996 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_ELSE_in_atom_expr1001 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_atom_expr1003 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_END_in_atom_expr1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raise_function_in_atom_expr1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal_value1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal_value1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal_value1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOB_in_literal_value1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal_value1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIME_in_literal_value1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_DATE_in_literal_value1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_literal_value1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bind_parameter1147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_bind_parameter1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_bind_parameter1166 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_bind_parameter1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_bind_parameter1185 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_bind_parameter1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAISE_in_raise_function1209 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_raise_function1212 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_IGNORE_in_raise_function1216 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_set_in_raise_function1220 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMA_in_raise_function1232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_STRING_in_raise_function1237 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_raise_function1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_name1250 = new BitSet(new long[]{0x0000000004000002L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_LPAREN_in_type_name1254 = new BitSet(new long[]{0x0000000000060000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1258 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_type_name1261 = new BitSet(new long[]{0x0000000000060000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_signed_number_in_type_name1265 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_type_name1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_in_pragma_stmt1301 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1306 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_pragma_stmt1308 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_pragma_stmt1314 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_EQUALS_in_pragma_stmt1317 = new BitSet(new long[]{0xFC00000000060000L,0xFFFFFFFFFFFFFFFFL,0x000BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pragma_stmt1323 = new BitSet(new long[]{0xFC00000000060000L,0xFFFFFFFFFFFFFFFFL,0x000BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_pragma_value_in_pragma_stmt1325 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_pragma_stmt1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_number_in_pragma_value1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_pragma_value1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_pragma_value1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTACH_in_attach_stmt1354 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0001BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DATABASE_in_attach_stmt1357 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0001BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_STRING_in_attach_stmt1364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_attach_stmt1368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_attach_stmt1371 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_attach_stmt1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETACH_in_detach_stmt1383 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DATABASE_in_detach_stmt1386 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_detach_stmt1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANALYZE_in_analyze_stmt1400 = new BitSet(new long[]{0xFC00000000000002L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_analyze_stmt1411 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_analyze_stmt1413 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_analyze_stmt1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REINDEX_in_reindex_stmt1427 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1432 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_reindex_stmt1434 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_reindex_stmt1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VACUUM_in_vacuum_stmt1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operation_conflict_clause1459 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_operation_conflict_clause1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ordering_term1486 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_ordering_term1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_ordering_term1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_operation_limited_clause1525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_operation_limited_clause1527 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1529 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_operation_limited_clause1532 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_operation_limited_clause1534 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_operation_limited_clause1542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1546 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_operation_limited_clause1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_operation_limited_clause1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_list_in_select_stmt1569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_ORDER_in_select_stmt1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_stmt1576 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1578 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1581 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_stmt1583 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_select_stmt1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1596 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OFFSET_in_select_stmt1600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_stmt1604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_INTEGER_in_select_stmt1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_core_in_select_list1654 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_select_op_in_select_list1657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_core_in_select_list1660 = new BitSet(new long[]{0x0000000000000002L,0x0200001000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_UNION_in_select_op1669 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ALL_in_select_op1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERSECT_in_select_op1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCEPT_in_select_op1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_core1692 = new BitSet(new long[]{0xFC000000741E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ALL_in_select_core1695 = new BitSet(new long[]{0xFC000000741E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_select_core1699 = new BitSet(new long[]{0xFC000000741E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_result_column_in_select_core1703 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1706 = new BitSet(new long[]{0xFC000000741E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_result_column_in_select_core1708 = new BitSet(new long[]{0x0000000002000002L,0x0000280000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_FROM_in_select_core1713 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_join_source_in_select_core1715 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_WHERE_in_select_core1720 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_select_core1724 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_GROUP_in_select_core1732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_select_core1734 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1736 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_COMMA_in_select_core1739 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_ordering_term_in_select_core1741 = new BitSet(new long[]{0x0000000002000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_HAVING_in_select_core1746 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_select_core1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_result_column1828 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_result_column1830 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ASTERISK_in_result_column1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_result_column1847 = new BitSet(new long[]{0xFC00000000000002L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_AS_in_result_column1851 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_result_column1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_source_in_join_source1878 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_join_op_in_join_source1881 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_single_source_in_join_source1884 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000008000001208L});
    public static final BitSet FOLLOW_join_constraint_in_join_source1887 = new BitSet(new long[]{0x0000000002000002L,0xA040000000080000L,0x0000000000001008L});
    public static final BitSet FOLLOW_id_in_single_source1904 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_single_source1906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1912 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000002L,0x0000800000000010L});
    public static final BitSet FOLLOW_AS_in_single_source1916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1922 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_BY_in_single_source1929 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_single_source1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_single_source1937 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_INDEXED_in_single_source1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source1980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_single_source1982 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source1984 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_AS_in_single_source1988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_ID_in_single_source1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_single_source2016 = new BitSet(new long[]{0xFC00000004000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_join_source_in_single_source2019 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_single_source2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_join_op2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATURAL_in_join_op2039 = new BitSet(new long[]{0x0000000000000000L,0xA040000000080000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LEFT_in_join_op2045 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_OUTER_in_join_op2050 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_INNER_in_join_op2056 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_CROSS_in_join_op2060 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_JOIN_in_join_op2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_join_constraint2074 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_join_constraint2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_join_constraint2083 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_join_constraint2085 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_join_constraint2089 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_join_constraint2092 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_join_constraint2096 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_join_constraint2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt2119 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_operation_conflict_clause_in_insert_stmt2122 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_REPLACE_in_insert_stmt2128 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt2131 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2136 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_insert_stmt2138 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2144 = new BitSet(new long[]{0x0000000004000000L,0x0000000001000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2151 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2155 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2158 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_insert_stmt2162 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2175 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_stmt2177 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2181 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_insert_stmt2184 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_insert_stmt2188 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_stmt2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_stmt_in_insert_stmt2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_insert_stmt2203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update_stmt2215 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_operation_conflict_clause_in_update_stmt2218 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_qualified_table_name_in_update_stmt2222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_SET_in_update_stmt2226 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2230 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_COMMA_in_update_stmt2233 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_update_set_in_update_stmt2237 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_update_stmt2242 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_update_stmt2244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_update_stmt2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_update_set2260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_update_set2262 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_update_set2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_stmt2272 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_FROM_in_delete_stmt2274 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_qualified_table_name_in_delete_stmt2276 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000802L});
    public static final BitSet FOLLOW_WHERE_in_delete_stmt2279 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_delete_stmt2281 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_operation_limited_clause_in_delete_stmt2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_begin_stmt2296 = new BitSet(new long[]{0x0000000000000002L,0x0002002004000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_set_in_begin_stmt2298 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_begin_stmt2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_commit_stmt2322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_commit_stmt2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROLLBACK_in_rollback_stmt2341 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_TRANSACTION_in_rollback_stmt2344 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_rollback_stmt2349 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_SAVEPOINT_in_rollback_stmt2352 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_rollback_stmt2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVEPOINT_in_savepoint_stmt2368 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_savepoint_stmt2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASE_in_release_stmt2380 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_SAVEPOINT_in_release_stmt2383 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_release_stmt2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_table_conflict_clause2401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CONFLICT_in_table_conflict_clause2404 = new BitSet(new long[]{0x0400000000000000L,0x0001010000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_table_conflict_clause2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_virtual_table_stmt2434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_VIRTUAL_in_create_virtual_table_stmt2436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_virtual_table_stmt2438 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2443 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_virtual_table_stmt2445 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_USING_in_create_virtual_table_stmt2455 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_virtual_table_stmt2459 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_virtual_table_stmt2462 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2464 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_virtual_table_stmt2467 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_virtual_table_stmt2469 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_virtual_table_stmt2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_table_stmt2483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_table_stmt2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_create_table_stmt2488 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_table_stmt2491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_table_stmt2493 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_table_stmt2495 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2502 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_table_stmt2504 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_table_stmt2510 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_create_table_stmt2516 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2518 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2521 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_create_table_stmt2523 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_table_stmt2528 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_in_create_table_stmt2530 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_table_stmt2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_table_stmt2540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_table_stmt2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_column_def_in_column_def2598 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000802000048010L});
    public static final BitSet FOLLOW_type_name_in_column_def2600 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_in_column_def2603 = new BitSet(new long[]{0x0000000000000002L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_CONSTRAINT_in_column_constraint2629 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_column_constraint2633 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_column_constraint_pk_in_column_constraint2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_not_null_in_column_constraint2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_unique_in_column_constraint2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_check_in_column_constraint2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_default_in_column_constraint2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_constraint_collate_in_column_constraint2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fk_clause_in_column_constraint2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_column_constraint_pk2732 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_column_constraint_pk2735 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000014L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_column_constraint_pk2738 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_pk2747 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_AUTOINCREMENT_in_column_constraint_pk2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_column_constraint_not_null2760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_column_constraint_not_null2762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_not_null2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_column_constraint_unique2781 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_column_constraint_unique2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_column_constraint_check2792 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_check2795 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_column_constraint_check2798 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_check2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_column_constraint_default2809 = new BitSet(new long[]{0x0000000004060000L,0x0000000000700000L,0x001B000000000040L});
    public static final BitSet FOLLOW_set_in_column_constraint_default2813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000A000000000000L});
    public static final BitSet FOLLOW_set_in_column_constraint_default2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_value_in_column_constraint_default2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_constraint_default2835 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_column_constraint_default2838 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_constraint_default2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_column_constraint_collate2849 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_column_constraint_collate2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_table_constraint2863 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint2867 = new BitSet(new long[]{0x0000000000000000L,0x0000040000021000L,0x0000002000008000L});
    public static final BitSet FOLLOW_table_constraint_pk_in_table_constraint2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_unique_in_table_constraint2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_check_in_table_constraint2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_constraint_fk_in_table_constraint2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_table_constraint_pk2933 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_pk2935 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_pk2939 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk2943 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_pk2946 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_pk2950 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_pk2954 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_pk2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_table_constraint_unique2981 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_unique2985 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique2989 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_unique2992 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_unique2996 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_unique3000 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_table_conflict_clause_in_table_constraint_unique3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHECK_in_table_constraint_check3027 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_check3030 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_table_constraint_check3033 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_check3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_table_constraint_fk3043 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_KEY_in_table_constraint_fk3045 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_constraint_fk3047 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3051 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_table_constraint_fk3054 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_table_constraint_fk3058 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_table_constraint_fk3062 = new BitSet(new long[]{0x0000000000000000L,0x0000000001023000L,0x0000002000048010L});
    public static final BitSet FOLLOW_fk_clause_in_table_constraint_fk3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_fk_clause3087 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause3091 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_LPAREN_in_fk_clause3094 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause3098 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_fk_clause3101 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause3105 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_fk_clause3109 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_fk_clause_action_in_fk_clause3115 = new BitSet(new long[]{0x0000000004000002L,0x0000000002000000L,0x0000000000000214L});
    public static final BitSet FOLLOW_fk_clause_deferrable_in_fk_clause3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_fk_clause_action3152 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_set_in_fk_clause_action3155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L,0x0000000021000000L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NULL_in_fk_clause_action3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_fk_clause_action3175 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_DEFAULT_in_fk_clause_action3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASCADE_in_fk_clause_action3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_fk_clause_action3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCH_in_fk_clause_action3193 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_fk_clause_action3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fk_clause_deferrable3204 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_DEFERRABLE_in_fk_clause_deferrable3208 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3212 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_DEFERRED_in_fk_clause_deferrable3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITIALLY_in_fk_clause_deferrable3219 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_IMMEDIATE_in_fk_clause_deferrable3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_table_stmt3232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_table_stmt3234 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_table_stmt3237 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_table_stmt3239 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3246 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_table_stmt3248 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_table_stmt3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter_table_stmt3284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_TABLE_in_alter_table_stmt3286 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3291 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_alter_table_stmt3293 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3299 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RENAME_in_alter_table_stmt3302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_TO_in_alter_table_stmt3304 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_alter_table_stmt3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_alter_table_stmt3312 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_COLUMN_in_alter_table_stmt3315 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFDBFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_column_def_in_alter_table_stmt3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_view_stmt3328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040080000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_view_stmt3330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_create_view_stmt3333 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_view_stmt3336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_view_stmt3338 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_view_stmt3340 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3347 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_view_stmt3349 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_view_stmt3355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_create_view_stmt3357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_select_stmt_in_create_view_stmt3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_view_stmt3367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_VIEW_in_drop_view_stmt3369 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_view_stmt3372 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_view_stmt3374 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3381 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_view_stmt3383 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_view_stmt3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_index_stmt3397 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_UNIQUE_in_create_index_stmt3400 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_create_index_stmt3404 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_index_stmt3407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_index_stmt3409 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_index_stmt3411 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3418 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_index_stmt3420 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_index_stmt3430 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_index_stmt3434 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_index_stmt3436 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3440 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMA_in_create_index_stmt3443 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_indexed_column_in_create_index_stmt3447 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_index_stmt3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_indexed_column3497 = new BitSet(new long[]{0x0000000000000002L,0x0000000010002004L});
    public static final BitSet FOLLOW_COLLATE_in_indexed_column3500 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_indexed_column3504 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000004L});
    public static final BitSet FOLLOW_ASC_in_indexed_column3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_indexed_column3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_index_stmt3544 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_INDEX_in_drop_index_stmt3546 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_index_stmt3549 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_index_stmt3551 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3558 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_index_stmt3560 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_index_stmt3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create_trigger_stmt3596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000880000000L});
    public static final BitSet FOLLOW_TEMPORARY_in_create_trigger_stmt3598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_create_trigger_stmt3601 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_create_trigger_stmt3604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_NOT_in_create_trigger_stmt3606 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_create_trigger_stmt3608 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3615 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_create_trigger_stmt3617 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3623 = new BitSet(new long[]{0x1000000000000000L,0x0180000008000020L,0x0000004000000000L});
    public static final BitSet FOLLOW_BEFORE_in_create_trigger_stmt3628 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AFTER_in_create_trigger_stmt3632 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_INSTEAD_in_create_trigger_stmt3636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3638 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DELETE_in_create_trigger_stmt3643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INSERT_in_create_trigger_stmt3647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_UPDATE_in_create_trigger_stmt3651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000280L});
    public static final BitSet FOLLOW_OF_in_create_trigger_stmt3654 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3658 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_create_trigger_stmt3661 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3665 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ON_in_create_trigger_stmt3674 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_create_trigger_stmt3678 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_FOR_in_create_trigger_stmt3681 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_EACH_in_create_trigger_stmt3683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ROW_in_create_trigger_stmt3685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000100000000000L});
    public static final BitSet FOLLOW_WHEN_in_create_trigger_stmt3690 = new BitSet(new long[]{0xFC000000740E0000L,0xFFFFFFFFFFFFFFFFL,0x001BBFFFFFFFFFFFL});
    public static final BitSet FOLLOW_expr_in_create_trigger_stmt3692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_BEGIN_in_create_trigger_stmt3698 = new BitSet(new long[]{0x0000000000000000L,0x0080000008000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_update_stmt_in_create_trigger_stmt3702 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_insert_stmt_in_create_trigger_stmt3706 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_delete_stmt_in_create_trigger_stmt3710 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_select_stmt_in_create_trigger_stmt3714 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMI_in_create_trigger_stmt3717 = new BitSet(new long[]{0x0000000000000000L,0x0080000408000000L,0x0000004010800000L});
    public static final BitSet FOLLOW_END_in_create_trigger_stmt3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop_trigger_stmt3729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_TRIGGER_in_drop_trigger_stmt3731 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_IF_in_drop_trigger_stmt3734 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_trigger_stmt3736 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3743 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_drop_trigger_stmt3745 = new BitSet(new long[]{0xFC00000000000000L,0xFFFFFFFFFFFFFFFFL,0x0000BFFFFFFFFFFFL});
    public static final BitSet FOLLOW_id_in_drop_trigger_stmt3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_id3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_column_def4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_column_def_in_id_column_def4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword_column_def4490 = new BitSet(new long[]{0x0000000000000002L});

}