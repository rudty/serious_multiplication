package org.rudtyz.serious.multiplication.factory.impl;

import org.rudtyz.serious.multiplication.printer.NumberPrinter;
import org.rudtyz.serious.multiplication.factory.NumberPrinterFactory;
import org.rudtyz.serious.multiplication.printer.impl.ConsoleNumberPrinter;
import org.springframework.stereotype.Component;

@Component
public class ConsoleNumberPrinterFactory implements NumberPrinterFactory {
    @Override
    public NumberPrinter create() {
        return new ConsoleNumberPrinter();
    }
}
