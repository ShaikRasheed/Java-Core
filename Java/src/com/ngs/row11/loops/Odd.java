package com.ngs.row11.loops;

import java.util.*;
class Odd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your  number ");
		int iteams = sc.nextInt();
		for(int i = 0; i <= iteams; i++)
		{
			
			if( i%2 == 0 )
			{
				// Here Skiping the even number 
				continue;
			}
			System.out.println( "odd number =  " + i);
		}
		//System.out.println("your total iteams price="+sum);
	}
}