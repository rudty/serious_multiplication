package org.rudtyz.serious.multiplication.factory.impl;

import org.rudtyz.serious.multiplication.factory.NewLinePrinter;

public class ConsoleNewLinePrinter implements NewLinePrinter {
    @Override
    public void print(Object a) {
        print();
    }

    @Override
    public void print() {
        System.out.println();
    }
}
