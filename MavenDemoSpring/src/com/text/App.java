package com.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args)
	{
		ApplicationContext contxt=new ClassPathXmlApplicationContext("spring.xml");
		Computer c=contxt.getBean(Computer.class);
		c.display(); 
	}
}
