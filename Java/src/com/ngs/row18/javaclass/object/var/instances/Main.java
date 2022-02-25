package com.ngs.row18.javaclass.object.var.instances;
public class Main
{
	
	static String s2; 
	public Main()
	{
		
		System.out.println("hello without args main parameters");
	}
	public Main(int a)
	{
		System.out.println("hello argsmain parameters");
	}
	public static void main(String[] args) 
	{
		String s = "name";
		Main main = new Main(4); 
		
		System.out.println(main);
		
		System.out.println(s);
		s = "chotu";
		
		System.out.println(s);
		String s1 = "Java";  
		 
		 
		String s3 = new String("Java"); 
		System.out.println(s3);
		
		
		String s4 = new String(s3).intern();
		System.out.println(s4);
		
		
		String s5 = new String(s).intern();
		
		System.out.println((s1 == s2)+", String are equal."); // true  
		System.out.println((s1 == s3)+", String are not equal."); // false  
		System.out.println((s1 == s4)+", String are equal."); // true 
		System.out.println(s4 + s3);
		System.out.println(main.s2);
		
		System.out.println(s5);
	}
}
