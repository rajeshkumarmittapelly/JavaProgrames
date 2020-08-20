package com.javaprogramesDay10;

import java.util.Scanner;

public class InterchangeChar {
	
	String interchangeChar(String strVal) {
		char ch[] = strVal.toCharArray();	
		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]= temp;
		strVal = String.valueOf(ch);
		return strVal;
	}
	
	String interchange2Char(String strVal) {
		if(strVal.length()<=1) {
			return strVal;
		}
		else
		{
			return strVal.charAt(strVal.length()-1)+strVal.substring(1, strVal.length()-1)+strVal.charAt(0);
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am a software developer";
		System.out.println("Given String is: \n"+str);		
		InterchangeChar obj1 = new InterchangeChar();
		System.out.println("String After revering first and last characters :");	
		System.out.println(obj1.interchange2Char(str));
		
		
	}
}
