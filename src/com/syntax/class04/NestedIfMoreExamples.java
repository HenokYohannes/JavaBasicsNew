package com.syntax.class04;

public class NestedIfMoreExamples {

	public static void main(String[] args) {
	
	boolean replCompleted=true;
	int assignment=5;
	
	if (replCompleted) {
		
	
	if(assignment>16) {
		System.out.println(" You did an amazing work");
	}else if (assignment>10) {
		System.out.println(" You did good,but you should do more");
	}else if(assignment>6) {
		System.out.println(" You need to try do more homework");
	} else {
		System.out.println(" why ?");
	}
	
	
	}else {
		System.out.println(" Please make sure you do your homework");
	}
	
	}

}
