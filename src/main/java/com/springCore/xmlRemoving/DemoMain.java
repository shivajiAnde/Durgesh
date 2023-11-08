package com.springCore.xmlRemoving;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
		student.display();
	}

}
