package com.ngs.row29.packages;

public class Subpackclass
{
	public void main()
	{
		System.out.println("Subpack class ");
	}
	public static  void main(String[] args) 
	{
		System.out.println("hello");
		com.ngs.row29.packages.Pack1 pack1 = new Pack1();
		pack1.Show();
		com.ngs.row29.packages.Pack2 pack2 = new Pack2();
		pack2.pack2mthd();
	}
}
