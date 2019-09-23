package com.etoak.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class TestFilter2 extends OncePerRequestFilter{
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)  
            throws ServletException, IOException {  
        System.out.println("############TestFilter2 before############");
        filterChain.doFilter(request, response);  
        System.out.println("############TestFilter2 after############");
  
    }  
}
