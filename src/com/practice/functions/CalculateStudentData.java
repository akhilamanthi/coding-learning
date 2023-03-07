package com.practice.functions;

public class CalculateStudentData {
public static void main(String[] args) {
	calculateStudentPercentage();
}
public static  int calculateStudentPercentage() {
	int sum=0;
	int TotalSum=500;
	int[] marks = {20,30,40,60,70};
	for(int i=0;i<marks.length;i++) {
		sum=sum+marks[i];
	}
	int percentage=(sum/TotalSum)*100;
	System.out.println("The total marks is " +percentage);
	return percentage;
}
}
