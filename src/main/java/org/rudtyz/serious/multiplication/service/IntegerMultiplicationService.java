package org.rudtyz.serious.multiplication.service;

import org.rudtyz.serious.multiplication.service.event.IntegerMultiplicationEvent;
import org.rudtyz.serious.multiplication.service.strategies.MultiplicationStrategy;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class IntegerMultiplicationService {
    private final MultiplicationStrategy<Integer, Integer, Integer> multiplicationStrategy;
    private final ApplicationEventPublisher multiplicationEventPublisher;

    public IntegerMultiplicationService(
            ApplicationEventPublisher multiplicationEventPublisher,
            MultiplicationStrategy<Integer, Integer, Integer> multiplicationStrategy) {
        this.multiplicationEventPublisher = multiplicationEventPublisher;
        this.multiplicationStrategy = multiplicationStrategy;
    }

    public int multiplication(int lhs, int rhs) {
        final int result = multiplicationStrategy.multiply(lhs, rhs);
        multiplicationEventPublisher.publishEvent(
                new IntegerMultiplicationEvent(lhs, rhs, result));
        return result;
    }
}
