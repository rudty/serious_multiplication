package org.rudtyz.serious.multiplication.service.support;

public class NumberMultiplicationEvent extends MultiplicationEvent<Number> {
    public NumberMultiplicationEvent(Number lhs, Number rhs, Number result) {
        super(lhs, rhs, result);
    }
}
