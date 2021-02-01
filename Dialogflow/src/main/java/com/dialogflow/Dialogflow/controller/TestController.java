package com.dialogflow.Dialogflow.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dialogflow")
public class TestController {
	
	@PostMapping("/setintent")
	public String setIntent(){
		return "yofi";
	}

}
