package com.xgj.server;


import com.xgj.entity.Demo;
import com.xgj.service.TestService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testServer {
    private static Log logger = LogFactory.getLog(testServer.class);

    public static void main(String args[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestService testService = (TestService) ctx.getBean("testService");
        logger.info("执行结果：" + testService.test(new Demo()));
    }
}
