package com.bitcamp.web.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.MobileService;

@SessionAttributes("user")
@Controller
public class MobileController {
	private static final Logger logger = LoggerFactory.getLogger(MobileController.class);
	@Autowired Command cmd;
	@Autowired ShiftFactory shift;
	@Autowired MobileService service;
	@Autowired MobileDTO mobile;
	
	@RequestMapping("/mobile/shop")
	public String shop(Model model) {		
		List<MobileDTO> phones = service.phones();
		logger.info("MobileController is {}.", phones);	
		model.addAttribute("phones",phones);
		return shift.create("mobile", "open");
		
	}
	
	
}
