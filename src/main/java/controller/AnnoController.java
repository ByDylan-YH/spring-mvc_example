package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

/**
 * Author:BY
 * Date:2020/3/31
 * Description: controller一些常用注解
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes("test") // 把test=test存入到session域
public class AnnoController {
    //    获取参数内容
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println(username);
        return "success";
    }

    //    获取body内容
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println(body);
//        uname=qwe&age=qwe
        return "success";
    }

    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id) {
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println(cookieValue);
        return "success";
    }

    //    @RequestMapping("/testModelAttribute")
//    public String testModelAttribute(User user) {
//        System.out.println("testModelAttribute 被执行");
//        System.out.println(user);
//        return "success";
//    }

    //    1.如果它有返回值,那么在正常的请求方法内加参数即可拿到
//    @ModelAttribute
//    public User showUser(String uname) {
//        System.out.println("ModelAttribute 优先执行,相当于init");
//        User user = new User();
//        user.setUname(uname);
//        user.setAge(0);
//        user.setDate(new Date());
//        System.out.println("showUser : " + user);
//        return user;
//    }
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("result") String result) {
        System.out.println("testModelAttribute 被执行");
        System.out.println(result);
        return "success";
    }

    //    2.如果它没有返回值,则把它存入map,后面的方法用注解获取值
    @ModelAttribute
    public void showUser(String uname, Map<String, String> resultMap) {
        System.out.println("ModelAttribute 优先执行,相当于init");
        resultMap.put("result", "ModelAttribute result");
    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model) {
        System.out.println("testSessionAttributes");
        model.addAttribute("test", "test");
        return "success";
    }

    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap) {
        System.out.println("getSessionAttributes : " + modelMap.getAttribute("test"));
        return "success";
    }

    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "success";
    }

}
