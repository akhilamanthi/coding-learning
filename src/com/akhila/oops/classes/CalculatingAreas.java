package com.akhila.oops.classes;

public class CalculatingAreas {
	
	public static void main(String[] args) {
		Square  square=new Square();
		square.setSquare(8);
		System.out.println("Area is :"+square.calculateArea());
	}
}
