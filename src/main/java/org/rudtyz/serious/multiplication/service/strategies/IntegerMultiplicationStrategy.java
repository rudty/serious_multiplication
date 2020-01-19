package org.rudtyz.serious.multiplication.service.strategies;


import org.springframework.stereotype.Component;

@Component
public class IntegerMultiplicationStrategy implements MultiplicationStrategy<Integer, Integer, Integer> {

    @Override
    public Integer multiply(Integer lhs, Integer rhs) {
        return lhs * rhs;
    }

}
