package com.ngs.Row31.superK.thisK;

public class Superk2 extends SuperK 
{
	String color="Green";
	public void color()
	{
		System.out.println("This is Parent class property"+super.color);// this is to access super class property
		System.out.println("This is child class property"+color);// this is for accessing child class property
	}
}
