package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){
        System.out.println(jp.getArgs()[0].toString());
        System.out.println("Before LoggingAspect");
    }

    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After LoggingAspect");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "val")
    public void afterReturning(int val) {
        System.out.println("AfterReturning LoggingAspect : " + val);
    }
}