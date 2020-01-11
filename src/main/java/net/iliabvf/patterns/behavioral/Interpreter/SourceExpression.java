/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.Interpreter;

public class SourceExpression implements Expression {
    private String sourceString;

    public SourceExpression(String sourceString) {
        this.sourceString = sourceString;
    }

    @Override
    public boolean process(String context) {
        if (context.contains(sourceString)){
            return true;
        }
        return false;
    }
}
