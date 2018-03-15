package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;

@Component
public interface BoardMapper {
	public void addBoard  (Command cmd);
    public void modifyBoard (Command cmd);
    public void removeBoard (Command cmd);
    public List<BoardDTO> list(Command cmd);
    public List<BoardDTO> selectAll(); 
    public BoardDTO selectById(Command cmd);
    public int count();

}
