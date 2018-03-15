package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MobileDTO;
@Component
public interface MobileMapper {
	public List<MobileDTO> list();
	   public void addMobile  (Command cmd);
	    public void modifyMobile (Command cmd);
	    public void removeMobile (Command cmd);
	    public List<MobileDTO> selectAll();
	    public MobileDTO selectById(Command cmd);
	    public int selectCount();
	



	
}
