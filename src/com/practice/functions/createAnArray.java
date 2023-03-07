package com.practice.functions;

import com.practice.recursion.MyOwnFunctions;

public class createAnArray {
public static void main(String[] args) {
	int[] myOwnArray=createArray();
	System.out.println("====================");
	MyOwnFunctions.printIntArray(myOwnArray);
}
public static int[] createArray() {
	int[] numberArray=new int[100];
	MyOwnFunctions.printIntArray(numberArray);
	for(int i=0;i<100;i++) {
		numberArray[i]=1;
		}
	MyOwnFunctions.printIntArray(numberArray);
	return numberArray;

	}
}

