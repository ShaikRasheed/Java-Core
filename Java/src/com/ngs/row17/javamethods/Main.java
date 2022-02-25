package com.ngs.row17.javamethods;

import java.util.*;

// Main class for ArithmeticOperations Class
class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// String Employee=sc.next();
		ArithmticOperations oper = new ArithmticOperations();

		// Here we are calling the methods.
		oper.add();// add(1,2) i want to pass this parameters through cmd.
		oper.sub();
		oper.mul();
		oper.div();

	}
}