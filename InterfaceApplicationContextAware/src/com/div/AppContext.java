package com.div;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AppContext implements ApplicationContextAware {
	ApplicationContext context;
	@Autowired
	Employee employee;
	public AppContext() {
		System.out.println("app context constructor");
	}
	void show(){
		employee=getEmployee();
		employee.print();
	}
	public Employee getEmployee() {
		return context.getBean("emp",Employee.class);
	}

	public void setEmployee(Employee emp) {
		this.employee = emp;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
	}
}
