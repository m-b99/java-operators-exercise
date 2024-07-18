package com.oaklandgrp.recruitment.java.expressions;

public final class ExpressionUtils {

    private ExpressionUtils() {
    }
    public static String formatExpressions(String operator, Expression[] expressions) {
        StringBuilder sb = new StringBuilder("(").append(operator);
        for (Expression expression : expressions) {
            sb.append(" ").append(expression.format());
        }
        sb.append(")");
        return sb.toString();
    }
}
