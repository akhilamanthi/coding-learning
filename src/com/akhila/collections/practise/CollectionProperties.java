package com.akhila.collections.practise;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionProperties {
		public static void main(String[] args) {
			HashSet<String> names = new HashSet<>(100,0.25f);
			names.add("Akhila");
			names.add("Janu");
			names.add("Nagamani");
			names.add("Divya");
		/*
		System.out.println("Set is "+names.toString());
		System.out.println("Size of set is "+names.size());
		System.out.println("Is empty "+names.isEmpty());
		System.out.println("Is contains Akhila "+names.contains("Akhila"));
		System.out.println("Is contains Divya "+names.contains("Divya"));
		*/
	
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println("Name is ::"+it.next());
		}
	
		String[] arrayName=new String[] {"Siva","Sankar","Akheera","janu"};
		for(int i=0;i<arrayName.length;i++) {
			if(arrayName[i]=="Janu") {
				System.out.println("true");
			}
		}
		}
}
