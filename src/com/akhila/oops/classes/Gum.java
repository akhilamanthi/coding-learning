package com.akhila.oops.classes;

public class Gum {
	String liquid;


public void setLiquid(String liq) {
	this.liquid=liq;
}
public String getLiquid() {
	return this.liquid;
}
public String toLiquid() {
	System.out.println("liquid == "+this.liquid);
	return null;
}
}


