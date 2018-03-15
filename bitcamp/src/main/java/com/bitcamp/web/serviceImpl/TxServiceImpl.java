package com.bitcamp.web.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.mapper.TxMapper;
import com.bitcamp.web.service.TxService;

@Service
public class TxServiceImpl implements TxService{
	private static final Logger logger = LoggerFactory.getLogger(TxServiceImpl.class);
	@Autowired TxMapper mapper;
	
	@Override
	public void createPhone(Command cmd) {
		logger.info("Mo@@#####l is {}.");
		
		mapper.create(cmd);
		// TODO Auto-generated method stub
		
	}

	@Override
	public String createPhoneN() {
		
		return "010 - "+(int) (Math.random() * 8999 + 1000)+" - "+(int) (Math.random() * 8999 + 1000);
	}
}
