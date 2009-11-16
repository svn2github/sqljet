/**
 * ISqlJetBinaryExpression.java
 * Copyright (C) 2009 TMate Software Ltd
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */
package org.tmatesoft.sqljet.core.schema;

/**
 * @author TMate Software Ltd.
 * @author Dmitry Stadnik (dtrace@seznam.cz)
 */
public interface ISqlJetBinaryExpression extends ISqlJetExpression {

    public enum Operation {
        OR, AND, EQUALS, NOT_EQUALS, LESS, LESS_OR_EQ, GREATER, GREATER_OR_EQ, SHIFT_LEFT, SHIFT_RIGHT, BIT_AND, BIT_OR, PLUS, MINUS, MULTIPLY, DIVIDE, MODULO, CONCATENATE;

        public static Operation decode(String s) {
            if ("or".equalsIgnoreCase(s)) {
                return OR;
            } else if ("and".equalsIgnoreCase(s)) {
                return AND;
            } else if ("=".equalsIgnoreCase(s) || "==".equalsIgnoreCase(s)) {
                return EQUALS;
            } else if ("!=".equalsIgnoreCase(s) || "<>".equalsIgnoreCase(s)) {
                return NOT_EQUALS;
            } else if ("<".equalsIgnoreCase(s)) {
                return LESS;
            } else if ("<=".equalsIgnoreCase(s)) {
                return LESS_OR_EQ;
            } else if (">".equalsIgnoreCase(s)) {
                return GREATER;
            } else if (">=".equalsIgnoreCase(s)) {
                return GREATER_OR_EQ;
            } else if ("<<".equalsIgnoreCase(s)) {
                return SHIFT_LEFT;
            } else if (">>".equalsIgnoreCase(s)) {
                return SHIFT_RIGHT;
            } else if ("&".equalsIgnoreCase(s)) {
                return BIT_AND;
            } else if ("|".equalsIgnoreCase(s)) {
                return BIT_OR;
            } else if ("+".equalsIgnoreCase(s)) {
                return PLUS;
            } else if ("-".equalsIgnoreCase(s)) {
                return MINUS;
            } else if ("*".equalsIgnoreCase(s)) {
                return MULTIPLY;
            } else if ("/".equalsIgnoreCase(s)) {
                return DIVIDE;
            } else if ("%".equalsIgnoreCase(s)) {
                return MODULO;
            } else if ("||".equalsIgnoreCase(s)) {
                return CONCATENATE;
            }
            return null;
        }

        public String toString() {
            switch (this) {
            case OR:
                return "OR";
            case AND:
                return "AND";
            case EQUALS:
                return "=";
            case NOT_EQUALS:
                return "!=";
            case LESS:
                return "<";
            case LESS_OR_EQ:
                return "<=";
            case GREATER:
                return ">";
            case GREATER_OR_EQ:
                return ">=";
            case SHIFT_LEFT:
                return "<<";
            case SHIFT_RIGHT:
                return ">>";
            case BIT_AND:
                return "&";
            case BIT_OR:
                return "|";
            case PLUS:
                return "+";
            case MINUS:
                return "-";
            case MULTIPLY:
                return "*";
            case DIVIDE:
                return "/";
            case MODULO:
                return "%";
            case CONCATENATE:
                return "||";
            }
            return "";
        }
    }

    public Operation getOperation();

    public ISqlJetExpression getLeftExpression();

    public ISqlJetExpression getRightExpression();
}
