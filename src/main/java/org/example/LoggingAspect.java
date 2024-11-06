package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
    @Around("execution(* services.*.*(..))")
    public void around(ProceedingJoinPoint joinPoint){

    }
    @Around("execution(* services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint){

    }
}
