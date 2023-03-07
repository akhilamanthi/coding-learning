package com.akhila.polimorphism;

public class Shirt extends Dress {
	int material;
	int measurements;
	int thread;
	int buttons;
	
	public void Strech(int ma,int meas,int thre,int but) {
		this.material=ma;
		this.measurements=meas;
		this.thread=thre;
		this.buttons=but;
	}

	@Override
	public void Strech(int ma, int meas, int thre) {
		System.out.println("In Shirt class");
	}
	
	public void Strech() {
		System.out.println("In Shirt class");
	}
	
	
	public static void main(String[] args) {
		Dress d=new Dress();
		d.Strech(0, 0, 0);
		Dress s=new Shirt();
		s.Strech(0, 0, 0);
		System.out.println(((Shirt)s).buttons);
		//
		((Shirt)s).printName();
		Shirt sr=(Shirt) new Dress();
		sr.consider();

	}
	
	public void  printName() {
		System.out.println("In printName");
	}
}
