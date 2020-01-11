/*
 * Copyright (c) 2020. Budeanu Vasile
 */

package net.iliabvf.patterns.behavioral.Interpreter;

public class Main {
    public static void main(String[] args) {
        Expression sourceExpression1 = new SourceExpression("Xor1");
        Expression sourceExpression2 = new SourceExpression("Xor2");

        System.out.println("XOR result is " + new XORExpression(sourceExpression1, sourceExpression2).process("Xor1 OR Xor2 ?"));

        Expression sourceExpression3 = new SourceExpression("lies");

        System.out.println("NOT result is " + new NotExpression(sourceExpression3).process("True or lies ?"));

    }
}
