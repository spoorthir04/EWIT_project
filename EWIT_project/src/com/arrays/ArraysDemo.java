package com.arrays;
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		String days[]= new String[7];
		//days[0]= "MONDAY";
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<days.length;i++) {
		System.out.println("please enter the "+i+"th"+"day");	
		days[i]=sc.nextLine();
		
		
		}
		System.out.println("days of the week are");
		for(int i=0;i<days.length;i++) {
			System.out.println(days[i]);
			
		}

	}

}
