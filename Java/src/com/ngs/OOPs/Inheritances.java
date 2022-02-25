package com.ngs.OOPs;

public class Inheritances extends Abstractclass {

	private String name;
	@Override
	public void add() 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello this is Inheritance");
	}
	
	public void display()
	{
		System.out.println("This is inheritances display method");
	}
	public void helloworld(String name)
	{
		System.out.println("Hello bro "+name);
	}
	public void helloworld(String name, int age)
	{
		System.out.println("Method overloading"+name+age);
		
	}
	public void  setmethod(String name)
	{
		this.name=name;
		 System.out.println("encapluse");
		
	}
	public String getmethod()
	{
		this.name="rasheed";
		return name;
	}
	public static void main(String[] args)
	{
		Inheritances inheritances = new Inheritances();
		
	}
}
