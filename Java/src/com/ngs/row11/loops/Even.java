package com.ngs.row11.loops;

import java.util.Scanner;

/*
* Creating a class for Even number.
*/
/**
 * @author NGS017
 *
 * @author Shaik Rasheed
 */
class Even {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Enter number any positive number
		System.out.println("enter a number");
		int number = scanner.nextInt();

		// Here the entered number is divisible by 2 then that number is even
		if (number % 2 == 0) {
			System.out.println("even number=" + number);
		}

		else {
			System.out.println("Not a even number=" + number);
		}
	}

}