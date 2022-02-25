package com.ngs.row28.Interfaces;

 

public class ICICI implements Bank {
	double Interest = 101;
	private String name;

	public void getInterestRate() {

		this.set("i am giving 10% interest");
		System.out.println("SBI interes" + Interest + "\n" + this.get());

	}

	public void set(String value) {
		name = value;
		// return name;
	}

	public String get() {
		return this.name;
	}

	public static void main(String[] args) {
		ICICI icici = new ICICI();
		icici.getInterestRate();

	}
}
