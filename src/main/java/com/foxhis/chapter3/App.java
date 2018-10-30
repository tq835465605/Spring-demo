package com.foxhis.chapter3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConditonalConfig.class);
		CanditonalDemo demo=(CanditonalDemo)context.getBean(CanditonalDemo.class);
		System.out.println(demo);
		demo.printName();
	}

}
