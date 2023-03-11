package com.akhila.collections.practise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionsByUsingSet {
	public static void main(String[] args) {
		TreeSet<String> names=new TreeSet<>();
		HashSet<String> names1=new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		while(names.size() < 6) {
			System.out.println("Enter name to insert into list :");
			String enteredName = scanner.next();
			names.add(enteredName);
			names1.add(enteredName);

		}
		System.out.println(names);
		System.out.println(names1);
		
		/*
		 * names.add("Kaikaluru"); names.add("Kaikaluru"); names.add("Eluru");
		 * names.add("Aatapaaka"); names.add("adaf");
		 * 
		 * names.size(); System.out.println("Size of the set is " +names.size());
		 * System.out.println("Names  is " +names.toString());
		 * System.out.println("Is Empty " +names.isEmpty());
		 * System.out.println("Is Contains Chintapadu "+names.contains("Chintapadu"));
		 * System.out.println("Is contains Bhimavaram "+names.contains("Bhimavaram"));
		 * 
		 * System.out.println("========");
		 * 
		 * TreeSet<String> Villagenames=new TreeSet<>(); Villagenames.add("Vijayawada");
		 * Villagenames.add("Chintapadu"); Villagenames.add("Chintapadu");
		 * Villagenames.add("Pullapar");
		 * 
		 * System.out.println("Size of the set is " +Villagenames.size());
		 * System.out.println("Names  is " +Villagenames.toString());
		 * System.out.println("Is Empty " +Villagenames.isEmpty());
		 * System.out.println("Is Contains Chintapadu "+Villagenames.contains(
		 * "Chintapadu"));
		 * System.out.println("Is contains Bhimavaram "+Villagenames.contains(
		 * "Bhimavaram"));
		 */
		
	}
	
	
}
