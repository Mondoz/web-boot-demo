package com.lee.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserLogAspect {

	private Logger log = LogManager.getLogger(this.getClass());

	@Before("execution(* com.lee.controllers.UserController.*(..))")
	public void beforeUserAccess(JoinPoint joinPoint) {
		log.info("before user access");
	}
}
