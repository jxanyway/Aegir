package com.jxanyway.aegir.HelloWorld;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	
	public String sayHi(@WebParam(name="name") String name);

}
