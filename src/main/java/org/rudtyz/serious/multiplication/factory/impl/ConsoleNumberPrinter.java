package org.rudtyz.serious.multiplication.factory.impl;

import org.rudtyz.serious.multiplication.factory.NumberPrinter;

public class ConsoleNumberPrinter implements NumberPrinter {
    @Override
    public void print(Number a) {
        System.out.print(a);
    }
}
