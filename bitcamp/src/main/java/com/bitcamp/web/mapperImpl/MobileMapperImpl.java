package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.mapper.MobileMapper;

@Repository
public class MobileMapperImpl implements MobileMapper{
	private static final Logger logger = LoggerFactory.getLogger(MobileMapperImpl.class);
	@Autowired SqlSessionTemplate sqlSession;
	String ns = "com.bitcamp.web.mapperImpl.MobileMapperImpl.";

	@Override
	public List<MobileDTO> list() {
		logger.info("MobileMapperImpl is {}.");
		return sqlSession.selectList("list");
		
	}



	@Override
	public List<MobileDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MobileDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void addMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void modifyMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void removeMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}




}
