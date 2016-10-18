// RegexMatch.java
package com.jdojo.regex;

public class RegexMatch {
	public static void main(String[] args) {
		// Prepare a regular expression to represent a pattern
		String regex = ".@.";
                
                // Try matching many strings against the regular expression
		RegexMatch.matchIt("a@k", regex);
		RegexMatch.matchIt("webmaster@jdojo.com", regex);
		RegexMatch.matchIt("r@j", regex);
		RegexMatch.matchIt("a%N", regex);
		RegexMatch.matchIt(".@.", regex);
	}

	public static void matchIt(String str, String regex) {
		// Test for pattern match
		if (str.matches(regex)) {
			System.out.println(str + " matches the regex " + regex);
		}
		else {
			System.out.println(str + " does not match the regex " + regex);
		}	
	}
}
