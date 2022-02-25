package com.ngs.row24.Polymorphism;

public class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("draw method in Rectangle");
	}
	public static void main(String[] args)
	{
		 
		Circle circle = new Circle();
		circle.draw();
		Triangle triangle = new Triangle();
		triangle.draw();
		Triangle triangle2 = new Circle();
		triangle2.draw();
		Shape shape = new Shape();
		shape.draw();
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		Shape shape2=new Rectangle();
		shape2.draw();
		 		
	}

}
