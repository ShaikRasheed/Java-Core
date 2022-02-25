package com.ngs.row11.loops;

import java.util.*;
class Employee
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("you want to enter employee records ");
		String Employee = scanner.next();
		while(Employee.equals("yes"))
		{
			System.out.println("enter your Employee Name ");
			String Empname = scanner.next();
			System.out.println("enter your Employee age ");
			String age = scanner.next();
			System.out.println("enter your Employee Salary ");
			String Salary = scanner.next();
			System.out.println("enter your Employee Designation ");
			String Designation = scanner.next();
			System.out.println("Employee Name " + Empname +"\n Employee age" + age + "\n Employee Salary"+Salary+"\nEmployee Designation"+Designation);
			System.out.println( "you want to enter another record  enter yes" );
			Employee = scanner.next();
		}
		
	}
}