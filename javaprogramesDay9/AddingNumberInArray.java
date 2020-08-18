package com.javaprogramesDay9;

import java.util.Scanner;

public class AddingNumberInArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		System.out.println("How many number you want to add");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int num1[] = new int[n];
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter "+(i+1)+" Number: ");
			num1[i]=in.nextInt();
		}	
		System.out.println("Entered array values are: ");
		for (int i : num1) {
			System.out.print(i+", ");
		}
	}
}
