package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Samosa getsamosa() {
		return new Samosa();
	}
	
	@Bean(name= {"student","temp","con"}) //can use any name to inject in the object.
	public Student getstudent() {
		
		Student student = new Student(getsamosa());
		
		return student;
	}
	
}
