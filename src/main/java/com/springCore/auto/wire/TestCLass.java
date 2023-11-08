package com.springCore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCLass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/auto/wire/autoconfig.xml");
		Emp emp = context.getBean("emp",Emp.class);
		System.out.println(emp);
	
	
	}
}
