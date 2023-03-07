package com.akhila.oops.classes;

public class Design {
	String typeofmodel;
	String color;
	public Design() {
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
	public String toColor() {
		System.out.println("TypeOfModel="+this.typeofmodel+"Color="+this.color);
		return null;
	}
}
