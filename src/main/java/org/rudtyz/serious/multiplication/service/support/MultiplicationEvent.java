package org.rudtyz.serious.multiplication.service.support;

import java.util.Objects;

public class MultiplicationEvent <T extends Number> {
    private T lhs;
    private T rhs;
    private T result;

    public MultiplicationEvent(T lhs, T rhs, T result) {
        Objects.requireNonNull(lhs);
        Objects.requireNonNull(rhs);
        Objects.requireNonNull(result);
        this.lhs = lhs;
        this.rhs = rhs;
        this.result = result;
    }

    public T getLhs() {
        return lhs;
    }

    public T getRhs() {
        return rhs;
    }

    public T getResult() {
        return result;
    }
}
