package com.java.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloWorldController {

	@RequestMapping("helloworld")
	public String helloworld(Model model){
		model.addAttribute("message","haha");
		return "helloworld";
	}
	
}
