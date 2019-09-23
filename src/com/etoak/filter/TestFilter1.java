package com.etoak.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class TestFilter1 extends OncePerRequestFilter {
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)  
            throws ServletException, IOException {  
        //在DispatcherServlet之前执行  
		System.out.println("############TestFilter1 before############");
        filterChain.doFilter(request, response);
        //在视图页面返回给<a target="_blank" href="http://www.07net01.com/tags-%E5%AE%A2%E6%88%B7%E7%AB%AF-0.html" class="infotextkey" >客户端</a>之前执行，但是执行顺序在Interceptor之后  
        System.out.println("############TestFilter1 after############");

//      try {  
//          Thread.sleep(10000);  
//      } catch (InterruptedException e) {  
//          e.printStackTrace();  
//      }  
    } 
}
