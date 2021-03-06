package com.example.demo.asp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * @description: Audience
 * @author: leiming5
 * @date: 2020-11-02 14:32
 */
@Aspect
public class Audience {

    @Pointcut("execution(* com.example.demo.asp.Sing.*(..))")
    public void perform(){}

    @Around("perform()")
    public void silenceCellPhone(ProceedingJoinPoint joinPoint){

        // 解析参数
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;

        String[] parameterNames = methodSignature.getParameterNames();

    }


    @Before("perform()")
    public  void takeSeat(){

        System.out.println("take seat=========>");
    }

    @AfterReturning("perform()")
    public void applause(){
        System.out.println("applause=========>");
    }

    @AfterThrowing("perform()")
    public void demandRefund(){

        System.out.println("Demand a Refund========>");
    }
}
