package com.springcore.ci;

import java.util.List;

public class Person {
	
	private String name;
	private int personId;
	private Certi certi;
	List<String> list;
	public Person(String name, int personId, Certi certi,List<String> list) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi=certi;
		this.list=list;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PersonId : "+this.personId+ " , PersonName : "+this.name+", Certificates: { "+this.certi.name+" }, ContactNo: " +this.list;
	}
	
	
	
}
