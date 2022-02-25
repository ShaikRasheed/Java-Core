package com.ngs.row8.DataTypes;

/*c) Write Java program to allow the user to input two integer values and then the program prints the results of adding, subtracting, multiplying, dividing, remainder for  the two values.*/

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		String a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Value");
		a = sc.next();
		System.out.println("enter b Value");
		b = sc.next();
		// Here we converting or type casting string to double.
		double firstnum = Double.parseDouble(a);

		double secnum = Double.parseDouble(b);

		double add = firstnum + secnum;

		System.out.println(" Given value of A is =" + a + "\n Given value of B is=" + b);
		System.out.println("  After adding A and B = " + add);
		double sub = firstnum - secnum;
		System.out.println(" Given value of A is =" + a + " \n Given value of B is= " + b);
		System.out.println("  After subtracting both numbers = " + sub);
		double mult = firstnum * secnum;
		System.out.println(" Given value of A is =" + a + "\n Given value of B is=" + b);
		System.out.println("  After multiplying A and B = " + mult);
		double div = firstnum / secnum;
		System.out.println(" Given value of A is =" + a + "\n Given value of B is=" + b);
		System.out.println("  After Divison A and B = " + div);
		// i have a doubt how to get this data exactly()
		double e = 5 / 8;
		System.out.println(e);// here why i am getting 0.0;

	}

}