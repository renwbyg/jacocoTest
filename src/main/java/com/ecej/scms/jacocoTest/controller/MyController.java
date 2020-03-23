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
		System.out.println("diff version 1");
		return "myMethod1 is invoked!!";
	}


}
