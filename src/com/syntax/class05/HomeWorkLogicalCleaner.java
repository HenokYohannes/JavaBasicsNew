package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkLogicalCleaner {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in June, July or August → season
		 * =“Summer”. At the end of the program we should see output as “You were born
		 * is season ______“.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter you birthday month");

		String month = input.next();
		String season = input.nextLine();

		if (month.equals("December") || month.equals("January") || month.equals("February")) {

			season = "Winter";
		} else if (month.equals("April") || month.equals("May") || month.equals("June")) {

			season = "Spring";
		} else if (month.equals("July") || month.equals("August") || month.equals("September")) {

			season = "Summer";
		} else if (month.equals("October") || month.equals("November") || month.equals("December")) {

			season = "Fall";
		} else {
			season = "Invalid"+season+" month or you are not yet born";
		}
		
		
		System.out.println("You were born in " + season);
	}
}
