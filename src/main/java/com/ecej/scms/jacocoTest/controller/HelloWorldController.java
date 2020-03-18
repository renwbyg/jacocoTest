package com.ecej.scms.jacocoTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {

	@RequestMapping("/myMethod1")
	@ResponseBody
	public String myMethod1() {
		System.out.println("diff version 1");
		return "myMethod1 is invoked!!";
	}

	@RequestMapping("/myMethod2")
	@ResponseBody
	public String myMethod2() {
		System.out.println("diff version 2");
		return "myMethod2 is invoked!!";
	}

	@RequestMapping("/myMethod3")
	@ResponseBody
	public String myMethod3() {
		System.out.println("myMethod3 is invoked!!");
		return "myMethod3 is invoked!!";
	}
}
