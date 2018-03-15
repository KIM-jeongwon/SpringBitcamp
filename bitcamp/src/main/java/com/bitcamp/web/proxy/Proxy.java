package com.bitcamp.web.proxy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;

import com.bitcamp.web.adapter.PageAdapter;

import lombok.Data;

@Data
public abstract class Proxy {
	public abstract void execute(Model model,Object o);	
}
