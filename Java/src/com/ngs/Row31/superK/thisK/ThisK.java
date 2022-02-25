package com.ngs.Row31.superK.thisK;

//  this is  refers to the current object 
public class ThisK {
	// Instances variables are stored in heap memory or area
	String name="chotu";
	int rollno;
	int phone;

	public ThisK(String name) {
		this.name = name;
		System.out.println("my name" + name+this.phone);
	}

	public ThisK(String name, int rollno) {
		this(name);
		this.name = name;
		rollno = rollno;
		this.phone=phone;
		//this.name = "CHotu";
		//i have doubt here i am not able to getting  the value of the when i am passing in the constructor 
		System.out.println("my name" + this.name + "" + rollno + "" + name);
	}

	//the parameterized variables are stored in the stack memory
	public ThisK(String name, int Rollno, int phone) {
		this(name, phone);
		this.name = name;
		this.rollno = rollno;
		this.phone = phone;
		System.out.println("my name" + name + "" + rollno + "" + Rollno);
	}

}
