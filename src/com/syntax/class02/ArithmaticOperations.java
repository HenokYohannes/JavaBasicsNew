package com.syntax.class02;

public class ArithmaticOperations {

	public static void main(String[] args) {

		int number1 = 10;
		int number2 = 20;

		System.out.println(number1 + number2);
		System.out.println(number2 - number1);
		System.out.println(number1 * number2);
		System.out.println(number1 / number2);// 0 java will ignore the decimal & show only 0
		System.out.println(number2 / number1);

		System.out.println("-------------if we use double----------------");

		double number3 = 10;
		double number4 = 20;
		System.out.println(number3 / number4); //double give the result 0.5
	
	
	boolean var1=true;
	boolean var2=false;
	
	//System.out.println(var1+var2); we can not calculate boolean type of data.Not allowed !
	
	char char1='A'; // A is stored as 65
	char char2='B'; // B is stored as 61
	System.out.println(char1+char2);// behind any character Java store characters (char)as a number
	System.out.println(char1-char2);
	System.out.println(char1*char2);
	System.out.println(char1/char2);
	
	
	System.out.println("-------------adding String----------------"); 
	
	String str1="hi";
	String str2="bye";
	
	System.out.println(str1+str2);
	// System.out.println(str1-str2); NOT allowed
	//System.out.println(str1*str2); NOT allowed
	//System.out.println(str1/str2); NOT allowed
	
	}

}
