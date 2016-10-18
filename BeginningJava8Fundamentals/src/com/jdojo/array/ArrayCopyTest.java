// ArrayCopyTest.java
package com.jdojo.array;

import java.util.Arrays;

public class ArrayCopyTest {
	public static void main(String[] args) {
		// Have an array with 5 elements
		int[] data = {1, 2, 3, 4, 5 };

		// Expand the data array to 7 elements
		int[] eData = expandArray(data, 7);

		// Truncate the data array to 3 elements
		int[] tData = expandArray(data, 3);

		System.out.println("Using for-loop...");
		System.out.println("Original Array: " + Arrays.toString(data));
		System.out.println("Expanded Array: " + Arrays.toString(eData));
		System.out.println("Truncated Array: " + Arrays.toString(tData));

		// Copy data array to new arrays
		eData = new int[9];
		tData = new int[2];
		System.arraycopy(data, 0, eData, 0, 5);
		System.arraycopy(data, 0, tData, 0, 2);
       
		System.out.println("Using System.arraycopy() method...");
		System.out.println("Original Array: " + Arrays.toString(data));
		System.out.println("Expanded Array: " + Arrays.toString(eData));
		System.out.println("Truncated Array: " + Arrays.toString(tData));   
	}

	// Uses a for-loop to copy an array
	public static int[] expandArray(int[] oldArray, int newLength) {
		int originalLength = oldArray.length;   
		int[] newArray = new int[newLength];        
		int elementsToCopy = 0;
        
		if (originalLength > newLength) {
			elementsToCopy = newLength;
		} 
		else {
			elementsToCopy = originalLength;
		}

		for (int i = 0; i < elementsToCopy; i++) {
			newArray[i] = oldArray[i];
		}
		return newArray;
	}
}
