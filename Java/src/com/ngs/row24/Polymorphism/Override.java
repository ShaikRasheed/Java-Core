package com.ngs.row24.Polymorphism;

public class Override {

	int id;
	String name;
	String address;

	Override(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	// overriding the toString() method
	public String toString() {
		return id + " " + name + " " + address;
	}

	public static void main(String[] args) {
		Override override = new Override(198, "Rasheed", "Tenali");
		Override override2 = new Override(200, "Dev", "hyderbad");

		System.out.println(override);// compiler will takes like this s1.toString()
		System.out.println(override2);// compiler will takes like this s2.toString()
	}
}
