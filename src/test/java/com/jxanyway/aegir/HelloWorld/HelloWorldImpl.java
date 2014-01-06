package com.jxanyway.aegir.HelloWorld;

import javax.jws.WebService;

@WebService(endpointInterface="com.jxanyway.aegir.HelloWorld.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	public String sayHi(String name) {
		// TODO Auto-generated method stub
		System.out.println("这是一个测试 SayHi()");
		return "您好：" + name;
	}

}
