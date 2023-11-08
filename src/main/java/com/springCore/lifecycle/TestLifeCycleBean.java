package com.springCore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycleBean {
	public static void main(String[] args) {
//		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/lifecycle/lifecycleconfig.xml");
//		Samosa samosa = context.getBean("samosa",Samosa.class);
//		System.out.println(samosa);
//		context.registerShutdownHook();
		
//		 Pepsi pepsi = context.getBean("pepsi",Pepsi.class);
//		 System.out.println(pepsi);
//		
//		Example example = context.getBean("example",Example.class);
//		System.out.println(example);
		
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/springCore/lifecycle/lifecycleconfig.xml");
//		Student bean = ctx.getBean("stud",Student.class);
//		System.out.println(bean);
		Shivaji shivaji = ctx.getBean("shivaji",Shivaji.class);
		System.out.println(shivaji);
		ctx.registerShutdownHook();
//		Annotate annotate = ctx.getBean("annotate",Annotate.class);
//		System.out.println(annotate);
		
	}
}
