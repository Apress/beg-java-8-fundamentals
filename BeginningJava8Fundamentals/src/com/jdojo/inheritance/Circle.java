// Circle.java
package com.jdojo.inheritance;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}
	
	// Provide an implementation for inherited abstract draw() method
	public void draw() {
		System.out.println("Drawing a circle...");
	}

	// Provide an implementation for inherited abstract getArea() method
	public double getArea() {
		return Math.PI * radius * radius;
	}

	// Provide an implementation for inherited abstract getPerimeter() method
	public double getPerimeter() {
		return 2.0 * Math.PI * radius;
	}
}
