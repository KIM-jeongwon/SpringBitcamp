package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

public interface MobileService {

	public ResultMap makePhone(Command cmd);

	public ResultMap findMobile(Command cmd);



}
