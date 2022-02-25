package com.ngs.row28.Interfaces;

 

public class HDFC implements Bank
{
	float Interest=1000;
	public  void  getInterestRate()
	{
		System.out.println(" HDFC Bank"+Interest);
		
	}
	HDFC()
	{
		System.out.println("default constructor");
	}
	public static void main(String[] a)
	{
		HDFC hdfc = new HDFC();
		hdfc.getInterestRate();
	}
}