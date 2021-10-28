package com.syntax.class05;

public class ReviewClassTypeCasting {

	public static void main(String[] args) {
		
		// ReviewClassTypeCasting

	/* Type Casting
	 * 
	 *Definition: converting one data type to another data type
	 */
	
	// byte num=129; // can not do it because the range is bigger for byte
		// what you will do to change it is 
		
		byte num=(byte)129; //because we are forcing bigger data to put it in to smaller data type there is a possibility of lost of information
		//(value) -127 is very different from the original 129 unexpected result will happen.
	
	System.out.println(num);
	
	// byte has 8 slots
	// short has 16 slots
	//Integer has 32 slots
	// Long has 64 slots
	
	short number2=125;
	byte num2=(byte)number2;
	
	System.out.println(num2);
	
	System.out.println((int)12.5); // decimal part will be ignored
	System.out.println((double)12); // it will add .0 to the integer number 12.0
	
	}

}
