package com.practice.functions;

public class SumofAllNumbers {
	public static void main(String[]args) {
		sumOfAllNumbers();

	}
public static int sumOfAllNumbers() {
	int printtotal=0;
	for(int i=1;i<=10;i++) {
		int number=i;
		printtotal=printtotal+number;
	}
	System.out.print("The sum of All Numbers Before 1000 is"+printtotal);

	return printtotal;
}
}
