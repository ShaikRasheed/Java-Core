package com.ngs.row21.Inheritance;

public class Subclass extends Base
{
	Subclass()
	{
		System.out.println("Hello Subclass");
	}
	
	public static void main(String[] args) 
	{
		Base base = new Base();
		base.main();
		Subclass subclass=new Subclass();
	 
	}

}
