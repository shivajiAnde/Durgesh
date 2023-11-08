package com.springCore.Stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("object")
@Scope("singleton")
//Scope("prototype")  is used to get objects in n number as per requirement
public class Student {
	
	@Value("shivaji")
	private String name;
	
	@Value("java Spring")
	private String course;

	@Value("#{listData}")
	private List<String> address;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student(String name, String course) {
		super();
		this.name = name;
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", address=" + address + "]";
	}
	
}
