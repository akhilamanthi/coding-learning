package com.akhila.collections.practise;

import java.util.Comparator;

public class StudentSalaryComparator implements Comparator<SelectedStudents>{

	@Override
	public int compare(SelectedStudents o1, SelectedStudents o2) {
		if(o1.getSalary() > o2.getSalary()) {
			return 1;
		} if(o1.getSalary() < o2.getSalary()) {
			return -1;
		} else {
			return 0;
		}
	}

	
}
