package org.freedom.securitytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SecurityController {

	@GetMapping("/")
	public ModelAndView index()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@GetMapping("/hello")
	public ModelAndView hello()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("hello");
		return modelAndView;
	}
	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	
}
