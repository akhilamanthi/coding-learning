package com.practice;
import java.util.Scanner;
public class triangle {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("print number of lines");
		String number = scanner.next();
		for(int i=0;i <= Integer.parseInt(number);i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
		}
	}
}
