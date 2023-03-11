package com.practice.recursion;
import java.util.Scanner;
public class divisiblenumbers {
public static void main(String[] args) {
	int n = 0,count=0;
	int a[] = {2,6,9,7,3,15,21,25,28,14};
	n=a.length;
		for(int i =0;i<n;i++) {
			int ithelemen=a[i];
			for(int j=0;j<n;j++) {
				int jthelemen=a[j];
				if(jthelemen%ithelemen==0) {
				 count = count+1;
				}
			}
			System.out.println(i+ " has " + count + " of dividents");
		}
}
}
