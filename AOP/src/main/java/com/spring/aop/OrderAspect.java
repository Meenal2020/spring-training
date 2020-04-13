package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class OrderAspect {

	@Pointcut("execution(* com.spring.aop.CustomerOrder.*(..))")
	public void pointcut() {
	}

	@Before("pointcut()")
	public void logBeforeAdvice(JoinPoint jp) {
		System.out.println("\n******Logging for order pre-processing.. " + jp.getSignature().getName() + " ******");
	}

	@After("pointcut()")
	public void logAfterAdvice(JoinPoint jp) {
		System.out.println("\n******Logging for order post-processing.." + jp.getSignature().getName() + " ******");
	}

	@AfterReturning("pointcut()")
	public void logAfterReturingAdvice(JoinPoint jp) {
		System.out.println(
				"\n******Logging for successful order post-processing.." + jp.getSignature().getName() + " ******");
	}

	@AfterThrowing("pointcut()")
	public void logAfterThrowingAdvice(JoinPoint jp) {
		System.out.println(
				"\n******Logging for unsuccessful order post-processing.." + jp.getSignature().getName() + " ******");
	}

	@Around("execution(* com.spring.aop.CustomerOrder.placeUpdatedOrder(..))")
	public void logAroundAdvice(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(
				"\n******Logging for *Around* order pre-processing.." + jp.getSignature().getName() + " ******");
		jp.proceed();
		System.out.println(
				"\n******Logging for *Around* order post-processing.." + jp.getSignature().getName() + " ******");

	}

}
