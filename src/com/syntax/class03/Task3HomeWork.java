package com.syntax.class03;

public class Task3HomeWork {

	public static void main(String[] args) {

		/*
		 * 1. Declare variable and increase by 100 using shorthand operator 2. Declare
		 * variable and decrease by 67 using shorthand operator 3. Declare variable
		 
		 * cakePiece=11 and divide cakePiece between 4 people using shorthand operator
		 * each person should get an equal piece of cake 4. Declare variable
		 
		 * cakePiece=25 and divide cakePiece between 7 people . Using shorthand operator
		 * found out how many pieces of cake left after it was distributed equally among
		 * 7 people
		 * 
		 * 
		 */
		int number = 100;
		number += 100;
		System.out.println(number);
System.out.println("--------------------------------------");
		int number1 = 100;
		number1 -= 67;
		System.out.println(number1);
		System.out.println("--------------------------------------");
	
		int cakePiece=11;  // if i use double i will have 2.75
	System.out.println(cakePiece/4);
	System.out.println(cakePiece%4);
	
	System.out.println("--------------------------------------");
	
	int cakePiece1=25; // you can reassign like cakePiece=25;
	
	cakePiece1/=7;
	System.out.println(cakePiece1);
	
	int cakePiece2 = 25;
	System.out.println(cakePiece2%7);
	}

}
