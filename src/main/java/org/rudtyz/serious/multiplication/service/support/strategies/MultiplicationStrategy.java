package org.rudtyz.serious.multiplication.service.strategies;

public interface MultiplicationStrategy<R, A1, A2> {
    R multiply(A1 lhs, A2 rhs);
}
