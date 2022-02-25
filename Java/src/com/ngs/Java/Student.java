package com.ngs.Java;

public class Student {
	private String name;
	int rollno, marks;

	public void setData(String name, int rollno, int marks) { // ) {
		// TODO Auto-generated method stub

		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	public void displayData() {// , int rollno, int marks) {
		// TODO Auto-generated method stub
		// this.name="";
		System.out.println(this.name + "\n" + this.rollno + "\n" + this.marks);
		System.out.println(name);

	}

}
