package com.exception.demo;

public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("I'm in a main method");
		int result;
		try {
			result = TryCatchExample.performDivision(12,0);
			if(result !=0)
				System.out.println("Division is"+result);
			System.out.println("-------------------");
			
			result= TryCatchExample.performDivision(12, 3);
			if(result !=0)
				System.out.println("Division is"+result);
			System.out.println("-------------------");
			
	         }catch(Exception e) {
	        	 System.out.println(TryCatchExample.performDivision(12f, 15f));
	        	 System.out.println("-------------------");
	         	 System.out.println(TryCatchExample.performDivision(12f, 0f));
	         }
	}

}
