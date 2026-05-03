package com.example.paypal.subscription;

public class ApplicationContext {
	private String brand_name;
	private String locale;
	private String shipping_preference;
	private String user_action;
	private PaymentMethod payment_method;
	private String return_url;
	private String cancel_url;
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getShipping_preference() {
		return shipping_preference;
	}
	public void setShipping_preference(String shipping_preference) {
		this.shipping_preference = shipping_preference;
	}
	public String getUser_action() {
		return user_action;
	}
	public void setUser_action(String user_action) {
		this.user_action = user_action;
	}
	public String getReturn_url() {
		return return_url;
	}
	public void setReturn_url(String return_url) {
		this.return_url = return_url;
	}
	public String getCancel_url() {
		return cancel_url;
	}
	public void setCancel_url(String cancel_url) {
		this.cancel_url = cancel_url;
	}
	public PaymentMethod getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(PaymentMethod payment_method) {
		this.payment_method = payment_method;
	}
	public ApplicationContext(String brand_name, String locale, String shipping_preference, String user_action,
			PaymentMethod payment_method, String return_url, String cancel_url) {
		this.brand_name = brand_name;
		this.locale = locale;
		this.shipping_preference = shipping_preference;
		this.user_action = user_action;
		this.payment_method = payment_method;
		this.return_url = return_url;
		this.cancel_url = cancel_url;
	}
	

}
