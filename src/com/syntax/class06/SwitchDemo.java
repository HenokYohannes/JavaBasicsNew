package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * Rules:
	 * Values in case MUST be same Data type as a VARIABLE in SWITCH
	 * 
	 */
	char gender='m';
	String description;
	
	switch(gender) {
	case'm':
	description="Male";
	break;
	case 'f':
		description="Female";
	break;
	default: // if we don't want the default we have to initialize in this the description
		     // to null
		description = "Unknown";
	}
	
	System.out.println( gender+ " means "+description);
	
	/*Limitation
	 * We can't use the logical operation && || 
	 * it only check EQUALITY
	 * 1. we cannot use logical Operators
	 * 2. we cannot use relational operators
	 * 
	 * Limitation of data type
	 * 1.cannot use boolean
	 * 2.cannot be used with double/float
	 * 3.cannot be used with long
	 */
	
	
	boolean fall=true;
	//switch(fall) // boolean can not be used
	}

}
