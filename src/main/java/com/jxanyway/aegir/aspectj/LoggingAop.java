package com.jxanyway.aegir.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class LoggingAop {

	@AfterReturning(returning = "rvt", pointcut = "execution(* com.jxanyway.aegir.service.*.*(..))")
	public void logging(Object rvt) {
		System.out
				.println(":::::::::@AfterReturning: 返回通知, 在方法返回结果之后执行=========>"
						+ rvt);
	}

}
