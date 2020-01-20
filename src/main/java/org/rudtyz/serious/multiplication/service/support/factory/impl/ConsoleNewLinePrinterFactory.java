package org.rudtyz.serious.multiplication.service.factory.impl;

import org.rudtyz.serious.multiplication.service.factory.NewLinePrinter;
import org.rudtyz.serious.multiplication.service.factory.NewLinePrinterFactory;
import org.springframework.stereotype.Component;

@Component
public class ConsoleNewLinePrinterFactory implements NewLinePrinterFactory {
    @Override
    public NewLinePrinter create() {
        return new ConsoleNewLinePrinter();
    }
}
