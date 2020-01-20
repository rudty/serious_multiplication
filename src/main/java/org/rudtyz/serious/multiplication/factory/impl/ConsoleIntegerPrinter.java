package org.rudtyz.serious.multiplication.factory.impl;

import org.rudtyz.serious.multiplication.factory.IntegerPrinter;

public class ConsoleIntegerPrinter implements IntegerPrinter {
    @Override
    public void print(Integer a) {
        System.out.print(a);
    }
}
