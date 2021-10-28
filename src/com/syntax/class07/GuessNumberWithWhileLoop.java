package com.syntax.class07;

import java.util.Scanner;

public class GuessNumberWithWhileLoop {

	public static void main(String[] args) {
		/*
		 * let's create a secret number (1 to 100)
		 * let's ask user to guess my secret number
		keep asking for the number till user guess the secret number
		 */
		
		
		
	int secretNumber=78;
	Scanner scan=new Scanner(System.in);
	int userNumber;
	
	System.out.println(" Please guess my secret number 1-100 ");
	userNumber=scan.nextInt();
	
	while(userNumber!=secretNumber) {
		System.out.println(" Please guess my secret number 1-100 ");
		userNumber=scan.nextInt();
		
	}
	System.out.println(" You got it !!!!! ");
	
	
	
	}

}
