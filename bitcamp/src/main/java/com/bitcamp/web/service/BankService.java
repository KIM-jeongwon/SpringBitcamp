package com.bitcamp.web.service;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;


public interface BankService {

	public ResultMap create(Command cmd);

	public ResultMap findBank(Command cmd);


}
