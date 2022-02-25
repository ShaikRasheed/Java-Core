package com.ngs.Row37.StringBuffer;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author NGS017 Sk Rasheed
 */
public class RegistationForm {
	public static void main(String[] args) throws ParseException {
		// It is the variable to count the buffer index size by default index
		// starts from zero.
		int count = 0;

		// To creating the buffer object.
		StringBuffer buffer = new StringBuffer();

		// buffer.append("Hello \t");

		// insert is the method to insert the data based on the index position.
		System.out.println(buffer.insert(0, "Hello "));

		// capacity is the method To know the buffer capacity or size of the
		int length = buffer.capacity();
		System.out.println("buffer by default capacity is : " + length);

		// Creating the scanner object to read the data dynamically
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your Firstname");
		String Firstname = sc.nextLine();

		System.out.println("enter your Lastname");
		String Lastname = sc.nextLine();

		System.out.println("enter your Email");
		String Email = sc.nextLine();

		System.out.println("Enter your Date of Birth");
		String DOB = sc.nextLine();

		System.out.println("Enter your Gender");
		String Gender = sc.nextLine();

		System.out.println("Enter your Marital Status");
		String MS = sc.nextLine();

		System.out.println("Enter your Phone Number");
		String phone = sc.nextLine();

		System.out.println("Enter your Address");
		String Address = sc.nextLine();

		System.out.println("Enter your Occupation");
		String Occupation = sc.nextLine();

		System.out.println("Enter your EMployeer");
		String Employeer = sc.nextLine();

		System.out.println("Enter your City");
		String City = sc.nextLine();

		System.out.println("Enter your Pincode");
		String Pincode = sc.nextLine();

		//
		if (!Firstname.equals("") && !Lastname.equals("") && !Occupation.equals(null)) {
			/*
			 * It is the validataion for gmail
			 */
			boolean emailvalue = Pattern.matches("^(.+)@(.+)$", Email);
			if (emailvalue == true) {

				System.out.println(buffer.insert(0, Email));

			} else {

				for (int i = 0; i < buffer.length(); i++) {
					// System.out.println(buffer.charAt(i));
					count = i;
					// System.out.println(count);
				}

				/*
				 * replace is the method to replace the content and i am storing
				 * in the buffer displaying the error message.
				 */
				buffer.replace(0, count, "Your Email is invalid ");
				System.out.println(buffer);
			}
			try {
				if (DOB != null) {

					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					java.util.Date date = simpleDateFormat.parse(DOB);
					String dt = simpleDateFormat.format(date);
					System.out.println(buffer);

				}
			} catch (Exception e) {
				// int length1 = buffer.capacity();
				for (int i = 0; i < buffer.length(); i++) {
					// System.out.println(buffer.charAt(i));
					count = i;
					// System.out.println(count);
				}
				System.out.println(count);
				buffer.replace(0, count, "Date of Birth is mismatch");
				System.out.println(buffer);
			}

			/*
			 * this is used to find the size of the buffer
			 */
			for (int i = 0; i < buffer.length(); i++) {
				// System.out.println(buffer.charAt(i));
				count = i;
				// System.out.println(count);
			}

			/*
			 * Based on the buffer size
			 */
			if (count > 0 && 10000 >= count) {

				System.out.println("Logined not Successfully");
			} else {
				System.out.println("login successfull");
			}
		} else {
			buffer.append("you entered null values please check");
			buffer.append(phone);

			System.out.println(buffer);
		}

	}
}
