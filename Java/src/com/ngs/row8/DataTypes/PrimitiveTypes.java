/*a)  Define variables for all the java primitive types, assign value and display.
b) Write a Java Program to
Identify and declare variables for name, age, salary
Read values from console and assign values to above variables
Display their values on screen in separte line
Display their values on screen in single line with space between
c) Write Java program to allow the user to input two integer values and then the program prints the results of adding, subtracting, multiplying, dividing, remainder for  the two values.*/

package com.ngs.row8.DataTypes;

class PrimitiveTypes {
	public static void main(String[] args) {
		byte byterangeN = -128;// Byte range Negative -128 .. 127 (8bits)
		System.out.println("Byte Negative Range is " + byterangeN);

		byte byterangeP = 127;// Byte range Positive
		System.out.println("Byte Positive Range is " + byterangeP);

		short shortrangeN = -32768;// -32,768 .. 32,767(16bits)
		System.out.println("Short Negative Range is" + shortrangeN);

		short shortrangeP = 32767;
		System.out.println("Short Postive range is " + shortrangeP);

		int intrangeN = -2147483648;// -2,147,483,648 .. 2,147,483,647 (32bits)
									// (2billion)
		System.out.println();
		int intrangeP = 2147483647;
		long longrangeN = -9223372036854775808l;// -9,223,372,036,854,775,808 ..
												// 9,223,372,036,854,775,807(64
												// bits)
		System.out.println(longrangeN);

		float a = 0.0788888888888888888888888f; // 32 bits
		double d = 0.0; // 64 bits
		char ch; // 16 bits
		boolean bol = false; // 1bit
		System.out.println(a);

	}
}