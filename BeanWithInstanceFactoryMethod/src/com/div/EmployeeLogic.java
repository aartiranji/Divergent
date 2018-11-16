package com.div;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeLogic {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Web.xml");
		Employee manager= (Employee) context.getBean("manager");
		System.out.println("********** Manager Detail **********");
		System.out.println(manager.getName());
		System.out.println(manager.getAge());
		System.out.println(manager.getDesignation());
		
		//Get the Employee(SeniorManager) class instance
        Employee seniormanager = (Employee)context.getBean("seniormanager");
        
        System.out.println("**** seniormanager Details ****");
        System.out.println("Name : "+seniormanager.getName());
        System.out.println("Age  : "+seniormanager.getAge());
        System.out.println("Designation : "+seniormanager.getDesignation());
    }
		
	}

