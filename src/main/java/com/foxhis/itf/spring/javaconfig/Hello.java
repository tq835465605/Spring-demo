package com.foxhis.itf.spring.javaconfig;


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
