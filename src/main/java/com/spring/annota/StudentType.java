package com.spring.annota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StudentType {
	
	
	@Autowired
	@Qualifier("marks1")
	private Marks marks;


	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	public StudentType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentType(Marks marks) {
		super();
		System.out.println("is it working...");
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentType [marks=" + marks + "]";
	}
	
	
}
