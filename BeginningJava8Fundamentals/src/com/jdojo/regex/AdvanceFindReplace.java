package com.jdojo.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AdvanceFindReplace {
	public static void main (String[] args) {
		String regex = "\\b\\d+\\b";
		StringBuffer sb = new StringBuffer();
		String replacementText = "";
		String matchedText = "";

		String text = "A train carrying 125 men and women was traveling at" + 
              " the speed of 100 miles per hour. " + 
              "The train fare was 75 dollars per person." ;

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);

		while (m.find()) {
			matchedText = m.group();

			// Convert the text into an integer for comparing
			int num = Integer.parseInt(matchedText);

			// Prepare the replacement text
			if (num == 100) {
				replacementText = "a hundred";
			}
			else if (num < 100) {
				replacementText = "less than a hundred";
			}
			else {
				replacementText = "more than a hundred";
			}

			m.appendReplacement(sb, replacementText);
		} 

		// Append the tail
		m.appendTail(sb); 

		// Display the old and new text
		System.out.println("Old Text: " + text);
		System.out.println("New Text: " + sb.toString());
	} 
}
