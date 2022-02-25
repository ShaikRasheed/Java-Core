package com.ngs.row21.Inheritance;

public class DsuperM {
	// This is instance variable
	int a = 10;

	// Default constructor
	public DsuperM() {
		System.out.println(" Super call method & variable " + a);
	}

	public void DsuperM() {
		int b = 20;
		System.out.println(" Super call method & variable " + b);
	}

	public void add() {

		int b = a + 20;
		System.out.println(" Super call method & variable " + b);
	}

	public void sub() {

		int b = 10 - 20;
		System.out.println(" Super call method & variable " + b);
	}

}
