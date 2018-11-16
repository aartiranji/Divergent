package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hello.HelloBeanClass;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("ApplicationConfig.class");
		HelloBeanClass h=(HelloBeanClass) context.getBean("helloBean");
		h.print();
	}

}
