package com.foxhis.chapter3;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;


/**
 * 
 * @author tq
 *
 */
@Configuration
//@Profile("dev")  //类级别上的profile
public class DevelopmentProfileConfig {
	
	@Bean(destroyMethod="shutdown")
	@Profile("dev")//方法级别上的profile
	public DataSource dataSource()
	{
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
				.addScript("classpath:schema.sql").addScript("class:test-data.sql").build();
	}
	
	@Bean
	@Profile("prod")
	public DataSource jndiDataSource()
	{
		JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
		jndiObjectFactoryBean.setJndiName("jdbc/myDs");
		jndiObjectFactoryBean.setResourceRef(true);
		jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
		return (DataSource)jndiObjectFactoryBean.getObject();
	}
	
	

}
