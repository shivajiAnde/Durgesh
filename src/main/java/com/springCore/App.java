package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
    	Student student = applicationContext.getBean("stud",Student.class);
    	Student student2 = applicationContext.getBean("stud1",Student.class);
    	System.out.println(student);
    	System.out.println(student2);
    
    }
}
