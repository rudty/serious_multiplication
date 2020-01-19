package org.rudtyz.serious.multiplication.service.factory.impl;

import org.rudtyz.serious.multiplication.service.factory.IntegerPrinter;

public class ConsoleIntegerPrinter implements IntegerPrinter {
    @Override
    public void print(Integer a) {
        System.out.print(a);
    }
}
