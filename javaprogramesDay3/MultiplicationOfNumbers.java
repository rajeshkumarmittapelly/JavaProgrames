package com.javaprogramesDay3;
public class MultiplicationOfNumbers {
	int multiplication(int a, int b) {

		int temp = a * b;

		return temp;

	}

	int multiplication(int a, int b, int c) {

		int temp = a * b * c;

		return temp;

	}

	float multiplication(float a, float b, float c) {

		float temp = a * b * c;

		return temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationOfNumbers obj1 = new MultiplicationOfNumbers();
		System.out.println("Multiplication of Two integer numbers 5 & 6 is :" + obj1.multiplication(5, 6));
		System.out.println(
				"Multiplication of Three integer numbers 500,85 & 766 is :" + obj1.multiplication(500, 85, 766));
		System.out.println("Multiplication of Three floating numbers 500.85,85.96 & 76.6 is :"
				+ obj1.multiplication(500.85f, 85.96f, 76.6f));

	}

}
