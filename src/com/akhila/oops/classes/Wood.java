package com.akhila.oops.classes;

public class Wood {
	int material;
	int axe;
	int knife;
public Wood(int ma,int ax,int kni) {
	this.material=ma;
	this.axe=ax;
	this.knife=kni;
}
public Wood() {
	System.out.println("Create Object");
}
public void setMaterial(int ma) {
	this.material=ma;
}
public int setMaterial() {
	return material;
}
public void setAxe(int ax) {
	this.axe=ax;
}
public int getAxe() {
	return axe;
}
public void setKnife(int kni) {
	this.knife=kni;
}
public int getKnife() {
	return knife;
}
public String toBed() {
	System.out.println("material= "+this.material+"axe= "+this.axe+"knife= "+this.knife);
	return null;
}
}
