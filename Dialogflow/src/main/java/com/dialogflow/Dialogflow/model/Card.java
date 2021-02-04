package com.dialogflow.Dialogflow.model;

public class Card {

	private String title;
	private String subtitle;
	private String imageUri;
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
	public String getImageUri() {
		return imageUri;
	}
	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	public Button[] getButtons() {
		return buttons;
	}
	public void setButtons(Button[] buttons) {
		this.buttons = buttons;
	}	
}
