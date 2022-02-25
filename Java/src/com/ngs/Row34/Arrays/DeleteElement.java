package com.ngs.Row34.Arrays;

//import java.langArray;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter your Array size");
		int sz = sc.nextInt();
		String[] names = new String[sz];
		String[] newnames = new String[names.length - 1];
		System.out.println("Enter elements");
		for (int i = 0; i < sz; i++) {
			// System.out.println();
			names[i] = sc.next();
		}
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

		}
		System.out.println(Arrays.toString(names));
		System.out.println("Enter your index number which you want to delete");
		int removeindex = sc.nextInt();
		int j = removeindex;
		for (int i = 0, k = 0; i < names.length; i++) 
		{
			if (i != j) 
			{
				 
				 
					newnames[k] = names[i];

					k++;
				 
			}

		}
		System.out.println(newnames);
		System.out.println(Arrays.toString(newnames));

	}
	 

	public static void main(String[] args) {
		DeleteElement d = new DeleteElement();
		d.delete();
	}

}
