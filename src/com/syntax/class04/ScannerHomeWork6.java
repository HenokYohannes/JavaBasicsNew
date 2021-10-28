package com.syntax.class04;

import java.util.Scanner;

public class ScannerHomeWork6 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("How many years have you worked in this company");
		int years = input.nextInt();

		if (years >= 5) {
			System.out.println("You are eligible for the bonus");
		} else {
			System.out.println(" You are not eligible for the bonus !");
		}

		System.out.println("How much is your salary ?");
		int salary = input.nextInt();
		if (salary >= 50000) {
			System.out.println("You are eligible for the 5000 bonus");
			if (salary < 50000) {
				System.out.println(" You are eligible for the 3000 bonus");
			}
		} else {
			System.out.println(" You are not eligible !");
		}

	}
}
