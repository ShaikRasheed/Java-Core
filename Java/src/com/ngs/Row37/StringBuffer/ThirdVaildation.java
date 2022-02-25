package com.ngs.Row37.StringBuffer;

/**
 * @author NGS017
 *
 */
/*
 * There are many ways to reverse String in Java. We can reverse String using
 * StringBuffer, StringBuilder, iteration etc. Let's see the ways to reverse
 * String in Java.
 * 
 * 
 * 
 */
public class ThirdVaildation {

	public static void main(String[] args) {
		String str = "Shaik Rasheed", nstr = "";
		char ch;

		System.out.print("Original word: ");
		System.out.println("Shaik Rasheed"); // Example word

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			nstr = ch + nstr; // adds each character in front of the existing
								// string
		}
		System.out.println("Reversed word: " + nstr);

		// By using StringBuilder Class.
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString());

		// By Using StringBuffer Class.

		StringBuffer sb1 = new StringBuffer("rasheed");
		sb1.append("hello ");
		System.out.println("Hello " + sb1.reverse());

	}
}
