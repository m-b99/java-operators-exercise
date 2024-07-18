package com.oaklandgrp.recruitment.java.expressions;

import com.oaklandgrp.recruitment.java.expressions.literals.Literal;
import com.oaklandgrp.recruitment.java.expressions.operations.Add;
import com.oaklandgrp.recruitment.java.expressions.operations.Multiply;

public class ExpressionFactory {

    public static Expression literal(final int value) {
        return new Literal(value);
    }

    public static Expression add(final Expression... expressions) {
        return new Add(expressions);
    }

    public static Expression multiply(final Expression... expressions) {
        return new Multiply(expressions);
    }

}
