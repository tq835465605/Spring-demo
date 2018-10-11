package com.foxhis.itf.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Hello hello=(Hello)context.getBean("hellobean");
		hello.setName("nihao");
		hello.printf();
	}
}
