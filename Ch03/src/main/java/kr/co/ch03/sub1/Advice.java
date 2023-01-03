package kr.co.ch03.sub1;
// 부가기능

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Advice {

	// pointcut 선언 (내용이 없는 메소드 선언)
	@Pointcut("execution(* kr.co.ch03..Service.*(..))")
	public void beforePointcut() {}
	
	@Pointcut("execution(* kr.co.ch03..Service.*(..))")
	public void afterPointcut() {}
	
	
	
	// before가 언제 weaving 되는지 정해주는 어노테이션
	@Before("beforePointcut()")
	public void before() {
		System.out.println("횡단관심 - before...");
	}
	
	// after가 언제 weaving 되는지 정해주는 어노테이션
	@After("afterPointcut()")
	public void after() {
		System.out.println("횡단관심 - after...");
	}
	
	
	
	
	
}
