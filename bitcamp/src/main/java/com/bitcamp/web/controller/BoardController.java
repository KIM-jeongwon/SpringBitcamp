package com.bitcamp.web.controller;


import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.Page;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.enums.ImageRepo;
import com.bitcamp.web.enums.Serv;
import com.bitcamp.web.enums.TnameEnum;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.proxy.FileProxy;
import com.bitcamp.web.proxy.PageProxy;
import com.bitcamp.web.service.BoardService;
@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired ShiftFactory shift;
	@Autowired BoardService service;
	@Autowired Command cmd;
	@Autowired BoardDTO board;
	@Autowired Page page;
	@Autowired PageProxy pagePxy;
	@Autowired FileProxy filePxy;
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String boardlist(Model model,
			@RequestParam(value="pageSize",defaultValue="5")String pageSize,
			@RequestParam(value="blockSize",defaultValue="5")String blockSize,
			@RequestParam(value="pageNum",defaultValue="1")String nowPage){
		page.setPageSize(Integer.parseInt(pageSize));
		page.setBlockSize(Integer.parseInt(blockSize));
		page.setNowPage(Integer.parseInt(nowPage));
		pagePxy.execute(model,page);
		/*new PageProxy(model).execute(page);*/
		return shift.create(TnameEnum.board.toString(),Serv.list.toString());

	}
	@RequestMapping(value="/write",method= RequestMethod.GET)
	public String write() {
		
		return shift.create(TnameEnum.board.toString(),Serv.write.toString());
	}
	@RequestMapping(value="/detail/{bbsSeq}", method=RequestMethod.GET)
	public String detail(Model model,
		 @PathVariable("bbsSeq") String bbsSeq) {
		board.setBbsSeq(bbsSeq);
		cmd.setBoard(board);
		BoardDTO detail = service.findById(cmd);
		model.addAttribute("content",detail.getContent());
		model.addAttribute("title",detail.getTitle());
		return shift.create(TnameEnum.board.toString(),Serv.detail.toString());
	}
	@RequestMapping(value="/fileupload" ,method=RequestMethod.POST)
	public String upload(FileProxy pxy,Model model) throws IllegalStateException, IOException {
	/*	List<MultipartFile> files = file.getFiles();*/
		String fileName = pxy.getFile().getOriginalFilename();
		System.out.println("업로드된파일 : "+fileName);
		String path = 
				ImageRepo.UPLOAD_PATH.toString()+ fileName;
		File file = new File(path);
		pxy.getFile().transferTo(file);
		model.addAttribute("uploadImage", path);
		return shift.create(TnameEnum.board.toString(),Serv.write.toString());
	}

}
