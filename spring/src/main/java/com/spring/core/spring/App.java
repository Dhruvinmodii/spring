package com.spring.core.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/spring/springcore.xml");
        student stud = (student)context.getBean("s1");
        student stud1 = (student)context.getBean("s2");
        System.out.println(stud);
        System.out.println(stud1);
    }
   
}
