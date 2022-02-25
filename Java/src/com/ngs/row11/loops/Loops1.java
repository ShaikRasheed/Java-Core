package com.ngs.row11.loops;

import java.util.*;



/**
 * @author NGS017
 *
 */
class Loops1
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your options\n 1 To calculate Sum\n 0 To exit");
		int opt = sc.nextInt();
		/*
		 * if(opt==0) { System.exit(0); } else {
		 * System.out.println("Please enter your options"); }
		 * System.out.println("Please enter your options");
		 */

		/*
		 * while(true) { switch(opt) { case 0: System.exit(0); break;
		 * 
		 * 
		 * case 1: System.out.println("enter your 1st Num"); int
		 * num1=sc.nextInt();
		 * 
		 * 
		 * } //return false; }
		 */

		/*
		 * while(opt==0) { System.exit(0); }
		 * System.out.println("Input the 5 numbers: "); for(int i=1; i<=5; i++)
		 * { int num = input.nextInt(); sum += num; }
		 * System.out.println("The sum of the given number is " + sum); double
		 * avg = sum/5d;
		 * System.out.println("The average of the given number is " + avg);
		 * System.out.println("The enter your options");
		 */
		while (opt == 1) {
			System.out.println("Please enter your options\n 1 To calculate Sum\n 0 To exit");
			opt = sc.nextInt();
			if (opt == 0) {
				System.exit(0);
			}
			double sum = 0;
			System.out.println("Input the 5 numbers: ");
			for (int i = 1; i <= 5; i++) {
				int num = sc.nextInt();
				sum += num;
			}
			System.out.println("The sum of the given number is " + sum);
			double avg = sum / 5d;
			System.out.println("The average of the given number is " + avg);

		}

	}
}