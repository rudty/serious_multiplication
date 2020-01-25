package org.rudtyz.serious.multiplication.service.strategies;


import org.springframework.stereotype.Component;

@Component
public class IntegerMultiplicationStrategy implements MultiplicationStrategy<Integer, Integer> {

    @Override
    public Integer multiplication(Integer lhs, Integer rhs) {
        final int result = Math.multiplyExact(lhs, rhs);
        return result;
    }

}
