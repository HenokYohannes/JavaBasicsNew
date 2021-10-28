package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomeWork {

	public static void main(String[] args) {
		/*
		 * Create a Java program to capture 2 numbers from a user and define which
		 * number is the largest.
		 */
		int num;
		int num1;
		num = 12;
		num1 = 10;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any number");
		num = input.nextInt();

		if (num > num1) {
			System.out.println(num + " is greater than " + num1);
			num1 = input.nextInt();
		}
		if (num == num1) {
			System.out.println(num + " = " + num1);
			num = input.nextInt();

		} else {
			System.out.println(num + " is less than " + num1);
		}
	}
}