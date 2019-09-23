package com.etoak.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor implements HandlerInterceptor {
	private String testString = "";
	public void setTestString(String testString) {
		this.testString = testString;
	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {  
		
        System.out.println("************TestInterceptor 在DispatcherServlet之前执行**********"+testString);
      //UserModal user  = (UserModal) request.getSession().getAttribute("userInfo");
        //if(user == null){
          //  response.sendRedirect("/toLogin.do");
          //  return false;
       // }    这是对登录的拦截，获取登录是的session，如果获取不到将拦截跳转到登录界面。拦
        return true;  
    }  
  
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)  
            throws Exception {  
        System.out.println("************TestInterceptor 在controller执行之后执行*********");
    }  
  
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)  
            throws Exception {
        System.out.println("************TestInterceptor 在页面渲染完成返回给客户端之前执行**********");
    }  
}
