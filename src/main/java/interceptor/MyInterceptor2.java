package interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author:BY
 * Date:2020/4/4
 * Description:自定义拦截器
 */
public class MyInterceptor2 implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(MyInterceptor2.class);

    //    return true 放行，执行下一个拦截器，如果没有，执行controller中的方法
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        logger.info("controller方法执行前 : preHandle 执行");
        // request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        logger.info("controller方法执行后,success.jsp执行之前 : postHandle 执行");
        // request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        logger.info("success.jsp页面执行后 : afterCompletion 执行");
    }
}













