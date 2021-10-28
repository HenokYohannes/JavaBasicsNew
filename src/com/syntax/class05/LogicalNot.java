package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean boo=!true;
System.out.println(boo);
	
boolean zoo=!false;
	System.out.println(zoo);
	
	System.out.println("---------------");
	
	boolean isRain=false;
	
	if(!isRain) {
		System.out.println(" i will go for a walk");
	}
	
	System.out.println("--------aother Example----------");
	
	String userName="Test";
	String passWord="Password";
	
			if(!userName.equals(passWord)) {
				System.out.println("I am accepting you password ");
			}
	System.out.println("---------Box------");
	
	boolean selected=false;
	if(!selected) {
		System.out.println("do click");
	}
	
	}

}
