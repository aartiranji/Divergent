package com.div;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Employee { 
	@Autowired(required= false)
	public Employee(@Qualifier("address1") Address address) {
		this.address = address;
	}

	private int id;  
	private String name;
	
	private Address address;  

	//Constructor
	
	//method  
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address);  
	}
	
	//setters and getters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}  

}  