package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@ResponseBody
	@RequestMapping({"","/main"})
	//멀티 메핑
	
	public String main() {
		return "MainController:main()";
	}
}
