package org.rudtyz.serious.multiplication.service;

import org.rudtyz.serious.multiplication.service.factory.StringPrinter;
import org.rudtyz.serious.multiplication.service.factory.StringPrinterFactory;
import org.rudtyz.serious.multiplication.service.strategies.MultiplicationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {
    private StringPrinter printer;

    private MultiplicationStrategy<Integer, Integer, Integer> multiplicationStrategy;

    public MultiplicationService(
            StringPrinterFactory factory,
            MultiplicationStrategy<Integer, Integer, Integer> multiplicationStrategy) {
        this.printer = factory.create();
        this.multiplicationStrategy = multiplicationStrategy;
    }

    public int multiplication(int lhs, int rhs) {
        printer.print(lhs + " * " + rhs + " = " + (lhs * rhs));
        return multiplicationStrategy.multiply(lhs, rhs);
    }

}
