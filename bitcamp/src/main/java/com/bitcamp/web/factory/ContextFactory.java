package com.bitcamp.web.factory;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.bitcamp.web.command.Path;
import com.bitcamp.web.enums.Direction;
import com.sun.jndi.toolkit.url.Uri;

import jdk.nashorn.internal.scripts.JS;



@Component
public class ContextFactory extends Factory{
	private static final Logger logger = LoggerFactory.getLogger(ContextFactory.class);
	@Autowired Path path;
	
	@Override
	public Object create() {
		return ((ServletRequestAttributes) 
				 RequestContextHolder
				.currentRequestAttributes())
				.getRequest()
				.getContextPath();
	}
	public Path path() {
		
		path.setContext((String)create());
		path.setCss(create()+Direction.CSS.toString());
		path.setJs(create()+Direction.JS.toString());		
		path.setImage(create()+Direction.IMAGE.toString());
		return path;
		
	
		
		
	}
}
