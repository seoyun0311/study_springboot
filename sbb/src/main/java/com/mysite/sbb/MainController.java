package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //MainController 클래스가 스프링 부트의 컨트롤러가 됨
public class MainController {
	@GetMapping("/sbb") // 브라우저가 URL 요청하면 스프링 부트는 요청 페이지와 매핑되는 메서드를 찾아 실행
	@ResponseBody // URL 요청에 대한 응답으로 문자열 리턴
	public String index() {
		return "안녕하세요 sbb에 오신 것을 환영합니다.";
	}
    @GetMapping("/")
    public String root() {
    	return "redirect:/question/list";
    }
}


// 스프링 부트는 웹브라우저로 부터 http://localhost:8080/sbb 요청이 발생하면 /sbb URL과 매핑되는 index 메서드를 MainController 클래스에서 찾아 실행