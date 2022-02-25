package com.ngs.row11.loops;

/**
 * @author NGS017
 *
 */
class ForLops 
{
	public static void main(String[] args)
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				if((i==0&&j==0)||(i==1&&j==1) )
				{
					System.out.println("******");
				}
				System.out.println(i+"    "+j);
			}
		}
		 System.out.print("*");
		 System.out.println("*****");
		 
	}
}