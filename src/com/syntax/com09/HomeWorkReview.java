package com.syntax.com09;

import java.util.Scanner;

public class HomeWorkReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner scan=new Scanner (System.in);
	
	System.out.println(" please enter the start and end points respectively");
	int start=scan.nextInt();
	int end=scan.nextInt();
	int sumEven=0;
	int sumOdd=0;
	
	if (start < end) {
		
	}
	for(int i=start; i<=end; i++) {
		if(i%2==0) {
			sumEven+=i;
		}else {
			sumOdd+=i;
		}
		}
	System.out.println("Sum of the even numbers in range from "+start+" to "+end+" is "+sumEven);
	System.out.println("Sum of the odd numbers in range from "+start+" to "+end+" is "+sumOdd);
	
	}else {
		
		System.out.println(" Please enter start point less than the end point");
	}

}
}