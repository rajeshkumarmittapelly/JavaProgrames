package com.javaprogramesDay11;

import org.apache.commons.lang3.StringUtils;

public class FindingRepeatedCharacters {

	String repeatChar(String strVal) {
		String revStr ="";
		if (strVal.length() <= 1) {
			return strVal;
		} else {
			for (int i = 0; i < strVal.length(); i++) {
				for (int j = i + 1; j < strVal.length(); j++) {
					if (strVal.charAt(i) == strVal.charAt(j)) {
						revStr= revStr+strVal.charAt(i);
					}
				}

			}
			//System.out.println(revStr);
		}
		return removeDuplicateschar(revStr);

	}
	String removeDuplicateschar(String strVal) {
			String strOut = "";
			for (int i = 0; i < strVal.length(); i++) {
				if(!strOut.contains(String.valueOf(strVal.charAt(i)))) {
					//strOut = strOut+ String.valueOf(strVal.charAt(i)); both gives the same output
					strOut = strOut+ strVal.charAt(i);
				}
				
			}
			return strOut;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am a software developer";
		System.out.println("Given String is: \n" + str);
		FindingRepeatedCharacters obj1 = new FindingRepeatedCharacters();
		System.out.println("Repeated characters are :");
		System.out.println(obj1.repeatChar(str));
		

	}
}
