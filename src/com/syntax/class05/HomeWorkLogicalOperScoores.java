package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkLogicalOperScoores {
	public static void main(String[] args) {

		/*
		 * write a program that will read three inputs of scores (quiz,mid term,and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >= 90--> grade=A if the average score >=70 and <90 --> grade =B
		 * if the average score >=50 and <70 --> grade =C if the average score<50-->
		 * grade=F
		 */

		Scanner input= new Scanner(System.in);
		int quiz, midterm, finalScore;
		int average;
		String grade="grade";
		

		System.out.println("Please enter your quiz score: ");
		quiz = input.nextInt();

		System.out.println("Please enter your midterm score: ");
		midterm = input.nextInt();

		System.out.println("Please enter your final score: ");
		finalScore = input.nextInt();

		average = (quiz + midterm + finalScore) / 3;

		if (average >= 90) {
			grade = "A";

		} else if (average >= 70 && average < 90) {
			grade = "B";
		} else if (average >= 50 && average< 70) {
			grade = "C";
		} else {
			grade = "F";
		}

		System.out.println("Your grade is " + grade);

		
		}
	}



