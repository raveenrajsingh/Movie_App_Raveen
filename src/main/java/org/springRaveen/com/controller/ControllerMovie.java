package org.springRaveen.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMovie {

	@RequestMapping("/")
	public String welcome() {
	return "index";
	
	
}

	@RequestMapping("/movie.html")
	public String welcomePartTwo() {
	return "movie";
	
	
}
	
}
