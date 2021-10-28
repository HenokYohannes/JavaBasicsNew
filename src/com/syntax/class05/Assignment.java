package com.syntax.class05;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		/*
		 * if hour b/n 1-11--> Morning
		 * if hour b/n 12-15--> Afternoon
		 * if hour b/n 16-20--> Evening
		 * if hour b/n 21-24--> Night
		 */


	Scanner input =new Scanner (System.in);
	
	int time=input.nextInt();
	if (time>=1 && time<=11){
		System.out.println(" Right now is morning");
	}else if (time>=12 && time<=15) {
		System.out.println(" Right now is afternoon");
	}else if(time>=16 && time<=20) {
		System.out.println("Right now is evening");
	}else if(time >=21 && time<=24) {
		 System.out.println("Right now is night");
	}
	else {
		System.out.println(" Not Valid time");
	}
System.out.println("----------------------------");

	String timeofDay;
	
	if(time>=1 && time<=11) {
		 timeofDay="morning";
	}else if (time>=12 && time<=15) {
		timeofDay="afternoon";
	}else if(time>=16 && time<=20) {
		timeofDay="evening";
	}else if(time >=21 && time<=24) {
		timeofDay="night";
	}else {
		timeofDay="Invalid";
	}
	
	}
	
}