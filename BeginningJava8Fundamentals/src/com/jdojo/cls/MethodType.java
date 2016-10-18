// MethodType.java
package com.jdojo.cls;

public class MethodType {
	static int m = 100; // A static variable
	int n = 200;        // An instance variable

	// Declare a static method
	static void printM() {

		/* We can refer to only static variable m in this method 
		   because we are inside a static method */

		System.out.println("printM() - m = " + m); 
   
		/* System.out.println("printM() - n = " + n); */ /* A Compiler error */
	}

	// Declare an instance method
	void printMN() {
		/* We can refer to both static and instance variables m and n in this method */
		System.out.println("printMN() - m = " + m);
		System.out.println("printMN() - n = " + n);
	}
}
