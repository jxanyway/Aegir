package com.jxanyway.aegir.HelloWorld;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloWorldClientTest {
	@Test
	@SuppressWarnings("resource")
	public void HelloWorld(){
		
		final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ClientBeanTest.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloClient");
		String hello = helloWorld.sayHi("路飞");
		System.out.println(hello);
		logger.debug("==========>哈哈哈哈哈");
	}

}
