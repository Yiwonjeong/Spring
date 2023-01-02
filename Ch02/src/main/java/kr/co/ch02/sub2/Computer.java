package kr.co.ch02.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "com")
public class Computer {
	
	// DI 1번 방법: 생성자 (Constructor Injection)
	private CPU cpu;
	
	@Autowired
	public Computer(CPU cpu) {
		this.cpu = cpu;
	}
	
	// DI 2번 방법: 세터 인젝션
	private RAM ram;
	
	@Autowired
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	
	// DI 3번 방법: 필드 인젝션 (주로 사용)
	@Autowired
	private HDD hdd;
	
	
	
	public void show() {
		cpu.show();
		ram.show();
		hdd.show();
	}
	
	
}
