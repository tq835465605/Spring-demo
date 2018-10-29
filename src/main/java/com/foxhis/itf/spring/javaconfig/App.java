package com.foxhis.itf.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//隐式装配的调用
		//Hello hello=(Hello)context.getBean(Hello.class);
		//显式装配的调用
		Hello hello=(Hello)context.getBean("hellobean");
		System.out.println(hello);
		hello.setName("nihao");

		hello.printf();
		
		Hello hello2=(Hello)context.getBean("hellobean");
		System.out.println(hello2);
		System.out.println(hello==hello2);//返回true,spring产生的bean都是单例模式
		
	}
}
