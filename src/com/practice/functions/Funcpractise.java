package com.practice.functions;

import com.practice.recursion.MyOwnFunctions;

public class Funcpractise {
private static final int Length = 0;
public static void main(String[] args) {
	String[] name={"Divya","Jaqnu","Lavanya","Teqja","Sivaq"};
	printAllNames(name);
	System.out.println("====================");
	int smallname=getSmallName(name);
	System.out.println("The  Small name is"+smallname);
	int bigname=getBiggestName(name);
	System.out.println("The Biggest Name is"+bigname);
	System.out.println("====================");
	getEachNameLength(name);
	System.out.println("====================");
	getName(name,3);
	System.out.println("====================");
	int count=0;
	count=countArrayNames(name);
	MyOwnFunctions.printLine("Count of names " +count);
	System.out.println("====================");
	name = getNames();
	printAllNames(name);
}
public static String[] getNames() {
	 String[] Names= {"Divya"};
	 return Names;
}
public static void printAllNames(String[] name) {
	for(int i=0;i<name.length;i++) {
		System.out.println(name[i]);
	}
}
public static int countArrayNames(String[] name) {
	int count=0 ;
	for(int i=0;i<name.length;i++) {
		 count = count+1;
	}
	return count;
}
public static String getName(String[] names,int position) {
	int countOfNamesInArray=countArrayNames(names);
	if(countOfNamesInArray > position) {
		String askedElement=names[position];
		MyOwnFunctions.printLine("Element at "+position+" is "+askedElement);
		return askedElement;
	}
	return "";
}
public static int getEachNameLength(String[] name) {
	for(int i=0;i<name.length;i++) {
		int Length = name[i].length();
		MyOwnFunctions.printLine("The each word length is" +Length);
	}
	return Length;
}
public static int getBiggestName(String[] name) {
	int BigName=0;
	for(int j=0;j<name.length;j++) {
		if(name[j].length()>BigName) {
			BigName=name[j].length();
		}
	}
	return BigName ;
}
public static int getSmallName(String[] name) {
	int Smallname=100
	System.out.println("Smallname"+Smallname);
	for(int i=0;i<name.length;i++) {
		System.out.println("i"+i);
		if(name[i].length()<=Smallname) {
			Smallname=name[i].length();
		}
	}
	return Smallname;
}
}