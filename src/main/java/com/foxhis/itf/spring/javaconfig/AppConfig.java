package com.foxhis.itf.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="hellobean")
	public Hello getHello()
	{
		return new Hello();
	}

}
