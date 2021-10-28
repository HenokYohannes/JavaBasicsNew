package com.syntax.class02;

public class IncrementOperator {

	public static void main(String[] args) {
		
		int number=10;
		System.out.println(number);
		number=number+1;
		number=number+number;
		//number=number+number; 11+11=22 ( number is update from 10+1)
		System.out.println(number);
		
		
		System.out.println("-----------------------------");
		
		number++; // increments the value by ONE
	System.out.println(number);
	
	int number1=10;
	number1++;
	System.out.println(number1);
	}

}
