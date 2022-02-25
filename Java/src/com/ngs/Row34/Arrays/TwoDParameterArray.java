package com.ngs.Row34.Arrays;
import java.util.Scanner;
public class TwoDParameterArray
{


	public static int max(int[][] a) 
	{
		int max = a[0][0];
		for (int x = 0; x < a.length; x++) 
		{
			for (int y = 0; y < a[0].length; y++) 
			{
				//System.out.println(a[x][y]+" ");
				if (max < a[x][y] ) 
				{
					max = a[x][y];
					
				}
			}
		}

		return max;
	}



	 
		public static void main(String[] args) 
		{
			
			//Scanner class is used to read the data dynamically
			Scanner input = new Scanner(System.in);
			
			// Reading the integer value
			System.out.println("Enter your Matrix size");
			int positions = input.nextInt();

			//creating the 2D array with name a
			int[][] a = new int[positions][positions];

			System.out.println("enter your Matrix values");
			for(int row = 0; row<a.length; row++) 
			{
	            for(int col = 0; col<a[row].length; col++) 
	            {
	                a[row][col] = input.nextInt();
	                
	                //TwoDParameterArray.max(a);
	               
	            }
	        }
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("Greatest Number Value in the matrix is"+max(a));
		}
		TwoDParameterArray obj=new TwoDParameterArray();
		
		
		
}
