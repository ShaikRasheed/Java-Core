package com.ngs.row5.IntroductionToJava;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter your name ");
		String name = scanner.nextLine();

		System.out.println(" enter your College name ");
		String College = scanner.nextLine();
		// System.out.println("enter your College name "+College);

		System.out.println("enter your age ");
		int age = scanner.nextInt();

		// console and display the details on console in single line

		System.out.println("your Name is" + name + "your College name is " + College + "your  age is" + age);

		// console and display the details on console in different lines

		System.out.println("your Name is " + name + "\nyour College name is " + College + "\nyour  age is " + age);

	}

}
