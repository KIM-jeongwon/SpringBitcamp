package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;


@Component
public interface BoardService {
	public void addBoard (Command cmd);
	public void updateBoard(Command cmd);
	public void deleteBoard(Command cmd);
	public List<BoardDTO> list(Command cmd);
	public List<BoardDTO> findById(); // not pk
	public BoardDTO findById(Command cmd); // pk
	public int count();
}
