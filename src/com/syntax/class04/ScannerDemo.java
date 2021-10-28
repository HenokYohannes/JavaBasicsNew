package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
String str="Abc";
Scanner scan=new Scanner(System.in);
System.out.println(" Pleas enter you name");

	String name=scan.next(); // it will capture String value from console
	System.out.println(" Hello "+name);
	
	System.out.println(" please enter your age");
	int age=scan.nextInt();
	
	System.out.println(name+" You are "+age+ " years old");
	
	}

}
