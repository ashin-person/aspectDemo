package ljx.ashin.test;

import ljx.ashin.service.StudentService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by AshinLiang on 2017/7/22.
 */
public class StudentServiceImplTest extends BaseTest {
    @Resource
    private StudentService studentService;

    @Test
    public void getStudentInfo(){
        studentService.getStduentInfo("ashin");
    }
}
