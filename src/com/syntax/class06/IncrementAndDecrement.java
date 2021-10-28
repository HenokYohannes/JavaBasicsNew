package com.syntax.class06;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
	int num=100;	
	num=num+1; // shorter way num+=1;
	num+=1;
	System.out.println(num);

	num++; // increment value of variable by 1
	System.out.println(num);
	
	num--; // decrement value of variable15
	System.out.println("---------------------------------------");
	int time=14;
	if(time<17) {
		System.out.println(" It is a day");
	}
	
	while (time<17) {
		System.out.println(" It is a day"); // infinit loop
	time++;
	}
	
	System.out.println(" I want to print numbers from 1 to 20 ");
	 int i=1 ;
	while(i<=20) {
	
		System.out.print( " "+i+ " " );
	i++;
	
	}
	System.out.println(" ---------");
	
	
	int y=50;
	
	while(y>=1) {
	
	System.out.print(y+" ");
	y--;
	}

	
}
}







