package com.foxhis.itf.spring.javaconfig;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;



@Configuration
//组件扫描方式,这种叫做隐式装配
//@ComponentScan(basePackages={"com.foxhis.itf.spring.javaconfig"})
//@ComponentScan(basePackageClasses={Hello.class})
public class AppConfig {
	
	//这种是显示装配
	//@Bean(name="hellobean")
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//修改其作用域，默认是单例模式
	public Hello getHello()
	{
		return new Hello();
	}

}
