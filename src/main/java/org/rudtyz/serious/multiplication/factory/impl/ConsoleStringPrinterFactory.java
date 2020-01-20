package org.rudtyz.serious.multiplication.factory.impl;

import org.rudtyz.serious.multiplication.factory.StringPrinter;
import org.rudtyz.serious.multiplication.factory.StringPrinterFactory;
import org.springframework.stereotype.Component;

@Component
public class ConsoleStringPrinterFactory implements StringPrinterFactory {

    @Override
    public StringPrinter create() {
        return new ConsoleStringPrinter();
    }
}
