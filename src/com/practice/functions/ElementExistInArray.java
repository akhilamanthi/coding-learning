package com.practice.functions;
import java.util.Scanner;
public class ElementExistInArray {
public static void main(String[] args) {
	elementExist();
}
public static boolean elementExist() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number");
	int number = sc.nextInt();
	int[] array= {2,3,4,5,6,7};
	for(int i=0;i<array.length;i++) {
		if(array[i]==number) {
			System.out.println("True");
		}
	}
	return false;
	}
}