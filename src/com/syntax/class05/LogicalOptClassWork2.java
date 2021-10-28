package com.syntax.class05;

import java.util.Scanner;

public class LogicalOptClassWork2 {

	public static void main(String[] args) {
		/*
		 * Write a program that will print whether
		 *  it is a weekend or weekday. 
		 *  If any day from 1-5 → output “It is a weekday”, 
		 *  anyday from 6-7 → output “It is a weekend”, 
		 *  any other day → output “Invalid day”
		 * 
		 */
	Scanner scan=new Scanner(System.in);
	System.out.println(" Please enter today's day");
	
	int day=scan.nextInt();
	if(day==1 || day==2 || day==3||day==4||day==5) {
		
		System.out.println(" It is a weekday");
	}else {
		System.out.println(" invald day");
		
		System.out.println("-------------------------------");
	
	}
	
	}

}
