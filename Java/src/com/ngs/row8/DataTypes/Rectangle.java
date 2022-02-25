package com.ngs.row8.DataTypes;

import java.lang.Math;
import java.util.Scanner;

/**
 * @author NGS017
 * @version 1.8
 * @author Shaik Rasheed
 * 
 */
class Rectangle {
	public void main() throws Exception {
		double area, perimeter, height, width;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter   Height:");
		width = scanner.nextDouble();
		System.out.println("enter   Height:");
		height = scanner.nextDouble();
		area = width * height;
		perimeter = 2 * (height + width);// p=2(h+w) a=area, π=pi=3.14 or 22/7
		System.out.println("area of the  rectangle is:" + area);
		System.out.println("area of the  rectangle is:" + perimeter);
	}
}