package com.etoak.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etoak.bean.User;
import com.etoak.dao.TestDao;



@Controller
public class TestController {
	private static Logger logger = Logger.getLogger(TestController.class);
	@Autowired
	private TestDao testDao;

	@RequestMapping(value = "/selectuser", method = RequestMethod.POST)  
	@ResponseBody 
	public String selectUser(){
		System.out.println("======================000");
		Map map = new HashMap();
		List<User> list = testDao.selectUser();
		return "0000";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(){
		int a = 1/0;
		System.out.println("登录成功");
		return "index";
	}
}
