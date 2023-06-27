package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		//Student s1 = context.getBean("firststudent",Student.class);
		//Student s1 = context.getBean("getstudent",Student.class);
		Student s1 = context.getBean("temp",Student.class);
		System.out.println(s1);
		s1.study();
	}

}
