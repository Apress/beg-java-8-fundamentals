// LateBindingTest.java
package com.jdojo.inheritance;

public class LateBindingTest {
	public static void main(String[] args) {
		LateBindingSuper lbSuper = new LateBindingSuper();
		LateBindingSub lbSub = new LateBindingSub();

		// Will access EarlyBindingSuper.print() 
		lbSuper.print(); // #1 

		// Will access EarlyBindingSub.print() 
		lbSub.print();   // #2 

		// Will access EarlyBindingSub.print() 
		((LateBindingSuper)lbSub).print(); // #3 

		// Assign the lbSub to lbSuper 
		lbSuper = lbSub; // Upcasting 

		// Will access EarlyBindingSub.print() because lbSuper 
		// is referring to a LateBindingSub object 
		lbSuper.print(); // #4 
	}
}
