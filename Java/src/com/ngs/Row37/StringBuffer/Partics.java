package com.ngs.Row37.StringBuffer;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Partics 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		StringBuffer buffer = new StringBuffer();
		// buffer.append("Hello \t");
		System.out.println(buffer.insert(0, "Hello "));
		int length = buffer.capacity();
		System.out.println(buffer);
		System.out.println(length);
		System.out.println(buffer);
		System.out.println("Enter your Email");
		String Email = sc.nextLine();
		System.out.println("Enter your DOB");
		String DOB = sc.nextLine();

		if (!Email.equals("") && !DOB.equals(null)) 
		{
			boolean emailvalue = Pattern.matches("^(.+)@(.+)$", Email);
			if (emailvalue == true)
			{

				System.out.println(Email);

			} 
			else
			{

				buffer.append("Your Email is invalid ");
				System.out.println(buffer);
			}
			try 
			{
				if (DOB != null) 
				{

					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					java.util.Date date = simpleDateFormat.parse(DOB);
					System.out.println(date);

				}
				 
				
			} 
			catch (Exception e) 
			{
				buffer.append("Date of Birth is mismatch");
				System.out.println(buffer);
			
				/*
				 * //int length1 = buffer.capacity(); for(int i = 0;
				 * i<buffer.length();i++) {
				 * //System.out.println(buffer.charAt(i)); count = i;
				 * //System.out.println(count);
				 */
			}
		}
			// System.out.println(count);

			
			
		

		//System.out.println("Logined Successfully");
	

	else
	{ 
		
			buffer.append("you entered null values please check");
			//buffer.append(phone);
			System.out.println(buffer);
	}
	}}
		
		/*for(int i = 0; i<buffer.length();i++)
		{
			//System.out.println(buffer.charAt(i));
			count=i;
			//System.out.println(count);
		}
		System.out.println(count);
		buffer.insert(count,"hello brother");
		for(int i = 0; i<buffer.length();i++)
		{
			//System.out.println(buffer.charAt(i));
			count=i;
			//System.out.println(count);
		}
		System.out.println(count);*/


