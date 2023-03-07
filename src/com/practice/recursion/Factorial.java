package com.practice.recursion;

public class Factorial {
	
	public static void main(String[] args) {
		int number=8;
		int factorial=calculateFactorial(8);
		int factorial1=calculateFactorialLoop(8);

		System.out.println("Factorial of "+number+" is :"+factorial);
		System.out.println("Factorial of "+number+" is :"+factorial1);

	}
	
	static int calculateFactorial(int number) {
		if(number==1) {
			return 1;
		}
		
		return number*calculateFactorial(number-1);
	}
	
	static int calculateFactorialLoop(int number) {
		int factorial=1;
		for(int i=number;i>0;i--) {
			factorial = factorial*i;
			System.out.println("number"+factorial);
		}
		return factorial;
	}

}
