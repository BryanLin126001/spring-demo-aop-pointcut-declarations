package ntt.global.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect
{
    @Pointcut("execution(public *  ntt.global.aopdemo.*.*.* (..))")
    private void forDaoPackage(){}

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice()
    {
        System.out.println("=====> logging before method running !!!");
    }

    @Before("forDaoPackage()")
    public void performApiAnalytics()
    {
        System.out.println("=====> logging Perform API Analytics !!!");
    }
}
