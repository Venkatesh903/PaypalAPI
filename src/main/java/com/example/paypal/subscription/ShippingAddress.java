package com.example.paypal.subscription;

public class ShippingAddress {
	private ShippingName name;
	private AddressModel address;
	public ShippingName getName() {
		return name;
	}
	public void setName(ShippingName name) {
		this.name = name;
	}
	public AddressModel getAddress() {
		return address;
	}
	public void setAddress(AddressModel address) {
		this.address = address;
	}
	public ShippingAddress(ShippingName name, AddressModel address) {
		
		this.name = name;
		this.address = address;
	}
	

}
