package com.practice.functions;

public class FindOddNumbers {
	public static void main(String[]args) {
		findOddNumber();
	}
	public static int findOddNumber() {
		int num=123456789;
		for(num=123456789;num>0;) {
			int quotient=num/10;
			int remainder=num%10;
			if(remainder%2!=0) {
				System.out.println("The odd number in the given integer value is " +remainder);
			}
			
			num=quotient;
		}
		return num;
	}
}
