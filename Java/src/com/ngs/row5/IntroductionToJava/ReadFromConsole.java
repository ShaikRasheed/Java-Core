package com.ngs.row5.IntroductionToJava;

/**
 * @author NGS017
 *
 */

//b) Write a Java Program to read a string  from console. To append  ""You have  entered : "" to the given string and display

import java.util.*;

public class ReadFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter your data in String format ");

		// The Java Scanner class is used to collect user input.
		Scanner scanner = new Scanner(System.in);

		/*
		 * scanner scans from the current position until it finds a line
		 * separator delimiter. The method returns the String from the current
		 * position to the end of the line.
		 */
		String name = scanner.nextLine();

		System.out.println("You have entered: " + name);

	}

}
