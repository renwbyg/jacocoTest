package com.ecej.scms.jacocoTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myController")
public class MyController {

	@RequestMapping("/myMethod1")
	@ResponseBody
	public String myMethod1() {
		System.out.println("myMethod1");
		return "myMethod1 is invoked!!";
	}

	@RequestMapping("/myMethod2")
	@ResponseBody
	public String myMethod2() {
		System.out.println("myMethod2");
		return "myMethod2 is invoked!!";
	}


}
