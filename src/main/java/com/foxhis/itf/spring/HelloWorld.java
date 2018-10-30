package com.foxhis.itf.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HelloWorld {

	
	//自动装配，其内部是采用byType
	@Autowired
	//装配有歧义的时候
//	@Qualifier("name1")
	private Name name2;
	
	public Name getName2() {
		return name2;
	}
	public void setName2(Name name2) {
		this.name2 = name2;
	}
	
	/*public HelloWorld(Name name) {
		// TODO Auto-generated constructor stub
		this.name2 = name;
	}*/
	
	public void printHello() {
		System.out.println("Spring 4.35 : Hello ! " + name2.getNameb());
		
	}
	
}
