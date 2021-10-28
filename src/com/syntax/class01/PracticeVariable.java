package com.syntax.class01;

public class PracticeVariable {

	public static void main(String[] args) {

		/*
		 * Create a Java program and name it Practice Variables In your program create
		 * variables to store all different types of primitive data to test the range
		 * (store max and min. value) Print the value of each variable
		 */
		byte box =  127; // more than that or less than -129 is error (-128 to 127)
		byte b1 = -127;

		short box1 = -32768;// one digit 0 more than shows error (-32768 to 32767)
		short b2 = 32767;

		int box2 = -2147483648; // more than that shows error (-2147483648 to 2147483647)
		int box3 = 2147483647;

		long box4 = 922337203; // more than that shows error(-9,223,372,036,854,775 to 9,223,372,036,854,775)

		float box5 = 3.402823477777777f;

		double box6 = -1.79769313486231577;
		double box7 = 1.79769313486231577777;

		char box8 = '*';

		boolean box9 = true;
		boolean box10 = false;

		System.out.println( box);
		System.out.println(b1);
		System.out.println(box1);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(box6);
		System.out.println(box7);
		System.out.println(box8);
		System.out.println(box9);
		System.out.println(box10);
	}

}
