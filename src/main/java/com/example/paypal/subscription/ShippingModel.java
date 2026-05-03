package com.example.paypal.subscription;

public class ShippingModel {
	private String currency_code;
	private String value;
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public ShippingModel(String currency_code, String value) {
		this.currency_code = currency_code;
		this.value = value;
		
	}

}
