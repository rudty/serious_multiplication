package org.rudtyz.serious.multiplication.service.business;

import org.rudtyz.serious.multiplication.service.strategies.MultiplicationStrategy;
import org.springframework.stereotype.Service;

@Service
public class IntegerMultiplicationService extends AbstractMultiplicationService<Integer, Integer, Integer> {

    public IntegerMultiplicationService(
            MultiplicationStrategy<Integer, Integer, Integer> multiplicationStrategy) {
        super(multiplicationStrategy);
    }

}
