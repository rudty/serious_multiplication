package org.rudtyz.serious.multiplication.factory.impl;

import org.rudtyz.serious.multiplication.factory.ObjectPrinter;
import org.rudtyz.serious.multiplication.factory.ObjectPrinterFactory;
import org.springframework.stereotype.Component;

@Component
public class ConsoleObjectPrinterFactory implements ObjectPrinterFactory {
    @Override
    public ObjectPrinter create() {
        return new ConsoleObjectPrinter();
    }
}
