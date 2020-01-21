package org.rudtyz.serious.multiplication.service.support;

import org.rudtyz.serious.multiplication.factory.*;
import org.springframework.stereotype.Component;

@Component
public class MultiplicationPrintFacade {
    private final StringPrinter stringPrinter;
    private final NumberPrinter objectPrinter;
    private final NewLinePrinter newLinePrinter;

    public MultiplicationPrintFacade(
            StringPrinterFactory stringPrinterFactory,
            NumberPrinterFactory integerPrinterFactory,
            NewLinePrinterFactory newLinePrinterFactory) {
        this.stringPrinter = stringPrinterFactory.create();
        this.objectPrinter = integerPrinterFactory.create();
        this.newLinePrinter = newLinePrinterFactory.create();
    }

    public void print(Number lhs, Number rhs, Number result) {
        objectPrinter.print(lhs);
        stringPrinter.print(" * ");
        objectPrinter.print(rhs);
        stringPrinter.print(" = ");
        objectPrinter.print(result);
        newLinePrinter.print();
    }
}
