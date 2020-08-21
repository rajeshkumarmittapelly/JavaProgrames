package com.javaprogramesDay11;

public class Palindrome1 {

	String reverse(String strVal) {
		if (strVal.length() <= 1) {
			return strVal;
		} else {
			return reverse(strVal.substring(1)) + strVal.charAt(0);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Madam";
		System.out.println("Given String is: \n" + str);
		Palindrome1 obj1 = new Palindrome1();
		System.out.println("String After revering first and last characters :");
		System.out.println(obj1.reverse(str));
		if (str.equalsIgnoreCase(obj1.reverse(str))) {
			System.out.println("Given String \"" + str + "\" is polyndrome");
		} else {
			System.out.println("Given String \"" + str + "\" is not a polyndrome");
		}

	}
}
