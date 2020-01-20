package org.rudtyz.serious.multiplication.service.support;

public class IntegerMultiplicationEvent extends MultiplicationEvent<Integer> {
    public IntegerMultiplicationEvent(int lhs, int rhs, int result) {
        super(lhs, rhs, result);
    }
}
