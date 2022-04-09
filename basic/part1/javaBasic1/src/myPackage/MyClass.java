package myPackage;

import java.util.Date;

public class MyClass {
	
	public static void main(String[] args) {
//		----- primitive types ------
		int a = 50;
		int b = 100;
		int c =a+b;
		System.out.println(c);
		
//		for big numbers , we can use underscore for
//		representation purpose , actually the underscore
//		will be ignored by java
		
		int x = 123_456_789;
		System.out.println(x);
		
//		for long number , like more than billion 
//		use data type "long" and also add "L" at
//		the end of the number , so java compiler 
//		understand , it is a long number
		long y = 123_456_789_000L;
		System.out.println(y);
		
//		very big float is called double
//		by default , java saw every float number
//		as double
		double z = 12.70;
		System.out.println(z);
		
//		for small floating number , we can use float
//		as java sees all floats as double by default
//		use a "F" at the end of the number
		float productPrice = 12.70F;
		System.out.println(productPrice);
		
//		char is used for single character
//		only single-quotes ' should be used
//		not double-quotes " 
		char letter = 'A';
		System.out.println(letter);
		
		
		
//		----- reference type / complex type ----
		
		
//		string is denoted by double quotes "
		String s="Subhadip"; 
		System.out.println(s);
		
//		date object is example of of reference type
		Date now = new Date();
		System.out.println(now);
		
	}
			
}
