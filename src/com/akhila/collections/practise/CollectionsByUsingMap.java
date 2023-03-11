package com.akhila.collections.practise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class CollectionsByUsingMap {
		public static void main(String[] args) {
			HashMap <String,Integer> hashMap = new HashMap();
			hashMap.put("Akhila", 100000);
			hashMap.put("Divya", 200000);
			hashMap.put("Suhasini", 300000);
			hashMap.put("Janu", 400000);
			System.out.println(hashMap);
			TreeMap <String,Integer> pairs = new TreeMap();
			pairs.put("Akhila", 100000);
			pairs.put("Divya", 200000);
			pairs.put("Suhasini", 300000);
			pairs.put("Janu", 400000);
			System.out.println(pairs);
			LinkedHashMap <String,Integer> linkedMapPairs = new LinkedHashMap();
			linkedMapPairs.put("Akhila", 100000);
			linkedMapPairs.put("Divya", 200000);
			linkedMapPairs.put("Suhasini", 300000);
			linkedMapPairs.put("Janu", 400000);
			System.out.println(linkedMapPairs);
			
		}
}
