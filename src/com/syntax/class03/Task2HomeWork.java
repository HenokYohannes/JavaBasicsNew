package com.syntax.class03;

public class Task2HomeWork {

	public static void main(String[] args) {
		
		/*
		 * Write a program to find the square of the number 3.9. You program should say “The square of the ____ is ____ “
		 Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
		 Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ 
		 and the area is __”
		
		 */
		
		double number=3.9;
		System.out.println( " the square of the " +number+ " is "+(number*number));
		
		double width = 5;
		double height = 8;
		double perimeter=2*(width+height);
		double area=width*height;
		
		System.out.println(" The perimeter of a rectangle with width" +width+" and height "+height+" is equal to " +perimeter+" and the area is " +area);
	    System.out.println(" The perimeter of a rectangle with width" +width+" and height "+height+" is equal to " +perimeter+" and the area is " +area);
	}

}
