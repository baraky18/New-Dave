package com.dialogflow.Dialogflow.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dialogflow.Dialogflow.model.FulfillmentMessages;
import com.dialogflow.Dialogflow.model.TestRequest;
import com.dialogflow.Dialogflow.model.TestResponse;
import com.dialogflow.Dialogflow.model.Text;


@RestController
@RequestMapping("/dialogflow")
public class TestController {
	
	@PostMapping("/setintent")
	public TestResponse setIntent(@RequestBody TestRequest testRequest){
		String[] textArr = {"yofi"};
		Text text = new Text();
		text.setText(textArr);
		TestResponse testResponse = new TestResponse();
		FulfillmentMessages fulfillmentMessages = new FulfillmentMessages();
		fulfillmentMessages.setText(text);
		testResponse.setFulfillmentMessages(fulfillmentMessages);
		return testResponse;
	}

}
