// SimplestInheritanceTest.java
package com.jdojo.inheritance;

public class SimplestInheritanceTest {
	public static void main(String[] args) {
		// Create an object of the Manager class
		Manager mgr = new Manager();

		// Set the name of the manager
		mgr.setName("Leslie Zanders");

		// Get the name of the manager
		String mgrName = mgr.getName();

		// Display the manager name
		System.out.println("Manager Name: " + mgrName);
	}
}
