package com.ngs.row11.loops;

import java.util.Scanner;

/**
 * @author NGS017
 * @version jre 1.8.0_171
 */
class Studentscore {

	public static void main(String[] args) {
		// System.out.println("enter your Maths marks in integer");
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter your Maths marks in integer");
		double Maths = scanner.nextDouble();

		System.out.println("enter your Physics marks in integer");
		double Physics = scanner.nextDouble();

		System.out.println("enter your Chemistry marks in integer");
		double Chemistry = scanner.nextDouble();

		// int Chemistry=sc.nextInt();
		/*
		 * int Maths=sc.nextInt();
		 * System.out.println("enter your Physics marks in integer"); int
		 * Physics=sc.nextInt();;
		 * System.out.println("enter your Chemistry marks in integer"); int
		 * Chemistry=sc.nextInt();
		 */
		/*
		 * if(Maths<0||100>=Maths) {
		 * System.out.println("given Maths marks is:"+Maths); } else {
		 * System.out.println("given Maths marks is:"
		 * +Maths+"invalid please recheck"); } if(Physics<0||100>=Physics) {
		 * System.out.println("given Physics marks is:"+Physics); } else {
		 * System.out.println("given Physics marks is:"
		 * +Physics+"invalid please recheck"); } if(Chemistry<0||100>=Chemistry)
		 * { System.out.println("given Chemistry marks is:"+Chemistry); } else {
		 * System.out.println("given Chemistry marks is:"
		 * +Chemistry+"invalid please recheck"); }
		 */
		if ((Maths > 0 && 100 >= Maths) && (Physics > 0 && 100 >= Physics) && (Chemistry > 0 && 100 >= Chemistry))
		{
			System.out.println("given Maths marks is:" + Maths + "given Physics marks is:" + Physics
					+ "given Chemistry marks is:" + Chemistry);

			double avg = (Maths + Physics + Chemistry) / 3d;
			System.out.println("Your avage score" + avg);
			if (avg >= 90) {
				System.out.println("Grade A");
			} else if (avg >= 70) {
				System.out.println("Grade B");
			}

			else if (avg >= 50) {
				System.out.println("Grade C");
			} else if (avg < 50) {
				System.out.println("Grade D");
			}
		} else {
			System.out.println("invalid data please check\ngiven Maths marks is:" + Maths + "given Physics marks is:"
					+ Physics + "given Chemistry marks is:" + Chemistry);

		}

	}
}