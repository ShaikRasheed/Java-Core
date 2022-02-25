package com.ngs.Row37.StringBuffer;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BuffClass {

	public void scanner() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		StringBuffer buffer = new StringBuffer();
		System.out.println("Enter first name");
		String firstname = sc.nextLine().toUpperCase();
		if (firstname.isEmpty()) {

			System.out.println(buffer.insert(0, "First name cannot be empty "));
			System.out.println("Enter First name");
			firstname = sc.nextLine().toUpperCase();

			System.out.println(firstname);
		}
		System.out.println("Enter last name");
		String lastname = sc.nextLine().toUpperCase();
		if (lastname.isEmpty()) {
			for (int i = 0; i < buffer.length(); i++) {
				count = i;
			}
			System.out.println(buffer.insert(count, "Last name cannot be empty"));
			System.out.println("Enter Last name");
			lastname = sc.nextLine().toUpperCase();
		}
		System.out.println("Enter Email");
		String email = sc.nextLine();
		if (email.matches(("^(.+)@(.+)$"))) {
			System.out.println("Entered email is correct");
		} else {
			for (int i = 0; i < buffer.length(); i++) {
				count = i;
			}
			System.out.println(buffer.insert(count, "\n Enter valid email"));
			email = sc.nextLine();
		}
		System.out.println("Enter DOB");
		String dob = sc.nextLine();

		if (dob.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")) {
			System.out.println("Entered dob is in valid form");

		} else {
			for (int i = 0; i < buffer.length(); i++) {
				count = i;
			}
			System.out.println(buffer.insert(count, "\n Enter valid dob \"dd/mm/yyyy\" "));
			dob = sc.nextLine();
		}
		System.out.println("Enter gender");
		String gender = sc.nextLine();
		if (gender.isEmpty()) {
			for (int i = 0; i < buffer.length(); i++) {
				count = i;
			}
			System.out.println(buffer.append(" Gender cannot be empty"));
			System.out.println("Enter Gender");
			lastname = sc.nextLine();
		}
		System.out.println("Enter Marial status");
		String marialstatus = sc.nextLine();
		System.out.println("Enter phone number");
		String phonenumber = sc.nextLine();
		if (phonenumber.matches("^\\d{10}$")) {
			System.out.println("Entered phone number is valid");
		} else {
			System.out.println("Enter valid number");
			phonenumber = sc.nextLine();

		}
		System.out.println("Enter pincode");
		String pincode = sc.nextLine();
		if (pincode.matches("^\\d{6}$")) {
			System.out.println("Entered pincode is valid");
		} else {
			System.out.println("Enter valid pincode");
			phonenumber = sc.nextLine();
		}
		System.out.println("Credit card details are validated");
		System.out.println("Credit card details are " + "\n" + "Name is " + firstname + lastname + "\n" + "Email is "
				+ email + "\n" + "dob is " + dob + "\n" + "Phone number is " + phonenumber);
	}

	public static void main(String[] args) {

		BuffClass bf = new BuffClass();
		bf.scanner();

	}

}
