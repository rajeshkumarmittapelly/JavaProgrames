package com.javaprogramesDay11;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingWord {
	
	void sortString(String str) {
String str2[] = str.split("\\s");
		
		for (int i = 0; i < str2.length; i++) {
			for (int j = i+1; j < str2.length; j++) {
				if(str2[i].compareTo(str2[j]) > 0) {
					String temp = str2[i];
					str2[i]=str2[j];
					str2[j]=temp;
				}
			}
		}
		for (String string : str2) {
			System.out.print(" "+string);
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abomasum macon not a actinium othen";
		System.out.println("Given String is: \n" + str);
		System.out.println("String After Sorting is:");
		SortingWord obj1 = new SortingWord();
		obj1.sortString(str);
		
	}
}
