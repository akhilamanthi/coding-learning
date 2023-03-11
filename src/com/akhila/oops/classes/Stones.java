package com.akhila.oops.classes;

public class Stones {
	int redStones;
	int blueStones;
	int yellowStones;
	public void setRedStones(int stone) {
		this.redStones=stone;
	}
	public int getSetRedStones() {
		return this.redStones;
	}
	
	public void setBlueStones(int blue) {
		this.blueStones=blue;
	}
	public int getSetBlueStones() {
		return this.blueStones;
	}
	public void setYellowStone(int yellow) {
		this.yellowStones=yellow;
	}
	public int getSetYellowStone() {
		return this.yellowStones;
	}
	public String toStone() {
		System.out.println("redStones == " +this.redStones+ "blueStones == " +this.blueStones+ "YellowStone == " +this.yellowStones);
		return null;
	}
}
