package org.rudtyz.serious.multiplication.service.support;

import org.rudtyz.serious.multiplication.factory.*;
import org.rudtyz.serious.multiplication.printer.NewLinePrinter;
import org.rudtyz.serious.multiplication.printer.NumberPrinter;
import org.rudtyz.serious.multiplication.printer.StringPrinter;
import org.springframework.stereotype.Component;

@Component
public class MultiplicationPrintFacade {
    private final StringPrinter stringPrinter;
    private final NumberPrinter numberPrinter;
    private final NewLinePrinter newLinePrinter;

    public MultiplicationPrintFacade(
            StringPrinterFactory stringPrinterFactory,
            NumberPrinterFactory numberPrinterFactory,
            NewLinePrinterFactory newLinePrinterFactory) {
        this.stringPrinter = stringPrinterFactory.create();
        this.numberPrinter = numberPrinterFactory.create();
        this.newLinePrinter = newLinePrinterFactory.create();
    }

    public void print(Number lhs, Number rhs, Number result) {
        numberPrinter.print(lhs);
        stringPrinter.print(" * ");
        numberPrinter.print(rhs);
        stringPrinter.print(" = ");
        numberPrinter.print(result);
        newLinePrinter.print();
    }
}
