package org.rudtyz.serious.multiplication;

import org.rudtyz.serious.multiplication.service.business.IntegerMultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicationController {

    @Autowired
    private IntegerMultiplicationService service;

    @RequestMapping("/")
    public String index(int lhs, int rhs) {
        return String.valueOf(service.multiplication(lhs, rhs));
    }
}
