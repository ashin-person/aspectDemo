package ljx.ashin.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by AshinLiang on 2017/7/23.
 */
@Aspect
public class GuardAspect {

    @Before("execution(* ljx.ashin.service.*.*.*(..))")
    public Object printLogMsg(JoinPoint joinPoint){

        Object[] params = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().getName();
        System.out.println("===调用service的"+methodName+"方法，参数为"+params[0].toString()+"===");
        return null;
    }

   /* @Around("execution(* ljx.ashin.service.*.*.*(..))")
    *//**
     * 数据校验
     *//*
    public Object validataAround(ProceedingJoinPoint proceedingJoinPoint){
        Object resultObj = null;//返回结果
        Object[] params = proceedingJoinPoint.getArgs();
//        proceedingJoinPoint.

        return null;
    }*/

    /**
     * 检验是否为空
     * @param params
     */
    private void validateParams(Object[] params){

    }
}
