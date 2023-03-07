package com.practice;
public class practise {
public static  void main(String args[]) {
	name(1,"sivakumar");
	}
static void name(int i,String k){
	if(i<k.length()) {
		name(i+1,k);
	}
	
	System.out.println(k);
}
}