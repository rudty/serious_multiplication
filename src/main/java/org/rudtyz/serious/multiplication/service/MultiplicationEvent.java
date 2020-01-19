package org.rudtyz.serious.multiplication.service;

public class MultiplicationEvent {
    private final int lhs, rhs, result;

    public MultiplicationEvent(int lhs, int rhs, int result) {
        this.lhs = lhs;
        this.rhs = rhs;
        this.result = result;
    }

    public int getLhs() {
        return lhs;
    }

    public int getRhs() {
        return rhs;
    }

    public int getResult() {
        return result;
    }
}
