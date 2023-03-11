'package com.practice;
import java.util.Scanner;
public class shape {
public static void main(String[] args) {
	String name= "Jansi";
	int rows= name.length();
	int cols= name.length()*2;
	int midposition=cols/2;
	int k=0;
	int i=0;
	while(i<rows) {
		int start = midposition-i;
		int end= midposition+i;
		 k=0;
		int j=0;
		while(j<cols) {
			if(j>=start && j<=end) {
			if(j==start||j==end) {
					System.out.print(name.charAt(k));
				} else {
					System.out.print(" ");
					//System.out.print(name.charAt(k));

					
				}
				System.out.print(" ");
				k++;
				j=j+2;
				
			} 
			else {
				System.out.print(" ");
				j=j+1;
			}
		}i++;
		System.out.println("");
			}
		}
		}
