package org.rudtyz.serious.multiplication;

import org.rudtyz.serious.multiplication.service.IntegerMultiplicationService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicationController {

    private IntegerMultiplicationService service;

    public String index(int lhs, int rhs) {
        return "result: " + service.multiplication(lhs, rhs);
    }
}
