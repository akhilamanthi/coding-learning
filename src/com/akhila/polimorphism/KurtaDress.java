package com.akhila.polimorphism;

public class KurtaDress extends Dress{
	
	
	public void Strech() {
		System.out.println("Kurta Dress");
	}

	@Override
	public int style() {
		return 1;//INDIA
	}
}
