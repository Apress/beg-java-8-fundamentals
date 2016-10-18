// SmartIntHolder.java
package com.jdojo.object;

public class SmartIntHolder {
	private int value;

	public SmartIntHolder(int value) {
		this.value = value;
	}

	public void setValue(int value) {
		this.value = value;     
	}

	public int getValue() {
		return value;
	}

	// Re-implement toString() method of the Object class
	public String toString() {
		// Return the stored value as a string
		String str = String.valueOf(this.value);
		return str;
	}
}
