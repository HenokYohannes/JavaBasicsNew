package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// We need to capture a country from a user
		//based on the country we have have to define a favourite food
	
		Scanner input;
		String country;
        String food;
		input = new Scanner(System.in);

		System.out.println("Please enter your country");

		country = input.nextLine();
	
		switch (country) { 

		case "USA":
			food = "burger";
			break;
		case "Eritrea":
			food = "Zigni";
			break;
		case" Italy":
			food="Pasta";
			break;
		case "Mexico":
			food="Tacos";
			break;
default:
	food="unknown";
		
		}
if(!food.equals("Unknown")) {
}else {
	
}	
		
System.out.println("Your favorite food is "+ food  );

	
	}

}
