package com.javaprogramesDay5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BubbleSort {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {15,80,3,150,79,2,1,18};
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < num.length-i; j++) {
				if(num[j-1]<num[j]) {
					int temp = num[j-1];
					num[j-1] = num[j];
					num[j]=temp;
				}
			}
		}
		for (int i : num) {
			System.out.print(i+",");
		}

	}

}
