package org.rudtyz.serious.multiplication.factory.impl;

import org.rudtyz.serious.multiplication.factory.ObjectPrinter;

public class ConsoleObjectPrinter implements ObjectPrinter {
    @Override
    public void print(Object a) {
        System.out.print(a);
    }
}
