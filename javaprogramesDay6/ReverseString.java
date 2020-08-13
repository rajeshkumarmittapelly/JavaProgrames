package com.javaprogramesDay6;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ReverseString {

	String reverseString(String str) {
		String str2 = "";
		int strLength = str.length();
		for (int i = (strLength - 1); i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}
		return str2;
	}

	void reverseStringRecurssion(String str) {

		if ((str == null) || (str.length() <= 1)) {
			System.out.println(str);
		} else {
			System.out.print(str.charAt(str.length() - 1));
			reverseStringRecurssion(str.substring(0, str.length() - 1));
		}

	}

	String reverseStringRecurssion2(String str) {

		if ((str == null) || (str.length() <= 1)) {
			return str;
		} else {

			return reverseStringRecurssion2(str.substring(1)) + str.charAt(0);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am rajesh Kumar";
		ReverseString obj1 = new ReverseString();
		System.out.println(obj1.reverseString(str));
		obj1.reverseStringRecurssion(str);
		System.out.println(obj1.reverseStringRecurssion2(str));
	}
}
