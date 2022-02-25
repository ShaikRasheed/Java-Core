package com.ngs.row24.Polymorphism;

public class particeMthdor extends ParticeMthdr
{
	public void Cone(int a) 
	{
		System.out.println("a= " + a);
	}

	public void Cone(int a, int b) 
	{
		a = a;
		b = a + b;
		System.out.println("a+b=" + b);
	}

	public void Cone(int a, int b, int c) 
	{
		a = a;
		b = b;
		c = c;
		int d = c + b + a;
		System.out.println("c=" + d);
	}

	public static void main(String[] args) {
		// System.out.println();
		particeMthdor ml = new particeMthdor();
		ml.Cone(12);
		ml.Cone(10, 18);
		// ml.Cone(10);
		ParticeMthdr pmr = new ParticeMthdr();
		pmr.Cone(9, 10, 11);
		ml.Cone(9, 10, 11);
	}

}
