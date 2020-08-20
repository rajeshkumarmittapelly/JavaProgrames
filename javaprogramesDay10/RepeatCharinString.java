package com.javaprogramesDay10;

import org.apache.commons.lang3.StringUtils;

public class RepeatCharinString {

	String repeatChar(String strVal) {

		if (strVal.length() <= 1) {
			return strVal;
		} else {
			String strRevVal = "";
			int i = 0;
			while (i < strVal.length()) {
				strRevVal = strRevVal + strVal.charAt(i) + strVal.charAt(i);
				i++;
			}
			return strRevVal;
		}
	}
	String repeatChar2(String strVal) {

		if (strVal.length() <= 1) {
			return strVal;
		} else {
			String strRevVal = "";
			int l = strVal.length();
			for (int i = 0; i < l; i++) {
				strRevVal = strRevVal+strVal.substring(i,i+1)+strVal.substring(i,i+1);
			}
			return strRevVal;
		}
	}
	String repeatChar3(String strVal) {

		if (strVal.length() <= 1) {
			return strVal;
		} else {
			
			return strVal.replaceAll(".", "$0$0");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am a software developer";
		System.out.println("Given String is: \n" + str);
		RepeatCharinString obj1 = new RepeatCharinString();
		System.out.println("String After revering first and last characters :");
		System.out.println(obj1.repeatChar(str));
		System.out.println(obj1.repeatChar2(str));
		System.out.println(obj1.repeatChar3(str));
		
	}
}
