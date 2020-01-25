package org.rudtyz.serious.multiplication.factory.impl;

import org.rudtyz.serious.multiplication.printer.NewLinePrinter;
import org.rudtyz.serious.multiplication.factory.NewLinePrinterFactory;
import org.rudtyz.serious.multiplication.printer.impl.ConsoleNewLinePrinter;
import org.springframework.stereotype.Component;

@Component
public class ConsoleNewLinePrinterFactory implements NewLinePrinterFactory {
    @Override
    public NewLinePrinter create() {
        return new ConsoleNewLinePrinter();
    }
}
