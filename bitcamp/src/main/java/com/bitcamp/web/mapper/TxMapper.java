package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.TxDTO;

@Component
public interface TxMapper {

	public void create(Command cmd);
    public void openTx(Command cmd);
    public void modifyTx (Command cmd);
    public void removeTx (Command cmd);
    public List<TxDTO> list();
    public List<TxDTO> selectAll();
    public TxDTO selectById(Command cmd);
    public int selectCount();
}
