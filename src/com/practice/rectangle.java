package com.practice;
import java.util.Scanner;
public class rectangle {
public static void main(String[] args) {
	angle();
}
public static void angle() {
	int n=5;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==0||j==0) {
				System.out.print("*");
			}
				else if(i==(n-1) || j==(n-1)) {
					System.out.print("*");
			}
				
				else {
					System.out.print(" ");
				} 
		}System.out.println("");
	}
}
}