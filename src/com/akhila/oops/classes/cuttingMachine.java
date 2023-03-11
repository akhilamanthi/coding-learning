package com.akhila.oops.classes;

public class cuttingMachine {
	int handmachine;
	String power;
	
	public cuttingMachine() {
		System.out.println("Create Object");
	}
	public void setHandMachine(int hand) {
		this.handmachine=hand;
	}
	public int getHandMachine() {
		return this.handmachine;
	}
	public void setPower(String pow) {
		this.power=pow;
	}
	
	public String getPower() {
		return this.power;
	}
	
	public String toCut() {
		System.out.println("HandMachine= "+this.handmachine+"Power= " +this.power);
		return null;
	}
}
