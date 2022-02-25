package com.ngs.row11.loops;

import java.util.Scanner;

/**
 * @author NGS017
 *
 */
class Greatest_Number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter your 1st number");
		int firstnum = scanner.nextInt();

		System.out.println("enter your 2st number");
		int secnum = scanner.nextInt();

		System.out.println("enter your 3st number");
		int thirdnum = scanner.nextInt();

		// here 1st > 2rd no and 1st no is greater then 3rd number.
		if (firstnum > secnum && firstnum > thirdnum) {
			System.out.println("enter your 1st number is greater" + firstnum);
		}

		// here 2nd > 1st no and 2nd no is greater then 3rd number.
		else if (secnum > firstnum && secnum > thirdnum) {
			System.out.println("enter your 2nd number is greater" + secnum);
		}

		// here 3rd number is greater then both 1 and 2.
		else {
			System.out.println("enter your 3rd number is greater" + thirdnum);
		}
	}

}
