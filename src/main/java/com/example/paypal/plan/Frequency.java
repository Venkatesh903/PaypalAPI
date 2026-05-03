package com.example.paypal.plan;

public class Frequency {
	private String interval_unit;
	private Integer interval_count;
	public String getInterval_unit() {
		return interval_unit;
	}
	public void setInterval_unit(String interval_unit) {
		this.interval_unit = interval_unit;
	}
	public Integer getInterval_count() {
		return interval_count;
	}
	public void setInterval_count(Integer interval_count) {
		this.interval_count = interval_count;
	}
	public Frequency(String interval_unit, Integer interval_count) {
		this.interval_unit = interval_unit;
		this.interval_count = interval_count;
	}
	

}
