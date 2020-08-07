package com.javaprogramesDay4;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LeapYear {
	boolean isYearLeap(int year) {
		boolean temp;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					temp = true;
					return temp;
				} else {
					temp = false;
					return temp;
				}
			} else {
				temp = true;
				return temp;
			}

		} else {
			temp = false;
			return temp;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		num1 = sc.nextInt();
		LeapYear obj = new LeapYear();
		System.out.println("Entered year "+num1 +" is a leap year? True/False?: "+obj.isYearLeap(num1));

	}

}
