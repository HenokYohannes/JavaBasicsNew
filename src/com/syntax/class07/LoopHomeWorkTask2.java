package com.syntax.class07;

import java.util.Scanner;

public class LoopHomeWorkTask2 {
	public static void main(String[] args) {

		/*
		 * Ask user what he/she wants to buy, ask for price and to pay for an item.
		 * continue asking to pay until user gets a right amount. conditions: if user
		 * gives extra money --> give change if user gives less money --> ask how much
		 * more you need
		 * 
		 * The amount has to be accumulated if users add more money
		 * 
		 * Whenever a user is done with payments, tell them “Thank you for shopping!”
		 * 
		 */

		Scanner input = new Scanner(System.in);

		String item;
		double price;
		double money;
		double reminder;
		double sum=0;

		System.out.println(" Please enter the item you want to purchase");
		input.next();

		price = 10;
		System.out.println(" Please pay for the Item");

		
		do {
			money = input.nextDouble();
			sum+=money; 
            reminder=sum-price;
		if(sum<price) {
			System.out.println("Please add more $ "+reminder);
		break;
		}else if(sum>price) {
		System.out.println(" Here is your change $ "+reminder);
	
	}else {
		System.out.println("You payed the right amount");
	
	}
	}while(sum !=sum);
		
		System.out.println(" Thank you for shopping with us");
		
		
		}	
	
	}


