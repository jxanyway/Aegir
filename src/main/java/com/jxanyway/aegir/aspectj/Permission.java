package com.jxanyway.aegir.aspectj;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class Permission {

	@Before("execution(* com.jxanyway.aegir.service.*.*(..))")
	public void permission(JoinPoint joinPoint) {
		System.out.println("@Before: 前置通知, 在方法执行之前执行");

		System.out.println("方法签名声明类型:"
				+ joinPoint.getSignature().getDeclaringType());
		System.out.println(":::::方法签名名称:" + joinPoint.getSignature().getName());
		System.out.println("::::::::::::参数:"
				+ Arrays.toString(joinPoint.getArgs()));
		System.out.println(":::::::::目标对象："
				+ joinPoint.getTarget().getClass().getName());
		System.out.println(":::::::::代理对像："
				+ joinPoint.getThis().getClass().getName());

	}

}
