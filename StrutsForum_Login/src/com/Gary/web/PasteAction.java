package com.Gary.web;


import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.Gary.domain.Paste;
import com.Gary.domain.User;
import com.Gary.service.PasteService;

public class PasteAction extends ActionSupport{

	
	public String getAllPaste() throws Exception {
		
		PasteService pasteService = new PasteService();
		List<Paste> pasteList = pasteService.findAllPaste();
		
		User user = new User();
		user.setUsername("Gary");
		user.setPassword("111");
		
		ActionContext.getContext().put("pasteList", pasteList);
		ActionContext.getContext().put("user", user);
		System.out.println(pasteList);
		
		return "index";
	}

	
	
}
