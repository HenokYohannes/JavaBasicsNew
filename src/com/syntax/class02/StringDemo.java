package com.syntax.class02;

public class StringDemo {
public static void main (String[]args) {
	
String name="Muzit";

System.out.println( name);
String address=" 1234 redwood city";
System.out.println(name + address);
int age=18;

System.out.println(name+" " + age);
boolean isRainning=true;
System.out.println(address+isRainning);
// is we have one String the result will be string concatenation combined the two
double number1=12.5;
double number2=12.5;

System.out.println(number1+number2);

String number3="12.5";
String number4="12.5";

System.out.println(number3 +" " +number4);
System.out.println(age+address);
System.out.println(age+" is my age");

System.out.print("My name is "+name);
System.out.println("my age is"+age);
System.out.println(" I live in"+address);
}
}
