package org.rudtyz.serious.multiplication.service.business;

public interface MultiplicationService<E extends Number, L extends Number, R extends Number> {
    E multiplication(L lhs, R rhs);
}
