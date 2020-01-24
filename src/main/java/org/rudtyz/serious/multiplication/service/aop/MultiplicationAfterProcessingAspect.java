package org.rudtyz.serious.multiplication.service.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.rudtyz.serious.multiplication.service.support.NumberMultiplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MultiplicationAfterProcessingAspect {
   private final ApplicationEventPublisher multiplicationEventPublisher;

   public MultiplicationAfterProcessingAspect(
           ApplicationEventPublisher multiplicationEventPublisher){
      this.multiplicationEventPublisher = multiplicationEventPublisher;
   }

   @AfterReturning(
           value = "execution(* org.rudtyz.serious.multiplication.service.business.*.multiplication(..))",
           returning = "returnValue")
   public void handleNumberEvent(JoinPoint joinPoint, Object returnValue) {
      Object[] args = joinPoint.getArgs();
      multiplicationEventPublisher.publishEvent(
              new NumberMultiplicationEvent(
                      (Number) args[0],
                      (Number)args[1],
                      (Number)returnValue));
   }
}
