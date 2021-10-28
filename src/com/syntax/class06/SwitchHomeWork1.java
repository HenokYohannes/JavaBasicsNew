package com.syntax.class06;

import java.util.Scanner;

public class SwitchHomeWork1 {

	public static void main(String[] args) {
		/*HW:  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
           Please complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner input=new Scanner(System.in);
	int num1;
	int num2;
	int result = 0;
	char opt;
		
		System.out.println(" Please enter two numbers");
		num1=input.nextInt();
	    num2=input.nextInt();
	System.out.println(" Please enter Operator");
	opt=input.next().charAt(0);
	
	switch (opt) {
	case'+':
		result=num1+num2;
	break;
	
	case '-':
		result=num1-num2;
		break;
	case'*':
		result=num1*num2;
		break;
	case'/':
		result=num1/num2;
	break;
	default:

System.out.println(" you entered invalid operator");
	}	
	System.out.println(num1+ " " +opt+" "+num2+ " = "+result);
	

	
	
	
	
	
	
	
	
	
	
	}
	
}
