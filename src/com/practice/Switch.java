package com.practice;
import java.util.Scanner;
public class Switch 
{
	public static int doOperation(int a,int b,int i)
	{
		switch(i)
		{
		case 1:System.out.println("a+b");
		break;
		case 2:System.out.println("a-b");
        break;
		case 3:System.out.println("a*b=="+a*b);
		break;
		case 4:System.out.println("a/b");
		break;
        default:System.out.println("invalid OPerator");
        break;
		}
		return i;
	}
	public static int doOperation(int a,int b,String i) {
		return 0;
	}

	public static void main(String[] args) {		// TODO Auto-generated method stub
		doOperation(8, 8, 3);
		doOperation(8, 8, "3");
	}

}
