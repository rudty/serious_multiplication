package org.rudtyz.serious.multiplication.service;

import org.rudtyz.serious.multiplication.service.factory.StringPrinter;
import org.rudtyz.serious.multiplication.service.factory.StringPrinterFactory;
import org.rudtyz.serious.multiplication.service.strategies.MultiplicationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {
    private final MultiplicationStrategy<Integer, Integer, Integer> multiplicationStrategy;
    private final ApplicationEventPublisher multiplicationEventPublisher;

    public MultiplicationService(
            ApplicationEventPublisher multiplicationEventPublisher,
            MultiplicationStrategy<Integer, Integer, Integer> multiplicationStrategy) {
        this.multiplicationEventPublisher = multiplicationEventPublisher;
        this.multiplicationStrategy = multiplicationStrategy;
    }

    public int multiplication(int lhs, int rhs) {
        final int result = multiplicationStrategy.multiply(lhs, rhs);
        multiplicationEventPublisher.publishEvent(new MultiplicationEvent(lhs,rhs,result));
        return result;
    }

}
