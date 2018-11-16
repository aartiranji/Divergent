package com.div;

public class EmployeeFactory
{
    private EmployeeFactory()
    {}

    public static Employee createEmployee(String designation)
    {
        Employee emp = new Employee();
        
        if ("manager".equals(designation))
        {
            emp.setName("Manager JavaInterviewPoint");
            emp.setAge("111");
            emp.setDesignation(designation);
        }
        else if("seniormanager".equals(designation))
        {
            emp.setName("SeniorManager JavaInterviewPoint");
            emp.setAge("222");
            emp.setDesignation(designation);
        }
        else
        {
            throw new RuntimeException();
        }
        return emp;
    }
}