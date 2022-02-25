package com.ngs.row26.Abstraction;

class Main extends Abstract {

	public void add() {
		System.out.println("hello add");
	}

	public void add1() {
		System.out.print("hello add");
	}

	public static void main(String[] ar) {
		Main main = new Main();
		main.add();
		main.add1();
	}
}