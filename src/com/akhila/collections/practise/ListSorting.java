package com.akhila.collections.practise;

import java.util.ArrayList;
import java.util.Collections;

import fulllstack.java.opps.stat.Student;

public class ListSorting {
	
	public static void main(String[] args) {
		ArrayList<SelectedStudents> listOfStudnets = new ArrayList<SelectedStudents>();
		SelectedStudents akhila = new SelectedStudents("Akhila", 1456, 800000);
		SelectedStudents divya = new SelectedStudents("Divya", 24561, 700000);
		SelectedStudents lavanay = new SelectedStudents("Lavanya", 34561, 600000);
		SelectedStudents keerthi = new SelectedStudents("Keerthi", 44561, 500000);
		SelectedStudents keerthi3 = new SelectedStudents("Keerthi3", 44561, 900000);

		
		
		listOfStudnets.add(akhila);
		listOfStudnets.add(keerthi);
		listOfStudnets.add(lavanay);
		listOfStudnets.add(divya);
		listOfStudnets.add(keerthi3);
		
		System.out.println(listOfStudnets);
		
		Collections.sort(listOfStudnets, new StudentSalaryComparator()); 
		System.out.println(listOfStudnets);
		Collections.sort(listOfStudnets, new StudentNameComparator());
		
		System.out.println(listOfStudnets);
		
	}
}
