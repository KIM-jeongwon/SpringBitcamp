package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.mapper.TxMapper;

@Repository
public class TxMapperImpl implements TxMapper{
	private static final Logger logger = LoggerFactory.getLogger(TxMapperImpl.class);
	@Autowired SqlSessionTemplate sqlSession;
	
	
	@Override
	public void create(Command cmd) {
		logger.info("createcreate !!@@ is {}.");
		sqlSession.insert("create",cmd);
	}


	@Override
	public void openTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}


	

	@Override
	public List<TxDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<TxDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public TxDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void modifyTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}
}
