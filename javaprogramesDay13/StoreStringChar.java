package com.javaprogramesDay13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class StoreStringChar {

	public static void main(String[] args) {

		String str = "Welcome to the Java world";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(i+", ");
		}

		List<Character> listFrChars = new ArrayList<Character>();
		List<Character> list = new ArrayList<Character>();
		Set<Integer> set = new HashSet<Integer>();

		for (char ch : str.toCharArray()) {
			if (!listFrChars.contains(ch)) {
				listFrChars.add(ch);
			}
		}
		for (char ch : str.toCharArray()) {

			// if(!(ch==' '))
			{
				list.add(ch);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			// set.add(str.indexOf(str.charAt(i)));

			// System.out.print(str.indexOf(str.substring(i, i+1), i));
			set.add(str.indexOf(str.substring(i, i + 1), i));
		}
		System.out.println("\n List dispalying with charecters from string");
				for (Character character : listFrChars) {
			System.out.print(character + ", ");
		}
				System.out.println("\n Set dispalying with each charecter position from string");
		for (Integer integer : set) {
			System.out.print(integer + ", ");
		}

	}
}
