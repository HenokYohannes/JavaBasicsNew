package com.syntax.class05;

import java.util.Scanner;

public class LargestNumberEnhancedCode {

	public static void main(String[] args) {
		/*
		 *  Ask user to enter 3 numbers and define which 
		 *  is the largest number.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
			
			double num1=scan.nextDouble();
			double num2=scan.nextDouble();
			double num3=scan.nextDouble();
			
			double largest=0;
			
	
			if(num1>=num2 &&num1>num3) {
				
				largest=num1;
			
			}else if(num2>=num3 && num2>num1) {
				
				largest=num2;
			
			}else if (num3>num2 && num3>=num1) {
				largest=num3;
			}
			
			boolean isEven;
			if(largest%2==0) {
				isEven=true;
			}
	System.out.println(largest+" number is even");
	}


		}
