package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AdminDTO;

@Component
public interface AdminMapper {
	public void addAdmin  (Command cmd);
    public void modifyAdmin (Command cmd);
    public void removeAdmin (Command cmd);
    public List<AdminDTO> list();
    public List<AdminDTO> selectAll(); 
    public AdminDTO selectById(Command cmd);
    public int count();
}
