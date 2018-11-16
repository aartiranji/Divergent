package com.div;

public class A {
	B b;
	//methods
	public void aM1() {
		System.out.println("hii from aM1");
	}

	public void aM2() {
		System.out.println("hii from aM2");
		b.bM1();
	}
	//constructor 4 autowier="constructor"
/*
	public A(B b) {
		super();
		this.b = b;
	}
*/	//setter-Getter
	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
