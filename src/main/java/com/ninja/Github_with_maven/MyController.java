package com.ninja.Github_with_maven;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/test")
	public String test()
	{
		return "hello springboot app";
	}
	@RequestMapping("/home")
	public String home()
	{
		return "Don't spread hate";
	}


}
