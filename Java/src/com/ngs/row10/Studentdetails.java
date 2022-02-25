package com.ngs.row10;

import java.util.Scanner;

/*
* Creating the class for Studentdetails.
*/
/**
 * @author NGS017
 * @author Shaik Rasheed
 * 
 */
class Studentdetails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Enter the Student name.
		System.out.println("enter   Student Name ");
		String Name = scanner.next();
		System.out.println("enter   Student age");
		String age = scanner.next();
		System.out.println("enter Student CollegeName");
		String ColName = scanner.next();
		System.out.println("enter Student Branch");
		String Branch = scanner.next();
		System.out.println("enter Student City");
		String City = scanner.next();
		System.out.println("Your Name is:" + Name + "Your Age is:" + age + " Your CollegeName is:" + ColName
				+ "Your Branch name is" + Branch + "Your City Name is " + City);
	}
}