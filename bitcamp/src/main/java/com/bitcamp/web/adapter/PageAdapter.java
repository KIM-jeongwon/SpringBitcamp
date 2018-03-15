package com.bitcamp.web.adapter;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.Page;
import com.bitcamp.web.service.BoardService;


@Component
public class PageAdapter {
	@Autowired Command cmd;
	@Autowired BoardService boardService;

	public Command attr(Page page) {		
		page.setTotalCount(boardService.count());
		System.out.println("전체게시글"+page.getTotalCount());
		page.setTotalPage(0);
		System.out.println("전체 페이지 개수"+page.getTotalPage());
		System.out.println("블록갯수"+page.getBlockSize());
		page.setPageStart(0); 
		System.out.println("페이지 스타트"+page.getPageStart());
		page.setPageEnd(0);
		System.out.println("페이지 엔드"+page.getPageEnd());
		page.setPreBlock(false);
		System.out.println("전블록"+page.isPreBlock());
		page.setNextBlock(false);
		System.out.println("후블록"+page.isNextBlock());
		page.setStartRow(0);
		System.out.println("로우 스타트 "+page.getStartRow());
		page.setEndRow(0);
		System.out.println("로우 엔드"+page.getEndRow());
		System.out.println("페이지넘버"+page.getPageNum());
		System.out.println("페이지 종료");
		cmd = new Command();
		cmd.setPaging(page);
		return cmd;		
	}
}


