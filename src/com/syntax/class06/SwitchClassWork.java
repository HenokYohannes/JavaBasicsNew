package com.syntax.class06;

import java.util.Scanner;

public class SwitchClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/*Ask user to enter their country and capture it. 
	 * Once values are captured print which language user speaks.
	 */
	
	Scanner input=new Scanner(System.in);
		
		String country;
	String lang = null;
	
	System.out.println(" Please enter your country");
	country=input.next();
	
	switch (country) {
	case "USA":
	lang="English";
	break;
	
	case "Eritrea":
		lang="Tigrigna";
		break;
	case "German":
		lang="German";
		
	case "China":
		lang=" Mandarin";
		break;
		
		default:
				lang="Unkbown";
	
	} if(!lang.equals("Unknown")) {
			
			}else {
					
				}
	System.out.println("Your language is "+ lang);
	}
	}

