package com.ngs.row11.loops;

import java.util.Scanner;

/**
 * @author NGS017
 *
 */
class Vowels_consonants {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter a Character");
		char Character = scanner.next().charAt(0);// To read the data by char
													// wise by using charAt.

		// AEIOU are vowels.
		if (Character == 'a' || Character == 'e' || Character == 'i' || Character == 'o' || Character == 'u') {
			System.out.println("enter a Character is vowel");
		}

		else {
			System.out.println("enter a Character is consonants");
		}
	}
}