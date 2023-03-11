package com.akhila.collections.practise;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<SelectedStudents>{

	@Override
	public int compare(SelectedStudents o1, SelectedStudents o2) {
		if(o1.getName().length() > o2.getName().length()) {
			return 1;
		} else if(o1.getName().length() < o2.getName().length()) {
			return -1;
		} else {
			return 0;
		}
		
	}
	

}
