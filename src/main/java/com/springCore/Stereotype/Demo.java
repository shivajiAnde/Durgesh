package com.springCore.Stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{22+23}")
	private int x;
	
	@Value("#{6<2?55:100}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private double e;

	@Value("#{ T(java.lang.Math).E }")
	private double pi;
	
	@Value("#{ new java.lang.String('shivaji')}")
	private String name;
	
	@Value("#{ 11<3 }")
	private boolean isActive;
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	

	public Demo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", e=" + e + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	
	
}
