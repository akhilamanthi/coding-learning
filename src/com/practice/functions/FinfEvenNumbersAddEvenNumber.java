package com.practice.functions;

public class FinfEvenNumbersAddEvenNumber {
public static void main(String[]args) {
	findEvenNumberAddEven();
}
public static int findEvenNumberAddEven() {
	int num=2345678;
	int sum=0;
	for(num=2345678;num>0;) {
		int quotient=num/10;
		int remainder=num%10;
		if(remainder%2==0) {
			sum=sum+remainder;
			System.out.println("The even number in the given integer value is " +remainder);
		}
		else{
			System.out.println(" ");
		}
		num=quotient;
	}
	System.out.println("The sum of even number is " +sum);
	return num;
}
}
