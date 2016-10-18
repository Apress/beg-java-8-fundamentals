// PredefinedDateFormats.java
package com.jdojo.format;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class PredefinedDateFormats {	
	public static void main(String[] args) {		
		// Get current date
		Date today = new Date();

		// Print date in the default locale format
		Locale defaultLocale = Locale.getDefault();		
		printLocaleDetails(defaultLocale); 
		printDate(defaultLocale, today);
		
		// Print date in French format 		
		printLocaleDetails(Locale.FRANCE); 
		printDate(Locale.FRANCE, today);

		// Print date in German format. We could also use Locale.GERMANY instead of new Locale ("de", "DE") 
		Locale germanLocale = new Locale ("de", "DE");
		printLocaleDetails(germanLocale); 
		printDate(germanLocale, today);
	}
	
	public static void printLocaleDetails (Locale locale){		
		String languageCode = locale.getLanguage();
		String languageName = locale.getDisplayLanguage();
		String countryCode = locale.getCountry();
		String countryName = locale.getDisplayCountry();

		// Print the locale info
		System.out.println("Language: " + languageName + 
						"(" + languageCode + "); " +
						"Country: " + countryName + 
						"(" + countryCode + ")"	);
	}

	public static void printDate (Locale locale, Date date){
		DateFormat formatter;
		String formattedDate;

		// Get the date instance for SHORT style for locale 
		formatter = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		
		// Format the date and print it
		formattedDate = formatter.format(date);		
		System.out.println("SHORT: " + formattedDate);
		
		// Get the date instance for MEDIUM style for locale 
		formatter = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
		
		// Format the date and print it
		formattedDate = formatter.format(date);		
		System.out.println("MEDIUM: " + formattedDate);
		
		// Print a blank line at the end 
		System.out.println();
	}
}
