package com.akhila.oops.classes;

public abstract class  Shape implements TwoDimensionObject {
		private int length;
		int width;
		int height;
		int side;
		public Shape() {
			System.out.println("Create Object");
			}
		
		public void setLength(int len) {
			if(len>100) {
				return;
			}else {
				this.length=len;
			}
			this.length=len;
		}
		
		public int getLength() {
			return this.length;
			//return this.length;
		}
		
		public void setWidth(int wid) {
			this.width=wid;
		}
		public int getWidth() {
			return this.width;
		}
		
		public void setHeight(int ht) {
			this.height=ht;
		}
		public int getHeight() {
			return this.height;
		}
		
		public void setSide(int sid) {
			this.side=sid;
		}
		
		public int getSide() {
			return this.side;
		}
		public String toSize() {
			System.out.println("Length="+this.length+"Width=" +this.width+"Height="+this.height);
			return null;
		}
}
