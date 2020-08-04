package com.javaprogramesDay1;

import java.util.Scanner;

public class QuotientNreminder {

	int quotient(int numerator, int division) {
		int quotient1 = numerator / division;
		return quotient1;
	}

	int reminder(int numerator, int division) {
		int reminder1 = numerator % division;
		return reminder1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		num1 = sc.nextInt();
		System.out.println("Enter the Denominator");
		num2 = sc.nextInt();
		QuotientNreminder sample = new QuotientNreminder();

		System.out.println("Numerator: " + num1 + ", Denominator is:" + num2);
		System.out.println(
				"Quotient is:" + sample.quotient(num1, num2) + " and The Reminder is :" + sample.reminder(num1, num2));

	}

}
