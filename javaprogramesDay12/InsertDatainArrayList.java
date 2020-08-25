package com.javaprogramesDay12;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

public class InsertDatainArrayList {
	
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
			System.out.print(integer+",");
		}
		System.out.println("\nArray Values after inserting values at 3 & 4 postion");
		list.add(2, 1000);
		list.add(3, 1001);
		for (Integer integer : list) {
			System.out.print(integer+",");
		}
		list.set(3, 1003);
		System.out.println("\nArray Values after updating the value at 4 postion");
		for (Integer integer : list) {
			System.out.print(integer+",");
		}
		list.remove(4);
		System.out.println("\nArray Values after removing the value at 5 postion");
		for (Integer integer : list) {
			System.out.print(integer+",");
		}

	}
}
