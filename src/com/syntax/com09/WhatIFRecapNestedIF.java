package com.syntax.com09;

public class WhatIFRecapNestedIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 for (int i=1; i<3; i++) {
	 for( int j=0; j<=2; j++) {
		 
	System.out.println("Hello");
	 break;
	 }
 
 System.out.println(" Good morning");
 
 }
 
	System.out.println("-----------------------");
	boolean morning=true;
	
	for (int i= 1; i<=3; i++) {
		 System.out.println(" I am for loop");
	while(morning) {
		System.out.println("Good Morning");
	// break; here will STOP
	}
	//break;  nothing happens infin.loop coz the break is out of the nested While block
	}
	System.out.println("-----------------------");
	
	 for (int i=1; i<3; i++) {
		 for( int j=0; j<=2; j++) {
		
			 if(j==1) {
			continue;
		}	 
		System.out.println("Hello");
		
	
	}
System.out.println(" Good Morning");
}
}
}