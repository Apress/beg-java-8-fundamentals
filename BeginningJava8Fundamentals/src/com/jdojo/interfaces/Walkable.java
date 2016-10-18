// Walkable.java
package com.jdojo.interfaces;

public interface Walkable {
	// An abstract method
	void walk();
	
	// A static convenience method
	public static void letThemWalk(Walkable[] list) {
		for (int i = 0; i < list.length; i++) {
			list[i].walk();
		}
	}
}
