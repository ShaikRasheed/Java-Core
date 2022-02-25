package com.ngs.row24.Polymorphism;

public class Circle extends Triangle {

	public void draw() {
		System.out.println("draw method in Circle ");
	}

	public static void main(String[] args) {

		Circle circle = new Circle();
		circle.draw();
		Triangle triangle = new Triangle();
		triangle.draw();
		Triangle triangle2 = new Circle();
		triangle2.draw();

	}

}
