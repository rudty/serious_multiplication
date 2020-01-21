package org.rudtyz.serious.multiplication.service.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.rudtyz.serious.multiplication.service.support.IntegerMultiplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MultiplicationProcessingAspect {
   private final ApplicationEventPublisher multiplicationEventPublisher;

   public MultiplicationProcessingAspect(
           ApplicationEventPublisher multiplicationEventPublisher){
      this.multiplicationEventPublisher = multiplicationEventPublisher;
   }

   @AfterReturning(
           value = "execution(* org.rudtyz.serious.multiplication.service.business.*.*(..))",
           returning = "returnValue")
   public void handleInteger(JoinPoint joinPoint, Object returnValue) {
      Object[] args = joinPoint.getArgs();
      multiplicationEventPublisher.publishEvent(
              new IntegerMultiplicationEvent(
                      (Integer)args[0],
                      (Integer)args[1],
                      (Integer)returnValue));
   }
}
