package kr.co.ch02.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/* 
 * 작성일: 2023.01.02
 * 작성자: 이원정
 * 내용: Spring IoC 실습하기
 */
public class IoCMain {
	public static void main(String[] args) {
		
		/*
		IoC를 활용하지 않은 기존의 자바 객체 생성 방법
		LgTV tv1 = new LgTV();
		SamsungTV tv2 = new SamsungTV();
		
		tv1.powerOn();
		tv1.soundUp();
		
		tv2.powerOff();
		tv2.soundDown();
		*/
		
		
		// IoC 적용: 스프링 컨테이너로 객체 주입 (ctx: 스프링 컨테이너)
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		LgTV lTv = ctx.getBean("ltv", LgTV.class);
		SamsungTV sTv =  ctx.getBean("stv", SamsungTV.class);
		
		lTv.powerOn();
		lTv.soundUp();
		
		sTv.powerOff();
		sTv.soundDown();
		
		
	}
}
