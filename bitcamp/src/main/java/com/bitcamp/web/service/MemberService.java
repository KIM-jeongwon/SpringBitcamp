package com.bitcamp.web.service;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.TxDTO;
@Component
public interface MemberService {
	public void addMember(Command cmd);
	public MemberDTO findMemberById(Command cmd);
	public boolean exist(Command cmd);
	public void deleteMember(Command cmd);
	public TxDTO findByPhone(Command cmd);
}