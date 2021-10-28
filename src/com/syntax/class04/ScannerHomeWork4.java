package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomeWork4 {

	public static void main(String[] args) {
		/*
		 *  Create a Java program that will ask user to input city and temperature. 
		 *  Your program should convert 
		 *  Fahrenheit into celsius and print “The temperature is the city __ is __”
		 */
	
	Scanner input=new Scanner(System.in);
	System.out.println( "Please enter your city ");
	String city = input.next();
	 System.out.println("What is the temperature ?");
	
	 int temp=input.nextInt();
	 int FtoC = ((temp-32)*5/9);
	 
	System.out.println("The Temprerature in your city is "+FtoC);
	}

}
