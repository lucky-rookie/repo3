package com.imooc.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAdvice {

    @Before(value = "myPointCut()")
    public void advice(JoinPoint joinPoint) {
        System.out.println("前置通知=================="+joinPoint);
    }

    @AfterReturning(value = "execution(* com.imooc.demo.ProductDao.update(..))",returning="result")
    public void afterReturning(Object result) {
        System.out.println("后置通知=================="+result);
    }

    @Around(value = "myPointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前通知=================");
        Object obj=proceedingJoinPoint.proceed();
        System.out.println("环绕后通知=================");
        return obj;
    }

    @AfterThrowing(value = "execution(* com.imooc.demo.ProductDao.find*(..))",throwing = "e")
    public void afterthrow(Throwable e) {
        System.out.println("异常抛出通知================"+e);
    }

    @After(value = "execution(* com.imooc.demo.ProductDao.findAll(..))")
    public void after() {
        System.out.println("最终通知====================");
    }

    @Pointcut(value = "execution(* com.imooc.demo.ProductDao.findAll(..))||execution(* com.imooc.demo.ProductDao.delete(..))")
    private void myPointCut(){}
}
