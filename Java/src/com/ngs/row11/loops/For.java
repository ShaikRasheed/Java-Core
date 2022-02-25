package com.ngs.row11.loops;

/**
 * @author NGS017
 *
 */
class For {
	public static void main(String[] args)
	{
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*" + "\t");
			}
			System.out.println(" ");
		}
	}
}