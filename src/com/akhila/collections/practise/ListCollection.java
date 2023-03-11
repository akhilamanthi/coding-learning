package com.akhila.collections.practise;

import java.util.ArrayList;

public class ListCollection {
		public static void main(String [] args) {
			ArrayList<String> names =new ArrayList<>();
			names.add("Bhavani");
			names.add("Durga");
			names.add("Suhasini");
			names.add("Jansi");
			names.add("Akhi");
			
		System.out.println("Set is "+names.toString());
		System.out.println("Size of set is "+names.size());
		System.out.println("Is empty " +names.isEmpty());
		System.out.println("Is contains Akhila " +names.contains("Akhila"));
		System.out.println("Is contains Suhasini " +names.contains("Suhasini"));
		}
}
