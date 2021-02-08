package com.dialogflow.browser.model;

public class Card {

	private String title;
	private String subtitle;
	private String audioUri;
	private Button[] buttons;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getAudioUri() {
		return audioUri;
	}
	public void setAudioUri(String imageUri) {
		this.audioUri = imageUri;
	}
	public Button[] getButtons() {
		return buttons;
	}
	public void setButtons(Button[] buttons) {
		this.buttons = buttons;
	}	
}
