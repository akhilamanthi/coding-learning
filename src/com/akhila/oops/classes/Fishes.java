package com.akhila.oops.classes;

public class Fishes {
	int diamond;
	int square;
	int triangle;
	
	public Fishes() {
		System.out.println("Create object");
	}
	
	public Fishes(int dia,int sqa,int tri) {
		this.diamond=dia;
		this.square=sqa;
		this.triangle=tri;
	}
	public void setDiamond(int dia) {
		this.diamond=dia;
	}
	public int getDiamond() {
		return this.diamond;
	}
	public void setSquare(int sqa) {
		this.square=sqa;
	}
	public int getSquare() {
		return this.square;
	}
	public void setTriangle(int tri) {
		this.triangle=tri;
	}
	public int getTriangle() {
		return this.triangle;
	}
	public String toFishes() {
		System.out.println("diamond ==" +this.diamond+ "square ==" +this.square+ "triangle ==" +this.triangle);
		return null;
	}
}
