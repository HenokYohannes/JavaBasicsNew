package com.syntax.class07;

public class HomeWorklLoopTask {

	public static void main(String[] args) {

		// Calculate sum of all even and all odd numbers from range 1 to 100

		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				sum = sum + i;
			}

		}

		System.out.println("The sum of all even numbers range from 1-100 is " + sum);
		System.out.println("-----------------------");

		int sum1 = 0;

		for (int i = 1; i <= 100; i++) {

			if (i % 2 != 0) {
				sum1 = sum1 + i;
			}

		}
		System.out.print("The sum of all Odd numbers range from 1-100 is " + sum1);

	}

}
