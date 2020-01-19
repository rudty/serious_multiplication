package org.rudtyz.serious.multiplication.service;

import org.rudtyz.serious.multiplication.service.factory.StringPrinter;
import org.rudtyz.serious.multiplication.service.factory.StringPrinterFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationEventService {

    private final StringPrinter printer;

    public MultiplicationEventService(StringPrinterFactory factory) {
        this.printer = factory.create();
    }

    @EventListener
    public void onMultiplicationEventReceive(MultiplicationEvent event) {
        printer.print(event.getLhs() + " * " + event.getRhs() + " = " + event.getResult());
    }
}
