package org.rudtyz.serious.multiplication.service.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MultiplicationExceptionProcessingAspect {
    @Around("execution(* org.rudtyz.serious.multiplication.service.business.*.multiplication(..))")
    public Object handleOverflow(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            return joinPoint.proceed();
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
