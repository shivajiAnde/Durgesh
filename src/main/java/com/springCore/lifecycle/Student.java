package com.springCore.lifecycle;

public class Student {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("property value had set");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	public void init() {
		System.out.println("inside the init method");
	}
	public void destroy() {
		System.out.println("student object is goint to destroy");
	}
}
