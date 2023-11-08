package com.springCore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorAmbiguityTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/ci/ciconfig.xml");
		Addition a=(Addition)context.getBean("addition");
		Addition addition = context.getBean("add",Addition.class);
		addition.doSum();
	}
}
