package com.springCore.xmlRemoving;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student{
	
	@Autowired
	private Samosa samosa;
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	public void display() {
		samosa.rate();
		System.out.println("student is studying");
	}

	public Samosa getSamosa() {
		return samosa;
	}
	
//	@Autowired
	public void setSamosa(Samosa samosa) {
		System.out.println("settor injection is working");
		this.samosa = samosa;
	}
}
