package com.ngs.row21.Inheritance;

public class Employee 
{
	String empid = "198";

	Employee(String empid) {
		this.empid = empid;
		System.out.println(this.empid);
	}

	Employee() {
		this.empid = empid;
		System.out.println("default constructor" + this.empid);
	}
	// this.empid=empId;
}
