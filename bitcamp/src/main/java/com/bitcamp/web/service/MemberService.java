package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

public interface MemberService {
	public ResultMap findMemberById(Command cmd);
	public ResultMap make();
	public ResultMap login(Command cmd);
	public ResultMap changePass(Command cmd);
	public ResultMap DeleteId(Command cmd);
	public ResultMap CreateBank();
}