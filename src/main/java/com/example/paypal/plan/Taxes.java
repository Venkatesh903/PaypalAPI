package com.example.paypal.plan;

public class Taxes {
	private String percentage;
	private boolean inclusive;
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public boolean isInclusive() {
		return inclusive;
	}
	public void setInclusive(boolean inclusive) {
		this.inclusive = inclusive;
	}
	public Taxes() {
		
	}
	public Taxes(String percentage, boolean inclusive) {
		this.percentage = percentage;
		this.inclusive = inclusive;
		
	}

}
