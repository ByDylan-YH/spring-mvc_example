package controller;

import entity.Account;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Author:BY
 * Date:2020/3/30
 * Description: 请求参数解析
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    //    请求参数绑定
    @RequestMapping(path = "/testParam")
    public String testParam(String username, String password) {
        System.out.println("testParam: " + username + " : " + password);
        return "success";
    }

    //    请求参数绑定封装到JavaBean
    @RequestMapping(path = "/saveAccount")
    public String saveAccount(Account account) {
        System.out.println(account);
        return "success";
    }
    //    自定义类型转换器
    @RequestMapping(path = "/saveUser")
    public String saveUser(User user) {
        System.out.println(user);
        return "success";
    }

    //    原生的API
    @RequestMapping(path = "/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        System.out.println(response);
        return "success";
    }

}
