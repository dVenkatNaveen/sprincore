package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("studentobj") //by default component will create student as obj of a class Student but to mention our own objec name mention under ""
@Scope("prototype")
public class Student {
	
	@Value("Naveen")
	private String sname;
	@Value("Bangalore")
	private String city;
	@Value("#{temp}")
	private List<String> address;
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", city=" + city + ", address=" + address + "]";
	}

	
	
	 

}
