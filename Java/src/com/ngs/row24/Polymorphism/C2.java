package com.ngs.row24.Polymorphism;

public class C2 extends C1
{
	String name="Rasheed";
	public void print()
	{
		System.out.println("Hello c2"+name);
	}
	public static void main(String[] args)
	{
		 
		C2 c2=new C2();
		c2.print();
		C1 c1=new C2();
		c1.print();
	}
}
