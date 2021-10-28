package com.syntax.class02;

public class HomeWork02 {

	public static void main(String[] args) {

		
		/*
		 * Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. 
		 * “The _______ of 2 numbers ___ and ___ is equal to _____”
Write a program to find the square of the number 3.9. You program should say “The square of the ____ is ____ “
Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
 Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ 
 and the area is __”
1. Declare variable and increase by 100 using shorthand operator
2. Declare variable and decrease by 67 using shorthand operator
3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator 
each person should get an equal piece of cake
4. Declare variable cakePiece=25 and divide cakePiece between 7 people . 
Using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
		  
		 */
		
		
		
		
		
		
		
		double number1 = 10.50;
		double number2 = 10.50;
		double sum = number1 + number2;
		double sub=number1-number2;
		double mul = number1 * number2;
		double div = number1 / number2;

		System.out.println("The Addition of 2 numbers "+ number1+ " and "+number2+"is equal to " +sum);
		System.out.println("The subtraction of 2 numbers "+ number1+ " and "+number2+"is equal to "+sub);
		System.out.println("The Multplication of 2 numbers "+ number1+ " and "+number2+"is equal to " +mul);
		System.out.println("The division of 2 numbers "+ number1+ " and "+number2+"is equal to " +div);
		
		System.out.println("________________Task2_____________________");
		
		
		double squer = 3.9 * 3.9;
		System.out.println(" The squer of " + 3.9 + " is " + squer);

		double width = 5;
		double height = 8;
		double perimeter=2*(width+height);
		double area=width*height;
		
		
		System.out.println(" The perimeter of a rectangle with width" +width+" and height "+height+" is equal to " +perimeter+"and the area is"+area);

		int var = 10;
		var += 100;
		System.out.println(var);

		int var1 = 100;
		var1 -= 67;
		System.out.println(var1);

		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);

		int cakePiece1 = 25;
		cakePiece1 /= 7;
		System.out.println(cakePiece1);

		cakePiece1 = 25;
		cakePiece1 %= 7;
		System.out.println(cakePiece1);

		// End of Task

		double x = 2.7;
		int y = (int) x;
		System.out.println(y);
	}

}
