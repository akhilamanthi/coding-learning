package com.akhila.oops.classes;

public class photo extends Shape {
	double size;

	
	public photo() {
		System.out.println("Create Object");
		}
	
	public void setSize(double siz) {
		this.size=siz;
	}
	public double getSize() {
		return this.size;
	}
	
	
	public String toPhoto() {
		System.out.println("Size="+this.getSize()+"Length="+this.getLength()+"Width=" +this.width);
		return null;
	}

	@Override
	public long calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
