package com.example.paypal.subscription;

public class SubscriberName {
	private String given_name;
	private String surname;
	
	
	public SubscriberName(String given_name, String surname) {
		this.setGiven_name(given_name);
		this.setSurname(surname);
	}
	public String getGiven_name() {
		return given_name;
	}
	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

}
