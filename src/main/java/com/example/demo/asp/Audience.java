package com.example.demo.asp;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @description: Audience
 * @author: leiming5
 * @date: 2020-11-02 14:32
 */
@Aspect
public class Audience {

    @Pointcut("execution(* com.example.demo.asp.Sing.perform(..))")
    public void perform(){}

    @Before("perform()")
    public void silenceCellPhone(){
        System.out.println("silence cell phone=========>");
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
