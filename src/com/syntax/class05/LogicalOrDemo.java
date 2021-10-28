package com.syntax.class05;

import java.util.Scanner;

public class LogicalOrDemo {

	public static void main(String[] args) {
		/*
		 * ask user to enter today's day
		 * if Monday or Friday--> no class
		 * Tuesday or Wednesday --> manual class
		 * Saturday or Sunday--> Java class
		 */

	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter today's day");
	String day=scan.next();
	
	if(day.equalsIgnoreCase("Monday")      ||  day.equalsIgnoreCase("Friday")) {
		System.out.println("Today I have no class");
	
	}else if (day.equalsIgnoreCase ("Tuesday")    || day.equalsIgnoreCase("Wednesday")) {
		System.out.println(" I have Manual class");
	
	}else if (day.equalsIgnoreCase("Thursday")) {
		System.out.println("I have review class");
	
	}else if (day.equalsIgnoreCase ("Saturday")   ||  day.equalsIgnoreCase("Sunday")){
		System.out.println(" Today I have Java calss");
	
	
	}else {
		System.out.println(day + " is invalid");
	}
}

	}


