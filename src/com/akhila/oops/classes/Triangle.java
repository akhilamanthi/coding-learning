package com.akhila.oops.classes;

public class Triangle extends Shape{
	
	@Override
	public long calculateArea() {
		// TODO Auto-generated method stub
		return this.getLength()*this.getHeight()*(1/2);
	}
	
	public static void main(String [] args) {
		Triangle triangle=new Triangle();
		triangle.setLength(4);
		triangle.setHeight(12);
		System.out.println("Area of tringle is" +triangle.calculateArea());
	}
}
