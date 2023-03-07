package com.practice;

import java.util.Scanner;

public class matrix
{
  public  static void main(String args[])
 {
	int m1[][] = new int[3][3];
	Scanner scanner=new Scanner(System.in);
	int actualSum=45;
	int caliculatedSum=0;
	for(int i=0;i<3;i++) 
	{
	   for(int j=0;j<3;j++) 
	   {
		   System.out.println("Enter value for matrix position ("+i+""+j+")");
		   m1[i][j]=scanner.nextInt();
	   }
     }
	
	for(int i=0;i<3;i++) 
	{
	   for(int j=0;j<3;j++) 
	   {
		   System.out.print(m1[i][j]+" ");
	   }
	   System.out.println("");
     }
	
	for(int i=0;i<3;i++) 
	{
	   for(int j=0;j<3;j++) 
	   {
		   caliculatedSum=caliculatedSum+m1[i][j];
	   }
     }
	   System.out.println("Missing number is ::"+(actualSum-caliculatedSum));


  }
}
