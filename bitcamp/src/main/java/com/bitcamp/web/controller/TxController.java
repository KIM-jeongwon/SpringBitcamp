package com.bitcamp.web.controller;

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
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.TxService;
@SessionAttributes("user")
@Controller
public class TxController {
	private static final Logger logger = LoggerFactory.getLogger(TxController.class);
	@Autowired TxDTO tx;
	@Autowired ShiftFactory shift;
	@Autowired Command cmd;
	@Autowired TxService service;
	@RequestMapping(value="/mobile/open", method =  RequestMethod.POST)
	public String open(Model model,
			@RequestParam("mobSeq")String mobSeq,
			@RequestParam("telecom")String telecom,
		    @ModelAttribute("user") MemberDTO member) {		
			logger.info("telecom is {}.",telecom);	
			tx.setCount("1");
			tx.setTxKey(member.getId()+mobSeq);
			tx.setPhoneNum(service.createPhoneN());	
			tx.setTelecom(telecom);		
			tx.setId(member.getId());		
			tx.setTotal("1");
			cmd.setTx(tx);
			service.createPhone(cmd);
			
			logger.info("cmd is {}.",cmd);	
			model.addAttribute(cmd);
			return shift.create("user", "mypage");
		/*
			total,regdate; --*/
		
	}
}
