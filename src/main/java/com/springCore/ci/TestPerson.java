package com.springCore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/ci/ciconfig.xml");
		Person person = context.getBean("person",Person.class);
		System.out.println(person);
		
	}
}
