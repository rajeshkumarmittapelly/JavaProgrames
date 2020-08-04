package com.javaprogramesDay1;

public class SumofComplexNumbers {
	double r, i;
	SumofComplexNumbers(double r, double i){
		this.r = r;
		this.i = i;
	}
	
	public SumofComplexNumbers() {
		// TODO Auto-generated constructor stub
	}

	public static SumofComplexNumbers SumofCnumbers(SumofComplexNumbers n1, SumofComplexNumbers n2) {
		SumofComplexNumbers value = new SumofComplexNumbers();
		value.r = n1.r+n2.r;
		value.i = n1.i+n2.i;
		return value;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumofComplexNumbers num1 = new SumofComplexNumbers(5.2,4.9);
		System.out.println("Complex number 1 "+num1.r +" + i" +num1.i);
		
		SumofComplexNumbers num2 = new SumofComplexNumbers(3.2,4);
		System.out.println("Complex number 2 "+num2.r +" + i" +num2.i);
		SumofComplexNumbers sum = SumofCnumbers(num1, num2);
		System.out.println("Sum of complex number :"+sum.r +" + i" +sum.i);
		

	}

}
