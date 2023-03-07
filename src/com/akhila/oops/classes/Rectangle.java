package com.akhila.oops.classes;

public class Rectangle extends Shape {

	@Override
	public long calculateArea() {
		// TODO Auto-generated method stub
		return this.getLength()*this.getWidth();
		Rectangle.main(null);
	}
	
	public static void main(String args[]) {
		Rectangle rectangle=new Rectangle();
		rectangle.setLength(4);
		rectangle.setWidth(6);
		System.out.println("Area is :"+rectangle.calculateArea());
		Rectangle.calculateArea();
		rectangle.main("eretg);
	}
}
