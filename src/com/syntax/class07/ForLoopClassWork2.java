package com.syntax.class07;

public class ForLoopClassWork2 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
//Print odd numbers between 20 and 50 (2 ways)
	
	
	for(int i=20; i>=1; i--) {
		
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
	System.out.println("");
	System.out.println("-----2nd-----");
	
	for(int i=0; i<=20;i+=2) {
		
		System.out.print(i+" ");
	}
	
	System.out.println("");
	System.out.println("-----odd-----");
	
	for( int i=1; i<=50; i+=2) {
		
	System.out.print(i+" ");
	}
	System.out.println("");
	System.out.println("-----odd-----");
	
	for(int i=19; i<=50;i+=2) {
		System.out.print(i+" ");
	}
	}

}
