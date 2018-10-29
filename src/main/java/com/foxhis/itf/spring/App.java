package com.foxhis.itf.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.foxhis.itf.springdatabase.JdbcUsernameDaoImpl;
import com.foxhis.itf.springdatabase.Username;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld");
        helloWorld.printHello();
       
//        OutputHelper outputGenerator= (OutputHelper)context.getBean("OutputHelper");
//        outputGenerator.generateOutput();
        
/*        JdbcUsernameDaoImpl jdbcUsernameDaoImpl=(JdbcUsernameDaoImpl)context.getBean("UsernameDao");
        Username use=jdbcUsernameDaoImpl.getUsernameById(3);
        System.out.println(use.getPassword());*/
        
    }
}
