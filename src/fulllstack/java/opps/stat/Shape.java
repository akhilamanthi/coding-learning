package fulllstack.java.opps.stat;

public class Shape {
	 int length;
	 
	public void setLength(int length) {
		this.length=length;
	}
	public int getLength() {
		return this.getLength();
	}
	public String toString() {
		return  this.length.toString();
	}
	
	public static void main(String[] args) {
		Shape shape= new Shape();
		shape.setLength(4);
		shape.toString();
	}
}
