package com.javaprogramesDay7;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MissingNumbers {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[] = { 75,76,78,79,80,81,83 };
		System.out.println("Given Integers are:");
		for (int i : num1) {
			System.out.print(i+",");
		}
		System.out.println();
		System.out.println("Missing Numbers are:");
		
		for (int i = 0; i <num1.length-1; i++) {
			
			if ((num1[i+1] -num1[i])!=1) {
				System.out.print((num1[i] +1)+",");
			}
		
	}
	}
}
