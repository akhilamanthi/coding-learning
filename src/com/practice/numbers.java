package com.practice;
import java.util.Scanner;
public class numbers {
	public static void main(String []args) {
		printnumber(100);
	}
    static void printnumber(int n){
    	 if(n>0) {
    		 printnumber(n-1);
    	 }
    		 System.out.println(n);
     }
      }
