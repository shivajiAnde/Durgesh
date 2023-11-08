package com.springCore.ci;

import java.util.List;

public class Person {
	
	private String name;
	
	private int personId;
	
	private Certi certi;
	
	private List<String> list;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public Person(String name, int personId,Certi certi,List<String> list) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi=certi;
		this.list=list;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ","+certi+","+list+"]";
	}

	public Certi getCerti() {
		return certi;
	}

	public void setCerti(Certi certi) {
		this.certi = certi;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	
}
