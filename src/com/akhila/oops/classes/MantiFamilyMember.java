package com.akhila.oops.classes;

public class MantiFamilyMember extends ManthiFamily{
	
	String name;
	int min_salary=40000;
	
	@Override
	public String profession() {
		return "SOFTWAE_ENGINEER";
	}

	@Override
	public String income() {
		return "1000000";
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	  public String toString() {
	        return getName()+"--"+profession()+"--"+income()+"--"+surname();
	    }

}
