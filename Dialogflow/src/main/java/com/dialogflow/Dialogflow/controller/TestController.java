package com.dialogflow.Dialogflow.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dialogflow.Dialogflow.model.TestResponse;


@RestController
@RequestMapping("/dialogflow")
public class TestController {
	
	@PostMapping("/setintent")
	public TestResponse setIntent(){
		TestResponse testResponse = new TestResponse();
		testResponse.setTest("yofi");
		return testResponse;
	}

}
