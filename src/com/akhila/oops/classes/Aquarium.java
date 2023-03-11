package com.akhila.oops.classes;
public class Aquarium {
	Glass glassDetails;
	Gum  fevicol;
	Stones colors;
	Fishes types;
	Chair stand;
	
	public static void main(String[] args) {
		Glass gl1=new Glass();
		gl1.setLength(8);
		gl1.setMaterialType(2);
		gl1.toString();
		
		Glass gl2=new Glass();
		gl2.setLength(18);
		gl2.setMaterialType(21);
		gl2.toString();
		
		/*
		 * Glass gl4=new Glass(); gl4.setLength(5); gl4.setMaterialType(4);
		 * gl3.setLength(10); gl4.toString(); Gum gm=new Gum(); gm.setLiquid("Blue");
		 * gm.toLiquid(); Stones st=new Stones(); st.setRedStones(4);
		 * st.setBlueStones(8); st.setYellowStone(16); st.toStone(); Fishes f1=new
		 * Fishes(); f1.setDiamond(4); f1.setSquare(5); f1.setTriangle(3);
		 * f1.toFishes(); Fishes f =new Fishes(3,4,5); f.toFishes();
		 */
	}
}