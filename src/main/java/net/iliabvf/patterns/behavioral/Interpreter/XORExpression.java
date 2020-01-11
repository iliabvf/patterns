/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.Interpreter;

public class XORExpression implements Expression {
    private  Expression expression1;
    private  Expression expression2;

    public XORExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean process(String context) {
        return expression1.process(context) ^ expression2.process(context);
    }
}
