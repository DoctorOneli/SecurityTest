package org.freedom.securitytest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {

	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	
	
	@GetMapping("/admin")
	public String admin()
	{
		return "admin";
	}
	
	
}
