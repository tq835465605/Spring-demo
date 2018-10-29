package com.foxhis.itf.spring.javaconfig;

import org.springframework.stereotype.Component;

//声明为组件，让spring容器自动扫描
@Component
public class Hello {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printf()
	{
		System.out.println("spring 3.5! "+name);
	}

}
