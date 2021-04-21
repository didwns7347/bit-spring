package com.bitacademy.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitacademy.guestbook.repository.GuestbookRepository;
import com.bitacademy.guestbook.vo.GuestbookVo;

@Controller
public class GuestbookController {
	@Autowired
	private GuestbookRepository repository;
	@RequestMapping("")
	public String index(Model model) {
		List<GuestbookVo> list = repository.findAll();
		model.addAttribute("list", list);
		return "WEB-INF/views/index.jsp";
	}
	@RequestMapping("/deleteform")
	public String form(Long no, Model model) {
		System.out.println(no);
		model.addAttribute("no", no);
		return "WEB-INF/views/deleteform.jsp";
	}
	@RequestMapping("/add")
	public String add(GuestbookVo Vo) {
		repository.insert(Vo);
		return "redirect:/";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("password")String password,@RequestParam("no") Long no) {
		repository.delete(password, no);
		return "redirect:/";
	}
}
