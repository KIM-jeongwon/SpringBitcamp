package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AdminDTO;
import com.bitcamp.web.mapper.AdminMapper;
import com.bitcamp.web.service.AdminService;

@Repository
public class AdminMapperImpl  implements AdminMapper{

	

	@Override
	public List<AdminDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addAdmin(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyAdmin(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAdmin(Command cmd) {
		// TODO Auto-generated method stub
		
	}

}
