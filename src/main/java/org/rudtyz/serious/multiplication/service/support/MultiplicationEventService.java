package org.rudtyz.serious.multiplication.service;

import org.rudtyz.serious.multiplication.service.support.IntegerMultiplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationEventService {

    private final MultiplicationPrintFacade multiplicationPrintFacade;

    public MultiplicationEventService(MultiplicationPrintFacade multiplicationPrintFacade) {
        this.multiplicationPrintFacade = multiplicationPrintFacade;
    }

    @EventListener
    public void onMultiplicationEventReceive(IntegerMultiplicationEvent event) {
        multiplicationPrintFacade.print(event.getLhs(), event.getRhs(), event.getResult());
    }
}
