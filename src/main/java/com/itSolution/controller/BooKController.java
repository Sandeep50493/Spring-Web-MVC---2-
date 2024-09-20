package com.itSolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BooKController {
	
	@GetMapping("/msg")
	public ModelAndView getMsg(@RequestParam String name) {
		
		String txtMsg="Hello "+name+" ,Good Morning";
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg",txtMsg);
		
		mav.setViewName("index");
		
		return mav;
		
	}
	@GetMapping("/book")
	public ModelAndView getBookData(@RequestParam String name,@RequestParam String author) {
		
		//http://localhost:8080/book?name=ConceptOfPhysics&author=HcVerma
		System.out.println("Name :: "+name);
		System.out.println("Author :: "+author);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg",name+" By "+author+" is out of Stock....");
		mav.setViewName("index");
		return mav;
	}
}
