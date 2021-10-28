package com.syntax.class03;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=10; // defining
		double number2; // defining
		number2=number; // assigning
		System.out.println(number2);
	
	// if i know the content from the bigger box to smaller box fits nothing will happen this will call it type casting
	// number2=(int)number;
	
	
	int number3=10;
	double number4=number3;
	
	int number5=1256;
	byte number6=(byte)number5;
	System.out.println(number6);
	
	
	short number7=12;
	byte number8=(byte)number7;
	
	int number9=1000;
	float f=number9;
	
long l=(long)f;
	double number10=10.5;
	int number11=(int)number10;
	
	System.out.println(number11);
	
	
	}
}
