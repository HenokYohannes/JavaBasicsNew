package com.syntax.com09;

public class AllFormArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]num= {100,200,300,400,500};
		
		//for (int i=0;i<5;i++) {
			for (int i=0; i<num.length; i++) {
				System.out.print(num [i]+ " ");
			
			}
		System.out.println();
			System.out.println("-------------------------");
	// to access all elements from an Array we can use for each loop/Advanced/enhanced
			
	for(int n:num) {
		System.out.print(n+" ");
	
	}
	System.out.println("-----------");
	System.out.println();
	String [] colors= {"red","blue","white"};
	
	for(String col:colors) {
		System.out.println(col);
	}
	}
	}


