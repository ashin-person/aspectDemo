package ljx.ashin.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 一个简单的切面样例
 * Created by AshinLiang on 2017/7/22.
 */
@Aspect
public class SimpleAspect {
    @Before("execution(* ljx.ashin.service.*.*.*(..))")//注意，这里的切点表达式的写法，前面要带上星号*
    public void doBeforeInServiceLayer(){
        System.out.println("=====================================");
        System.out.println("Aop: do before in Service layer");
        System.out.println("=====================================");

    }
}
