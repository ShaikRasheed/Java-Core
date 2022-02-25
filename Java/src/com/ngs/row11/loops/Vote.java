package com.ngs.row11.loops;

import java.util.Scanner;

class Vote {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter your Age in integer");
		String ag = scanner.next();

		// Here coverting String to Integer by using ParseInt method.
		int age = Integer.parseInt(ag);
		System.out.println("entered Age" + age);
		/*
		 * if(age >18) { System.out.println("you are aligable to vote"); } else
		 * if(age>120) { System.out.println("you are aligable to vote"); } else
		 * { System.out.println("you are not aligable to vote"); }
		 */

		// Age limit is in between 18 to 100 are aligible to vote.
		if (age < 18 || 100 >= age) {
			System.out.println("you are aligable to vote");
		} else {
			System.out.println("you are not aligable to vote");
		}

	}
}