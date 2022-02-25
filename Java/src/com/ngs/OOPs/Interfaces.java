package com.ngs.OOPs;

//why interfaces concepts comes into picture in inheritance multipule and hibrid inheritance is not supported 
// It will leads to deadly diamond problem
// what is interface?
// It is a collection of abstract methods.
//It is used to achieve abstraction and multiple inheritance in Java.
public interface Interfaces 
{
	// Here It will be taken as public static final int a =10
	int a = 10;
	// It will be taken as abstract methods
	void main();
	void add();
	
	//  public static final int b;
	static int b = 100;
	//static{} 
	//this are supported in java 8
	
}
