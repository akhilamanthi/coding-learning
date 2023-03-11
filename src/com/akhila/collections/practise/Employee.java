package com.akhila.collections.practise;

public class Employee implements Comparable<Employee> {

	private String name;
	private int salary;
	
	
	public int getSalary() {
		return salary;
	}
	
	
	public String getName() {
		return name;
	}
	
	public Employee() {
		
	}
	
	public Employee(String name, int salary) {
		this.salary = salary;
		this.name = name;
	}
	
	public String toString() {
		return this.getName() + " : " + this.getSalary();
	}

	@Override
	public int compareTo(Employee o) {
		return o.getName().length() > this.getName().length() ? 1: -1;
	}
}
