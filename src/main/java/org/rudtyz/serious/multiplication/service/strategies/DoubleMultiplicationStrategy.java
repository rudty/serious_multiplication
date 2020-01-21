package org.rudtyz.serious.multiplication.service.strategies;

import org.springframework.stereotype.Component;

@Component
public class DoubleMultiplicationStrategy implements MultiplicationStrategy<Double, Double, Double> {

    @Override
    public Double multiply(Double lhs, Double rhs) {
        return lhs * rhs;
    }

}
