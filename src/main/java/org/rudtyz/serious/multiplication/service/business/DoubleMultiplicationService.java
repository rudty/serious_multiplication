package org.rudtyz.serious.multiplication.service.business;

import org.rudtyz.serious.multiplication.service.strategies.MultiplicationStrategy;
import org.springframework.stereotype.Service;

@Service
public class DoubleMultiplicationService {
    private final MultiplicationStrategy<Double, Double, Double> multiplicationStrategy;


    public DoubleMultiplicationService(
            MultiplicationStrategy<Double, Double, Double> multiplicationStrategy) {
        this.multiplicationStrategy = multiplicationStrategy;
    }

    public double multiplication(double lhs, double rhs) {
        final double result = multiplicationStrategy.multiply(lhs, rhs);
        return result;
    }
}