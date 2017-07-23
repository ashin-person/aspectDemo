package ljx.ashin.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 通告
 * Created by AshinLiang on 2017/7/23.
 */
@Aspect
public class AdviceAspect {

    @Before("ljx.ashin.aspect.PointAspect.myPointAspect()")
    public void logInfo(){
        System.out.println("========================");
        System.out.println("打印出我的通告的日志");
        System.out.println("========================");
    }
}
