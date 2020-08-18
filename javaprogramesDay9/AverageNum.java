package com.javaprogramesDay9;
public class AverageNum {

	void avgNum(int num[]) {
		int sum =0;
		for (int i = 0; i < num.length; i++) {
			sum = sum+num[i];
		}
		float avg = (float)sum/(float)num.length;
		
		System.out.printf("Avergae value of given integers: %.3f", avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[] = { 75,76,78,79,80,81,83 };
		System.out.println("Given Integers are:");
		for (int i : num1) {
			System.out.print(i+",");
		}
		System.out.println();
		
		AverageNum obj = new AverageNum();
		obj.avgNum(num1);	
	}
}
