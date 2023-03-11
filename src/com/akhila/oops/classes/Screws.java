package com.akhila.oops.classes;

public class Screws {
	String shape;
	
	public Screws(String sha) {
		this.shape=sha;
	}
	
	public Screws() {
		System.out.println("Create Object");
	}
	
	public void setShape(String sha) {
		this.shape=sha;
	}
	public String getShape() {
		return this.shape;
	}
	public String toScrews() {
		System.out.println("Shape= "+this.shape);
		return null;
	}
}
