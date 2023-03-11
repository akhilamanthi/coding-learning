package com.akhila.collections.practise;

import java.util.TreeSet;

public class SetSorting {
	public static void main(String[]  args) {
		TreeSet<String> employeeNames = new TreeSet<String>();
		employeeNames.add("SivaKumar");
		employeeNames.add("Mahesh");
		employeeNames.add("NagaRaju");
		System.out.println(employeeNames.toString());
		
		TreeSet<Employee> employeeOjbects = new TreeSet<>();
		Employee siva = new Employee("AkhilaKumarKalyaniSupiryaSupradRamSeeta",10000);
		Employee akhila = new Employee("SivaKumar", 15000);
		Employee raju = new Employee("Viashnavi", 20000);
		
		employeeOjbects.add(siva);
		employeeOjbects.add(raju);	
		employeeOjbects.add(akhila);
		
		System.out.println(employeeOjbects);
	
	}
	
	
}
