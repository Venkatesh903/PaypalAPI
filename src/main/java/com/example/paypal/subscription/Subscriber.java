package com.example.paypal.subscription;

public class Subscriber {
	private SubscriberName name;
	private String email_address;
	private ShippingAddress shipping_address;
	public SubscriberName getName() {
		return name;
	}
	public void setName(SubscriberName name) {
		this.name = name;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public ShippingAddress getShipping_address() {
		return shipping_address;
	}
	public void setShipping_address(ShippingAddress shipping_address) {
		this.shipping_address = shipping_address;
	}
	public Subscriber(SubscriberName name, String email_address, ShippingAddress shipping_address) {
		this.name = name;
		this.email_address = email_address;
		this.shipping_address = shipping_address;
	}
	

}
