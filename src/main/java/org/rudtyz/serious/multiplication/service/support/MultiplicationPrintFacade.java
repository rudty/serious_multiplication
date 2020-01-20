package org.rudtyz.serious.multiplication.service.support;

import org.rudtyz.serious.multiplication.factory.*;
import org.springframework.stereotype.Component;

@Component
public class MultiplicationPrintFacade {
    private final StringPrinter stringPrinter;
    private final IntegerPrinter integerPrinter;
    private final NewLinePrinter newLinePrinter;

    public MultiplicationPrintFacade(
            StringPrinterFactory stringPrinterFactory,
            IntegerPrinterFactory integerPrinterFactory,
            NewLinePrinterFactory newLinePrinterFactory) {
        this.stringPrinter = stringPrinterFactory.create();
        this.integerPrinter = integerPrinterFactory.create();
        this.newLinePrinter = newLinePrinterFactory.create();
    }

    public void print(int lhs, int rhs, int result) {
        integerPrinter.print(lhs);
        stringPrinter.print(" * ");
        integerPrinter.print(rhs);
        stringPrinter.print(" = ");
        integerPrinter.print(result);
        newLinePrinter.print();
    }
}
