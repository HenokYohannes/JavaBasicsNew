package com.syntax.com09;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		int[] array = new int[4];
		array[0] = 12;
		array[1] = 10;
		array[2] = 13;
		array[3] = 14;

		System.out.println(array[2] + array[0]);

		// i need to create an array that will hold 3 elements of double type of values

		double[] arr = new double[3];
		arr[0] = 11.99;
		arr[1] = 1.09;
		arr[2] = 3.09;

		// replace value eassign arr[1]=100.99;

		String[] colors = new String[4];

		// colors[0]="Red"; // default of array
		colors[1] = "Blue";
		colors[2] = "Black";
		colors[3] = "Yellow";
		// colors[4]="Green"; java.lang.ArrayIndexOutOfBoundsException: Index 4 out of
		// bounds for length 4
		// at com.syntax.com09.ArrayIntro.main(ArrayIntro.java:32)

		System.out.println("size of array is " + colors.length);

		System.out.println(colors[0]);

		char[] grades = new char[5];

		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		//grades[5] = 'F';
	System.out.println(grades[4]);
	
	}

}
