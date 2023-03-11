package com.practice;
import java.util.Scanner;
public class ReverseNumbers 
{
public static void main(String args[]) 
   {
	int num,rev;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter your number");
	int number=scanner.nextInt();
	num=0;
	rev=0;
	while(num!=0) {
		rev=rev*10+(num%10);
		num=num/10;
	}
	System.out.println("reverse number is"+rev);
  }
}