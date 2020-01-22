package org.rudtyz.serious.multiplication.service.business;

import org.rudtyz.serious.multiplication.service.strategies.MultiplicationStrategy;

public class AbstractMultiplicationService<E extends Number, L extends Number, R extends Number> implements MultiplicationService<E, L, R> {
    private final MultiplicationStrategy<E, L, R> multiplicationStrategy;

    public AbstractMultiplicationService(MultiplicationStrategy<E, L, R> multiplicationStrategy) {
        this.multiplicationStrategy = multiplicationStrategy;
    }

    @Override
    public E multiplication(L lhs, R rhs) {
        return multiplicationStrategy.multiply(lhs, rhs);
    }
}
