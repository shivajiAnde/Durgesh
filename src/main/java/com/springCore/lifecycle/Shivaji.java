package com.springCore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Shivaji implements InitializingBean,DisposableBean{
	
	private String studies;

	public String getStudies() {
		return studies;
	}

	public void setStudies(String studies) {
		this.studies = studies;
	}

	@Override
	public String toString() {
		return "Shivaji [studies=" + studies + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("intialization done");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("eliminated");
	}

	
	
}
