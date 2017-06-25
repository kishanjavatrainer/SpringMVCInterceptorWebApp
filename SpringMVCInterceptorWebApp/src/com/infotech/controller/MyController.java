package com.infotech.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.custom.editor.StudentNameCustomEditor;
import com.infotech.model.Student;

@Controller
public class MyController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "doj", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameCustomEditor());
		
		binder.setDisallowedFields("phone");
	}
	@RequestMapping(value ="/register" ,method=RequestMethod.GET)
	public String registerPage(Model model){
		model.addAttribute("student", new Student());
		return "register";
	}
	
	@RequestMapping(value ="/registerSuccess" ,method=RequestMethod.POST)
	public ModelAndView loginSuccess(@ModelAttribute("student") Student student,BindingResult result){
		if(result.hasErrors()){
			return new ModelAndView("register");
		}
		ModelAndView modelAndView = new ModelAndView("registerSuccess");
		modelAndView.addObject("student", student);
		return modelAndView;
	}
	
	@ModelAttribute
	public void commonData(Model model){
		model.addAttribute("headerMessage", "Welcome to Starve Technology");
		
		List<String> techList = new ArrayList<>();
		techList.add("Hibernate");
		techList.add("Spring");
		techList.add("JSP");
		techList.add("Servlet");
		techList.add("Struts");
		
		List<String> citiesList = new ArrayList<>();
		citiesList.add("Pune");
		citiesList.add("Chennai");
		citiesList.add("Delhi");
		citiesList.add("Other");
		
		List<String> genderList = new ArrayList<>();
		genderList.add("Male");
		genderList.add("Female");
		
		model.addAttribute("technologyList", techList);
		model.addAttribute("citisList", citiesList);
		model.addAttribute("genderList", genderList);
	}
}
