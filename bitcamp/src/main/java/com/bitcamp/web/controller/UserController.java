package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.web.factory.ContextFactory;
@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired ContextFactory contextFactory;
	
	
	@RequestMapping("/mypage")
	
	public String MyPage(Model model) {
		model.addAttribute("context", (String) contextFactory.create());
		model.addAttribute("js", contextFactory.path("js"));
		model.addAttribute("css", contextFactory.path("css"));
		return "user/mypage"
				;
	}
	
	@RequestMapping("/nav")
	
	public String nav(Model model) {
		model.addAttribute("context", (String) contextFactory.create());
		model.addAttribute("js", contextFactory.path("js"));
		model.addAttribute("css", contextFactory.path("css"));
		return "common/nav";
		
	}
}
