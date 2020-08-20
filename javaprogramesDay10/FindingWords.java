package com.javaprogramesDay10;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingWords {

	int numberofWord(String str) {
		String str2[] = str.split(" ");
		int countword = 0;
		for (int i = 0; i < str2.length; i++) {
			int length = str2[i].length();
			char chr = str2[i].charAt(length - 1);
			if (chr == 'm') {
				System.out.println(str2[i]);
				countword++;
			}
			if (chr == 'n') {
				System.out.println(str2[i]);
				countword++;
			}
		}

		return countword;

	}

	int numberofWord2(String str) {
		String str2[] = str.split(" ");
		int countword = 0;
		for (int i = 0; i < str2.length; i++) {
			char chr = str2[i].toLowerCase().charAt(str2[i].length() - 1);
			if (chr == 'm' || chr == 'n') {
				countword++;
				System.out.println(str2[i]);
			}
		}

		return countword;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abomasum macon not a actinium othen";
		System.out.println("Given String is: \n" + str);

		FindingWords objj = new FindingWords();
		System.out.println("Number of words ending with 'm' and 'n'");

		System.out.println(objj.numberofWord(str));
		System.out.println(objj.numberofWord2(str));

	}
}
