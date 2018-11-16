package com.div;

public class Employee {  
public Employee(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

private int id;  
private String name;
private Address add;
  
public Employee() {System.out.println("def cons");}  
  
public Employee(int id) {this.id = id;}  
  
public Employee(String name) {  this.name = name;}  
  
public Employee(int id, String name) {  this.id = id;  this.name = name;  } 

  
void show(){  
    System.out.println(id+" "+name);
    System.out.println(add); 
}  
  
}  