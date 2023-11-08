package com.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/Collections/collectionSpring.xml");
		Emp emp = applicationContext.getBean("emp",Emp.class);
		System.out.println(emp.getName());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getCourses());
		System.out.println(emp.getPhones());
	}
}
