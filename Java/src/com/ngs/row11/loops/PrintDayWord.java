package com.ngs.row11.loops;

/* (a) a "else if ladder" statement;*/
import java.util.Scanner;
/**
 * @author NGS017
 *
 */
public class PrintDayWord
{
    
    public static void main(String[] args) 
	{
		String numberStr;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your  number from 0 to 6");
		int number = scanner.nextInt();
		if (0 == number) 
		{
            numberStr = "Sunday";
        } 
		else if (1 == number) 
		{
            numberStr = "Monday";
        } 
		else if (2 == number) 
		{
            numberStr = "Tuesday";
        }
		else if (3 == number) 
		{
            numberStr = "Wednesday";
        } 
		else if (4 == number)
		{
            numberStr = "Thursday";
        }
		else if (5 == number) 
		{
            numberStr = "Friday";
        } 
		else if (6 == number)
		{
            numberStr = "Saturday";
        }
		else
		{
            numberStr = "Not a valid day";
        }
		System.out.println("your day is "+numberStr);
	
	}
}