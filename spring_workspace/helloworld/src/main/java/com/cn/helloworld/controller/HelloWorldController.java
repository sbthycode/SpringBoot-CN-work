package com.cn.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "helo coding in java";
	}
	
	@GetMapping("/hello-get")
	public String helloGet() {
		return "helo gettttt";
	}
	
	@GetMapping("hello-param/{name}")
	public String helloPath(@PathVariable String name) {
		return "helo path "+name;
	}
	
}
