package com.syntax.com08;

public class ContinueKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break--> breaks the loop
		//continue --> skips current iteration/cycle and goes back to the beginning of the loop
		
		
		for (int i=1; i<=5; i++) {
			
		
			if (i==3) {
				
				continue;
				
			
			}
			System.out.println(" Hi "+i);
			System.out.println(" Hello "+i);
		
		}
		
		System.out.println("End of the code");
	
	// I want to print numbers from 1 to 10 except number 3 & 7 & 9
	
	for ( int i=1; i<=10; i++) {
		
	if(i==3 || i==7 || i==9) {
		continue;
	}
	System.out.print(i+" ");
	}
	System.out.println("");
	System.out.println("End of the code");
	}

}
