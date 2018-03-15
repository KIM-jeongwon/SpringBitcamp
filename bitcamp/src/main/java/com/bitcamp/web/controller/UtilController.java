package com.bitcamp.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.web.command.Path;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.factory.ContextFactory;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.LottoService;

@Controller
public class UtilController {
	private static final Logger logger = LoggerFactory.getLogger(UtilController.class);
	@Autowired ContextFactory contextFactory;
	@Autowired Path path;
	@Autowired LottoService service;
	@Autowired LottoDTO lotto;
	@Autowired ShiftFactory shift;
	@RequestMapping("/lotto/{money}")
	public String money(@PathVariable String money,Model model) {		
		logger.info("Money is {}.", money);		
		lotto.setMoney(money);	    
		logger.info("호이 is {}", service.createLottos(lotto));
		model.addAttribute("lottos",service.createLottos(lotto));
		model.addAttribute("money",money);
		return shift.create("lotto", "result");
	}

}
