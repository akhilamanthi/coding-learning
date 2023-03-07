package com.akhila.oops.classes;

public class Square extends Shape{
		int side;
		
	public long calculateArea() {
		// TODO Auto-generated method stub
		return this.width*this.width;
	}
	
	public static void main(String[] args) {
		Square  square=new Square();
		square.setWidth(3);
		System.out.println("Area is :"+square.calculateArea());
	}
}
