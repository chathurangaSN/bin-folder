package com.chanaka.eh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chanaka.eh.model.Activity;

@Controller

public class ActivityController {

	@RequestMapping(value = "/greeting")
	public String getWelcomeMessage(Model model) {

		model.addAttribute("msg" ,"Hi Spring YOu are Awesome");

		return "welcome";

	}
	
	@RequestMapping(value = "/addactivity")
	public String getAddActivity(@ModelAttribute("activities") Activity activity){
		System.out.println(activity.getName());
		if(activity.getName() == null){
			return "activity";
		}else{
			return "redirect:addSubActivity.html";
		}
		
	}
	
	@RequestMapping(value = "/addSubActivity")
	public String getSubAddActivity(@ModelAttribute("activities") Activity activity){
		System.out.println("Sub activity is "+activity.getName());
		return "activity";
	}
	
}
