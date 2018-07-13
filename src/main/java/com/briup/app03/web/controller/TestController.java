package com.briup.app03.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http：//127.0.0.1/8080/test/hellow
 */
@RestController
@RequestMapping("/test")

public class TestController {
	
	@GetMapping("hellow01")
	public String hellow(){
		return "hellow world01";
	}
	@GetMapping("hellow02")
	public String hellow02(){
		return "hellow world02";
	}
}
