package com.bitcamp.web.service;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.domain.AdminDTO;
@Component
public interface AdminService {
	public void addAdmin (Command cmd);
	public void updateAdmin(Command cmd);
	public void deleteAdmin(Command cmd);
	public List<AdminDTO> list();
	public List<AdminDTO> findById(); // not pk
	public AdminDTO findById(Command cmd); // pk
	public int count();

}