package com.itSolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg(@RequestParam String name) {
		
		ModelAndView mav = new ModelAndView();
		
		String txtMsg="Hello Mr./Mrs. "+name+"Welcome in Shri Mata Vaishno Devi Devotional Place , Katra , Jammu";
		
		mav.addObject("msg",txtMsg);
		mav.setViewName("index");
		
		return mav;
	}
	@GetMapping("/thanks")
	public String getThankMessage(@RequestParam String name,Model model) {
		
		String txtMsg="Thanks Mr./Mrs. "+name+" For Coming Shri Mata Vaishno Devi Devotional Place , Katra , Jammu";
		model.addAttribute("msg",txtMsg);
		return "index";
	}
}
