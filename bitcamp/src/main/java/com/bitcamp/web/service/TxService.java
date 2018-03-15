package com.bitcamp.web.service;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;

@Component
public interface TxService {
	public void createPhone(Command cmd);
	public String createPhoneN();
}
