package com.oaklandgrp.recruitment.java.expressions.operations;

import com.oaklandgrp.recruitment.java.expressions.Expression;
import com.oaklandgrp.recruitment.java.expressions.ExpressionUtils;

public class Multiply implements Expression {
    private final Expression[] expressions;

    public Multiply(Expression... expressions) {
        this.expressions = expressions;
    }

    @Override
    public int evaluate() {
        int product = 1;
        for (Expression expression : expressions) {
            product *= expression.evaluate();
        }
        return product;
    }

    @Override
    public String format() {
        return ExpressionUtils.formatExpressions("*", expressions);
    }
}
