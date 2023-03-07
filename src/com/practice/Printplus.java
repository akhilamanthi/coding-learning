package com.practice;
import java.util.Scanner;

public class Printplus {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number");
	int num = scanner.nextInt();
	int  rows = num;
	int cols = num;
	int i=0;
	while(i<= rows) {
		int j=0;
		while( j<= cols) {
			if(i==2|| (j == (rows/2))) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			j++;
		}
		System.out.println("");
		i++;
	}
}
}
