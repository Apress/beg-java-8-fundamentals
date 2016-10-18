// NameIterator.java
package com.jdojo.array;

import java.util.ArrayList;

public class NameIterator {
	public static void main(String[] args) {
		// Create an ArrayList of String
		ArrayList<String> nameList = new ArrayList<String>();

		//Add some names
		nameList.add("Christopher");
		nameList.add("Kathleen");
		nameList.add("Ann");

		// Get the count of names in the list
		int count = nameList.size();        

		// Let us print the name list
		System.out.println("List of names...");
		for(int i = 0; i < count; i++) {
			String name = nameList.get(i);
			System.out.println(name);
		}

		// Let us remove Kathleen from the list
		nameList.remove("Kathleen");

		// Get the count of names in the list again
		count = nameList.size();        

		// Let us print the name list again
		System.out.println("After removing Kathleen...");
		for(int i = 0; i < count; i++) {
			String name = nameList.get(i);
			System.out.println(name);
		}
	}
}
