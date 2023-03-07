package com.practice.functions;

public class numberOfCharactersInAstring {
public static void main(String[]args) {
	noOfCharactersInString("SivaKumar");
}
public static int noOfCharactersInString(String a) {
	int count=0;
	for(int i=0;i<a.length();i++) {
		count=count+1;
	}
	System.out.print("The Number of Characters in a String is"+count);
	return count;
}
}
