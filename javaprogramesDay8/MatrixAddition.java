package com.javaprogramesDay8;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][] = { { 1, 2 }, { 3, 4 } };
		int[][] array2 = { { 5, 6 }, { 7, 8 } };
		int sum;
		for (int i = 0; i < array1.length; i++) {
			sum =0;
			for (int j = 0; j < array2.length; j++) {
				sum = array1[i][j]+array2[i][j];
				System.out.println("Array1["+i+"]["+j+"]"+array1[i][j]);
				System.out.println("Array2["+i+"]["+j+"]"+array2[i][j]);
				System.out.println("Array3["+i+"]["+j+"]"+ sum);
			}
		}

	}
}
