package com.akhila.oops.classes;44*

public class Glass extends Shape{
	int materialType;//1-Glass,2-Plastic
	
	static String NAME=" SOMALINGAM";
	
	
	 void printName() {
		System.out.println(NAME);
	}
	
	
	public Glass() {
		System.out.println("Create object");
	}
	
	public Glass(int mt,int length, int bt ,int ht) {
		this.materialType=mt;
	}
	
	
	public  void setMaterialType(int type) {
		this.materialType=type;
	}
	
	public int getMaterialType() {
		return this.materialType;
	}
	
	@Override
	public String toString() {
		System.out.println("Material type  " +this.materialType+ " length== " +this.getLength()+  " breadth==  " +this.width+ " heigth  " +this.height);
		return null;
		
	}

	@Override
	public long calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
