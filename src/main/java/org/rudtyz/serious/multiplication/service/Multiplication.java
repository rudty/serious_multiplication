package org.rudtyz.serious.multiplication.service;

@FunctionalInterface
public interface Multiplication<L extends Number, R extends Number> {
    Number multiplication(L lhs, R rhs);
}
