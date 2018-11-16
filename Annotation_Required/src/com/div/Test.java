package com.div;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext contex=new ClassPathXmlApplicationContext("context.xml");
	Employee e= (Employee) contex.getBean("emp");
	 e.displayInfo();
}
}
