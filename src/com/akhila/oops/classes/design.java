package com.akhila.oops.classes;

public class design {
	String typeofmodel;
	String color;
	public design() {
	System.out.println("Create Object");
	}
	public void setTypeOfModel(String type) {
		this.typeofmodel=type;
	}
	public String getTypeOfModel() {
		return this.typeofmodel;
	}
	public void setColor(String co) {
		this.color=co;
	}
	public String getColor() {
		return this.color;
	}
	public String todesign() {
		System.out.println("TypeOfModel="+this.typeofmodel+"Color="+this.color);
		return null;
	}
}
