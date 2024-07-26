package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@GetMapping("/Hello")
	@ResponseBody
	public String Hello() {
		return "Hello Spring Boot Board";
	}

}