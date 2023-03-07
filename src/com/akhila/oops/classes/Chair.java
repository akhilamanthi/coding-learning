package com.akhila.oops.classes;

public class Chair {
	int plastic;
	String design;
	int cuttingMachine;
public static void main(String[] args) {
	Plastic pl=new Plastic();
	pl.setfire(1);
	pl.setPlasticThing(3);
	pl.toPlastic();
	design de=new design();
	de.setTypeOfModel("normal design");
	de.setColor("pink");
	de.todesign();
	cuttingMachine cut=new cuttingMachine();
	cut.setHandMachine(2);
	cut.setPower("Current");
	cut.toCut();
}
}
