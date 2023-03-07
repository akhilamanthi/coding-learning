package com.practice.recursion;

public class MyOwnFunctions {

	public static void main(String[] args) {
		String name="Akila";
		printLine("This my welcome project!!!");		
		printLineInCapitals(name);
		printLine(toCapital("Siva"));
		printLine(toCapital("Ram"));
		printLine(toCapital("Sita"));
	}
	public static void printLine(String line) {
		System.out.println(line);
	}
	
	public static void printInSameLine(Array line) {
		System.out.print(line);
	}
	public static void printInSameLine(String line) {
		System.out.print(line);
	}
	
	public static void printLine(int line) {
		System.out.println(line);
	}
	public static void printInSameLine(char line) {
		System.out.print(line);
	}
	
	
	public static void printLine(char line) {
		System.out.println(line);
	}
	
	public static String toCapital(String line) {
		return line.toUpperCase();
	}
	
	public static void printLineInCapitals(String line) {
		String capitaLine=toCapital(line);
		printLine(capitaLine);
	}
	public static void printIntArray(int[] array) {
		System.out.println("");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
	}
	}
