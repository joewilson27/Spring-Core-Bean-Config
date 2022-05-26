package com.joe.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// not injection object
//    	Samsung s7 = new Samsung();
//        s7.config();
    	
    	// 1. Inject with application context (this is spring has)
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class); // put class config AppConfig class to this variable
    	Samsung s7 = factory.getBean(Samsung.class);
    	s7.config();
        
    }
}
