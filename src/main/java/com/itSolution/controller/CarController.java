package com.itSolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {
	
	// http://localhost:8080/car/120/Banglore
	@GetMapping("/car/{carId}/Banglore")
	public ModelAndView getCarColor(@PathVariable Integer carId) {
		ModelAndView mav=new ModelAndView();
		
		String color=null;
		if(carId>=100) {
			color="Red";
		}
		else {
			color="Green";
		}
		mav.addObject("msg","Car color :: "+color);
		mav.setViewName("index");
		
		return mav;
	}
	
	 //localhost:8080/stock/jaguar/location/Bengaluru
	@GetMapping("/stock/{brand}/location/{loc}")
	public ModelAndView getCarStock(@PathVariable String brand,@PathVariable String loc) {
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg","In "+loc+" "+brand+" cars out of Stock");
		mav.setViewName("index");
		
		return mav;	
	}	
}
