package com.example.paypal.subscription;

public class SubscriptionModel {
	private String plan_id;
	private String start_time;
	private ShippingModel shipping_amount;
	private Subscriber subscriber;
	private ApplicationContext application_context;
	public String getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public ShippingModel getShipping_amount() {
		return shipping_amount;
	}
	public void setShipping_amount(ShippingModel shipping_amount) {
		this.shipping_amount = shipping_amount;
	}
	public Subscriber getSubscriber() {
		return subscriber;
	}
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}
	public ApplicationContext getApplication_context() {
		return application_context;
	}
	public void setApplication_context(ApplicationContext application_context) {
		this.application_context = application_context;
	}
	public SubscriptionModel(String plan_id, String start_time, ShippingModel shipping_amount, Subscriber subscriber,
			ApplicationContext application_context) {
		
		this.plan_id = plan_id;
		this.start_time = start_time;
		this.shipping_amount = shipping_amount;
		this.subscriber = subscriber;
		this.application_context = application_context;
	}
	

	

}
