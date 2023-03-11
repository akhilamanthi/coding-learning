package com.practice;

public class multiplicationtables {
public static void main(String[] args) {
	table(12,10);
	table(13,20);
}
		static void table(int n,int i) {
	i=0;
	if(i>0) {
		table(n,i-1);
	}
	System.out.print(n*i);
}
}
