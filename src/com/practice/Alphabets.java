package com.practice;
import java.util.Scanner;
public class Alphabets {
public static void main(String []args) {
	printAlphabest(1);
}
   static void printAlphabest(int c) {
	 c ='A';
	if(c<='Z') {
		printAlphabest(c+1);
   }
	System.out.print(c);
   }
}