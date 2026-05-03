package com.example.paypal.plan;
import java.util.*;
public class PlanProduct {
	private String product_id;
	private String name;
	private String description;
	private String status;
	private List<BillingCycle> billing_cycles;
	private PaymentPreferences payment_preferences;
	private Taxes taxes;
	
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public PlanProduct(String product_id,
	String name,
	String description,
	String status,
	List<BillingCycle> billing_cycles,
	PaymentPreferences payment_preferences,
	Taxes taxes) {
		this.product_id = product_id;
		this.name= name;
		this.description = description;
		this.status = status;
		this.setBilling_cycles(billing_cycles);
		this.setPayment_preferences(payment_preferences);
		this.setTaxes(taxes);
		
	}
	public List<BillingCycle> getBilling_cycles() {
		return billing_cycles;
	}
	public void setBilling_cycles(List<BillingCycle> billing_cycles) {
		this.billing_cycles = billing_cycles;
	}
	public PaymentPreferences getPayment_preferences() {
		return payment_preferences;
	}
	public void setPayment_preferences(PaymentPreferences payment_preferences) {
		this.payment_preferences = payment_preferences;
	}
	public Taxes getTaxes() {
		return taxes;
	}
	public void setTaxes(Taxes taxes) {
		this.taxes = taxes;
	}

}
