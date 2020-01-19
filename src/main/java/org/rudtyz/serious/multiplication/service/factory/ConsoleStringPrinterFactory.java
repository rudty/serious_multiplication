package org.rudtyz.serious.multiplication.service.factory;

import org.rudtyz.serious.multiplication.service.factory.impl.ConsoleStringPrinter;

public class ConsoleStringPrinterFactory implements StringPrinterFactory {

    @Override
    public StringPrinter create() {
        return new ConsoleStringPrinter();
    }
}
