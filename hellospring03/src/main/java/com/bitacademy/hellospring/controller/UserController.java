package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * 
 * @author MyCom
 * @RequestMapping
 * Method(Handler) + type(class) 단독 메핑
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
	//GET방식으로 요청이 들어오면 응답
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/joinform.jsp";
	}
	
	//POST방식으로 요청이 들어올 경우 응답
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(UserVo vo) {
		System.out.println(vo);
		return "redirect:/main";
	}
	
	@ResponseBody
	@RequestMapping(value="/update")
	public String update(@RequestParam("n") String name) {
		/*
		 * 만일 n이라는 이름으로 파라미터가 전달되지 않으면 400 bad request오류 발생
		 * http://localhost:8080/hellospring03/user/update?n=asdf 에러 x
		 * http://localhost:8080/hellospring03/user/update에러
		 */
		System.out.println(name);
		return "UserController:update";
	}
	@ResponseBody
	@RequestMapping(value="/update")
	public String update2(
			@RequestParam(value="name",required=true, defaultValue="")String name,
			@RequestParam(value="age",required=true, defaultValue="0")int age){
		/*
		 * 만일 n이라는 이름으로 파라미터가 전달되지 않으면 400 bad request오류 발생
		 * http://localhost:8080/hellospring03/user/update?n=asdf 에러 x
		 * http://localhost:8080/hellospring03/user/update에러
		 * 가 발생하던 코드의 문제를 해겷함
		 */
		System.out.println(name);
		return "UserController:update";
	}
}
