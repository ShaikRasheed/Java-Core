package com.ngs.Row37.StringBuffer;

import java.util.Scanner;

public class Validation1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your UserName");
		String Username = sc.next();
		System.out.println("Enter your Password");
		String pass = sc.next();

		if (Username.equals("admin") && pass.equals("password123")) {
			System.out.println("login Successfull");
		} else {
			System.out.println("Login failed due to invalid user name or password");
		}

	}
}
