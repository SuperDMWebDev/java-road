package com.example.javaroad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaRoadApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println("Message "+obj.getMessage());
	}

}
