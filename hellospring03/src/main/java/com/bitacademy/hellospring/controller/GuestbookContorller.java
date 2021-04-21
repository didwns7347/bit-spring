package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/***
 * 
 * @author MyCom
 * @RequestMapping
 * type(class) 단독 메핑
 */

@Controller
@RequestMapping("/guestbook")
public class GuestbookContorller {
	@ResponseBody
	@RequestMapping()
	public String list() {
		return "GeustbookController:list()";
	}
	
	@ResponseBody
	@RequestMapping()
	public String delete() {
		return "GeustbookController:delete()";
	}
	
	
}
