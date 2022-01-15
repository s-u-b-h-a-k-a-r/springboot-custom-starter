package com.subhakar.spring.impl;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Slf4j
public class LogMethodExecutionTimeAspect {
    @Around("@annotation(com.subhakar.spring.annotations.LogMethodExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        final long start = System.currentTimeMillis();
        final Object proceed = proceedingJoinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        log.info(proceedingJoinPoint.getSignature() + " executed in " + executionTime + "ms");
        return proceed;
    }
}
