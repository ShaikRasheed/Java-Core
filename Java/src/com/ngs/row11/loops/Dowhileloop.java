package com.ngs.row11.loops;



/**
 * @author NGS017
 *
 */
public class Dowhileloop
{	 
	public static void main(String[] args)
	{
		//System.out.println(args[0]);
		int i = 0 ,sum = 0;
		do
		{
			System.out.println("i values= "+i);
			
			sum = sum + i;//sum+=i;
			System.out.println("i values sum= " + sum);
			i++;
		}while(i<=100);
		
		System.out.println("i values sum="+sum);
		double avg=sum/100d;
		System.out.println("i values sum="+avg);
		
	}
}