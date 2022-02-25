package com.ngs.row11.loops;

import java.util.*;



// Creating the Employee class by using the Do while.
class EmployeeDowhile 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("you want to enter employee records ");
		String Employee = scanner.next();

		// dowhile means 1st it do the work after that check the condition.
		do {
			System.out.println("enter your Employee Name ");
			String Empname = scanner.next();
			System.out.println("enter your Employee age ");
			String age = scanner.next();
			System.out.println("enter your Employee Salary ");
			String Salary = scanner.next();
			System.out.println("enter your Employee Designation ");
			String Designation = scanner.next();
			System.out.println("Employee Name " + Empname + "\n Employee age" + age + "\n Employee Salary" + Salary
					+ "\nEmployee Designation" + Designation);
			System.out.println("you want to enter another record  enter yes");
			Employee = scanner.next();
		} while (Employee.equals("yes"));

	}
}