package com.foxhis.itf.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
//组件扫描方式,这种叫做隐式装配
//@ComponentScan(basePackages={"com.foxhis.itf.spring.javaconfig"})
//@ComponentScan(basePackageClasses={Hello.class})
public class AppConfig {
	
	//这种是显示装配
	@Bean(name="hellobean")
	public Hello getHello()
	{
		return new Hello();
	}

}
