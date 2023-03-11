package com.practice;
import java.util.Scanner;
public class LeftAngleTringle {
	public static void main(String args[]) {
		leftangle();
	}
	public static void leftangle() {
		int n=5;
		int i=1;
		while(i<=n) {
		int j=n;
		while(j>=1) {
			if(i>=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}j--;
			System.out.print("\n");
		}i++;
	}
}