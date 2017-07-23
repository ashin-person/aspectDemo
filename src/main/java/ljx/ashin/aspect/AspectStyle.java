package ljx.ashin.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 四种切面类型的使用
 * Created by AshinLiang on 2017/7/23.
 */
@Aspect
public class AspectStyle {
    @Before("execution(* ljx.ashin.service.*.*.*(..))")
    public void beforeDo(){
        System.out.println("Before执行方法之前");
    }

    @After("execution(* ljx.ashin.service.*.*.*(..))")
    public void afterDo(){
        System.out.println("After最终执行");
    }

    @AfterReturning("execution(* ljx.ashin.service.*.*.*(..))")
    public void afterReturningDo(){
        System.out.println("AfterReturning方法执行完之后return返回之前");
    }

    @AfterThrowing("execution(* ljx.ashin.service.*.*.*(..))")
    public void afterThrowingDo(){
        System.out.println("AfterThrowing抛异常是执行");
    }

    @Around("execution(* ljx.ashin.service.*.*.*(..))")
    public Object validataAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around环绕方法执行");
        Object resultObj = null;
        resultObj = proceedingJoinPoint.proceed();
        return resultObj;
    }

}
