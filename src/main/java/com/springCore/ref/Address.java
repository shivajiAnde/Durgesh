package com.springCore.ref;

public class Address {
	
	private String village;
	
	private int pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String village, int pincode) {
		super();
		this.village = village;
		this.pincode = pincode;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [village=" + village + ", pincode=" + pincode + "]";
	}
	
	
	
}
