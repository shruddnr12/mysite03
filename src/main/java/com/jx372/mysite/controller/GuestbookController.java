package com.jx372.mysite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jx372.mysite.service.GuestbookService;
import com.jx372.mysite.vo.GuestbookVo;
import com.jx372.mysite.vo.UserVo;

@RequestMapping("/guestbook")
@Controller
public class GuestbookController {
	
	@Autowired
	private GuestbookService guestService;
	
	@RequestMapping("")
	public String Guestbook(Model model){
		model.addAttribute("list", guestService.getList());	
		return "guestbook/list";
	}
	
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	public String add(@ModelAttribute GuestbookVo guestbookVo
	){	
		System.out.println(guestbookVo);
		guestService.insert(guestbookVo);
		return "redirect:/guestbook";
	}
	
	/*많이 쓰는 방식*/
	@RequestMapping( "/delete" ) 
	public String delete(Model model,
			@RequestParam("no") Long no){
		
		return "guestbook/list"; 
		 
	}
	
	

	
}
