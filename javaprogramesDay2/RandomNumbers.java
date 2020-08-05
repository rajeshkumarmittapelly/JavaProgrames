package com.javaprogramesDay2;


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomNumbers {
	double r, i;
	public Set<Integer> randomIntegers(int min, int max) {
		//Random objGenerator = new Random();
		Set<Integer> randomNum = new HashSet<Integer>();
		  for (int iCount = 1; iCount< max; iCount++){
			// returns a value in the range [0, max – min] where max is excluded
			//int temp = (int) (Math.random() * ( max - min ));			 
			//range up to the range that you are targeting. But this still does not include the maximum value.
			//int temp = (int) ((Math.random() * ( max - min )) + min);
			//To get the max value included, need to add 1 to your range parameter (max - min). This will return a random double within the specified range. 
			int temp =  (int) ((Math.random() * ((max - min) + 1)) + min);
			 randomNum.add(temp);
             }
		return randomNum;
	}


	public static void main(String[] args) {
		
		int minNum, maxNum;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Minimum value");
		minNum = input.nextInt();
		System.out.println("Enter Maximum value");
		maxNum = input.nextInt();
		RandomNumbers int1 = new RandomNumbers();		
		Set<Integer> ranodmInt = int1.randomIntegers(minNum, maxNum);
		System.out.println(ranodmInt.size());
		System.out.println(ranodmInt);

	}

}
