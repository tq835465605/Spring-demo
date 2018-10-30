package com.foxhis.itf.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//隐式装配的调用
		//Hello hello=(Hello)context.getBean(Hello.class);
		//显式装配的调用
		Hello hello=(Hello)context.getBean(Hello.class);
		System.out.println(hello);
		hello.setName("nihao");

		hello.printf();
		
		Hello hello2=(Hello)context.getBean(Hello.class);
		hello2.setName("buhao");
		System.out.println(hello2);
		hello2.printf();
		System.out.println(hello==hello2);//返回true,spring产生的bean都是单例模式
		
		/**
		 * 如果让生成的bean不是单例模式的呢
		 * 可以使用scope注释
		 */
		
	}
}
