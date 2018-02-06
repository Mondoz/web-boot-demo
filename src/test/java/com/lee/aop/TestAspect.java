package com.lee.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lcx on 2018/2/6 12:44.
 */
@Aspect
@Configuration
public class TestAspect {
	private Logger log = LogManager.getLogger(this.getClass());
	@Before("execution(* com.lee.service.Business.*(..))")
	public void before() {
		log.info("before business");
	}
}
