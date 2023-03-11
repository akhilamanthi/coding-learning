package com.akhila.collections.practise;

import java.util.HashSet;

public class SetSortings {
	public static void main(String[]  args) {
		HashSet<String> TeacherNames = new HashSet<String>();
		TeacherNames.add("Syamala");
		TeacherNames.add("Murali");
		TeacherNames.add("Divya");
		System.out.println(TeacherNames.toString());
		
		HashSet<Teacher>TeacherObjects = new HashSet<>();
		Teacher Syamala = new Teacher("Maths",40000);
		Teacher Murali = new Teacher("Physics",10000);
		Teacher Divya = new Teacher("Chemistry",50000);
		
		TeacherObjects.add(Syamala);
		TeacherObjects.add(Murali);
		TeacherObjects.add(Divya);
		
		System.out.println(TeacherObjects);
	}
}	
