package com.dialogflow.Dialogflow.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dialogflow.Dialogflow.model.Card;
import com.dialogflow.Dialogflow.model.FulfillmentMessages;
import com.dialogflow.Dialogflow.model.TelephonyPlayAudio;
import com.dialogflow.Dialogflow.model.TestRequest;
import com.dialogflow.Dialogflow.model.TestResponse;
import com.dialogflow.Dialogflow.model.Text;


@RestController
@RequestMapping("/dialogflow")
public class TestController {
	
	@PostMapping("/textresponse")
	public TestResponse textResponse(@RequestBody TestRequest testRequest){
		String[] textArr = {"yofi"};
		Text text = new Text();
		text.setText(textArr);
		TestResponse testResponse = new TestResponse();
		FulfillmentMessages[] fulfillmentMessages = new FulfillmentMessages[1];
		fulfillmentMessages[0] = new FulfillmentMessages();
		fulfillmentMessages[0].setText(text);
		testResponse.setFulfillmentMessages(fulfillmentMessages);
		return testResponse;
	}

	@PostMapping("/richresponse")
	public TestResponse richResponse(@RequestBody TestRequest testRequest){
//		String[] textArr = {"sababa"};
//		Text text = new Text();
//		text.setText(textArr);
		Card card = new Card();
		card.setTitle("audioFile");
		card.setSubtitle("Hi man, I understand what your trying to say, but who's gonna believe you");
		card.setAudioUri("https://storage.cloud.google.com/new_dave_poc/Hi%20man%2C%20I%20understand%20what%20your%20trying%20to%20say%2C%20but%20who's%20gonna%20believe%20you.mp3");
		TestResponse testResponse = new TestResponse();
		FulfillmentMessages[] fulfillmentMessages = new FulfillmentMessages[1];
		fulfillmentMessages[0] = new FulfillmentMessages();
//		fulfillmentMessages[0].setText(text);
		fulfillmentMessages[0].setCard(card);
		testResponse.setFulfillmentMessages(fulfillmentMessages);
		return testResponse;
	}
	
	@PostMapping("/telephonyresponse")
	public TelephonyPlayAudio telephonyResponse(@RequestBody TestRequest testRequest){
//		String[] textArr = {"sababa"};
//		Text text = new Text();
//		text.setText(textArr);
//		Card card = new Card();
//		card.setTitle("audioFile");
//		card.setSubtitle("Hi man, I understand what your trying to say, but who's gonna believe you");
//		card.setAudioUri("https://storage.cloud.google.com/new_dave_poc/Hi%20man%2C%20I%20understand%20what%20your%20trying%20to%20say%2C%20but%20who's%20gonna%20believe%20you.mp3");
//		TestResponse testResponse = new TestResponse();
//		FulfillmentMessages[] fulfillmentMessages = new FulfillmentMessages[1];
//		fulfillmentMessages[0] = new FulfillmentMessages();
//		fulfillmentMessages[0].setText(text);
//		fulfillmentMessages[0].setCard(card);
//		testResponse.setFulfillmentMessages(fulfillmentMessages);
//		return testResponse;
		TelephonyPlayAudio telephonyPlayAudio = new TelephonyPlayAudio();
		telephonyPlayAudio.setAudioUri("gs://new_dave_poc/HiMan.mp3");
		return telephonyPlayAudio;
	}
}
