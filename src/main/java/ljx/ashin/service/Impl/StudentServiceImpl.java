package ljx.ashin.service.Impl;

import ljx.ashin.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * Created by AshinLiang on 2017/7/22.
 */
@Service
public class StudentServiceImpl implements StudentService{
    public void getStduentInfo(String name) {
        System.out.println("getStduentInfoService"+name);
    }
}
