package java_test;

public class Box {
	private String item;
	private double boxNum;
	
	public Box(double boxNum, String item) {
		this.boxNum = boxNum;
		this.item = item;
	}
	
	public double getBoxNum() {
		return boxNum;
	}
	
	public String toString() {
		return item;
	}
}
