package org.rudtyz.serious.multiplication.service;

import org.rudtyz.serious.multiplication.service.event.IntegerMultiplicationEvent;
import org.rudtyz.serious.multiplication.service.factory.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationEventService {

    private final StringPrinter stringPrinter;
    private final IntegerPrinter integerPrinter;
    private final NewLinePrinter newLinePrinter;

    public MultiplicationEventService(
            StringPrinterFactory stringPrinterFactory,
            IntegerPrinterFactory integerPrinterFactory,
            NewLinePrinterFactory newLinePrinterFactory) {
        this.stringPrinter = stringPrinterFactory.create();
        this.integerPrinter = integerPrinterFactory.create();
        this.newLinePrinter = newLinePrinterFactory.create();
    }

    @EventListener
    public void onMultiplicationEventReceive(IntegerMultiplicationEvent event) {
        integerPrinter.print(event.getLhs());
        stringPrinter.print(" * ");
        integerPrinter.print(event.getRhs());
        stringPrinter.print(" = ");
        integerPrinter.print(event.getResult());
        newLinePrinter.print();
    }
}
