package com.itheima.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component("logger")
@Aspect
public class Logger {

    @Pointcut("execution(* *..*.*(..))")
    public void f(){}

    //@Before("f()")
    public  void befforePrintLog(){
        System.out.println("before打印日志信息");
    }
    //@AfterReturning("f()")
    public  void afterPrintLog(){
        System.out.println("after打印日志信息");
    }
    //@AfterThrowing("f()")
    public  void exceptnomPrintLog(){
        System.out.println("exception打印日志信息");
    }
    //@After("f()")
    public  void closePrintLog(){
        System.out.println("close打印日志信息");
    }

    @Around("f()")
    public  Object arroundPrintLog(ProceedingJoinPoint pjp){
        Object p;
        try {
            Object[] args = pjp.getArgs();
             p = pjp.proceed(args);
            System.out.println("arroundPrintLog.....");
            return p;
        } catch (Throwable throwable) {

            throwable.printStackTrace();
            return null;
        }finally {

        }
    }
}
