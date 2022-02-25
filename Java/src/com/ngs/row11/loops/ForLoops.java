package com.ngs.row11.loops;


/**
 * @author NGS017
 *
 */
class ForLoops {
	public static void main(String[] args) 
	{
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) 
			{
				if(i%2!=0)
				{
					
						System.out.print(i+" ");
				}
			}
			System.out.println("");
		}
		/*for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("1");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("* ");
			}
			System.out.println("");
		}*/

	}
}