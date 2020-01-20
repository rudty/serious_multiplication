package org.rudtyz.serious.multiplication.service.business;

import org.rudtyz.serious.multiplication.service.strategies.MultiplicationStrategy;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class IntegerMultiplicationService {
    private final MultiplicationStrategy<Integer, Integer, Integer> multiplicationStrategy;


    public IntegerMultiplicationService(
            MultiplicationStrategy<Integer, Integer, Integer> multiplicationStrategy) {

        this.multiplicationStrategy = multiplicationStrategy;
    }

    public int multiplication(int lhs, int rhs) {
        final int result = multiplicationStrategy.multiply(lhs, rhs);
        return result;
    }
}
