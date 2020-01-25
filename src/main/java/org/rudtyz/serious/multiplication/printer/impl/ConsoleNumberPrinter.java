package org.rudtyz.serious.multiplication.printer.impl;

import org.rudtyz.serious.multiplication.printer.NumberPrinter;

public class ConsoleNumberPrinter implements NumberPrinter {
    @Override
    public void print(Number a) {
        System.out.print(a);
    }
}
