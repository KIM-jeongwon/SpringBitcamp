package com.bitcamp.web.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bitcamp.web.command.Command;

import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.factory.ContextFactory;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.MemberService;

@SessionAttributes("user")

@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired ContextFactory contextFactory;
	@Autowired MemberService mService;
	@Autowired Command cmd;
	@Autowired MemberDTO member;
	@Autowired ShiftFactory shift;
	
	@RequestMapping("/login/{id}/{pass}")
	public String login(Model model, 
			@PathVariable("id") String id,
			@PathVariable("pass") String pass,
			 @ModelAttribute("phone") TxDTO tx) {
		logger.info("Move to {}", "user/login");
		logger.info("login() ID is {}", id);
		logger.info("login() PASSWORD is {}", pass);
		member.setId(id);
		member.setPass(pass);
		cmd.setMember(member);
		String path = shift.create("user","login");
		if(mService.exist(cmd)) {
			model.addAttribute("user", mService.findMemberById(cmd));
			model.addAttribute("phone",mService);
			model.addAttribute("account","");
			path = shift.create("user", "mypage");
		}
		return path;
	}
	@RequestMapping("/logout")
	public String logout(@ModelAttribute("user") MemberDTO user,SessionStatus status) {
		user = new MemberDTO();
		status.setComplete();
		logger.info("[컨트롤러 : 로그아웃 ]");
		return shift.redirect("user", "login");
	}
	
	@RequestMapping("/mypage")
	
	public String MyPage(Model model) {
		logger.info("USER CONTROLLER 진입 mypage(){}.","Enter || ");
		model.addAttribute("path",contextFactory.path());
		return shift.create("user", "mypage");
	}
	
	@RequestMapping("/nav")
	
	public String nav(Model model) {
		model.addAttribute("path",contextFactory.path());
		return shift.create("common","nav");
		
	}

	@RequestMapping("/join/{id}/{pass}/{name}")
	public String join(
			@PathVariable("id") String id,
			@PathVariable("pass") String pass,
			@PathVariable("name") String name) {
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		cmd.setMember(member);
		mService.addMember(cmd);
		return shift.redirect("user", "login");
	}



	
}
