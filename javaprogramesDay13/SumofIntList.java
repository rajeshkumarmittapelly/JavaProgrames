package com.javaprogramesDay13;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class SumofIntList {
	int sumOfValues1(ArrayList<Integer> list) {
		int sumNumbers = 0;
		sumNumbers = list.stream().mapToInt(Integer::intValue).sum();
		return sumNumbers;
	}

	int sumOfValues2(ArrayList<Integer> list) {
		int sum = 0;
		for (Integer integer : list) {
			sum = sum + integer;
		}

		return sum;
	}

	int sumOfValues3(ArrayList<Integer> list) {
		int sumNumbers = 0;
		sumNumbers = (int) list.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
		return sumNumbers;
	}

	int sumOfValues4(ArrayList<Integer> list) {
		Integer Sum = (int) list.stream().reduce(0, (a, b) -> a + b);
		return Sum.intValue();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(18);
		list.add(180);
		list.add(80);
		list.add(90);
		System.out.println("Array List values");
		for (Integer integer : list) {
			System.out.print(integer + ",");
		}
		SumofIntList obj = new SumofIntList();
		System.out.println("\n" + "Sum of List Numebrs using methid 1 = " + obj.sumOfValues1(list));
		System.out.println("\n" + "Sum of List Numebrs using methid 2 = " + obj.sumOfValues2(list));
		System.out.println("\n" + "Sum of List Numebrs using methid 3 = " + obj.sumOfValues3(list));
		System.out.println("\n" + "Sum of List Numebrs using methid 4 = " + obj.sumOfValues4(list));
	}
}
