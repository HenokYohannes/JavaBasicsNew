package com.syntax.class03;

public class Recape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* What are Variables ?
		 * Variables are boxes in the computer memory that hold values
		 * What is Data type ?
		 * datatype is mechanism that defines what type of values a variable can
		 * store and what type of operations we can perform on that data.
		 * 
		 * String concatenation ?
		 *  using String concatenation we can combine or attach a value with String
		 *  
		 */
	
	
	String var1="Hello world";
	int number1=10;
	String result=var1+number1;
	
	System.out.println(result);
	
	boolean ifTrue=true;
	System.out.println(ifTrue+result);
	
	/* To perform concatenation only one variable needs to be a String the other variable 
	 
	 * can be of any data type like boolean int char String e.t.c...
	 
	 * Arithmetic Operators
	 * + - * / % 
	 */
 
	
	
	/* we use + to 
	 * 
	 * 
	 */
	int number2=14;
	int number3=3;
	
	System.out.println(number2/number3);
	System.out.println(number2%number3);
	
	System.out.println("--------------------------");
	
	
	
			System.out.println("---------shortHand Opr.-----------------");

	
	int number6= -100;
	
	number6++;
		System.out.println(number6);	
			
	
	number6--;
	System.out.println(number6);
	
	//number** ( multiply multiply) is not allowed b/c it does not change anything 2*1=2 
	// number//( divid divid) not allowed b/ it does not chane anything
	
	double number7=10;
	number7++;
	
	System.out.println(number7);
	System.out.println((++number7)); // pre pot increment
	
	System.out.println((++number7));
	
	
	System.out.println("------------------------");
	
double number8=400;
	number8/=4;
	System.out.println(number8);
	
	number8-=40;
	System.out.println(number8);
	
	double number9=10;
	number9%=4;
	System.out.println(number9);
	
	}

}
