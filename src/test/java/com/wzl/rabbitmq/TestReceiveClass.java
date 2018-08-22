package com.wzl.rabbitmq;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReceiveClass {
	
	private ApplicationContext context = null;
	
    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring.xml");
    }
    
    @Test  
    public void receiveMQ() throws Exception {
    	System.out.println(context.toString());
    }
    
}
