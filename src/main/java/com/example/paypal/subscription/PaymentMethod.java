package com.example.paypal.subscription;

public class PaymentMethod {
	private String payer_selected;
	private String payee_preferred;
	public String getPayer_selected() {
		return payer_selected;
	}
	public void setPayer_selected(String payer_selected) {
		this.payer_selected = payer_selected;
	}
	public String getPayee_preferred() {
		return payee_preferred;
	}
	public void setPayee_preferred(String payee_preferred) {
		this.payee_preferred = payee_preferred;
	}
	public PaymentMethod(String payer_selected, String payee_preferred) {
		this.payer_selected = payer_selected;
		this.payee_preferred = payee_preferred;
	}
	

}
