package com.dialogflow.browser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.dialogflow.browser.model.FulfillmentMessages;
import com.dialogflow.browser.model.TestRequest;
import com.dialogflow.browser.model.TestResponse;
import com.dialogflow.browser.model.Text;



@Controller
@RequestMapping("/dialogflow")
public class TestController {
	
	@RequestMapping(value="/textresponse", method = RequestMethod.POST)
	public TestResponse textResponse(@RequestBody TestRequest testRequest){
		String[] textArr = {"<speak><audio src=\"https://storage.googleapis.com/new_dave_poc/damn_new.wav\">didn't get your MP3 audio file</audio></speak>"};
		Text text = new Text();
		text.setText(textArr);
		TestResponse testResponse = new TestResponse();
		FulfillmentMessages[] fulfillmentMessages = new FulfillmentMessages[1];
		fulfillmentMessages[0] = new FulfillmentMessages();
		fulfillmentMessages[0].setText(text);
		testResponse.setFulfillmentMessages(fulfillmentMessages);
		return testResponse;
	}
}
