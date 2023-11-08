package com.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTestClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/ref/refconfig.xml");
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
	}
}
