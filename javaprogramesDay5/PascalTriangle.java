package com.javaprogramesDay5;

import java.util.Scanner;

public class PascalTriangle {

	long fact(int num1) {
		long factorial = 1;
		for (int i = 1; i <= num1; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	int comb(int a, int b) {

		int x = (int) (fact(a) / (fact(a - b) * fact(b)));

		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows of Triangle to Print");
		num1 = sc.nextInt();

		PascalTriangle obj1 = new PascalTriangle();

		for (int i = 0; i <= num1; i++) {
			for (int j = 0; j < num1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + obj1.comb(i, j));
			}
			System.out.println("");

		}

	

	}
}
