package org.rudtyz.serious.multiplication.factory.impl;

import org.rudtyz.serious.multiplication.printer.StringPrinter;
import org.rudtyz.serious.multiplication.factory.StringPrinterFactory;
import org.rudtyz.serious.multiplication.printer.impl.ConsoleStringPrinter;
import org.springframework.stereotype.Component;

@Component
public class ConsoleStringPrinterFactory implements StringPrinterFactory {

    @Override
    public StringPrinter create() {
        return new ConsoleStringPrinter();
    }
}
