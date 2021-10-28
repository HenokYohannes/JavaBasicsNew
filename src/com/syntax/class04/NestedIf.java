package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true;
	
		int dose=2;
		
		if(vaccine) {
		System.out.println(" How many doses have taken");
		
		if(dose==1) {
			System.out.println(" when are have taken your 2nd sose");
		}
		else{
			System.out.println(" You are fully vaccinated");
		}
		// Nested if is dependent on the mainIf condition
		}
		
		System.out.println("--------------------------");
	
	String day="Friday";
	int date=13;
	
	if (day.equals("Friday")) {
		
		System.out.println(" I am going to the movies today");
	if(date==13) {
	System.out.println(" I am watching a scary movie");
	
	}else {
		System.out.println(" I am watching a comedy today");
	}
	
	
	
	
	}else{
		System.out.println(" I am going to study");
	}
	
	
	
	}



}
