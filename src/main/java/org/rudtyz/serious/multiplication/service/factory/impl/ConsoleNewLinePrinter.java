package org.rudtyz.serious.multiplication.service.factory.impl;

import org.rudtyz.serious.multiplication.service.factory.NewLinePrinter;

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
