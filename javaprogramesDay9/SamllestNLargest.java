package com.javaprogramesDay9;

import java.util.ArrayList;
import java.util.Scanner;

public class SamllestNLargest {

	int[] sortDecending(int num1[]) {
		for (int i = 0; i < num1.length; i++) {

			for (int j = 1; j < num1.length - i; j++) {

				if (num1[j - 1] < num1[j]) {
					int temp = num1[j - 1];
					num1[j - 1] = num1[j];
					num1[j] = temp;
				}
			}
		}
		for (int j = 0; j < num1.length; j++) {
			System.out.print(num1[j] + ",");
		}
		System.out.println();
		return num1;
	}

	void smallLargest(int num2[]) {

		
		int length = sortDecending(num2).length;
		System.out.println("Largest Number is: "+ num2[0]);
		System.out.println("Smallest Number is: "+ num2[length-1]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[] = { 78, 19, 5, 4, 7, 10, 102, 5, 19, 10 };

		SamllestNLargest obj1DuplicateNumbers = new SamllestNLargest();
		obj1DuplicateNumbers.smallLargest(num1);

	}
}
