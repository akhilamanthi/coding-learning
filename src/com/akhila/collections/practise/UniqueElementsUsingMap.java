package com.akhila.collections.practise;
import java.util.HashMap;

public class UniqueElementsUsingMap {
	public static void main(String[] args) {
		String[] names =new String[] {"Divya","Suhasini","Teja","Divya","Teja"};
		HashMap<String,Integer> hashMap = new HashMap();
		for(int  i =0; i< names.length; i++ ) {
			if(hashMap.containsKey(names[i])) {
				System.out.println("occurance of "+ names[i] + " is " + hashMap.get(names[i]));
				hashMap.put(names[i], hashMap.get(names[i])+1);
			} else {
				hashMap.put(names[i],1);
			}
		}
		System.out.println(hashMap.toString());
	}	
}
