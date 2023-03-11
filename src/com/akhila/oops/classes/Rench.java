package com.akhila.oops.classes;

public class Rench {
	int size;
	int length;
	
	public Rench (int siz,int len) {
		this.size=siz;
		this.length=len;
	}
	
	public Rench() {
		System.out.println("Create Object");
	}
	public void setSize(int siz) {
		this.size=siz;
	}
	public int getSize() {
		return this.size;
	}
	public void setLength(int len) {
		this.length=len;
	}
	public int getLength() {
		return this.length;
	}
	
	public String toRench() {
		System.out.println("Size=" +this.size+"Length=" +this.length);
		return null;
	}
}
