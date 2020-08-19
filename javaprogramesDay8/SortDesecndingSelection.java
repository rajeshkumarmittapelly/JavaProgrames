package com.javaprogramesDay8;

import java.util.ArrayList;
import java.util.Scanner;

public class SortDesecndingSelection {

	int[] sortDecending(int num1[]) {
		for (int i = 0; i < num1.length; i++) {
			int mid_index = i;

			for (int j = i+1; j < num1.length ; j++) {

				if (num1[j] < num1[mid_index]) {
					mid_index = j;
					
				}
			}
			System.out.println(mid_index);
			int temp = num1[mid_index];
			num1[mid_index] = num1[i];
			num1[i] = temp;

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
		SortDesecndingSelection obj1 = new SortDesecndingSelection();
		int sortedArray[] = obj1.sortDecending(num1);
		for (int i : sortedArray) {
			System.out.print(i + ", ");
		}

	}
}
