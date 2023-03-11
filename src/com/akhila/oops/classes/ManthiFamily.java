package com.akhila.oops.classes;

public abstract class ManthiFamily implements Family {

	static String ORIGIN="KAIKALUR";
	final int min_salary=300000;
	
	@Override
	public final String surname() {
		return "MANTHI";
	}
	
	public void printOrigin() {
		System.out.println(ORIGIN);
	}
	
	
}
