package com.springCore.auto.wire;

public class Emp {
	
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp(Address address) {
		super();
		System.out.println("its working now");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}


}
