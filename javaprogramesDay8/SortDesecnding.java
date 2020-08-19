package com.javaprogramesDay8;

import java.util.ArrayList;
import java.util.Scanner;

public class SortDesecnding {

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
		return num1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[] = { 78, 19, 5, 4, 7, 10, 102, 5, 19, 10 };
		System.out.println("Given Integer Array");
		for (int i : num1) {
			System.out.print(i + ", ");
		}
		System.out.println("\nArray After Sorting: ");
		SortDesecnding obj1 = new SortDesecnding();
		int sortedArray[] = obj1.sortDecending(num1);
		for (int i : sortedArray) {
			System.out.print(i + ", ");
		}

	}
}
