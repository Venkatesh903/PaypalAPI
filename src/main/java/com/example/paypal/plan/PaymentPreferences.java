package com.example.paypal.plan;

public class PaymentPreferences {
	private boolean auto_bill_outstanding;
	private String setup_fee_failure_action;
	private Integer payment_failure_threshold;
	private SetupFee setup_fee;
	public boolean isAuto_bill_outstanding() {
		return auto_bill_outstanding;
	}
	public void setAuto_bill_outstanding(boolean auto_bill_outstanding) {
		this.auto_bill_outstanding = auto_bill_outstanding;
	}
	public String getSetup_fee_failure_action() {
		return setup_fee_failure_action;
	}
	public void setSetup_fee_failure_action(String setup_fee_failure_action) {
		this.setup_fee_failure_action = setup_fee_failure_action;
	}
	public int getPayment_failure_threshold() {
		return payment_failure_threshold;
	}
	public void setPayment_failure_threshold(int payment_failure_threshold) {
		this.payment_failure_threshold = payment_failure_threshold;
	}
	public SetupFee getSetup_fee() {
		return setup_fee;
	}
	public void setSetup_fee(SetupFee setup_fee) {
		this.setup_fee = setup_fee;
	}
	public PaymentPreferences(boolean auto_bill_outstanding, SetupFee setup_fee, String setup_fee_failure_action, Integer payment_failure_threshold) {
		this.auto_bill_outstanding = auto_bill_outstanding;
		this.setup_fee = setup_fee;
		this.setup_fee_failure_action = setup_fee_failure_action;
		this.payment_failure_threshold=payment_failure_threshold;
	}

}
