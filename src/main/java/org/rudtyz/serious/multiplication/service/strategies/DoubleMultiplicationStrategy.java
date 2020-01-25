package org.rudtyz.serious.multiplication.service.strategies;

import org.springframework.stereotype.Component;

@Component
public class DoubleMultiplicationStrategy implements MultiplicationStrategy<Double, Double> {

    @Override
    public Double multiplication(Double lhs, Double rhs) {
        double result = lhs * rhs;
        if (Double.isInfinite(result) || Double.isNaN(result)) {
            throw new ArithmeticException("double overflow");
        }
        return result;
    }
}
