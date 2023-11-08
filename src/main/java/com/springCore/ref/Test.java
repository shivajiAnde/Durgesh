package com.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/ref/refconfig.xml");
			A a=(A)context.getBean("A");
			System.out.println(a);
			
	}

}
