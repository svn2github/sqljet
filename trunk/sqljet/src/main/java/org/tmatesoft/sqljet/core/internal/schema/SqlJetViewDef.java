package org.tmatesoft.sqljet.core.internal.schema;

import org.tmatesoft.sqljet.core.schema.ISqlJetViewDef;

public class SqlJetViewDef implements ISqlJetViewDef {
    
    private String rawSql;
    private String name;

    public SqlJetViewDef(String name, String rawSql) {
        this.rawSql = rawSql;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSelectStatement() {
        return rawSql;
    }

    public String toSQL() {
        return rawSql;
    }

}
