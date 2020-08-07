package com.javaprogramesDay4;

import java.util.Scanner;

public class Triangle {

	void printTraingle1(int num1) {
		for (int i = 1; i <= num1; i++) {

			for (int j = num1 - i; j > 0; j--) {
				// printing spaces
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}
	void printTraingle2(int num1) {
		for (int i = 1; i <= num1; i++) {

			
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");

			}
			System.out.println();
		}
	}
	void printTraingle3(int num1) {
		for (int i = 1; i <= num1; i++) {
			for (int j = 2*(num1-i); j >=0; j--) {
				// printing spaces
				System.out.print(" ");
			}

			
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");

			}
			System.out.println();
		}
	}
	void printTraingle4(int num1) {
		for (int i = 1; i <= num1; i++) {
						
			for (int j = 1; j <= i; j++) {
				System.out.print(" "+j);

			}
			System.out.println();
		}
	}
	void printTraingle5(int num1) {
		int counter =1;
		for (int i = 1; i <= num1; i++) {
						
			for (int j = 1; j <= i; j++) {
				System.out.print(" "+counter);
				counter++;

			}
			System.out.println();
		}
	}
	void printTraingle6(int num1) {
		for (int i = num1; i >= 0; i--) {

			for (int j = num1 - i; j > 0; j--) {
				// printing spaces
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows of Triangle to Print");
		num1 = sc.nextInt();
		Triangle obj1 = new Triangle();
		obj1.printTraingle1(num1);
		obj1.printTraingle2(num1);
		obj1.printTraingle3(num1);
		obj1.printTraingle4(num1);
		obj1.printTraingle5(num1);
		obj1.printTraingle6(num1);

	}

}
