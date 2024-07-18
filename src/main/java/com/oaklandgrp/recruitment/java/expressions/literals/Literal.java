package com.oaklandgrp.recruitment.java.expressions.literals;

import com.oaklandgrp.recruitment.java.expressions.Expression;

public class Literal implements Expression {
    private final int value;

    public Literal(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String format() {
        return String.valueOf(value);
    }
}
