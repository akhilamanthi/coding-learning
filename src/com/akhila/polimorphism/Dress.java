package com.akhila.polimorphism;

	public abstract class  Dress implements Style {
	int measurements;
	int thread;


	public  void Strech(int ma,int meas,int thre) {
		System.out.println("in Dress class");
	}
	
	public void Strech() {
		System.out.println("In Shirt class");
	}
	
	public void strict(Dress s) {
		if(s instanceof PunjabiDress)
		((PunjabiDress)s).printExtractPart();
		s.Strech();
	}
	
}
	
