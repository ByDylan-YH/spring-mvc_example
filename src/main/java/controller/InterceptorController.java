package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:BY
 * Date:2020/4/4
 * Description:
 */
@Controller
@RequestMapping("/interceptor")
public class InterceptorController {
    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        System.out.println("testInterceptor执行了...");
        return "success";
    }
}
