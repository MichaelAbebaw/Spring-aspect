package com.aspect.aspectdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* com.aspects.aspectdemo.service.CommentService.publishComment(..))") // aspectJ pointcut - http://mng.bz/4K9g
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Method will execute" + this.getClass().toString());
        joinPoint.proceed();
        logger.info("Method executed" + this.getClass().toString());
    }

    @Around("execution(* com.aspects.aspectdemo.service.CommentService.publishComment2(..))")
    public Object log2(ProceedingJoinPoint joinPoint) throws Throwable {
        // print the name and parameters of the intercepted method
        logger.info("Method : " + joinPoint.getSignature().getName() + " with param " + Arrays.asList(joinPoint.getArgs()));
        return joinPoint.proceed();
    }

}
