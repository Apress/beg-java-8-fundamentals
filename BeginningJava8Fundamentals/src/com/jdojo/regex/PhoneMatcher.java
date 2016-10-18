// PhoneMatcher.java
package com.jdojo.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneMatcher {
	public static void main(String[] args) {
		// Prepare regular expression. A group of 3 digits followed by 7 digits.
		String regex = "\\b(\\d{3})\\d{7}\\b";
		String source = "3342449027, 2339829, and 6152534734";
		
		// Compile the regular expression 
		Pattern p = Pattern.compile(regex);

		// Get Matcher object
		Matcher m = p.matcher(source);

		// Start matching and display the found area codes
		while(m.find()) {
			// Display the phone number and area code. Note that group 1 captures first 3 digits of match, whereas group 0 will have the entire phone number. The matched text can be obtained using m.group() or m.group(0)*/
			String phone = m.group();
			String areaCode = m.group(1);
			System.out.println("Phone: " + phone + 
			                   ", Area Code: " + areaCode);
		}
	}	
}
