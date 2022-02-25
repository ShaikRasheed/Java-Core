package com.ngs.Row32.Final;

public class FinalCM extends FinalC// here the final class can't be inherited
{
	public void display1()
	{
		System.out.println("Hello  class");
	}

	public static void main(String args[]) {
		FinalCM finalCM = new FinalCM();
		finalCM.display();

	}
}
