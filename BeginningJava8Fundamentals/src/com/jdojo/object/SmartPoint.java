// SmartPoint.java
package com.jdojo.object;

public class SmartPoint {
	private int x;
	private int y;
    
	public SmartPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
    
	/* Re-implement the equals() method */
	public boolean equals(Object otherObject) {
		// Are the same? 
		if (this == otherObject) {
			return true;
		}
	
		// Is otherObject a null reference? 
		if (otherObject == null) {
			return false;
		}
	
		// Do they belong to the same class?
		if (this.getClass() != otherObject.getClass()) {
			return false;
		}
	
		// Get the reference of otherObject in a SmartPoint variable
		SmartPoint otherPoint = (SmartPoint)otherObject;
	
		// Do they have the same x and y co-ordinates
		boolean isSamePoint = (this.x == otherPoint.x && this.y == otherPoint.y); 
	
		return isSamePoint;
	}
    
	/* Re-implement hashCode() method of the Object class,
	   which is a requirement when you re-implement equals() method */
	public int hashCode() {
		return (this.x + this.y);
	}
}
