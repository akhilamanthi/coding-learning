package com.practice;



import java.util.Scanner;

public class Arraytest {
	public static void main(String args[]) {
		int[][] studentInfo  = new int[50][3];
		studentInfo[0][0]=1;
		studentInfo[0][1]=59;
		studentInfo[0][2]=0;
		
		studentInfo[1][0]=0 ;
		studentInfo[1][1]=60;
		studentInfo[1][2]=1;
		
		studentInfo[2][0]=1;
		studentInfo[2][1]=65;
		studentInfo[2][2]=1;
		
		
		int numberofeligibleStudents=0;
		
		for(int i=0; i<studentInfo.length; i++) {
		  int currentStudent[]  =  studentInfo[i];
		  System.out.println(Arrays.toString(currentStudent));
		
		
		if(currentStudent[0]==1&& currentStudent[1]>=60 &&  currentStudent[2]==1) {
			System.out.println("Congratulations,student name " +i+ "Qualified for Scholarship");
			int numberofEligibleStudents= numberofEligibleStudents+1;
		}
	System.out.println("Number of eligible students for scholarship are..." +numberofeligibleStudents);
     }
	}
}
