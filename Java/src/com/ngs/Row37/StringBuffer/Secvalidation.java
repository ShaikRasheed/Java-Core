package com.ngs.Row37.StringBuffer;

/**
 * @author NGS017
 *
 */
public class Secvalidation {
	public static void main(String[] args) {
		String fullname = " Shaik Rasheed ";
		System.out.println(fullname.toUpperCase());
		System.out.println(fullname.toLowerCase());
		String firstname = fullname.substring(0, 5);
		String lastname = fullname.substring(6);
		System.out.println(firstname);
		System.out.println(lastname);
		String removevoidspaces = fullname.trim();
		System.out.println(removevoidspaces);

	}
}
