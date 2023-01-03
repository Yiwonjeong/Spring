package kr.co.ch03.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.ch03.sub1.Service;

public class AOPMain {
public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		AOPService service =  (AOPService) ctx.getBean("AOPService");
		
		// joinpoint
		System.out.println("------------------------");
		service.insert();
		
		// joinpoint
		System.out.println("------------------------");
		service.select();
		
		// joinpoint
		System.out.println("------------------------");
		service.update();
		
		// joinpoint
		System.out.println("------------------------");
		service.delete();
				
		
		
	}
}
