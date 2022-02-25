package com.ngs.row11.loops;

/*Write a Java program to get a number from the user and print whether it is positive or negative.*/

import java.util.Scanner;

/**
 * @author NGS017
 *
 * @version jre 1.8.0_171
 */
class PN_number {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter a number");
		int number = scanner.nextInt();

		// number will be greater than zero then it is a positive number.
		if (number > 0) {
			System.out.println("Positive");
		}

		// number is eqaul to zero.
		else if (number == 0) {
			System.out.println("Zero");
		}

		else {
			System.out.println("Negative");
		}
	}
}