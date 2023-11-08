package com.springCore.xmlRemoving;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.springCore.xmlRemoving"})
public class JavaConfig {
	
	@Bean(name={"student","student2","student3","stud","temp2"})
	public Student getStudent() {
		Student student=new Student(getSamosa());
		return student;
	}
	
	@Bean(name={"samosa","samosa2","temp","ton"})
	public Samosa getSamosa() {
		return new Samosa();
	}
	
}
