/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.Interpreter;

public class NotExpression implements Expression {
    private  Expression expression1;

    public NotExpression(Expression expression1) {
        this.expression1 = expression1;
    }

    @Override
    public boolean process(String context) {
        return !expression1.process(context);
    }
}
