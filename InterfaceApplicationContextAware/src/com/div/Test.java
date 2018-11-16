package com.div;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
	AppContext con=(AppContext) context.getBean("appCon");
	con.show();
	con.show();
}
}
