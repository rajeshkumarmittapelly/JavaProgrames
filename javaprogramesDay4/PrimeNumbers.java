package com.javaprogramesDay4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class PrimeNumbers {
	boolean primeNumber(int num1) {
		int counter = 0;
		boolean prime;
		if (num1 == 0 || num1 == 1) {
			prime = false;
		} else {
			for (int i = 2; i <= num1 / 2; i++) {
				if (num1 % i == 0) {
					counter++;
				}
			}
			if (counter == 0) {
				prime = true;
			} else {
				prime = false;
			}
		}
		return prime;

	}

	List printPrimeNumbers(int number) {

		List<Integer> prime = new ArrayList<Integer>();

		for (int i = 2; i <= number; i++) {

			if (primeNumber(i) == true) {
				prime.add(i);
			}
		}

		return prime;
	}

	List printAltPrimeNumbers(int number) {
		int temp=2;

		List<Integer> prime = new ArrayList<Integer>();

		for (int i = 2; i <= number; i++) {

			if (primeNumber(i) == true) {
				if(temp%2==0) {
				prime.add(i);
				}
				temp++;
				
			}
		}

		return prime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num1 = sc.nextInt();
		PrimeNumbers obj = new PrimeNumbers();
		System.out.println(obj.printPrimeNumbers(num1));
		System.out.println(obj.printAltPrimeNumbers(num1));

	}

}
