package com.practice;
import java.util.Scanner;
public class oddnumbers {
public static void main(String [] args) {
	odd(1);
}
     static void odd(int i) {
	if(i<100) {
		odd(i+1);
		}
		System.out.println(i);
	    
    }
}

