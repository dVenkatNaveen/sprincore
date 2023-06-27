package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired //can be given to object, setter method, constructor and to enable mention context tag in xml 
	@Qualifier("temp3") 
	// Qualifier tells which bean to inject out of 2 wrt to repective xml file and select temp2 as a selected name
	private Address address;

	//@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}
	
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
	}
	
	//@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
