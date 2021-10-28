package com.syntax.class05;

import java.util.Scanner;

public class HomeworkSelfTestLogicalOp {
	public static void main(String[] args) {

		/*
		 * /* write a program that will read three inputs of scores (quiz,mid term,and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >= 90--> grade=A if the average score >=70 and <90 --> grade =B
		 * if the average score >=50 and <70 --> grade =C if the average score<50-->
		 * grade=F
		 */
		Scanner scan = new Scanner(System.in);
		int quiz;
		int midterm;
		int finalScore;
		int average;
		String grade = "grade";
		System.out.println("Please enter your quiz");
		quiz = scan.nextInt();

		System.out.println("Please enter your midterm");
		midterm = scan.nextInt();

		System.out.println("Please enter finalScore");
		finalScore = scan.nextInt();

		average = (quiz + midterm + finalScore) / 3;

		if (average > 90 && average <= 90) {
			grade = "A";
		} else if (average >= 70 && average < 90) {
			grade = "B";
		} else if (average >= 50 && average < 70) {
			grade = "C";
		} else if (average < 50) {
			grade = "F";
		}

		System.out.println("Your average is " + average + " and grade " + grade);
	}
}
