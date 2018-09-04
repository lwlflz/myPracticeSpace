package com.liuwei.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/demo")
public class TestController {
	
	@RequestMapping(value="/test",method = RequestMethod.GET)
	public String testMVC() {
		return "index";
	}
}
