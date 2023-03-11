package com.practice.recursion;
import java.util.Scanner;
public class Present {
public static  void main(String[] args) {
	int a[] = new int[]{2,2,2,2};
	int multiply=0;
	for(int i=0;i<a.length;i++) {
			multiply=multiply-a[i];
		}
	System.out.print("Multiply"+ "total=="+multiply);
	}
}
