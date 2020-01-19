package org.rudtyz.serious.multiplication.service.factory.impl;

import org.rudtyz.serious.multiplication.service.factory.StringPrinter;
import org.rudtyz.serious.multiplication.service.factory.StringPrinterFactory;
import org.springframework.stereotype.Component;

@Component
public class ConsoleStringPrinterFactory implements StringPrinterFactory {

    @Override
    public StringPrinter create() {
        return new ConsoleStringPrinter();
    }
}
