package com.ngs.Row34.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {

	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your option to add employees or not\n 0 To exit 1 To add employee");
		int a = sc.nextInt();
		// System.out.println("enter employee ");
		int k = 0;
		String[] array = new String[3];
		String[] array1 = new String[array.length * 2];
		while (a != 0) {

			System.out.println("enter your employee name");
			String name = sc.next();
			System.out.println("enter your age ");
			int age = sc.nextInt();
			System.out.println("enter your designation");
			String design = sc.next();
			System.out.println("enter your salary");
			String salary = sc.next();
			int ar = array.length;
			String newarray[] = new String[ar++];

			/*
			 * for(int i=0;i<3;i++) { array[i]=name+" "+salary; } for(int
			 * i=0;i<3;i++) { array[i]=name+" "+salary; }
			 */
			for (int i = 0; i < array.length; i++) {
				newarray[k] += array[i];
				// System.out.println(array[i]);
				// System.out.println(Arrays.toString(array));
				// System.out.println(newarray[k]);

			}

			System.out.println("your name=  " + name + "  your salary= " + salary);
			System.out.println("enter your option to add employees or not\n 0 To exit 1 To add employee");
			a = sc.nextInt();

		}
		System.out.println(array1[k]);
		System.out.println("your are exited");
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.add();

	}
}
