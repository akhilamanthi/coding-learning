package com.practice.functions;

import com.practice.recursion.MyOwnFunctions;
public class evennumbers {
	public static void main(String [] args) {
		even();
	}
	public static void even() {
		for(int i=1;i<10;i++) {
			if(i%2 ==0) {
				System.out.println(i);
			}
		}
	}
}
