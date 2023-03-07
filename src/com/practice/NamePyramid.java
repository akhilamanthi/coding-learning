package com.practice;

import com.practice.recursion.MyOwnFunctions;

public class NamePyramid {
	public static void main(String args[]) {
				name("Akhila");
				name("jansi");
	}
	public static void name(String name) {
		int rows= name.length();
		int cols= name.length()*2;
		int midposition=cols/2;
		int k=0;
		for(int i=0;i<rows;i++) {
			int start = midposition-i;
			int end= midposition+i;
			 k=0;
			for(int j=0;j<cols;) {
				if(j>=start && j<=end) {
					
					if(j==start||j==end) {
						MyOwnFunctions.printInSameLine(name.charAt(k));
					} else {
						System.out.print(" ");
						//System.out.print(name.charAt(k));

						
					}
					MyOwnFunctions.printInSameLine(" ");
					k++;
					j=j+2;
					
				} 
				else {
					MyOwnFunctions.printInSameLine(" ");
					j=j+1;
				}
			}
			MyOwnFunctions.printLine("");
		}

	}
}
