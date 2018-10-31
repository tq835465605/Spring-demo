package com.foxhis.chapter5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//这句话的意思是：扫描com.foxhis.chapter5包，但是不扫描包含enablewebmvc的注解组件
@ComponentScan(basePackages={"com.foxhis.chapter5"},
		excludeFilters={//指定哪些类型不适合组件扫描
				@Filter(type=FilterType.ANNOTATION,value=EnableWebMvc.class)})//声明类型过滤器用作包含过滤器或排除过滤器
public class RootConfig {

}
