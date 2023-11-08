package com.springCore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/Stereotype/stereotype.xml");
//		Student student = context.getBean("object",Student.class);
//		System.out.println(student);
		Demo demo = context.getBean("demo",Demo.class);
		System.out.println(demo);
		
		
	}
}
