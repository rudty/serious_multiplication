package org.rudtyz.serious.multiplication.factory.impl;

import org.rudtyz.serious.multiplication.factory.StringPrinter;

public class ConsoleStringPrinter implements StringPrinter {
    @Override
    public void print(String a) {
        System.out.print(a);
    }
}
