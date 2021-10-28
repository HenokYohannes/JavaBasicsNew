package com.syntax.class07;

import java.util.Scanner;

public class TestTaskloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I want to ask a user their name and age 5 times

		Scanner scan = new Scanner(System.in);
		int i=5;
		while(i>=1) {
		
		System.out.println(" Please enter your name and age");

		String name = scan.next();
		int age = scan.nextInt();

		System.out.println(" Your name is " + name + " and you are " + age + " years old");
		
		i--;   // increment i++; i=1 while(i<=5) have the same result
		}
	}

}
