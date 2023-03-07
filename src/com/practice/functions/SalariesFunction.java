package com.practice.functions;

public class SalariesFunction {
public static void main(String[] args) {
	int[] salaries=ArraySalary();
	int minsalary=minSalary(salaries);
	System.out.println("The minimum Salary is"+minsalary);
	int maxsalary=maxSalary(salaries);
	System.out.println("The maximum Salary is"+maxsalary);
}
public static int[] ArraySalary() {
	int array[]= {10000,50000,20000,10000,25000};
	return array;
}
public static int minSalary(int[] array) {
	int minSalary=50000;
	for(int i=0;i<array.length;i++) {
		if(array[i]<minSalary) {
			minSalary=array[i];
		}
	}
	return minSalary;
}
public static int maxSalary(int[] array) {
	int maxSalary=15000;
	for(int i=0;i<array.length;i++) {
		if(array[i]>maxSalary) {
			maxSalary=array[i];
		}
	}
	return maxSalary;
}
}
