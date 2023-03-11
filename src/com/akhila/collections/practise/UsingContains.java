package com.akhila.collections.practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class UsingContains {
		public static void main(String[] args) {
			String[] names = new String[] {"siva","akhila","siva"};
			TreeSet<String> uniqueSet = new TreeSet();
			HashSet<String> uniqueSet1 = new HashSet();

			ArrayList<String> uniqueNames = new ArrayList();
			for(int i=0; i<names.length;i++) {
				System.out.println("Name is " + names[i]);
				uniqueNames.add(names[i]);
				uniqueSet.add(names[i]);
				uniqueSet1.add(names[i]);
			}
			
			System.out.println(uniqueNames);
			System.out.println(uniqueSet);
			System.out.println(uniqueSet1\);

		}
}
