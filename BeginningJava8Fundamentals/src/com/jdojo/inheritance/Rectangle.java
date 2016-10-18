// Rectangle.java
package com.jdojo.inheritance;

public class Rectangle extends Shape {
	private double width;
	private double height; 
	
	public Rectangle(double width, double height) {
		// Set the shape name as "Rectangle" 
		super("Rectangle");
		this.width = width;
		this.height = height;
	}

	// Provide an implementation for inherited abstract draw() method
	public void draw() {
		System.out.println("Drawing a rectangle...");
	}

	// Provide an implementation for inherited abstract getArea() method 
	public double getArea() {
		return width * height;
	}

	// Provide an implementation for inherited abstract getPerimeter() method
	public double getPerimeter() {
		return 2.0 * (width + height);
	}	
}
