

package com.akhila.collections.practise;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsByUsingList {
		public static void main(String[] args) {
			ArrayList<String>frndnames=new ArrayList<String>();
			frndnames.add("Divya");
			frndnames.add("Divya");
			frndnames.add("Teja");
			frndnames.add("Lavanya");
			frndnames.add("Suhasini");
			frndnames.add("Suhasini");
			frndnames.add(null);
		System.out.println("Size of the set is "+frndnames.size());
		System.out.println("Names is "+frndnames.toString());
		System.out.println("Is contains Akhila" +frndnames.contains("Akhila"));
		System.out.println("Is empty "+frndnames.isEmpty());
		
		System.out.println("*********");
		LinkedList<String>Dosthnames=new LinkedList<String>();
		Dosthnames.add("Divya");
		Dosthnames.add("Teja");
		Dosthnames.add("Teja");
		Dosthnames.add("Lavanya");
		Dosthnames.add("Suhasini");
		Dosthnames.add("Tanuja");
		Dosthnames.add("Akhila");
		
	System.out.println("Size of the set is "+Dosthnames.size());
	System.out.println("Names is "+Dosthnames.toString());
	System.out.println("Is contains Akhila" +Dosthnames.contains("Akhila"));
	System.out.println("Is empty "+Dosthnames.isEmpty());
	
		
		}
}
