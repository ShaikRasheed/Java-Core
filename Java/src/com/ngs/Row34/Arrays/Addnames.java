package com.ngs.Row34.Arrays;

import java.util.*;

public class Addnames {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your array size");
		int sz = sc.nextInt();

		String[] names = new String[sz];
		System.out.println("enter your Strings");

		for (int i = 0; i < sz; i++) {
			names[i] = sc.next();
			// System.out.println(names[i]);
		}
		for (int i = 0; i < names.length; i++) {

			System.out.println(Arrays.toString(names));

			/*
			 * if( names[1]|| names[5]) { System.out.println(names[0]); }
			 */
			System.out.println(" First position value is " + names[1] + " 5th  position value is " + names[5]
					+ " Nineth position value is " + names[9]);
		}
		// System.out.println(names[1]+""+names[5]+""+names[9]);

	}
}
