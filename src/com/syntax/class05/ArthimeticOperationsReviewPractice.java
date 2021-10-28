package com.syntax.class05;

public class ArthimeticOperationsReviewPractice {
 
	public static void main(String[] args) {
		
int number=10;
int number2=20;
	System.out.println(number/number2);
	System.out.println(number%number2);
	
	// if we divide smaller number to bigger number
	//because the result is Integer it will only take the 0 before the decimal number
	//Example 10/20=0.5 & it will only take the 0 before the decimal,the deciml will be ignored.
	
	// if we try to find the reminder of a smaller number from the bigger number
	// according to the rules of reminder it will take the smaller number as it is.
	//in this example 10%20 it will simply take 10
	
	System.out.println("------------------------------");
	
	double number3=10;
	double number4=20;
	
	System.out.println(number3/number4);
	System.out.println(number3%number4);
	
	System.out.println("------------------------------");
	
	System.out.println(number4/number3);
	System.out.println(number4%number3);
	
	System.out.println("------------------------------");
	
	 number3=-10;
	 number4=-20;
	
	System.out.println(number4/number3);
	System.out.println(number4%number3);
	System.out.println(number3%number4);
	
	// with modulus we do"t have the cancellation property like Multiplication and division
	
	System.out.println("------------------------------");
	number3=10.5;
	number4=5.5;
	
	System.out.println(number3%number4);
	
	}

}
