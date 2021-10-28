package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomeWork3 {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver license to them, otherwise you will
		 * offer them to get a learners permit.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age;
		age = input.nextInt();
		if (age >= 18) {
			System.out.println(" You are eligible for Driver's license");
		} else {
			System.out.println("Please take the learners permit");
		}
	}

}
