package com.syntax.com08;

public class CalculateHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int eSum=0;
	int oSum=0;
	
	for (int i=1; i<=100;i++) {
		
		if (i%2==0) {
			eSum+=i;
		}else {
			oSum+=i;
		}
	}
	System.out.println(" sum of even numbers="+eSum);
	System.out.println(" sum of even numbers="+oSum);
	}

}
