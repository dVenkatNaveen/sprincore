package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean; //To call destroy method 
import org.springframework.beans.factory.InitializingBean;//To call init method 

//Implementing Bean Life cycle using Interface
public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception { 
		// TODO Auto-generated method stub
		//Init method from InitializingBean
		System.out.println("Drinking Pepsi: Init Method Called");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//Destroy Method from DisposableBean
		System.out.println("Drinking Pepsi Finished: Destroy Method Called");
	}
	
}
