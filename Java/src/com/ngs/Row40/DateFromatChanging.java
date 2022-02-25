package com.ngs.Row40;

import java.text.*;
import java.util.Calendar;

public class DateFromatChanging {

	public static void main(String[] args) {
		// Initializing the date formatter
		DateFormat Date = DateFormat.getDateInstance();
		// Initializing Calender Object
		Calendar cals = Calendar.getInstance();
		// Displaying the actual date
		System.out.println("The original Date: " + cals.getTime());
		// Using format() method for conversion
		String currentDate = Date.format(cals.getTime());
		System.out.println("Formatted Date: " + currentDate);

		SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
		String stringDate = DateFor.format("10/10/1997");
		System.out.println(cals);
	}
}
