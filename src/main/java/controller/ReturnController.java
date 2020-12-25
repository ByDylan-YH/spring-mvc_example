package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Author:BY
 * Date:2020/4/1
 * Description:测试返回值
 * 请求地址: http://localhost:8080/response.jsp
 */
@Controller
@RequestMapping("/return")
public class ReturnController {

    //    这是开发的一般流程,页面请求进来,方法中得出结果通过model返回给页面
    @RequestMapping("/testString")
    public String testString(Model model) {
//        模拟从数据库中查询user对象
        User user = new User();
        user.setUname("by");
        user.setAge(25);
        user.setDate(new Date());
        model.addAttribute("user", user);
        return "success";
    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("void");
//        1.默认会去pages目录下请求一个叫方法名.jsp文件
        try {
//        2.请求转发[一次请求],注意这里不会去请求视图解析器
//            request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
            //        3.重定向[2次请求]
//            response.sendRedirect(request.getContextPath()+"/index.jsp");
//            4.直接进行响应
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().println("你好");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    返回string实际也是这样实现
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(Model model) {
        ModelAndView view = new ModelAndView();
//        模拟从数据库中查询user对象
        User user = new User();
        user.setUname("by");
        user.setAge(25);
        user.setDate(new Date());
//        1.它会把user存入request对象
        view.addObject("user", user);
//        2.跳转到哪个页面
        view.setViewName("success");
        return view;
    }

    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect() {
//        1.请求转发[请求1次],不会获取视图解析器,需要写全路径
//        return "forward:/WEB-INF/pages/success.jsp";
//        2.重定向[请求2次]
        return "redirect:/index.jsp";
    }

//    异步请求和响应的过程
//    @ResponseBody 会把user对象转成json
    @RequestMapping("/textAjax")
    public @ResponseBody User textAjax(@RequestBody User user) {
//        客户端发送ajax的请求,传的是json字符串,后端把json字符串封装到user对象
        System.out.println(user);
        return user;
    }
}
