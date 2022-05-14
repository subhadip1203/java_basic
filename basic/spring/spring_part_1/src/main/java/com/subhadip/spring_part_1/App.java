package com.subhadip.spring_part_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	try {
    		Student student1 = (Student) context.getBean("student1");
    		System.out.println(student1);
    	} finally {
    		((ClassPathXmlApplicationContext) context).close();
    	}
    	
    	
    
    }
}
