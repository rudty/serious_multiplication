package org.rudtyz.serious.multiplication.service.business;

import org.rudtyz.serious.multiplication.service.strategies.MultiplicationStrategy;
import org.springframework.stereotype.Service;

@Service
public class DoubleMultiplicationService extends AbstractMultiplicationService<Double, Double, Double>{

    public DoubleMultiplicationService(
            MultiplicationStrategy<Double, Double, Double> multiplicationStrategy) {
        super(multiplicationStrategy);
    }

}