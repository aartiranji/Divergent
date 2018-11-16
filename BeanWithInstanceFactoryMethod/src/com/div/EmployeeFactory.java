package com.div;

public class EmployeeFactory
{    private EmployeeFactory()
	    {}

	    public static EmployeeFactory createEmployee()
	    {   return new EmployeeFactory();
	    }
	    
	    public Employee getManager()
	    {
	        Employee emp = new Employee();
	        emp.setName("Manager JavaInterviewPoint");
	        emp.setAge("111");
	        emp.setDesignation("Manager");
	        return emp;
	    }
	    
	    public Employee getSeniorManager()
	    {
	        Employee emp = new Employee();
	        emp.setName("SeniorManager JavaInterviewPoint");
	        emp.setAge("222");
	        emp.setDesignation("SeniorManager");
	        return emp;
	    }
	}
