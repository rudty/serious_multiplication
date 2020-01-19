package org.rudtyz.serious.multiplication.service.factory.impl;

import org.rudtyz.serious.multiplication.service.factory.IntegerPrinter;
import org.rudtyz.serious.multiplication.service.factory.IntegerPrinterFactory;
import org.springframework.stereotype.Component;

@Component
public class ConsoleIntegerPrinterFactory implements IntegerPrinterFactory {
    @Override
    public IntegerPrinter create() {
        return new ConsoleIntegerPrinter();
    }
}
