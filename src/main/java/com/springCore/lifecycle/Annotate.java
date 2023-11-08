package com.springCore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotate {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Annotate [id=" + id + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("init is worked");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("object is destroyed");
	}
}
