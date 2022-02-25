/*b) Write a Java Program to
Identify and declare variables for name, age, salary
Read values from console and assign values to above variables
Display their values on screen in separte line
Display their values on screen in single line with space between*/

package com.ngs.row8.DataTypes;

import java.util.*;

/**
 * @author NGS017
 *
 */
public class Empolyee {
	public static void main(String[] args) {
		// String name,age,salary;
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter your name");
		String name = scanner.next();

		// System.out.println("enter your name"+name);

		System.out.println("enter your age");
		String age = scanner.next();// int

		// System.out.println("enter your age"+age);

		System.out.println("enter your salary");
		String salary = scanner.next();

		// System.out.println("enter your age"+salary);

		System.out.println("entered name is " + name + "\n entered age is " + age + "\n entered salary is " + salary);

	}
}