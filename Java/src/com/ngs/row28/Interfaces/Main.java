package com.ngs.row28.Interfaces;

import java.util.*;
public class Main implements  Multiinterfaces,Interface2  
{
	public void Cone()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hello cone ");
		}
	}
	public void Ctwo()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("hello  by ctwo ");
		}
	}
	public static void main(String[] args) throws Exception
	{
		Main obj=new Main();
		obj.Cone();
		obj.Ctwo();
		System.out.println("hello main");
		 
		
		
	}
}
