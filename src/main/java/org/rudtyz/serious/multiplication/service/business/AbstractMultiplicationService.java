package org.rudtyz.serious.multiplication.service.business;

import org.rudtyz.serious.multiplication.service.strategies.MultiplicationStrategy;

public class AbstractMultiplicationService<L extends Number, R extends Number> implements MultiplicationService<L, R> {
    private final MultiplicationStrategy<L, R> multiplicationStrategy;

    public AbstractMultiplicationService(MultiplicationStrategy<L, R> multiplicationStrategy) {
        this.multiplicationStrategy = multiplicationStrategy;
    }


    @Override
    public Number multiplication(L lhs, R rhs) {
        return multiplicationStrategy.multiplication(lhs, rhs);
    }
}
