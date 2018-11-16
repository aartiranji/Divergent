package com.div;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeLogic {
	public static void main(String[] args) {
		ApplicationContext contex=new ClassPathXmlApplicationContext("Web.xml");
		Employee e= (Employee) contex.getBean("empFactory");
		//e.toString();//no-output
		System.out.println(e);
        
	}

}
