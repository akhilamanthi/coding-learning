package com.practice;

import java.util.Scanner;

import com.practice.functions.allnumber;

public class Additionmatrix {
	public static void main(String args[])
	{
		allnumber all = new allnumber();
		all.checkit()
		int num=0,i,j,sr,sc;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your number");
		 num = scanner.nextInt();
		int m1[][]=new int[num][num];
		System.out.println("Before ::Number value "+num);

		traverseArrayAndPerformOperation(m1,num,1);//read input
		System.out.println("After :: Number value "+num);
		traverseArrayAndPerformOperation(m1,num,2);
		sr=traverseArrayAndPerformOperation(m1, num, 3);
		sc=traverseArrayAndPerformOperation(m1, num, 4);
	 
	    System.out.println("ROws and COlumn sum =="+(sr+sc));
	//operation, operation == 1 accept input
		//operation==2; printArray
		//operation==3 return rowsum
		//operation==4 return columsum
	}
	
	public static int traverseArrayAndPerformOperation(int[][] arr,int num,int operation) {
			Scanner s=new Scanner(System.in);
			int sr=0;
			int sc=0;
			for( int i=0;i<num;i++) {
			 	for(int j=0;j<num;j++) {
			 		if(operation == 2) {
				 		System.out.print(arr[i][j]+" ");	
			 		} else if(operation ==1) {
			 			System.out.println("Enter value for ("+i+","+j+")");
			 			arr[i][j]=s.nextInt();
			 		} else if(operation ==3) {
			 			sr=sr+arr[i][j];
			 		} else if(operation==4) {
			 			sc=sc+arr[j][i];
			 		}
			 	}
			 	System.out.println("");
			 }
		 	System.out.println("");
		 	if(operation == 3) {
		 		return sr;
		 	} else if(operation ==4) {
		 		return sc;
		 	}
		 	num=9;
		 	return 0;
	   }
}
