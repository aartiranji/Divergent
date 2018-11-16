package com.div;

public class Employee { 

	private static int id;

	public Employee() {
		System.out.println("emp cons called");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	 public void print() {
		 System.out.println(this.id);
	 }
	
}  