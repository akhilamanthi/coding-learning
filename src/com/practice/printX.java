package com.practice;
import java.util.Scanner;
public class printX {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i=0;i< number;i++) {
			for(int j=0;j<=number;j++) {
				if(i+j== number && Math.abs(i-j) >1 || i== j){
					System.out.print("*");
				}else {
					System.out.print("    ");
				}
			}
			System.out.println("");
		}
	}

}