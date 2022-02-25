package com.ngs.row17.javamethods;

import java.util.*; 
class  ArithmticOperations
{
	Scanner scanner = new Scanner(System.in);
	int a ,b;
	
	public void add()
	{
		System.out.println("enter a value ");
		double a = scanner.nextDouble();
		System.out.println("enter b value ");
		double b = scanner.nextDouble();
		double add = a+b;
		System.out.println("total sum= " + add);
	}
	public void sub()
	{
		
		System.out.println("enter a value ");
		double a = scanner.nextDouble();
		System.out.println("enter b value ");
		double b = scanner.nextDouble();
		double sub = a - b;
		System.out.println( "total sum = " + sub);
	}
	public void mul()
	{
		
		System.out.println( "enter a value " );
		double a = scanner.nextDouble();
		System.out.println( "enter b value " );
		double b = scanner.nextDouble();
		double mul = a * b;
		System.out.println( "total sum= " + mul);
	}
	public void div()
	{
		
		System.out.println( " enter a value " );
		double a = scanner.nextDouble();
		System.out.println( " enter b value ");
		double b = scanner.nextDouble();
		double div = a / b;
		System.out.println(" total sum= " + div);
	}
	 
	 
}