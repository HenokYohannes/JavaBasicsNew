package com.syntax.com08;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for( int i=1; i<=4; i++) {
		
		//System.out.println(i);  // I am an outer loop
		
		for ( int j=1;j<=99; j++) {
			System.out.println(i+" "+j); //" I am an inner loop"
		}
	}
	
for( int i=1; i<=9; i++) {
		
		//System.out.println(i);  // I am an outer loop
		
		for ( int j=0;j<=9; j++) {
			System.out.println(i+" "+j); //" I am an inner loop"
	
	
		}

	
	}
System.out.println(" End of the code");
}
}