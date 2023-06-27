package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
//This method contains the hook to call the destroy method
import org.springframework.context.support.AbstractApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implementing bean life cycle using XML 
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		context.registerShutdownHook();
		Samosa s1=(Samosa)context.getBean("s1");
		System.out.println(s1);
//registering shutdown hook to call destroy method this method exists inside the AbstractApplicationContext	
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//Implementing bean life cycle using Interfaces
		Pepsi p1=(Pepsi)context.getBean("p1");
		System.out.println(p1);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//Implementing bean life cycle using Annotations
		AnnotationExample a1=(AnnotationExample)context.getBean("a1");
		System.out.println(a1);
	}

}
