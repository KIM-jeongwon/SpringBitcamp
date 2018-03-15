package com.bitcamp.web.command;

import com.bitcamp.web.enums.Action;

import org.springframework.stereotype.Component;

import com.bitcamp.web.domain.AccountDTO;
import com.bitcamp.web.domain.AdminDTO;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.domain.TxDTO;


import lombok.Data;

@Data
@Component
public class Command {
	protected String cmd, dir,page,view,column,data;
	protected Action action;
	protected MemberDTO member;
	protected AccountDTO account;
	protected LottoDTO lotto;
	protected FoodDTO food;
	protected MobileDTO mobile;
	protected TxDTO tx;
	protected AdminDTO admin;
	protected BoardDTO board;
	protected Page paging;
	}

//