package kr.co.ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	// 요청함수 메소드 -> 요청 주소 매핑
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "/hello";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "/welcome";
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "/greeting";
	}
	
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:/user1/register";
	}
	
	// forward 주소 바뀌지 않음
	@GetMapping("/forward")
	public String forward() {
		return "forward:/user2/register";
	}
	
	
}
