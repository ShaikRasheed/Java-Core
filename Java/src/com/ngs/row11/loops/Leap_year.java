
package com.ngs.row11.loops;

import java.util.Scanner;

/*
* Creating a class for Leap_year
*/
/**
 * @author NGS017
 * @author Shaik Rasheed
 * 
 */
class Leap_year {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter a Year");
		int year = scanner.nextInt();

		/*
		 * Here we are checking enter year is divisible by 4 or not. And year
		 * 100 is not equals to zero. year divisible by 400 and equals to zero
		 * is leap year.
		 */
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("Specified year is a leap year");
		}

		// Are else not a leap year.
		else {
			System.out.println("Specified year is not a leap year");
		}

	}
}
