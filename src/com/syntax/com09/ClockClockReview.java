package com.syntax.com09;

public class ClockClockReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String time;
		
		for(int h=0; h<=23; h++) {
		 
			for (int m=0; m<=59; m++) {
			
			if (h<10 && m<10) {
				time=":0"+ h+m;
			}else if(h>=10 && m<10) {
				time="0"+h+":"+m;
			
			}else if (h<10 && m>=10) {
				time="0"+h+":"+m;
				
			}else {
				time=h+":"+m;
			}
		
			System.out.println(time);
			}
	}
	
		
	}

}
