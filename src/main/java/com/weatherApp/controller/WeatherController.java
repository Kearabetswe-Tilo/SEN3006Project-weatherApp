package com.weatherApp.controller;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.weatherApp.model.DateModel;
import com.weatherApp.model.WeatherModel;
import com.weatherApp.service.WeatherService;

@Controller
public class WeatherController {
	
	@Autowired
	WeatherService service;
		
	@GetMapping("/home")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView("Main-page");
		mv.addObject("weather",service.displayDailyData());	
		mv.addObject("searchdate", new DateModel());
		return mv;
	}
	
	@GetMapping("/view-data")
	public ModelAndView displayData() {
		ModelAndView mv = new ModelAndView("data-page");
		mv.addObject("data",service.findAlldata());	
		return mv;
	}
	
	@PostMapping("/find-date")
//	public ModelAndView SearchByDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate search) {
	public ModelAndView SearchByDate(@Valid @ModelAttribute("searchdate") DateModel dModel, BindingResult result) {
		ModelAndView mv = new ModelAndView("Main-page");
		mv.addObject("searchdate", dModel);
		if(result.hasErrors()) {
			mv.addObject("weather",service.displayDailyData());
		}
		else
		mv.addObject("weather",service.findByDate(dModel.getSearchdate()));	
		
		return mv;
		
	}
	
}
