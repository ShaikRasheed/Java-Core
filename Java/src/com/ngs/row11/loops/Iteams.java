
package com.ngs.row11.loops;
import java.util.*;
/*
* No of iteams and there sum by using For loop 
*/
/**
 * @author NGS017
 *
 */
class Iteams
{
	public static void main(String[] args)
	{
		// sum variable is to store the sum of the iteams and initialing with the value zero.
		double sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your total number iteams you want");
		int iteams = sc.nextInt();
		int i = 0;
		for( ; i < iteams ; )//for(int i=0;i<iteams;i++){}
		{
			
			System.out.println("enter your iteam price");
			
			int iteam = sc.nextInt();
			sum += iteam;
			i++;
		}
		System.out.println( " your total iteams price= " + sum);
		
	}
}
