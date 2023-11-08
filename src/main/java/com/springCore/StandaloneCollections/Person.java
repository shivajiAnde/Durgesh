package com.springCore.StandaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> frnds;
	
	private Map<String,Integer> feeStructure;
	
	private Properties properties;

	public List<String> getFrnds() {
		return frnds;
	}

	public void setFrnds(List<String> frnds) {
		this.frnds = frnds;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Person(List<String> frnds, Map<String, Integer> feeStructure, Properties properties) {
		super();
		this.frnds = frnds;
		this.feeStructure = feeStructure;
		this.properties = properties;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [frnds=" + frnds + ", feeStructure=" + feeStructure + ", properties=" + properties + "]";
	}

	
	
	
}
