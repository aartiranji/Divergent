package com.div;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Web.xml");  
	A a=(A)context.getBean("aa");
	a.aM1();
	a.aM2();
	//A a1=context.getBean("aa",A.class); 
	//a1.aM1();


}
}
