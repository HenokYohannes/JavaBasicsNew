package com.syntax.com09;

public class ArrayDemoDifferent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an array of Chars and store grades into in A,B,C,D,E,F
	//then print a grade B
	// 1 way of creating an array
	char[] grades=new char[6];
		
	grades[0] = 'A';
	grades[1] = 'B';
	grades[2] = 'C';
	grades[3] = 'D';
	grades[4] = 'E';
	
	
	int num;
	num=10;
	char[] gender; // declare an array
	gender=new char[2]; // initialize it's size
	
	// 2 way of creating an array
	char[] gradesArray= {'A','B','C','D'};
	
	
	System.out.println(gradesArray.length);
	System.out.println(gradesArray[2]);
	
	String[] names= {"Henok","Muzit","Sem,","Sky"};
	
	names[3]="Sky"; // re assining the name
	System.out.println(names[1]);
	
	
	String[] cars= {};
	System.out.println(cars.length);
	
	String[]carrs=new String[3];
	System.out.println(carrs.length);

	/*
	 * We can not declar an Array seperately if we want to store value in shortrt way
	 * 
	 * 
	 */
	// int[] nums;
	// num= {10,12,11}; compiler will complain on this line
	
	int[] nums= {10,12,56};
	
	}

}
