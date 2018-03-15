package com.bitcamp.web.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.mapper.BoardMapper;
import com.bitcamp.web.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired BoardMapper mapper;
	
	@Override
	public void addBoard(Command cmd) {
	
		
	}

	@Override
	public void updateBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardDTO> list(Command cmd) {
		List<BoardDTO> list = mapper.list(cmd);
		return list;
	}


	@Override
	public int count() {
	int count = mapper.count();
		return count;
	}

	@Override
	public List<BoardDTO> findById() {
		 
		return null;
	}

	@Override
	public BoardDTO findById(Command cmd) {
	
		return mapper.selectById(cmd);
	}
	
	

}
