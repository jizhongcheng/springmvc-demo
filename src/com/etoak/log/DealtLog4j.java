package com.etoak.log;

import java.io.File;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import com.etoak.bean.User;

public class DealtLog4j
{
  private static String logFilePath = "d:/logger";

//  private static HashMap WIP_SYSPROP = (HashMap)ServletContextUtil.getServletContext().getAttribute("WIP_SYSPROP");
//  private static String wip_uri_init = (String)WIP_SYSPROP.get("WIP_URI_INIT");
  private static String wip_uri_init = "aaa";

  public static void SetLogInfoFileName(String filename, Logger logger) {
	  System.out.println(1);
    logger.removeAllAppenders();
    logger.setLevel(Level.INFO);
    logger.setAdditivity(true);
    FileAppender appender = new DailyRollingFileAppender();
    PatternLayout layout = new PatternLayout();
    String conversionPattern = "[%d] %p %t %c - %m%n";
    layout.setConversionPattern(conversionPattern);
    appender.setLayout(layout);
    appender.setFile(logFilePath + wip_uri_init + File.separator + filename + "_info.log");
    appender.setEncoding("UTF-8");
    appender.setAppend(true);
    appender.activateOptions();
    logger.addAppender(appender);
  }

  public static void SetLogErrorFileName(String filename, Logger logger) {
    logger.removeAllAppenders();
    logger.setLevel(Level.DEBUG);
    logger.setAdditivity(true);
    FileAppender appender = new DailyRollingFileAppender();
    PatternLayout layout = new PatternLayout();
    String conversionPattern = "[%d] %p %t %c - %m%n";
    layout.setConversionPattern(conversionPattern);
    appender.setLayout(layout);
    appender.setFile(logFilePath + wip_uri_init + File.separator + filename + "_error.log");
    appender.setEncoding("UTF-8");
    appender.setAppend(true);
    appender.activateOptions();
    logger.addAppender(appender);
  }
  
  
  
  
  private static final Logger logger = Logger.getLogger(User.class);
  public static void main(String[] args)throws Exception {
  	DealtLog4j logs = new DealtLog4j();
  	logs.SetLogErrorFileName("Test",logger);
  	for(int i = 0; i < 1000;i++){
  		if(i%10 == 0){
//  			Thread.sleep(1000);
  			logger.info(i);
  		}
  		aa();
  	}
  	
      System.out.println("over");
  }
  
  public static void aa(){
	  try {
	      	String b = "20160519";
	      	String d = b.substring(b.length()+1);
//	      	System.out.println(d);
//	      	System.out.println(2);
	      } catch (Exception e) {
	    	  logger.info("info");
	    	  System.out.println(3);
	    	  logger.error("error",e);
	    	  System.out.println(4);
//	          e.printStackTrace();
	      }
  }
}