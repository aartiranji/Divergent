package com.div;

public class Employee {
	   private String name;
	    private String age;
	    private String designation;
	    
	    public Employee()
	    {
	        super();
	    }
	    public Employee(String name, String age, String designation)
	    {
	        super();
	        this.name = name;
	        this.age = age;
	        this.designation = designation;
	    }
	    public String getName()
	    {
	        return name;
	    }
	    public void setName(String name)
	    {
	        this.name = name;
	    }
	    public String getAge()
	    {
	        return age;
	    }
	    public void setAge(String age)
	    {
	        this.age = age;
	    }
	    public String getDesignation()
	    {
	        return designation;
	    }
	    public void setDesignation(String designation)
	    {
	        this.designation = designation;
	    }
	    @Override
	    public String toString()
	    {
	        return "***Employee Details***\n Name :" + name +"\n "
	          + "Age : " + age + "\n Designation : " + designation;
	    }
}
