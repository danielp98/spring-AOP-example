package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

//    @Before("execution(* services.HelloService.hello(..))")
//    public void before(){
//        System.out.println("before hello method from the class HelloService");
//    }
//
//    @After("execution(* services.HelloService.hello(..))")
//    public void after(){
//        System.out.println("after hello method from the class HelloService");
//    }
//
//    @AfterReturning("execution(* services.HelloService.hello(..))")
//    public void afterReturning(){
//        System.out.println("after returning hello method from the class HelloService");
//    }
//
//    @AfterThrowing("execution(* services.HelloService.hello(..))")
//    public void afterThrowing(){
//        System.out.println("after throwing hello method from the class HelloService");
//    }

    @Around("execution(* services.HelloService.hello(..))")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("Something else before the return of the hello method from the HelloService class!!!");
        Object result = null;
        try {
            //can also replace the parameters of the method
            //result = joinPoint.proceed(new Object[] {"Pablo"});
            result = joinPoint.proceed();
            System.out.println("Something else after the return of the hello method from the HelloService class");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return result;
    }

}
