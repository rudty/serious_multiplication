package org.rudtyz.serious.multiplication.printer.impl;

import org.rudtyz.serious.multiplication.printer.StringPrinter;

public class ConsoleStringPrinter implements StringPrinter {
    @Override
    public void print(String a) {
        System.out.print(a);
    }
}
