package org.rudtyz.serious.multiplication.service.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.rudtyz.serious.multiplication.service.support.MultiplicationPrintFacade;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MultiplicationExceptionProcessingAspect {
    private final MultiplicationPrintFacade multiplicationPrintFacade;

    public MultiplicationExceptionProcessingAspect(MultiplicationPrintFacade multiplicationPrintFacade) {
        this.multiplicationPrintFacade = multiplicationPrintFacade;
    }

    @Around("execution(* org.rudtyz.serious.multiplication.service.business.*.multiplication(..))")
    public Object handleOverflow(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            return joinPoint.proceed();
        } catch (ArithmeticException e) {
            Object[] args = joinPoint.getArgs();
            multiplicationPrintFacade.except((Number) args[0], (Number) args[1]);
            throw e;
        }
    }
}
