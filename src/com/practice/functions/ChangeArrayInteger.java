package com.practice.functions;

import com.practice.recursion.MyOwnFunctions;

public class ChangeArrayInteger {
public static void main(String[] args) {
	toChangeArrayToIntegerArray();
	allnumber l=new allnumber();
	l.checkit();
}
public static int[] toChangeArrayToIntegerArray() {
	int inputNumber=1234567;
	int length=getNumberOfDigits(inputNumber);
	int[] numberArray=new int[length];
	for(int i=0;i<length;i++) {
		int quotient=inputNumber/10;
		int remainder=inputNumber%10;
		numberArray[i]=remainder;
		inputNumber=quotient;
	}
	MyOwnFunctions.printIntArray(numberArray);
	return numberArray;
}
public static int getNumberOfDigits(int num) {
	int count=0;
	do {
		int quotient=num/10;
		int remainder=num%10;
		count=count+1;
		System.out.println("The number is" +remainder);
		num=quotient;	
	}while(num>0);
	System.out.println("The number of digits" +count);
	return count;
	}

}
