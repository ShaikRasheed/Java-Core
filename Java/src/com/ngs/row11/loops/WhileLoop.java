package com.ngs.row11.loops;

class WhileLoop {
	public static void main(String[] args) {
		// System.out.println(args[0]);
		int i = 0, sum = 0;

		while (i <= 100) {
			System.out.println("i values=" + i);

			sum = sum + i;
			System.out.println("i values sum=" + sum);
			i++;
		}
		System.out.println("i values sum=" + sum);
		double avg = sum / 100d;
		System.out.println("i values sum=" + avg);

	}
}