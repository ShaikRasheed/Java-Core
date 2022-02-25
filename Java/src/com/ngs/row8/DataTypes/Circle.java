package com.ngs.row8.DataTypes;

/* Write a Java program to print the area and perimeter of a circle.
Radius = 4.5 (Test Data)
c) Write a Java program to print the area and perimeter of a rectangle
Length = 4.5 Breadth = 9.5 (Test Data)*/

import java.lang.Math;
import java.util.Scanner;

class Circle {
	public static void main(String[] args) {
		double area, radius;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter  radius of the circle:");
		radius = scanner.nextDouble();
		area = Math.PI * (radius * radius);// A=πr2 a=area, π=pi=3.14 or 22/7

		System.out.println("area of the circle is:" + area);
	}
}
