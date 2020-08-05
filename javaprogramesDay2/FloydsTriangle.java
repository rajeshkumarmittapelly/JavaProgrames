package com.javaprogramesDay2;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows of Floyd's Triangle to Print");
		num1 = sc.nextInt();
		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num2+" ");
				num2++;
			}
			System.out.println();
		}

	}

}
