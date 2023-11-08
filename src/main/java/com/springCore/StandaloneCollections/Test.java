package com.springCore.StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/StandaloneCollections/standaloneCollect.xml");
		Person person = context.getBean("person",Person.class);
		System.out.println(person.getFrnds());
		System.out.println(person.getFrnds().getClass().getName());
	
	}
}
