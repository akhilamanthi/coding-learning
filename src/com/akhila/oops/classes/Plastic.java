package com.akhila.oops.classes;

public class Plastic {
		int fire;
		int plasticThing;
		
		public Plastic() {
			System.out.println("Create Object");
		}

	public void setfire(int fir) {
		this.fire=fir;
	}

	public int getfire() {
		return this.fire;
	}
	
	public void setPlasticThing(int plas) {
		this.plasticThing=plas;
	}
	
	public int getPlasticThing() {
		return this.plasticThing;
	}
	public String toPlastic() {
		System.out.println("Fire=" +this.fire+ "PlasticThing"+this.plasticThing);
		return null;
	}
}
