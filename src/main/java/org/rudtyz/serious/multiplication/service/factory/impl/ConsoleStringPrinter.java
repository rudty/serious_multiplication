package org.rudtyz.serious.multiplication.service.factory.impl;

import org.rudtyz.serious.multiplication.service.factory.StringPrinter;
import org.springframework.stereotype.Component;

public class ConsoleStringPrinter implements StringPrinter {
    @Override
    public void print(String a) {
        System.out.println(a);
    }
}
