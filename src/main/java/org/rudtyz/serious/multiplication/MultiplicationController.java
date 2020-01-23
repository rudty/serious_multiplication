package org.rudtyz.serious.multiplication;

import org.rudtyz.serious.multiplication.service.business.DoubleMultiplicationService;
import org.rudtyz.serious.multiplication.service.business.IntegerMultiplicationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicationController {

    private final IntegerMultiplicationService integerMultiplicationService;
    private final DoubleMultiplicationService doubleMultiplicationService;

    public MultiplicationController(IntegerMultiplicationService integerMultiplicationService, DoubleMultiplicationService doubleMultiplicationService) {
        this.integerMultiplicationService = integerMultiplicationService;
        this.doubleMultiplicationService = doubleMultiplicationService;
    }

    @RequestMapping("/")
    public String index(int lhs, int rhs) {
        return String.valueOf(integerMultiplicationService.multiplication(lhs, rhs));
    }

    @RequestMapping("/double")
    public String doubleMultiplication(double lhs, double rhs) {
        return String.valueOf(doubleMultiplicationService.multiplication(lhs, rhs));
    }

}
