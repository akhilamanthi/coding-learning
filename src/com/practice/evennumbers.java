package com.practice;
import java.util.Scanner;

import com.practice.recursion.MyOwnFunctions;
public class evennumbers {
	public static void main(String [] args) {
		even();
	}
	public static void even() {
		int i=1;
		while(i<100) {
			if(i%2!=1) {
				MyOwnFunctions.printLine(i+"");
			}
		}i++;
	}
}
