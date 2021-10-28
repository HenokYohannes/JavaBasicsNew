package com.syntax.class05;

public class ReviewClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String concatenation
		// String concatenation is combining two values.For String concatenation to happen
		// one variable should be type of STRING
		
		
		
		String num = "10";
		int num1 = 10;
		double num2 = 10;

		System.out.println(num + num1 + num2);// String 10+Int 10+double10.0
		System.out.println(num1 + num + num2);// Int10+String10+double10.0
		System.out.println(num1 + num2 + num);// Int10+double10.0+10

		// 1st out put 10+10+10.0=101010.0= Concatenation
		// 2nd out put 10+10+10.0=101010.0 =Concatenation
		// 3rd out put 10+10.0+10=20.010= first Arithmetic op.10+10.0 & the result will
		// be
		// concatenated to the String 10(num)

	
	}

}
