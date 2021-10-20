package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String showHomePage() {
		//sysout there  bnv
		System.out.println("controller invoked once");
		return "home";
	}


}
