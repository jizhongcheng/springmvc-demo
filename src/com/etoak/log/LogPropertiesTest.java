package com.etoak.log;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogPropertiesTest {

    public static void main(String[] args) {
        //解析配置文件
        PropertyConfigurator.configure( "D:/log4j.properties" );
        
        Logger log = LogManager.getLogger(LogPropertiesTest.class);
        log.debug("调试");
        log.info("信息");
        log.warn("警告");
//        log.error("错误");
        try {
        	int i = 10/0;
	      } catch (Exception e){
	          e.printStackTrace();
	      }
        
        log.fatal("致命错误");
    }

}
