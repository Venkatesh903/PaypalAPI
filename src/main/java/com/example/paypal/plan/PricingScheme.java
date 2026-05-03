package com.example.paypal.plan;

public class PricingScheme {
	   private FixedPrice fixed_price;
	   

	public FixedPrice getFixed_price() {
		return fixed_price;
	}

	public void setFixed_price(FixedPrice fixed_price) {
		this.fixed_price = fixed_price;
	}
	public PricingScheme(FixedPrice fixed_price) {
		this.fixed_price = fixed_price;
		
	}

}
