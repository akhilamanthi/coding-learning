package com.practice.functions;
import java.util.Scanner;
public class ElementExitsInString {
public static void main(String[] args) {
	findElementExitsInString();
}
public static boolean findElementExitsInString() {
	String PresentName = "Raja" ;
	String[] names = {"Syamala","Murali","RajaNagendra","Akhila"};
	boolean IsExist = false;
	for(int i=0;i<names.length;i++) {
		String currentName = names[i];
		if(PresentName == currentName) { 
			IsExist=true;
		}	
	}
	if(IsExist) {
		System.out.println("True");
	} else  {
		System.out.println("False");
	}
		return false;
	}
}
