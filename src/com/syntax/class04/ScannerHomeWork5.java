package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomeWork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *  Create a Java program that will ask if user has a credit card or not. 
 *  If you user does not have a credit card then offer them. 
 *  If they do have one ask what is balance on the card? If balance of the card is larger than 1000,
 *  tell them to pay off immediately, 
 *  otherwise you can tell them that they can spend more. 
 */
	Scanner input=new Scanner (System.in);
	
	System.out.println("Do you have credit card ?");
	String yes = input.next();
	
	if(yes.equalsIgnoreCase("yes")) {
		System.out.println("What is your balance");
		int balance=input.nextInt();
		
	if(balance>1000) {
		System.out.println("Please pay off immediately");
	}else {
		System.out.println("Please spend more");
	}
		
		}else {
			System.out.println("Would you like to have one ?");
		}
		}
	
}

