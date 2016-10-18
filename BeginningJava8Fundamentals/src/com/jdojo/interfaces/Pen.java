// Pen.java
package com.jdojo.interfaces;

public class Pen implements Movable {
	private double x;
	private double y;

	public Pen() {
		// By default, the pen is at (0.0, 0.0)
	}
	
	public Pen(double x, double y) {
		this.x = x;
		this.y = y;
	}
		
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public String toString() {
		return "Pen(" + x + ", " + y + ")";
	}
}
