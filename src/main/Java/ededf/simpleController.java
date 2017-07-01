package ededf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/7/1.
 */
@Controller
public class simpleController {
    public String Hello() {
        return "index";
    }
}
