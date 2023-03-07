package com.practice.functions;

public class DuplicateSumOfNumbers {
public static void main(String[] args) {
	sumOfNumbers();
}
public static int sumOfNumbers() {
	int a=123;
	int sum=0;
	for(a=123;a>0;) {
		int quot=a/10;
		int rem=a%10;
		sum=sum+a;
		System.out.print("The sum of Numbers is " +sum);
	}
	return sum;
}
}
