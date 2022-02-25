package com.ngs.row24.Polymorphism;

public class C3 extends C1 {
	String name = "Rasheed";

	public void print() {

		System.out.println("Hello c3" + name);
	}

	public static void main(String[] args) {

		C3 c3 = new C3();
		c3.print();
		C1 c1 = new C1();
		c1.print();
	}
}
