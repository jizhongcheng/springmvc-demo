package com.etoak.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class BaseInterceptor implements HandlerInterceptor{
	 /** 
     * 在DispatcherServlet之前执行 
     * */  
    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {  
        System.out.println("************BaseInterceptor 在DispatcherServlet之前执行**********");
      //UserModal user  = (UserModal) request.getSession().getAttribute("userInfo");
        //if(user == null){
          //  response.sendRedirect("/toLogin.do");
          //  return false;
       // }    这是对登录的拦截，获取登录是的session，如果获取不到将拦截跳转到登录界面。拦截器的登录应用基本都是对session的应用
        return true; 
    }  
  
    /** 
     * 在controller执行之后的DispatcherServlet之后执行 
     * */  
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)  
            throws Exception {  
        System.out.println("************BaseInterceptor 在controller执行之后执行**********");
    }  
      
    /** 
     * 在页面渲染完成返回给客户端之前执行 
     * */  
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)  
            throws Exception {  
        System.out.println("************BaseInterceptor 在页面渲染完成返回给客户端之前执行 **********");
//      Thread.sleep(10000);  
    }  
}
