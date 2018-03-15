package com.bitcamp.web.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.controller.AuthController;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.mapper.MemberMapper;
import com.bitcamp.web.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	@Autowired MemberDTO member;
	@Autowired MemberMapper mapper;
	@Override
	public void addMember(Command cmd) {
		mapper.insertMember(cmd);
	}

	@Override
	public MemberDTO findMemberById(Command cmd) {
		return mapper.selectMemberById(cmd);
	}

	@Override
	public boolean exist(Command cmd) {
		logger.info("MemberServiceImpl login() ID is {}", cmd.getMember().getId());
		return (mapper.exist(cmd)  != 0) ? true : false;
	}

	@Override
	public void deleteMember(Command cmd) {
	}

	@Override
	public TxDTO findByPhone(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

}
