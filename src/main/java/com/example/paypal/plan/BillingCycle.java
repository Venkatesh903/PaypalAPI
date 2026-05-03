package com.example.paypal.plan;

public class BillingCycle {
	private Frequency frequency;
    private String tenure_type;
    private int sequence;
    private int total_cycles;
    private PricingScheme pricing_scheme;
	public Frequency getFrequency() {
		return frequency;
	}
	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}
	public String getTenure_type() {
		return tenure_type;
	}
	public void setTenure_type(String tenure_type) {
		this.tenure_type = tenure_type;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public PricingScheme getPricing_scheme() {
		return pricing_scheme;
	}
	public void setPricing_scheme(PricingScheme pricing_scheme) {
		this.pricing_scheme = pricing_scheme;
	}
	public int getTotal_cycles() {
		return total_cycles;
	}
	public void setTotal_cycles(int total_cycles) {
		this.total_cycles = total_cycles;
	}
	public BillingCycle(Frequency frequency,
    String tenure_type,
    int sequence,
    int total_cycles,
    PricingScheme pricing_scheme) {
		this.frequency = frequency;
		this.tenure_type = tenure_type;
		this.sequence = sequence;
		this.total_cycles  = total_cycles;
		this.pricing_scheme = pricing_scheme;
	}

}
