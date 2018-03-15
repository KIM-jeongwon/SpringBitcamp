package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.mapper.BoardMapper;
import com.bitcamp.web.service.BoardService;

@Repository
public class BoardMapperImpl implements BoardMapper{
	private static final Logger logger = LoggerFactory.getLogger(BoardMapperImpl.class);
	@Autowired SqlSession sqlSession;
	

	@Override
	public List<BoardDTO> list(Command cmd) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("selectBoard",cmd);
	}

	@Override
	public List<BoardDTO> selectAll() {
	
		return null;
	}

	@Override
	public BoardDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("selectCount",cmd);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("boardCount");
	}

	@Override
	public void addBoard(Command cmd) {
		
	}

	@Override
	public void modifyBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

}
