package com.practice;

public class Diagnal {
	public static void main(String args[]) {
		     printdiagonal("Syamala");
		     printdiagonal("akhila");
			}
	public  static void printdiagonal(String name) {
		int rows= name.length()*2;
		int cols= name.length()*2;
		int midposition=cols/2;
		int k=0;
		for(int i=0;i<rows;i++) {
			int start = midposition-i;
			int end= midposition+i;
			if(i>=midposition) {
				 start = (i-midposition);
				 end = rows-((midposition+i)-rows);
			} 
			k=0;
			//System.out.println("for i  "+i+" start : "+start+" end "+end);
			for(int j=0;j<cols;) {
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
			}
			System.out.println("");
		}
		

	}

}
