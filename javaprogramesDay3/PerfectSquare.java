package com.javaprogramesDay3;


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class PerfectSquare {
	
	String prefectSquare(double a) {
		double squareRoot = Math.sqrt(a);
		double floorValue = Math.floor(squareRoot);
		if(squareRoot-floorValue==0) {
			return "Given number is a perfect Square Root";
		}
		return "Given number is NOT a perfect Square Root";
		
	}


	public static void main(String[] args) {
		
		double number, maxNum;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer value value");
		number = input.nextDouble();
		PerfectSquare obj = new PerfectSquare();
		System.out.println(obj.prefectSquare(number));

	}

}
