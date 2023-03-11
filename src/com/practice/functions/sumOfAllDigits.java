package com.practice.functions;

public class sumOfAllDigits {
public static void main(String[] args) {
	sumOfDigits(123456789);
}
public static int sumOfDigits(int a) {
	int num=123456789;
	int sum=0;
	for(num=123456789;num>0;) {
	int	quotient=num/10;
	int remainder=num%10;
	sum=sum+remainder;
	System.out.println("The number is"+remainder);
	num=quotient;
	}
	System.out.println("The sum of all digits in a given number is "+sum);
	return num;
	}
}
