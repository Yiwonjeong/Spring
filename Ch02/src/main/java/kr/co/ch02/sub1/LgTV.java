package kr.co.ch02.sub1;

import org.springframework.beans.factory.annotation.Autowired;

public class LgTV {
	
	@Autowired
	private Speaker spk;	
	// 멤버(참조 변수)로 선언 -> 현재 초기화 하지 않은 상태라 null임 -> application.xml에 bean 등록 & autowired 
	
	
	public void powerOn() {
		System.out.println("LgTV powerOn...");
	}
	public void powerOff() {
		System.out.println("LgTV powerOff...");
	}
	public void soundUp() {
		//System.out.println("LgTV soundUp...");
		spk.soundUp();
	}
	public void soundDown() {
		//System.out.println("LgTV soundDown...");
		spk.soundDown();
	}
}
