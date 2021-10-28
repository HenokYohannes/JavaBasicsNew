package com.syntax.class05;

public class ReviewClass1ArithmeticOperations {

	public static void main(String[] args) {
		
		/* Arithmetic Operations:
		 * 
		 * Addition --> +
		 * Subtraction --> -
		 * Multiplication -->  *
		 * Division --> /
		 * Modulus --> %
		 */
	
	// The data type decides with Operation we perform on a variable
	
	// String allows Addition + to be performed in the form of concatenation
	// String won"t do Multiplication or Division
	
		// On characters we can perform all Arithmetic Operations.
	// Characters like in Char 'A' 'B' etc are numbers behind the scene
	// in computer ASCII  E.g A=65, B=66 so we can perform Arithmetic Operation in char
	
	char a='A';
	char b='B';
	
	System.out.println(a+b);// 65+66=131
	System.out.println(a-b); //65-66=-1
	System.out.println(a*b); // 65X66= 4290
	System.out.println(a/b);//65/66=0 because the result is integer it will only take the 0 before the decimal
	System.out.println(a%b);//65%66=65 reminder rule
	//if we are trying to take the reminder from a smaller number with a bigger number, the is smaller number is always the out come
	// if (b%a) the the out come will be 1 the reminder is 1
	
	}

}
