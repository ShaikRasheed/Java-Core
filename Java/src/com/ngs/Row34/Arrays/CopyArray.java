package com.ngs.Row34.Arrays;

public class CopyArray {
	public void copy() {
		int intArray[] = { 12, 15, 17 };

		// print original intArray
		System.out.println("Contents of intArray[] before assignment:");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		// Create an array b[] of same size as a[]
		int copyArray[] = new int[intArray.length];
		int clone_Array[] = intArray.clone();

		// intArray is assigned to copyArray; so references point to same
		// location
		copyArray = intArray;

		// change element of copyArray
		copyArray[1]++;

		// print both arrays
		System.out.println("\nContents of intArray[]:");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println("\nContents of copyArray[]:");
		for (int i = 0; i < copyArray.length; i++) {
			System.out.print(copyArray[i] + " ");

		}
		for (int i = 0; i < clone_Array.length; i++) {
			System.out.print(clone_Array[i] + " ");
		}

	}

	public static void main(String[] args) {
		CopyArray cp = new CopyArray();
		cp.copy();
	}

}
