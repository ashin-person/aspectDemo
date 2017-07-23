package ljx.ashin.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 定义切点
 * Created by AshinLiang on 2017/7/23.
 */
@Aspect
public class PointAspect {

    @Pointcut("execution(* ljx.ashin.service.*.*.*(..))")
    public void myPointAspect(){};
}
