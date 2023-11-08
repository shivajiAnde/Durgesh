package com.spring.annota;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClassStudent {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/annota/annotationss.xml");
		StudentType student =(StudentType) context.getBean("student1");
		
		System.out.println(student);
	
	}
}
