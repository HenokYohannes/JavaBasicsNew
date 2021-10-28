package com.syntax.class02;

public class ShortHandOperatorDemo {

	public static void main(String[] args) {
		
		int number=10;
		number=number+2; // both the same
		
		System.out.println(number);
		
		number++; // both the same short version ( short hand Operator
	
	System.out.println(number++);
	
	System.out.println("-----------------------------------");
	
	number=10;
	number=number+30;
	System.out.println(number);
	number+=30;
	System.out.println(number);
	
	number=10;
	number-=5;
	System.out.println(number);
	
	number=10;
	number*=5;
	
	System.out.println(number);
	
	number=10;
	
	number/=5;
	System.out.println(number);
	
	number=10;
	number%=5;
	System.out.println(number);
	
	}

}
