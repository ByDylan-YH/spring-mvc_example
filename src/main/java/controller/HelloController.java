package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:BY
 * Date:2020/3/29
 * Description:
 */
@Controller
public class HelloController {
//    入门案例
    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("Hello Spring MVC ^_^");
        return "success";
    }
}
