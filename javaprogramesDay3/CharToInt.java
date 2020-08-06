package com.javaprogramesDay3;
public class CharToInt {
	public static void main(String[] args) {
		//ASCII value of character
		char sample = 'a';
		int value = sample;
		System.out.println("ASCII value char '3' is :"+value);
		
		//Converting character int to integaer value
		
		char ch = '3';
		int value2= Integer.parseInt(String.valueOf(ch));
		System.out.println("Integer value char '3' is :"+value2);
		
		char ch2 = '4';
		int value3= Character.getNumericValue(ch2);
		System.out.println("Integer value char '4' is :"+value3);
	
	}

}
