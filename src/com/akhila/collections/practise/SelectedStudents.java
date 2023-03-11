package com.akhila.collections.practise;

public class SelectedStudents {

	private String name;
	private Integer id;
	private long salary;
	
	public SelectedStudents() {
		
	}
	public SelectedStudents(String name, Integer id, long salary) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getSalary() {
		return this.salary;
	}
	
	public Integer getId() {
		return this.id;
	}

	public String toString() {
		return this.getName() + "-" + this.salary;
	}
}
