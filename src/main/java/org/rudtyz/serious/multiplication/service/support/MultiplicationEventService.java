package org.rudtyz.serious.multiplication.service.support;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationEventService {

    private final MultiplicationPrintFacade multiplicationPrintFacade;

    public MultiplicationEventService(MultiplicationPrintFacade multiplicationPrintFacade) {
        this.multiplicationPrintFacade = multiplicationPrintFacade;
    }

    @Async
    @EventListener
    public void onMultiplicationEventReceive(NumberMultiplicationEvent event) {
        multiplicationPrintFacade.print(event.getLhs(), event.getRhs(), event.getResult());
    }
}
