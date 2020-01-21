package org.rudtyz.serious.multiplication.factory.impl;

import org.rudtyz.serious.multiplication.factory.NumberPrinter;
import org.rudtyz.serious.multiplication.factory.NumberPrinterFactory;
import org.springframework.stereotype.Component;

@Component
public class ConsoleNumberPrinterFactory implements NumberPrinterFactory {
    @Override
    public NumberPrinter create() {
        return new ConsoleNumberPrinter();
    }
}
