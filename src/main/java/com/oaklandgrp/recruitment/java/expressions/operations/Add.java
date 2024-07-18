package com.oaklandgrp.recruitment.java.expressions.operations;

import com.oaklandgrp.recruitment.java.expressions.Expression;
import com.oaklandgrp.recruitment.java.expressions.ExpressionUtils;

public class Add implements Expression {
    private final Expression[] expressions;

    public Add(Expression... expressions) {
        this.expressions = expressions;
    }

    @Override
    public int evaluate() {
        int sum = 0;
        for (Expression expression : expressions) {
            sum += expression.evaluate();
        }
        return sum;
    }

    @Override
    public String format() {
        return ExpressionUtils.formatExpressions("+", expressions);
    }
}
