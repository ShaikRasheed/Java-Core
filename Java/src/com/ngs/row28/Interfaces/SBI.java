package com.ngs.row28.Interfaces;

 

public class SBI implements Bank
{
	double Interest=100;
	public void  getInterestRate()
	{
		System.out.println("SBI interes"+Interest);
	}
	public static void main(String[] args)
	{
		SBI sbi=new SBI();
		sbi.getInterestRate();
	}
}