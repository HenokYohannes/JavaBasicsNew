package com.syntax.class01;

public class DataTypes {

	public static void main(String[] args) {

		//Variables are containers that represent the data types
		
		
		// representing & storing whole numbers
		byte box1 = 127; // range -128 till 127
		short box2 = 1000; // range-32767 till 32769
		int box3 = 100000; // range most popular data type
        long box4=19900000000l;//( we add L l to specify the number)
	
	// representing & storing decimal numbers
	
	float a=1.99f;
	double b=19.99; // most popular data type to use for decimal number
	
	
	// representing and storing single character
	
	char character='#';
	
	char letter='c';
	
	
	//representing and storing boolean value (YES or NO )
	
	boolean hungry=true;
	boolean tired=false;
	
	
	System.out.println(box1);
	System.out.println("box1");
	//System.out.println(box); box will show error, not be printed, coz i don't have such a variable
	


	String txt = "Hello";
	System.out.println(txt.toUpperCase());
	
	}

	
	
}
