package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationExample {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public AnnotationExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AnnotationExample [subject=" + subject + "]";
	}
	
	@PostConstruct //By default disabled to enable add context:annotation tag in .xml Added dependency javax.annotation-api to get this Annotation as they are removed from java9+ versions
	public void start() {
		System.out.println("Annotation Starting method");
	}
	
	@PreDestroy //By default disabled to enable add context:annotation tag in .xml Added dependency javax.annotation-api to get this Annotation as they are removed from java9+ versions
	public void end() {
		System.out.println("Annotation Ending method");
	}
	
	
}
