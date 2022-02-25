package com.ngs.row21.Inheritance;

public class BsubM extends DsuperM
{

	int b = 10;
	
	/*This the default Constructor*/
	public BsubM()
	{
		System.out.println("Sub call default constructor & variable"+b);
	}
	
	/*This the Method*/
	public void  BsubM()
	{
		// This is a local variable.
		int c = 98;
		
		System.out.println("sub call method & variable"+c);
	}
	
	/*This the Method  */
	public void  add()
	{
		// This is a local variable
		int b = 20;
		
		System.out.println("sub call method & variable"+b);
	}
	public static void main(String[] args) 
	{
		/*DsuperM dsm = new DsuperM();
		System.out.println(dsm.a);
		dsm.DsuperM();*/
		
		// Creating a object for a class.
		BsubM bsubM = new BsubM();
		
		// calling a method through the object.
		bsubM.DsuperM();
		
		//System.out.println(dsm.c);
		bsubM.BsubM();
		bsubM.add();
		DsuperM dsuperM = new DsuperM();
		dsuperM.add();
		DsuperM dsuperM2 = new BsubM();
		dsuperM2.add();
		dsuperM2.sub();
	}

}
