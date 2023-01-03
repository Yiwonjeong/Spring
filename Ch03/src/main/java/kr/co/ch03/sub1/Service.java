package kr.co.ch03.sub1;
// 핵심기능 

import org.springframework.stereotype.Component;

// component 등록
@Component
public class Service {
	
	public void insert() {
		System.out.println("핵심관심 - insert...");
	}
	public void select() {
		System.out.println("핵심관심 - select...");
	}
	public void update() {
		System.out.println("핵심관심 - update...");
	}
	public void delete() {
		System.out.println("핵심관심 - delete...");
	}
	
}
