package com.foxhis.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


/**
 * 运行时才注入值，可采用注解PropertySource
 * @author tq
 *
 */
@Configuration
@PropertySource("classpath:/condition.properties")
public class ConditonalConfig {

	/**
	 * Environment为整个bean的上下文环境变量
	 */
	@Autowired
	Environment env;
	
	/**
	 * bean 注释没有指定name的情况下，默认采用Class<T>加载方式获取该bean
	 * conditional 为条件化的bean，需实现conditional接口，如ConditonalImpl类
	 * @return
	 */
	@Bean
	@Conditional(ConditonalImpl.class)
	public CanditonalDemo demo()
	{
		return new CanditonalDemo(env.getProperty("name"));
	}
}
