package com.akhila.collections.practise;

public class Teacher implements Comparable<Teacher>{
		
		private String SubjectName;
		private int Salary;
		
	public String getSubjectName() {
		return SubjectName;
	}
	
	public int getSalary() {
		return Salary;
	}
	
	public Teacher() {
		
	}
	
	public Teacher(String SubjectName,int Salary) {
		this.SubjectName=SubjectName;
		this.Salary=Salary;
	}
	
	public String toString() {
		return this.getSubjectName() + " : " + this .getSalary();
	}

	
	@Override
	public int compareTo(Teacher o) {
		return o.getSalary() >this.getSalary() ? 1:-1;
	}
}
