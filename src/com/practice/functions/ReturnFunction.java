package com.practice.functions;
import java.lang.reflect.Array;

import com.practice.recursion.MyOwnFunctions;
public class ReturnFunction {
public static void main(String[] args) {
	int array[]=ArraySalary();
	Printarray(array);
	checkifSalarygreaterthan5000(9000);
	PrintSalariesAbove5000(array);
	System.out.println("=================");
	PrintSalariesBelow5000(array);
	int id=3;
	incrementSalary(array,id);
	System.out.println("updated salaries in main");
	System.out.println(id);
	Printarray(array);
	int Arraynum[]=arrayNumbers();
}
public static int[] ArraySalary() {
	int array[]= {1000,3000,5000,8000,9000};
	
	return array;
}
public static void Printarray(int[] array) {
	for(int i=0;i<array.length;i++) {
		MyOwnFunctions.printLine(array[i]);	
	}
}
public static boolean checkifSalarygreaterthan5000 (int Salary) {
	return Salary>5000;	
}

public static void PrintSalariesAbove5000( int [] array) {
		for(int i=0;i<array.length;i++) {
			if(checkifSalarygreaterthan5000(array[i])) {
				System.out.println( array[i]);	
			}
		}
}
public static boolean checkifSalarylessthan5000(int Salary) {
	return Salary<5000;
}
public  static void PrintSalariesBelow5000(int [] array) {
	for(int i=0;i<array.length;i++) {
		if(checkifSalarylessthan5000(array[i])) {
		System.out.println(array[i]);
			
		}
	}
}

public static int[] incrementSalary(int[] salaries,int id) {
	id=id+6;
	for(int i=0;i<salaries.length;i++) {
		if(checkifSalarylessthan5000(salaries[i])) {
			int newSalary=salaries[i]+500;
			System.out.println("Old salary :"+salaries[i]);
			System.out.println("New salary:"+newSalary);
			salaries[i]=salaries[i]+500;
		}
	}
	System.out.println("In increment");
	Printarray(salaries);
	return salaries;
}

public static String[] ArrayNames() {
	String[] arrayOfNames = {"Divya","Jansi","Janu","Lavanya"} ;
	return arrayOfNames;
}
public static int[] arrayNumbers() {
	int Arraynum[]= {4,3,5,8,5};
	return Arraynum;
}
}	




