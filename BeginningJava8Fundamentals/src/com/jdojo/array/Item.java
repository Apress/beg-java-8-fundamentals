// Item.java
package com.jdojo.array;

public class Item {
	private double price;
	private String name;

	public Item (String name, double initialPrice) {
		this.name = name;
		this.price = initialPrice;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double newPrice ) {
		this.price = newPrice;
	}

	public String toString() {
		return "[" + this.name + ", " + this.price + "]";
	}
}
