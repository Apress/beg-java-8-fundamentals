// NumTest.java
package com.jdojo.datatype;

public class NumTest {	
	public static void main(String[] args) {
		int anInt = 100;
		long aLong = 200L;
		byte aByte = 65;
		short aShort = -902;
		char aChar = 'A';
		float aFloat = 10.98F;
		double aDouble = 899.89;
		
		// Print values of the variables
		System.out.println("anInt = " + anInt);
		System.out.println("aLong = " + aLong);
		System.out.println("aByte = " + aByte);
		System.out.println("aShort = " + aShort);
		System.out.println("aChar = " + aChar);
		System.out.println("aFloat = " + aFloat);
		System.out.println("aDouble = " + aDouble);
		System.out.println("aDouble = " + aDouble);
		
		// Print sone double constants
		System.out.println("Max double = " + Double.MAX_VALUE);
		System.out.println("Min double = " + Double.MIN_VALUE);
		System.out.println("Positive infinity for double = " + Double.POSITIVE_INFINITY);
		System.out.println("Negative infinity for double = " + Double.NEGATIVE_INFINITY);
		System.out.println("Not-a-Number for double = " + Double.NaN);
		System.out.println("double takes " + Double.BYTES + " bytes");
	}
}
