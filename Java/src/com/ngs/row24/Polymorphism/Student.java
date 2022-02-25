package com.ngs.row24.Polymorphism;

public class Student {

	String name, address;
	int age;

	/*
	 * Student() { this.name=null; this.age=0; this.address=null; }
	 */
	public void setInfo(String name) {
		this.name = name;
	}

	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setInfo(String name, int age, String address) {

		this.name = name;
		this.age = age;
		this.address = address;

	}

	public void display() {
		System.out.println("Student name is" + name + "Student age is " + age + "Student address is " + address);
	}

	public static void main(String[] args) {

		Student st = new Student();
		st.display();
		st.setInfo("Rasheed");
		st.display();
		st.setInfo("Rasheed", 23);
		st.display();
		st.setInfo("Rasheed", 23, "HELLO World");
		st.display();

	}

}
