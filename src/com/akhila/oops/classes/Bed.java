package com.akhila.oops.classes;

public class Bed {
	Wood materialType;
	Design model;
	Rench shape;
	Screws round;
	public static void main(String[] args) {
	Wood w1 =new Wood();
	w1.setMaterial(6);
	w1.setAxe(4);
	w1.setKnife(7);
	w1.toBed();
	Design De=new Design();
	De.setTypeOfModel("Normal Design");
	De.setColor("White");
	De.toColor();
	Rench Ren=new Rench();
	Ren.setSize(5);
	Ren.setLength(7);
	Ren.toRench();
	Rench Re =new Rench(2,4);
	Re.toRench();
	Screws scr=new Screws();
	scr.setShape("Diagonal");
	scr.toScrews();
	Screws S1=new Screws("Square");
	S1.toScrews();
	}
}
