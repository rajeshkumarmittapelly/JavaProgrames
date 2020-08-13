package com.javaprogramesDay7;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateNumbers {

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
		return num1;
	}

	ArrayList<Integer> duplicateNumbers(int num2[]) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int num3[] = sortDecending(num2);
		for (int i = 0; i <num3.length-1; i++) {
			
				if (num3[i] == num3[i+1]) {
					list.add(num3[i]);
				}
			
		}

		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[] = { 78, 19, 5, 4, 7, 10, 102, 5, 19, 10 };

		DuplicateNumbers obj1DuplicateNumbers = new DuplicateNumbers();
		System.out.println(obj1DuplicateNumbers.duplicateNumbers(num1));

	}
}
